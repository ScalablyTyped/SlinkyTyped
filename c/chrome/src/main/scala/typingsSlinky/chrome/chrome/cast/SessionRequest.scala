package typingsSlinky.chrome.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionRequest extends js.Object {
  var appId: String = js.native
  var capabilities: js.Array[Capability] = js.native
  var language: js.UndefOr[String] = js.native
  var requestSessionTimeout: Double = js.native
}

object SessionRequest {
  @scala.inline
  def apply(appId: String, capabilities: js.Array[Capability], requestSessionTimeout: Double): SessionRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], requestSessionTimeout = requestSessionTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionRequest]
  }
  @scala.inline
  implicit class SessionRequestOps[Self <: SessionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCapabilities(value: js.Array[Capability]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestSessionTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestSessionTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
  }
  
}

