package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTipFormatter extends js.Object {
  def tipFormatter(value: Double): String = js.native
}

object AnonTipFormatter {
  @scala.inline
  def apply(tipFormatter: Double => String): AnonTipFormatter = {
    val __obj = js.Dynamic.literal(tipFormatter = js.Any.fromFunction1(tipFormatter))
    __obj.asInstanceOf[AnonTipFormatter]
  }
  @scala.inline
  implicit class AnonTipFormatterOps[Self <: AnonTipFormatter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTipFormatter(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipFormatter")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

