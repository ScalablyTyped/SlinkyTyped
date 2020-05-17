package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipHelp extends js.Object {
  var tooltipHelp: js.UndefOr[String] = js.native
  var tooltipRequired: js.UndefOr[String] = js.native
}

object TooltipHelp {
  @scala.inline
  def apply(): TooltipHelp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipHelp]
  }
  @scala.inline
  implicit class TooltipHelpOps[Self <: TooltipHelp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTooltipHelp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipHelp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipHelp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipHelp")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipRequired(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipRequired")(js.undefined)
        ret
    }
  }
  
}

