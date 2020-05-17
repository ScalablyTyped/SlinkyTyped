package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dashed
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.dotted
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineStyle extends js.Object {
  var lineColor: String = js.native
  var lineStyle: dotted | dashed | solid = js.native
  var lineWidth: Double = js.native
  var rendered: on | off | auto = js.native
}

object LineStyle {
  @scala.inline
  def apply(
    lineColor: String,
    lineStyle: dotted | dashed | solid,
    lineWidth: Double,
    rendered: on | off | auto
  ): LineStyle = {
    val __obj = js.Dynamic.literal(lineColor = lineColor.asInstanceOf[js.Any], lineStyle = lineStyle.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineStyle]
  }
  @scala.inline
  implicit class LineStyleOps[Self <: LineStyle] (val x: Self) extends AnyVal {
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
    def withRendered(value: on | off | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendered")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

