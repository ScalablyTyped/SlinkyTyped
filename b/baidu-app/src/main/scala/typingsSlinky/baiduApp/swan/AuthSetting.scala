package typingsSlinky.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthSetting extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  @JSName("scope.address")
  var scopeDotaddress: String = js.native
  @JSName("scope.invoiceTitle")
  var scopeDotinvoiceTitle: String = js.native
  @JSName("scope.record")
  var scopeDotrecord: String = js.native
  @JSName("scope.userInfo")
  var scopeDotuserInfo: String = js.native
  @JSName("scope.userLocation")
  var scopeDotuserLocation: String = js.native
  @JSName("scope.werun")
  var scopeDotwerun: String = js.native
  @JSName("scope.writePhotosAlbum")
  var scopeDotwritePhotosAlbum: String = js.native
  var success: js.UndefOr[js.Function1[/* res */ ErrMsgResponse, Unit]] = js.native
}

object AuthSetting {
  @scala.inline
  def apply(
    scopeDotaddress: String,
    scopeDotinvoiceTitle: String,
    scopeDotrecord: String,
    scopeDotuserInfo: String,
    scopeDotuserLocation: String,
    scopeDotwerun: String,
    scopeDotwritePhotosAlbum: String
  ): AuthSetting = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scope.address")(scopeDotaddress.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.invoiceTitle")(scopeDotinvoiceTitle.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.record")(scopeDotrecord.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.userInfo")(scopeDotuserInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.userLocation")(scopeDotuserLocation.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.werun")(scopeDotwerun.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.writePhotosAlbum")(scopeDotwritePhotosAlbum.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSetting]
  }
  @scala.inline
  implicit class AuthSettingOps[Self <: AuthSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScopeDotaddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope.address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopeDotinvoiceTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope.invoiceTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopeDotrecord(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope.record")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopeDotuserInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope.userInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopeDotuserLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope.userLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopeDotwerun(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope.werun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopeDotwritePhotosAlbum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope.writePhotosAlbum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withFail(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ ErrMsgResponse => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

