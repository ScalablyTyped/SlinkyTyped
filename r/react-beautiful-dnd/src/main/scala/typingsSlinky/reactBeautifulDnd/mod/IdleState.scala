package typingsSlinky.reactBeautifulDnd.mod

import typingsSlinky.reactBeautifulDnd.reactBeautifulDndStrings.IDLE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdleState extends State {
  var completed: js.UndefOr[CompletedDrag] = js.native
  var phase: IDLE = js.native
  var shouldFlush: Boolean = js.native
}

object IdleState {
  @scala.inline
  def apply(phase: IDLE, shouldFlush: Boolean): IdleState = {
    val __obj = js.Dynamic.literal(phase = phase.asInstanceOf[js.Any], shouldFlush = shouldFlush.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdleState]
  }
  @scala.inline
  implicit class IdleStateOps[Self <: IdleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPhase(value: IDLE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShouldFlush(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldFlush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompleted(value: CompletedDrag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completed")(js.undefined)
        ret
    }
  }
  
}

