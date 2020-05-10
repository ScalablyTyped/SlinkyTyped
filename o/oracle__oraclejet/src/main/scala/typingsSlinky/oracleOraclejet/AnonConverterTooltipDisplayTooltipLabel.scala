package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConverterTooltipDisplayTooltipLabel extends js.Object {
  var converter: js.UndefOr[Converter[Double]] = js.native
  var tooltipDisplay: js.UndefOr[off | auto] = js.native
  var tooltipLabel: js.UndefOr[String] = js.native
}

object AnonConverterTooltipDisplayTooltipLabel {
  @scala.inline
  def apply(): AnonConverterTooltipDisplayTooltipLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonConverterTooltipDisplayTooltipLabel]
  }
  @scala.inline
  implicit class AnonConverterTooltipDisplayTooltipLabelOps[Self <: AnonConverterTooltipDisplayTooltipLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConverter(value: Converter[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("converter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConverter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("converter")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipDisplay(value: off | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipLabel")(js.undefined)
        ret
    }
  }
  
}

