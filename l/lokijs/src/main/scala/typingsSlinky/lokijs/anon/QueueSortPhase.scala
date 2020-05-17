package typingsSlinky.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueSortPhase extends js.Object {
  var queueSortPhase: js.UndefOr[Boolean] = js.native
}

object QueueSortPhase {
  @scala.inline
  def apply(): QueueSortPhase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueSortPhase]
  }
  @scala.inline
  implicit class QueueSortPhaseOps[Self <: QueueSortPhase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueueSortPhase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueSortPhase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueueSortPhase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueSortPhase")(js.undefined)
        ret
    }
  }
  
}

