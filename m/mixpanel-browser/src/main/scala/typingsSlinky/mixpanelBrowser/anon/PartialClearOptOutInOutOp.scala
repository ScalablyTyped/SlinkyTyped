package typingsSlinky.mixpanelBrowser.anon

import typingsSlinky.mixpanelBrowser.mod.Persistence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mixpanel-browser.mixpanel-browser.ClearOptOutInOutOptions> */
@js.native
trait PartialClearOptOutInOutOp extends js.Object {
  var cookie_expiration: js.UndefOr[Double] = js.native
  var cookie_prefix: js.UndefOr[String] = js.native
  var cross_subdomain_cookie: js.UndefOr[Boolean] = js.native
  var persistence_type: js.UndefOr[Persistence] = js.native
  var secure_cookie: js.UndefOr[Boolean] = js.native
}

object PartialClearOptOutInOutOp {
  @scala.inline
  def apply(): PartialClearOptOutInOutOp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClearOptOutInOutOp]
  }
  @scala.inline
  implicit class PartialClearOptOutInOutOpOps[Self <: PartialClearOptOutInOutOp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCookie_expiration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie_expiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookie_expiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie_expiration")(js.undefined)
        ret
    }
    @scala.inline
    def withCookie_prefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie_prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookie_prefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie_prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withCross_subdomain_cookie(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cross_subdomain_cookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCross_subdomain_cookie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cross_subdomain_cookie")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistence_type(value: Persistence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistence_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistence_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistence_type")(js.undefined)
        ret
    }
    @scala.inline
    def withSecure_cookie(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure_cookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecure_cookie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure_cookie")(js.undefined)
        ret
    }
  }
  
}

