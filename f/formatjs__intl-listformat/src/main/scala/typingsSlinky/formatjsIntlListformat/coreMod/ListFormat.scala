package typingsSlinky.formatjsIntlListformat.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFormat extends js.Object {
  def format(elements: js.Array[String]): String = js.native
  def formatToParts(elements: js.Array[String]): js.Array[Part] = js.native
  def resolvedOptions(): ResolvedIntlListFormatOptions = js.native
}

object ListFormat {
  @scala.inline
  def apply(
    format: js.Array[String] => String,
    formatToParts: js.Array[String] => js.Array[Part],
    resolvedOptions: () => ResolvedIntlListFormatOptions
  ): ListFormat = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), formatToParts = js.Any.fromFunction1(formatToParts), resolvedOptions = js.Any.fromFunction0(resolvedOptions))
    __obj.asInstanceOf[ListFormat]
  }
  @scala.inline
  implicit class ListFormatOps[Self <: ListFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: js.Array[String] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormatToParts(value: js.Array[String] => js.Array[Part]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatToParts")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResolvedOptions(value: () => ResolvedIntlListFormatOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedOptions")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

