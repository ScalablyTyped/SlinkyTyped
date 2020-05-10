package typingsSlinky.formatjsIntlRelativetimeformat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelativeTimeFormat extends js.Object {
  def format(value: Double, unit: FormattableUnit): String = js.native
  def formatToParts(value: Double, unit: FormattableUnit): js.Array[Part] = js.native
  def resolvedOptions(): ResolvedIntlRelativeTimeFormatOptions = js.native
}

object RelativeTimeFormat {
  @scala.inline
  def apply(
    format: (Double, FormattableUnit) => String,
    formatToParts: (Double, FormattableUnit) => js.Array[Part],
    resolvedOptions: () => ResolvedIntlRelativeTimeFormatOptions
  ): RelativeTimeFormat = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction2(format), formatToParts = js.Any.fromFunction2(formatToParts), resolvedOptions = js.Any.fromFunction0(resolvedOptions))
    __obj.asInstanceOf[RelativeTimeFormat]
  }
  @scala.inline
  implicit class RelativeTimeFormatOps[Self <: RelativeTimeFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: (Double, FormattableUnit) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFormatToParts(value: (Double, FormattableUnit) => js.Array[Part]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatToParts")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withResolvedOptions(value: () => ResolvedIntlRelativeTimeFormatOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedOptions")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

