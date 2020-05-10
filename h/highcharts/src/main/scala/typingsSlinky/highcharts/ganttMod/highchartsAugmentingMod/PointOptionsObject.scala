package typingsSlinky.highcharts.ganttMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointOptionsObject extends js.Object {
  /**
    * The ending X value of the range point.
    */
  var x2: js.UndefOr[Double] = js.native
}

object PointOptionsObject {
  @scala.inline
  def apply(): PointOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointOptionsObject]
  }
  @scala.inline
  implicit class PointOptionsObjectOps[Self <: PointOptionsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withX2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x2")(js.undefined)
        ret
    }
  }
  
}

