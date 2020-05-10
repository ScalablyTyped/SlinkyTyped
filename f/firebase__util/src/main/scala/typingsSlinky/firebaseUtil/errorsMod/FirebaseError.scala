package typingsSlinky.firebaseUtil.errorsMod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/util/dist/src/errors", "FirebaseError")
@js.native
class FirebaseError protected ()
  extends ErrorData
     with Error {
  def this(code: String, message: String) = this()
  val code: String = js.native
  @JSName("name")
  val name_FirebaseError: typingsSlinky.firebaseUtil.firebaseUtilStrings.FirebaseError with (/* "FirebaseError" */ String) = js.native
}

