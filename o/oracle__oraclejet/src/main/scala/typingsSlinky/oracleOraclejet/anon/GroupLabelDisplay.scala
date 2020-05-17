package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.bottom
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.center
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.end
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.header
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.node
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.start
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupLabelDisplay extends js.Object {
  var groupLabelDisplay: node | off | header = js.native
  var header: HoverBackgroundColor = js.native
  var hoverColor: String = js.native
  var labelDisplay: off | node = js.native
  var labelHalign: start | end | center = js.native
  var labelMinLength: Double = js.native
  var labelStyle: js.Object = js.native
  var labelValign: top | bottom | center = js.native
  var selectedInnerColor: String = js.native
  var selectedOuterColor: String = js.native
}

object GroupLabelDisplay {
  @scala.inline
  def apply(
    groupLabelDisplay: node | off | header,
    header: HoverBackgroundColor,
    hoverColor: String,
    labelDisplay: off | node,
    labelHalign: start | end | center,
    labelMinLength: Double,
    labelStyle: js.Object,
    labelValign: top | bottom | center,
    selectedInnerColor: String,
    selectedOuterColor: String
  ): GroupLabelDisplay = {
    val __obj = js.Dynamic.literal(groupLabelDisplay = groupLabelDisplay.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], hoverColor = hoverColor.asInstanceOf[js.Any], labelDisplay = labelDisplay.asInstanceOf[js.Any], labelHalign = labelHalign.asInstanceOf[js.Any], labelMinLength = labelMinLength.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], labelValign = labelValign.asInstanceOf[js.Any], selectedInnerColor = selectedInnerColor.asInstanceOf[js.Any], selectedOuterColor = selectedOuterColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupLabelDisplay]
  }
  @scala.inline
  implicit class GroupLabelDisplayOps[Self <: GroupLabelDisplay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupLabelDisplay(value: node | off | header): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupLabelDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: HoverBackgroundColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelDisplay(value: off | node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelHalign(value: start | end | center): Self = {
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
    def withLabelValign(value: top | bottom | center): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelValign")(value.asInstanceOf[js.Any])
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
  }
  
}

