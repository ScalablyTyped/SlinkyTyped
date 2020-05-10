package typingsSlinky.emberRunloop.backburnerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeferredActionQueues
  extends /* index */ StringDictionary[js.Any] {
  var queues: js.Object = js.native
  def flush(fromAutorun: Boolean): js.Any = js.native
  def schedule(queueName: String, target: js.Any, method: js.Any, args: js.Any, onceFlag: Boolean, stack: js.Any): js.Any = js.native
}

object DeferredActionQueues {
  @scala.inline
  def apply(
    flush: Boolean => js.Any,
    queues: js.Object,
    schedule: (String, js.Any, js.Any, js.Any, Boolean, js.Any) => js.Any
  ): DeferredActionQueues = {
    val __obj = js.Dynamic.literal(flush = js.Any.fromFunction1(flush), queues = queues.asInstanceOf[js.Any], schedule = js.Any.fromFunction6(schedule))
    __obj.asInstanceOf[DeferredActionQueues]
  }
  @scala.inline
  implicit class DeferredActionQueuesOps[Self <: DeferredActionQueues] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlush(value: Boolean => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQueues(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchedule(value: (String, js.Any, js.Any, js.Any, Boolean, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(js.Any.fromFunction6(value))
        ret
    }
  }
  
}

