package typingsSlinky.angularCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableLongStackTrace extends js.Object {
  var enableLongStackTrace: js.UndefOr[Boolean] = js.native
}

object EnableLongStackTrace {
  @scala.inline
  def apply(): EnableLongStackTrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableLongStackTrace]
  }
  @scala.inline
  implicit class EnableLongStackTraceOps[Self <: EnableLongStackTrace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableLongStackTrace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLongStackTrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableLongStackTrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLongStackTrace")(js.undefined)
        ret
    }
  }
  
}

