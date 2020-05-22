package typingsSlinky.firebaseInstallations.commonMod

import typingsSlinky.firebaseInstallations.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorResponse extends js.Object {
  var error: Code
}

object ErrorResponse {
  @scala.inline
  def apply(error: Code): ErrorResponse = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorResponse]
  }
}

