package typingsSlinky.reactGoogleLoginComponent.mod

import typingsSlinky.reactGoogleLoginComponent.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleLoginInfo extends js.Object {
  def getAuthResponse(): AnonAccesstoken
}

object GoogleLoginInfo {
  @scala.inline
  def apply(getAuthResponse: () => AnonAccesstoken): GoogleLoginInfo = {
    val __obj = js.Dynamic.literal(getAuthResponse = js.Any.fromFunction0(getAuthResponse))
  
    __obj.asInstanceOf[GoogleLoginInfo]
  }
}

