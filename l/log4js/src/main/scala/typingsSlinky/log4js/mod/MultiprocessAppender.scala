package typingsSlinky.log4js.mod

import typingsSlinky.log4js.log4jsStrings.master
import typingsSlinky.log4js.log4jsStrings.multiprocess
import typingsSlinky.log4js.log4jsStrings.worker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiprocessAppender extends Appender {
  // (only needed if mode == master)- the name of the appender to send the log events to
  var appender: js.UndefOr[String] = js.native
  // (defaults to localhost) - the host/IP address to listen on, or send to
  var loggerHost: js.UndefOr[String] = js.native
  // (defaults to 5000) - the port to listen on, or send to
  var loggerPort: js.UndefOr[Double] = js.native
  // controls whether the appender listens for log events sent over the network, or is responsible for serialising events and sending them to a server.
  var mode: master | worker = js.native
  var `type`: multiprocess = js.native
}

object MultiprocessAppender {
  @scala.inline
  def apply(mode: master | worker, `type`: multiprocess): MultiprocessAppender = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiprocessAppender]
  }
  @scala.inline
  implicit class MultiprocessAppenderOps[Self <: MultiprocessAppender] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: master | worker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: multiprocess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppender(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appender")(js.undefined)
        ret
    }
    @scala.inline
    def withLoggerHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggerHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggerHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggerHost")(js.undefined)
        ret
    }
    @scala.inline
    def withLoggerPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggerPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggerPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggerPort")(js.undefined)
        ret
    }
  }
  
}

