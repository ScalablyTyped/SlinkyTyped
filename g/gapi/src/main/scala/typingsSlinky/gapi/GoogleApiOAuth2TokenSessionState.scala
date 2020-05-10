package typingsSlinky.gapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleApiOAuth2TokenSessionState extends js.Object {
  var extraQueryParams: AnonAuthuser = js.native
}

object GoogleApiOAuth2TokenSessionState {
  @scala.inline
  def apply(extraQueryParams: AnonAuthuser): GoogleApiOAuth2TokenSessionState = {
    val __obj = js.Dynamic.literal(extraQueryParams = extraQueryParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiOAuth2TokenSessionState]
  }
  @scala.inline
  implicit class GoogleApiOAuth2TokenSessionStateOps[Self <: GoogleApiOAuth2TokenSessionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtraQueryParams(value: AnonAuthuser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraQueryParams")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

