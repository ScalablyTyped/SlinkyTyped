package typingsSlinky.phantom.anon

import typingsSlinky.phantom.phantomStrings.debug
import typingsSlinky.phantom.phantomStrings.error
import typingsSlinky.phantom.phantomStrings.info
import typingsSlinky.phantom.phantomStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogLevel extends js.Object {
  var logLevel: js.UndefOr[debug | info | warn | error] = js.native
  var logger: js.UndefOr[Debug] = js.native
  var phantomPath: js.UndefOr[String] = js.native
  var shimPath: js.UndefOr[String] = js.native
}

object LogLevel {
  @scala.inline
  def apply(): LogLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogLevel]
  }
  @scala.inline
  implicit class LogLevelOps[Self <: LogLevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogLevel(value: debug | info | warn | error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: Debug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withPhantomPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phantomPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhantomPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phantomPath")(js.undefined)
        ret
    }
    @scala.inline
    def withShimPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shimPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShimPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shimPath")(js.undefined)
        ret
    }
  }
  
}

