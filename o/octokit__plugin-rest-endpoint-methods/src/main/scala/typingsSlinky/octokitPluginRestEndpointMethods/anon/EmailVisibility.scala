package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailVisibility extends js.Object {
  var email: Required
  var visibility: Required
}

object EmailVisibility {
  @scala.inline
  def apply(email: Required, visibility: Required): EmailVisibility = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailVisibility]
  }
}

