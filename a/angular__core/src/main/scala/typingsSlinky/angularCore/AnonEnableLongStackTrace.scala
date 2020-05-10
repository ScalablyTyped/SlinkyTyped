package typingsSlinky.angularCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEnableLongStackTrace extends js.Object {
  var enableLongStackTrace: js.UndefOr[Boolean] = js.native
}

object AnonEnableLongStackTrace {
  @scala.inline
  def apply(): AnonEnableLongStackTrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonEnableLongStackTrace]
  }
  @scala.inline
  implicit class AnonEnableLongStackTraceOps[Self <: AnonEnableLongStackTrace] (val x: Self) extends AnyVal {
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

