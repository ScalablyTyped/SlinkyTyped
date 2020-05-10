package typingsSlinky.cassandraDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNextExecution extends js.Object {
  var nextExecution: js.Function = js.native
}

object AnonNextExecution {
  @scala.inline
  def apply(nextExecution: js.Function): AnonNextExecution = {
    val __obj = js.Dynamic.literal(nextExecution = nextExecution.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNextExecution]
  }
  @scala.inline
  implicit class AnonNextExecutionOps[Self <: AnonNextExecution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextExecution(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextExecution")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

