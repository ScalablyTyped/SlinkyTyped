package typingsSlinky.onesignalCordovaPlugin

import typingsSlinky.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSLogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLogLevel extends js.Object {
  var logLevel: OSLogLevel = js.native
  var visualLevel: OSLogLevel = js.native
}

object AnonLogLevel {
  @scala.inline
  def apply(logLevel: OSLogLevel, visualLevel: OSLogLevel): AnonLogLevel = {
    val __obj = js.Dynamic.literal(logLevel = logLevel.asInstanceOf[js.Any], visualLevel = visualLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLogLevel]
  }
  @scala.inline
  implicit class AnonLogLevelOps[Self <: AnonLogLevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogLevel(value: OSLogLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisualLevel(value: OSLogLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualLevel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

