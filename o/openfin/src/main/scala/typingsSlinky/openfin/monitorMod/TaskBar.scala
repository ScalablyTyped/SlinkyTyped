package typingsSlinky.openfin.monitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskBar extends DipScaleRects {
  var edge: String = js.native
  var rect: Rect = js.native
}

object TaskBar {
  @scala.inline
  def apply(dipRect: Rect, edge: String, rect: Rect, scaledRect: Rect): TaskBar = {
    val __obj = js.Dynamic.literal(dipRect = dipRect.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], scaledRect = scaledRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskBar]
  }
  @scala.inline
  implicit class TaskBarOps[Self <: TaskBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdge(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRect(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rect")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

