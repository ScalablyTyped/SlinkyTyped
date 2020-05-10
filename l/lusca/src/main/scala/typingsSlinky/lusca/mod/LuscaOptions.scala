package typingsSlinky.lusca.mod

import typingsSlinky.lusca.luscaBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*~ Documentation declares that:
  *~ Setting any value to false will disable it.
  */
@js.native
trait LuscaOptions extends js.Object {
  var csp: js.UndefOr[cspOptions | `false`] = js.native
  var csrf: js.UndefOr[csrfOptions | Boolean] = js.native
  var hsts: js.UndefOr[hstsOptions | `false`] = js.native
  var nosniff: js.UndefOr[Boolean] = js.native
  var p3p: js.UndefOr[String | `false`] = js.native
  var referrerPolicy: js.UndefOr[String | `false`] = js.native
  var xframe: js.UndefOr[String | `false`] = js.native
  var xssProtection: js.UndefOr[xssProtectionOptions | Boolean] = js.native
}

object LuscaOptions {
  @scala.inline
  def apply(): LuscaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LuscaOptions]
  }
  @scala.inline
  implicit class LuscaOptionsOps[Self <: LuscaOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCsp(value: cspOptions | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csp")(js.undefined)
        ret
    }
    @scala.inline
    def withCsrf(value: csrfOptions | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csrf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsrf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csrf")(js.undefined)
        ret
    }
    @scala.inline
    def withHsts(value: hstsOptions | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsts")(js.undefined)
        ret
    }
    @scala.inline
    def withNosniff(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nosniff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNosniff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nosniff")(js.undefined)
        ret
    }
    @scala.inline
    def withP3p(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p3p")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutP3p: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p3p")(js.undefined)
        ret
    }
    @scala.inline
    def withReferrerPolicy(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrerPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferrerPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrerPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withXframe(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xframe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXframe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xframe")(js.undefined)
        ret
    }
    @scala.inline
    def withXssProtection(value: xssProtectionOptions | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xssProtection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXssProtection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xssProtection")(js.undefined)
        ret
    }
  }
  
}

