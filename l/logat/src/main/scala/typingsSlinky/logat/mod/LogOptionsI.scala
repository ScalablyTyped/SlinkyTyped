package typingsSlinky.logat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogOptionsI extends js.Object {
  var logFileName: js.UndefOr[String] = js.native
  var logLevel: js.UndefOr[Double] = js.native
  var logMethod: js.UndefOr[Double] = js.native
}

object LogOptionsI {
  @scala.inline
  def apply(): LogOptionsI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogOptionsI]
  }
  @scala.inline
  implicit class LogOptionsIOps[Self <: LogOptionsI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logFileName")(js.undefined)
        ret
    }
    @scala.inline
    def withLogLevel(value: Double): Self = {
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
    def withLogMethod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logMethod")(js.undefined)
        ret
    }
  }
  
}

