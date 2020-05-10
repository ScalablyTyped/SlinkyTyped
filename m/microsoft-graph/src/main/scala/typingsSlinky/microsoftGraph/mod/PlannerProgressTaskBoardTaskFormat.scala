package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlannerProgressTaskBoardTaskFormat extends Entity {
  // Hint value used to order the task on the Progress view of the Task Board. The format is defined as outlined here.
  var orderHint: js.UndefOr[String] = js.native
}

object PlannerProgressTaskBoardTaskFormat {
  @scala.inline
  def apply(): PlannerProgressTaskBoardTaskFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerProgressTaskBoardTaskFormat]
  }
  @scala.inline
  implicit class PlannerProgressTaskBoardTaskFormatOps[Self <: PlannerProgressTaskBoardTaskFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrderHint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderHint")(js.undefined)
        ret
    }
  }
  
}

