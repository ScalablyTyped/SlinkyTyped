package typingsSlinky.arangodb.collectionMod

import typingsSlinky.arangodb.ArangoDB.Collection
import typingsSlinky.arangodb.Foxx.CollectionSessionStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@arangodb/foxx/sessions/storages/collection", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(options: String | Collection[_]): CollectionSessionStorage = js.native
  def apply(options: CollectionStorageOptions): CollectionSessionStorage = js.native
}
