package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.center
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.end
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelHalign extends js.Object {
  var labelHalign: center | end | start = js.native
  var labelStyle: js.Object = js.native
  var maximizedSvgStyle: js.Object = js.native
  var minimizedSvgStyle: js.Object = js.native
  var showCount: on | off | auto = js.native
  var svgStyle: js.Object = js.native
}

object LabelHalign {
  @scala.inline
  def apply(
    labelHalign: center | end | start,
    labelStyle: js.Object,
    maximizedSvgStyle: js.Object,
    minimizedSvgStyle: js.Object,
    showCount: on | off | auto,
    svgStyle: js.Object
  ): LabelHalign = {
    val __obj = js.Dynamic.literal(labelHalign = labelHalign.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], maximizedSvgStyle = maximizedSvgStyle.asInstanceOf[js.Any], minimizedSvgStyle = minimizedSvgStyle.asInstanceOf[js.Any], showCount = showCount.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelHalign]
  }
  @scala.inline
  implicit class LabelHalignOps[Self <: LabelHalign] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withMaximizedSvgStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximizedSvgStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimizedSvgStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimizedSvgStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowCount(value: on | off | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSvgStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgStyle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

