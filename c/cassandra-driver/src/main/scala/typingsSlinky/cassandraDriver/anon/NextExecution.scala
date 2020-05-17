package typingsSlinky.cassandraDriver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NextExecution extends js.Object {
  var nextExecution: js.Function = js.native
}

object NextExecution {
  @scala.inline
  def apply(nextExecution: js.Function): NextExecution = {
    val __obj = js.Dynamic.literal(nextExecution = nextExecution.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextExecution]
  }
  @scala.inline
  implicit class NextExecutionOps[Self <: NextExecution] (val x: Self) extends AnyVal {
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

