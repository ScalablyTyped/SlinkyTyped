package typingsSlinky.highcharts.mod

import typingsSlinky.highcharts.highchartsStrings.pointBreak
import typingsSlinky.highcharts.highchartsStrings.pointInBreak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxisPointBreakEventObject extends js.Object {
  var brk: Dictionary[Double] = js.native
  var point: Point = js.native
  var preventDefault: js.Function = js.native
  var target: SVGElement = js.native
  var `type`: pointBreak | pointInBreak = js.native
}

object AxisPointBreakEventObject {
  @scala.inline
  def apply(
    brk: Dictionary[Double],
    point: Point,
    preventDefault: js.Function,
    target: SVGElement,
    `type`: pointBreak | pointInBreak
  ): AxisPointBreakEventObject = {
    val __obj = js.Dynamic.literal(brk = brk.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisPointBreakEventObject]
  }
  @scala.inline
  implicit class AxisPointBreakEventObjectOps[Self <: AxisPointBreakEventObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrk(value: Dictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoint(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreventDefault(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: SVGElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: pointBreak | pointInBreak): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

