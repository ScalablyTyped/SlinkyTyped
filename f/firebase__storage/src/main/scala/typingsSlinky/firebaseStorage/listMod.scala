package typingsSlinky.firebaseStorage

import typingsSlinky.firebaseStorage.authwrapperMod.AuthWrapper
import typingsSlinky.firebaseStorage.srcListMod.ListResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/src/implementation/list", JSImport.Namespace)
@js.native
object listMod extends js.Object {
  def fromResponseString(authWrapper: AuthWrapper, bucket: String, resourceString: String): ListResult | Null = js.native
  def listOptionsValidator(p: js.Any): Unit = js.native
}

