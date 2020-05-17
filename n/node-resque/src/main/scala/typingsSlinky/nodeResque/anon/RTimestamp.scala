package typingsSlinky.nodeResque.anon

import typingsSlinky.nodeResque.mod.Job
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTimestamp extends js.Object {
  var rTimestamp: Double = js.native
  var tasks: js.Array[Job[_]] = js.native
}

object RTimestamp {
  @scala.inline
  def apply(rTimestamp: Double, tasks: js.Array[Job[_]]): RTimestamp = {
    val __obj = js.Dynamic.literal(rTimestamp = rTimestamp.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTimestamp]
  }
  @scala.inline
  implicit class RTimestampOps[Self <: RTimestamp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTasks(value: js.Array[Job[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tasks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

