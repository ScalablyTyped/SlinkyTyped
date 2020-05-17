package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.center
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.horizontal
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.inner
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.outer
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rotated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HoverColor extends js.Object {
  var borderColor: String = js.native
  var borderWidth: Double = js.native
  var hoverColor: String = js.native
  var labelDisplay: horizontal | rotated | off | auto = js.native
  var labelHalign: inner | outer | center = js.native
  var labelMinLength: Double = js.native
  var labelStyle: js.Object = js.native
  var selectedInnerColor: String = js.native
  var selectedOuterColor: String = js.native
  var showDisclosure: on | off = js.native
}

object HoverColor {
  @scala.inline
  def apply(
    borderColor: String,
    borderWidth: Double,
    hoverColor: String,
    labelDisplay: horizontal | rotated | off | auto,
    labelHalign: inner | outer | center,
    labelMinLength: Double,
    labelStyle: js.Object,
    selectedInnerColor: String,
    selectedOuterColor: String,
    showDisclosure: on | off
  ): HoverColor = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], hoverColor = hoverColor.asInstanceOf[js.Any], labelDisplay = labelDisplay.asInstanceOf[js.Any], labelHalign = labelHalign.asInstanceOf[js.Any], labelMinLength = labelMinLength.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], selectedInnerColor = selectedInnerColor.asInstanceOf[js.Any], selectedOuterColor = selectedOuterColor.asInstanceOf[js.Any], showDisclosure = showDisclosure.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoverColor]
  }
  @scala.inline
  implicit class HoverColorOps[Self <: HoverColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelDisplay(value: horizontal | rotated | off | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelHalign(value: inner | outer | center): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelHalign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelMinLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelMinLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedInnerColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedInnerColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedOuterColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedOuterColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowDisclosure(value: on | off): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDisclosure")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

