package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dashed
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dotted
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineColor extends js.Object {
  var lineColor: String = js.native
  var lineStyle: dotted | dashed | solid = js.native
  var lineWidth: Double = js.native
  var markerColor: String = js.native
  var markerDisplayed: off | on = js.native
  var markerSize: Double = js.native
}

object LineColor {
  @scala.inline
  def apply(
    lineColor: String,
    lineStyle: dotted | dashed | solid,
    lineWidth: Double,
    markerColor: String,
    markerDisplayed: off | on,
    markerSize: Double
  ): LineColor = {
    val __obj = js.Dynamic.literal(lineColor = lineColor.asInstanceOf[js.Any], lineStyle = lineStyle.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], markerColor = markerColor.asInstanceOf[js.Any], markerDisplayed = markerDisplayed.asInstanceOf[js.Any], markerSize = markerSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineColor]
  }
  @scala.inline
  implicit class LineColorOps[Self <: LineColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLineColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineStyle(value: dotted | dashed | solid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkerColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkerDisplayed(value: off | on): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerDisplayed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkerSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

