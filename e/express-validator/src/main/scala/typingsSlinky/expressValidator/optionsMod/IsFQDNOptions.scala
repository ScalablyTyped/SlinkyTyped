package typingsSlinky.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsFQDNOptions extends js.Object {
  var allow_trailing_dot: js.UndefOr[Boolean] = js.native
  var allow_underscores: js.UndefOr[Boolean] = js.native
  var require_tld: js.UndefOr[Boolean] = js.native
}

object IsFQDNOptions {
  @scala.inline
  def apply(): IsFQDNOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsFQDNOptions]
  }
  @scala.inline
  implicit class IsFQDNOptionsOps[Self <: IsFQDNOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow_trailing_dot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_trailing_dot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_trailing_dot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_trailing_dot")(js.undefined)
        ret
    }
    @scala.inline
    def withAllow_underscores(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_underscores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_underscores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_underscores")(js.undefined)
        ret
    }
    @scala.inline
    def withRequire_tld(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require_tld")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequire_tld: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require_tld")(js.undefined)
        ret
    }
  }
  
}

