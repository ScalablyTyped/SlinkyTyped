package typingsSlinky.formatjsIntlUnifiedNumberformat.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@formatjs/intl-unified-numberformat.@formatjs/intl-unified-numberformat.UnifiedNumberFormatOptions, 'localeMatcher'> */
@js.native
trait PickUnifiedNumberFormatOp extends js.Object {
  var localeMatcher: js.UndefOr[String] = js.native
}

object PickUnifiedNumberFormatOp {
  @scala.inline
  def apply(): PickUnifiedNumberFormatOp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickUnifiedNumberFormatOp]
  }
  @scala.inline
  implicit class PickUnifiedNumberFormatOpOps[Self <: PickUnifiedNumberFormatOp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocaleMatcher(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeMatcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocaleMatcher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeMatcher")(js.undefined)
        ret
    }
  }
  
}

