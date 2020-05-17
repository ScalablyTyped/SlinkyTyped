package typingsSlinky.ngFacebook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<facebook-js-sdk.facebook.InitParams> */
@js.native
trait PartialInitParams extends js.Object {
  var appId: js.UndefOr[String] = js.native
  var autoLogAppEvents: js.UndefOr[Boolean] = js.native
  var cookie: js.UndefOr[Boolean] = js.native
  var frictionlessRequests: js.UndefOr[Boolean] = js.native
  var hideFlashCallback: js.UndefOr[Boolean] = js.native
  var status: js.UndefOr[Boolean] = js.native
  var version: js.UndefOr[String] = js.native
  var xfbml: js.UndefOr[Boolean] = js.native
}

object PartialInitParams {
  @scala.inline
  def apply(): PartialInitParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialInitParams]
  }
  @scala.inline
  implicit class PartialInitParamsOps[Self <: PartialInitParams] (val x: Self) extends AnyVal {
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
    def withoutAppId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoLogAppEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLogAppEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoLogAppEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLogAppEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withCookie(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(js.undefined)
        ret
    }
    @scala.inline
    def withFrictionlessRequests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frictionlessRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrictionlessRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frictionlessRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withHideFlashCallback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFlashCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideFlashCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFlashCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withXfbml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xfbml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXfbml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xfbml")(js.undefined)
        ret
    }
  }
  
}

