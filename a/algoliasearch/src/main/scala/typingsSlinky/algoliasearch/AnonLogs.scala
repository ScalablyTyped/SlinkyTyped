package typingsSlinky.algoliasearch

import typingsSlinky.algoliasearch.mod.Log
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLogs extends js.Object {
  var logs: js.Array[Log] = js.native
}

object AnonLogs {
  @scala.inline
  def apply(logs: js.Array[Log]): AnonLogs = {
    val __obj = js.Dynamic.literal(logs = logs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLogs]
  }
  @scala.inline
  implicit class AnonLogsOps[Self <: AnonLogs] (val x: Self) extends AnyVal {
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

