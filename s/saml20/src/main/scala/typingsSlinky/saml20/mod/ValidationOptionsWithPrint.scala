package typingsSlinky.saml20.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationOptionsWithPrint extends ValidationOptions {
  var audience: js.UndefOr[js.Any] = js.native
  var bypassExpiration: js.UndefOr[Boolean] = js.native
  var thumbprint: String = js.native
}

object ValidationOptionsWithPrint {
  @scala.inline
  def apply(thumbprint: String): ValidationOptionsWithPrint = {
    val __obj = js.Dynamic.literal(thumbprint = thumbprint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationOptionsWithPrint]
  }
  @scala.inline
  implicit class ValidationOptionsWithPrintOps[Self <: ValidationOptionsWithPrint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThumbprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudience(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audience")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudience: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audience")(js.undefined)
        ret
    }
    @scala.inline
    def withBypassExpiration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bypassExpiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBypassExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bypassExpiration")(js.undefined)
        ret
    }
  }
  
}

