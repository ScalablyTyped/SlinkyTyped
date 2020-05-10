package typingsSlinky.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompletedDrag extends js.Object {
  var afterCritical: LiftEffect = js.native
  var critical: Critical = js.native
  var impact: DragImpact = js.native
  var result: DropResult = js.native
}

object CompletedDrag {
  @scala.inline
  def apply(afterCritical: LiftEffect, critical: Critical, impact: DragImpact, result: DropResult): CompletedDrag = {
    val __obj = js.Dynamic.literal(afterCritical = afterCritical.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletedDrag]
  }
  @scala.inline
  implicit class CompletedDragOps[Self <: CompletedDrag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterCritical(value: LiftEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCritical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCritical(value: Critical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("critical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImpact(value: DragImpact): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: DropResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

