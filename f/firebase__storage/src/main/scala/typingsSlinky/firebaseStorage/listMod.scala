package typingsSlinky.firebaseStorage

import typingsSlinky.firebaseStorage.serviceMod.StorageService
import typingsSlinky.firebaseStorage.srcListMod.ListResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/storage/dist/src/implementation/list", JSImport.Namespace)
@js.native
object listMod extends js.Object {
  
  def fromResponseString(service: StorageService, bucket: String, resourceString: String): ListResult | Null = js.native
  
  def listOptionsValidator(p: js.Any): Unit = js.native
}
