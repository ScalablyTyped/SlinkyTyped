package typingsSlinky.log4js.mod

import typingsSlinky.log4js.log4jsStrings.noLogFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoLogFilterAppender extends Appender {
  // the name of an appender, defined in the same configuration, that you want to filter.
  var appender: String = js.native
  // the regular expression (or the regular expressions if you provide an array of values)
  // will be used for evaluating the events to pass to the appender.
  // The events, which will match the regular expression, will be excluded and so not logged.
  var exclude: String | js.Array[String] = js.native
  var `type`: noLogFilter = js.native
}

object NoLogFilterAppender {
  @scala.inline
  def apply(appender: String, exclude: String | js.Array[String], `type`: noLogFilter): NoLogFilterAppender = {
    val __obj = js.Dynamic.literal(appender = appender.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoLogFilterAppender]
  }
  @scala.inline
  implicit class NoLogFilterAppenderOps[Self <: NoLogFilterAppender] (val x: Self) extends AnyVal {
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
    def withExclude(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: noLogFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

