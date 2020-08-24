package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConverterTooltipDisplayTooltipLabel extends js.Object {
  var converter: js.UndefOr[typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter[Double]] = js.native
  var tooltipDisplay: js.UndefOr[off | auto] = js.native
  var tooltipLabel: js.UndefOr[String] = js.native
}

object ConverterTooltipDisplayTooltipLabel {
  @scala.inline
  def apply(): ConverterTooltipDisplayTooltipLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConverterTooltipDisplayTooltipLabel]
  }
  @scala.inline
  implicit class ConverterTooltipDisplayTooltipLabelOps[Self <: ConverterTooltipDisplayTooltipLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConverter(value: typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter[Double]): Self = this.set("converter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConverter: Self = this.set("converter", js.undefined)
    @scala.inline
    def setTooltipDisplay(value: off | auto): Self = this.set("tooltipDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipDisplay: Self = this.set("tooltipDisplay", js.undefined)
    @scala.inline
    def setTooltipLabel(value: String): Self = this.set("tooltipLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipLabel: Self = this.set("tooltipLabel", js.undefined)
  }
  
}

