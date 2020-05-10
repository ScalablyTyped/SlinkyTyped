package typingsSlinky.koaBunyanLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeContextOptions extends js.Object {
  var logLevel: js.UndefOr[String] = js.native
  var updateLogFields: js.UndefOr[js.Function1[/* fields */ js.Any, _]] = js.native
}

object TimeContextOptions {
  @scala.inline
  def apply(): TimeContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeContextOptions]
  }
  @scala.inline
  implicit class TimeContextOptionsOps[Self <: TimeContextOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogLevel(value: String): Self = {
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
    def withUpdateLogFields(value: /* fields */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateLogFields")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdateLogFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateLogFields")(js.undefined)
        ret
    }
  }
  
}

