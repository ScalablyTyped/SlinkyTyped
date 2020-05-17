package typingsSlinky.gapiClientTaskqueue.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeasedLastHour extends js.Object {
  /** Number of tasks leased in the last hour. */
  var leasedLastHour: js.UndefOr[String] = js.native
  /** Number of tasks leased in the last minute. */
  var leasedLastMinute: js.UndefOr[String] = js.native
  /** The timestamp (in seconds since the epoch) of the oldest unfinished task. */
  var oldestTask: js.UndefOr[String] = js.native
  /** Number of tasks in the queue. */
  var totalTasks: js.UndefOr[Double] = js.native
}

object LeasedLastHour {
  @scala.inline
  def apply(): LeasedLastHour = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeasedLastHour]
  }
  @scala.inline
  implicit class LeasedLastHourOps[Self <: LeasedLastHour] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeasedLastHour(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leasedLastHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeasedLastHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leasedLastHour")(js.undefined)
        ret
    }
    @scala.inline
    def withLeasedLastMinute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leasedLastMinute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeasedLastMinute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leasedLastMinute")(js.undefined)
        ret
    }
    @scala.inline
    def withOldestTask(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldestTask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldestTask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldestTask")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalTasks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalTasks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalTasks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalTasks")(js.undefined)
        ret
    }
  }
  
}

