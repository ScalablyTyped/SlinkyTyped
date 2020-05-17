package typingsSlinky.minappEnv.Intl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberFormat extends js.Object {
  def format(value: Double): String = js.native
  def resolvedOptions(): ResolvedNumberFormatOptions = js.native
}

object NumberFormat {
  @scala.inline
  def apply(format: Double => String, resolvedOptions: () => ResolvedNumberFormatOptions): NumberFormat = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), resolvedOptions = js.Any.fromFunction0(resolvedOptions))
    __obj.asInstanceOf[NumberFormat]
  }
  @scala.inline
  implicit class NumberFormatOps[Self <: NumberFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResolvedOptions(value: () => ResolvedNumberFormatOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedOptions")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

