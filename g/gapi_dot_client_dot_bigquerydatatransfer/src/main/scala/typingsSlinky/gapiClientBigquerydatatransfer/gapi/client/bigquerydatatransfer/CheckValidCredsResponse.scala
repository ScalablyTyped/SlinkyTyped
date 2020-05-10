package typingsSlinky.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckValidCredsResponse extends js.Object {
  /** If set to `true`, the credentials exist and are valid. */
  var hasValidCreds: js.UndefOr[Boolean] = js.native
}

object CheckValidCredsResponse {
  @scala.inline
  def apply(): CheckValidCredsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckValidCredsResponse]
  }
  @scala.inline
  implicit class CheckValidCredsResponseOps[Self <: CheckValidCredsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasValidCreds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasValidCreds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasValidCreds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasValidCreds")(js.undefined)
        ret
    }
  }
  
}

