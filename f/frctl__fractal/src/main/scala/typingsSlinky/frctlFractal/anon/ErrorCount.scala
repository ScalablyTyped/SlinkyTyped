package typingsSlinky.frctlFractal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorCount extends js.Object {
  var errorCount: Double = js.native
}

object ErrorCount {
  @scala.inline
  def apply(errorCount: Double): ErrorCount = {
    val __obj = js.Dynamic.literal(errorCount = errorCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCount]
  }
  @scala.inline
  implicit class ErrorCountOps[Self <: ErrorCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

