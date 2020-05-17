package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TipFormatter extends js.Object {
  def tipFormatter(value: Double): String = js.native
}

object TipFormatter {
  @scala.inline
  def apply(tipFormatter: Double => String): TipFormatter = {
    val __obj = js.Dynamic.literal(tipFormatter = js.Any.fromFunction1(tipFormatter))
    __obj.asInstanceOf[TipFormatter]
  }
  @scala.inline
  implicit class TipFormatterOps[Self <: TipFormatter] (val x: Self) extends AnyVal {
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

