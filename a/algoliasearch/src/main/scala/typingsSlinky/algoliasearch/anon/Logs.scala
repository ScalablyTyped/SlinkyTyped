package typingsSlinky.algoliasearch.anon

import typingsSlinky.algoliasearch.mod.Log
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logs extends js.Object {
  var logs: js.Array[Log] = js.native
}

object Logs {
  @scala.inline
  def apply(logs: js.Array[Log]): Logs = {
    val __obj = js.Dynamic.literal(logs = logs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Logs]
  }
  @scala.inline
  implicit class LogsOps[Self <: Logs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogs(value: js.Array[Log]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

