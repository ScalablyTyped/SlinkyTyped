package typingsSlinky.nightwatch.mod

import typingsSlinky.nightwatch.nightwatchStrings.DEBUG
import typingsSlinky.nightwatch.nightwatchStrings.INFO
import typingsSlinky.nightwatch.nightwatchStrings.SEVERE
import typingsSlinky.nightwatch.nightwatchStrings.WARNING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NightwatchLogEntry extends js.Object {
  /**
    * Severity level
    */
  var level: SEVERE | WARNING | INFO | DEBUG = js.native
  /**
    * The log entry message.
    */
  var message: String = js.native
  var source: js.UndefOr[String] = js.native
  /**
    * The time stamp of log entry in seconds.
    */
  var timestamp: Double = js.native
}

object NightwatchLogEntry {
  @scala.inline
  def apply(level: SEVERE | WARNING | INFO | DEBUG, message: String, timestamp: Double): NightwatchLogEntry = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchLogEntry]
  }
  @scala.inline
  implicit class NightwatchLogEntryOps[Self <: NightwatchLogEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLevel(value: SEVERE | WARNING | INFO | DEBUG): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

