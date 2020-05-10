package typingsSlinky.log4js.mod

import typingsSlinky.log4js.log4jsStrings.logLevelFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogLevelFilterAppender extends Appender {
  // the name of an appender, defined in the same configuration, that you want to filter
  var appender: String = js.native
  // the minimum level of event to allow through the filter
  var level: String = js.native
  // (defaults to FATAL) - the maximum level of event to allow through the filter
  var maxLevel: js.UndefOr[String] = js.native
  var `type`: logLevelFilter = js.native
}

object LogLevelFilterAppender {
  @scala.inline
  def apply(appender: String, level: String, `type`: logLevelFilter): LogLevelFilterAppender = {
    val __obj = js.Dynamic.literal(appender = appender.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogLevelFilterAppender]
  }
  @scala.inline
  implicit class LogLevelFilterAppenderOps[Self <: LogLevelFilterAppender] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppender(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: logLevelFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLevel")(js.undefined)
        ret
    }
  }
  
}

