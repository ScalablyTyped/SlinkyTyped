package typingsSlinky.formatNumber.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFormatNumberOverrideOptions extends js.Object {
  var noSeparator: js.UndefOr[Boolean] = js.native
  var noUnits: js.UndefOr[Boolean] = js.native
}

object IFormatNumberOverrideOptions {
  @scala.inline
  def apply(): IFormatNumberOverrideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFormatNumberOverrideOptions]
  }
  @scala.inline
  implicit class IFormatNumberOverrideOptionsOps[Self <: IFormatNumberOverrideOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoSeparator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withNoUnits(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noUnits")(js.undefined)
        ret
    }
  }
  
}

