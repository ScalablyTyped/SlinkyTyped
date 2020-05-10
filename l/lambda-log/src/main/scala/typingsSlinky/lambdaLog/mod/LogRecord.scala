package typingsSlinky.lambdaLog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogRecord extends js.Object {
  var _logLevel: String = js.native
  var _tags: js.Array[String] = js.native
  var meta: js.Any = js.native
  var msg: String = js.native
}

object LogRecord {
  @scala.inline
  def apply(_logLevel: String, _tags: js.Array[String], meta: js.Any, msg: String): LogRecord = {
    val __obj = js.Dynamic.literal(_logLevel = _logLevel.asInstanceOf[js.Any], _tags = _tags.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogRecord]
  }
  @scala.inline
  implicit class LogRecordOps[Self <: LogRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_logLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_tags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeta(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

