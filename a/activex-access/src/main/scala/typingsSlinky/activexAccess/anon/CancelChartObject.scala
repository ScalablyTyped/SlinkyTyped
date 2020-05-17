package typingsSlinky.activexAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelChartObject extends js.Object {
  val Cancel: js.Any = js.native
  val chartObject: js.Any = js.native
  val drawObject: js.Any = js.native
}

object CancelChartObject {
  @scala.inline
  def apply(Cancel: js.Any, chartObject: js.Any, drawObject: js.Any): CancelChartObject = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], chartObject = chartObject.asInstanceOf[js.Any], drawObject = drawObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelChartObject]
  }
  @scala.inline
  implicit class CancelChartObjectOps[Self <: CancelChartObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cancel")(value.asInstanceOf[js.Any])
        ret
    }
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

