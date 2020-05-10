package typingsSlinky.activexAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChartObject extends js.Object {
  val chartObject: js.Any = js.native
  val drawObject: js.Any = js.native
}

object AnonChartObject {
  @scala.inline
  def apply(chartObject: js.Any, drawObject: js.Any): AnonChartObject = {
    val __obj = js.Dynamic.literal(chartObject = chartObject.asInstanceOf[js.Any], drawObject = drawObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChartObject]
  }
  @scala.inline
  implicit class AnonChartObjectOps[Self <: AnonChartObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChartObject(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawObject(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawObject")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

