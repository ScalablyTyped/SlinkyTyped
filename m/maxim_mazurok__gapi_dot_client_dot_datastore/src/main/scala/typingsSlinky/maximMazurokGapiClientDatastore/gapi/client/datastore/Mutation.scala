package typingsSlinky.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mutation extends StObject {
  
  /** The version of the entity that this mutation is being applied to. If this does not match the current version on the server, the mutation conflicts. */
  var baseVersion: js.UndefOr[String] = js.native
  
  /** The key of the entity to delete. The entity may or may not already exist. Must have a complete key path and must not be reserved/read-only. */
  var delete: js.UndefOr[Key] = js.native
  
  /** The entity to insert. The entity must not already exist. The entity key's final path element may be incomplete. */
  var insert: js.UndefOr[Entity] = js.native
  
  /** The entity to update. The entity must already exist. Must have a complete key path. */
  var update: js.UndefOr[Entity] = js.native
  
  /** The entity to upsert. The entity may or may not already exist. The entity key's final path element may be incomplete. */
  var upsert: js.UndefOr[Entity] = js.native
}
object Mutation {
  
  @scala.inline
  def apply(): Mutation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mutation]
  }
  
  @scala.inline
  implicit class MutationMutableBuilder[Self <: Mutation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseVersion(value: String): Self = StObject.set(x, "baseVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseVersionUndefined: Self = StObject.set(x, "baseVersion", js.undefined)
    
    @scala.inline
    def setDelete(value: Key): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    @scala.inline
    def setInsert(value: Entity): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
    
    @scala.inline
    def setUpdate(value: Entity): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    @scala.inline
    def setUpsert(value: Entity): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
  }
}
