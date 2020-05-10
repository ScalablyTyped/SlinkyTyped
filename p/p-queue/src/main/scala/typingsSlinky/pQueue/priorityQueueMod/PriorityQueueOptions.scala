package typingsSlinky.pQueue.priorityQueueMod

import typingsSlinky.pQueue.optionsMod.QueueAddOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PriorityQueueOptions extends QueueAddOptions {
  var priority: js.UndefOr[Double] = js.native
}

object PriorityQueueOptions {
  @scala.inline
  def apply(): PriorityQueueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PriorityQueueOptions]
  }
  @scala.inline
  implicit class PriorityQueueOptionsOps[Self <: PriorityQueueOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
  }
  
}

