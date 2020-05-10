package typingsSlinky.jestEnvironmentJsdom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStackTraceLimit extends js.Object {
  var stackTraceLimit: Double = js.native
}

object AnonStackTraceLimit {
  @scala.inline
  def apply(stackTraceLimit: Double): AnonStackTraceLimit = {
    val __obj = js.Dynamic.literal(stackTraceLimit = stackTraceLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStackTraceLimit]
  }
  @scala.inline
  implicit class AnonStackTraceLimitOps[Self <: AnonStackTraceLimit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStackTraceLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackTraceLimit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

