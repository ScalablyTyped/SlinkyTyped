package typingsSlinky.firebaseStorage

import typingsSlinky.firebaseStorage.srcListMod.ListResult
import typingsSlinky.firebaseStorage.srcServiceMod.StorageService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/storage/dist/src/implementation/list", JSImport.Namespace)
@js.native
object implementationListMod extends js.Object {
  
  def fromResponseString(service: StorageService, bucket: String, resourceString: String): ListResult | Null = js.native
}
