package typingsSlinky.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Modification extends StObject {
  
  /** Create a new column family with the specified schema, or fail if one already exists with the given ID. */
  var create: js.UndefOr[ColumnFamily] = js.native
  
  /** Drop (delete) the column family with the given ID, or fail if no such family exists. */
  var drop: js.UndefOr[Boolean] = js.native
  
  /** The ID of the column family to be modified. */
  var id: js.UndefOr[String] = js.native
  
  /** Update an existing column family to the specified schema, or fail if no column family exists with the given ID. */
  var update: js.UndefOr[ColumnFamily] = js.native
}
object Modification {
  
  @scala.inline
  def apply(): Modification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Modification]
  }
  
  @scala.inline
  implicit class ModificationMutableBuilder[Self <: Modification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: ColumnFamily): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setDrop(value: Boolean): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setUpdate(value: ColumnFamily): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
