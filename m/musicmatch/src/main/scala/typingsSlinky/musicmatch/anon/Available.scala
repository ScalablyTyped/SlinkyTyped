package typingsSlinky.musicmatch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Available extends js.Object {
  var available: Double = js.native
  var execute_time: Double = js.native
  var status_code: Double = js.native
}

object Available {
  @scala.inline
  def apply(available: Double, execute_time: Double, status_code: Double): Available = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], execute_time = execute_time.asInstanceOf[js.Any], status_code = status_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Available]
  }
  @scala.inline
  implicit class AvailableOps[Self <: Available] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailable(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecute_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus_code(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status_code")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

