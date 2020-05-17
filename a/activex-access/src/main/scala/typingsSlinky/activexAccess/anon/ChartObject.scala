package typingsSlinky.activexAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartObject extends js.Object {
  val chartObject: js.Any = js.native
  val drawObject: js.Any = js.native
}

object ChartObject {
  @scala.inline
  def apply(chartObject: js.Any, drawObject: js.Any): ChartObject = {
    val __obj = js.Dynamic.literal(chartObject = chartObject.asInstanceOf[js.Any], drawObject = drawObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartObject]
  }
  @scala.inline
  implicit class ChartObjectOps[Self <: ChartObject] (val x: Self) extends AnyVal {
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

