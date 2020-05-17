package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.center
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.end
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HoverBackgroundColor extends js.Object {
  var backgroundColor: String = js.native
  var borderColor: String = js.native
  var hoverBackgroundColor: String = js.native
  var hoverInnerColor: String = js.native
  var hoverOuterColor: String = js.native
  var isolate: off | on = js.native
  var labelHalign: center | end | start = js.native
  var labelStyle: js.Object = js.native
  var selectedBackgroundColor: String = js.native
  var selectedInnerColor: String = js.native
  var selectedOuterColor: String = js.native
  var useNodeColor: on | off = js.native
}

object HoverBackgroundColor {
  @scala.inline
  def apply(
    backgroundColor: String,
    borderColor: String,
    hoverBackgroundColor: String,
    hoverInnerColor: String,
    hoverOuterColor: String,
    isolate: off | on,
    labelHalign: center | end | start,
    labelStyle: js.Object,
    selectedBackgroundColor: String,
    selectedInnerColor: String,
    selectedOuterColor: String,
    useNodeColor: on | off
  ): HoverBackgroundColor = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], hoverBackgroundColor = hoverBackgroundColor.asInstanceOf[js.Any], hoverInnerColor = hoverInnerColor.asInstanceOf[js.Any], hoverOuterColor = hoverOuterColor.asInstanceOf[js.Any], isolate = isolate.asInstanceOf[js.Any], labelHalign = labelHalign.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], selectedBackgroundColor = selectedBackgroundColor.asInstanceOf[js.Any], selectedInnerColor = selectedInnerColor.asInstanceOf[js.Any], selectedOuterColor = selectedOuterColor.asInstanceOf[js.Any], useNodeColor = useNodeColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoverBackgroundColor]
  }
  @scala.inline
  implicit class HoverBackgroundColorOps[Self <: HoverBackgroundColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverInnerColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverInnerColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverOuterColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverOuterColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsolate(value: off | on): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isolate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelHalign(value: center | end | start): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelHalign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedBackgroundColor")(value.asInstanceOf[js.Any])
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
    def withUseNodeColor(value: on | off): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNodeColor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

