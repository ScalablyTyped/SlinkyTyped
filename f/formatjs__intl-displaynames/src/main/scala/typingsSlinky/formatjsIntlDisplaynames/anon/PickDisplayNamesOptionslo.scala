package typingsSlinky.formatjsIntlDisplaynames.anon

import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.`best fit`
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.lookup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@formatjs/intl-displaynames.@formatjs/intl-displaynames/lib/intl-displaynames.DisplayNamesOptions, 'localeMatcher'> */
@js.native
trait PickDisplayNamesOptionslo extends js.Object {
  var localeMatcher: js.UndefOr[lookup | (`best fit`)] = js.native
}

object PickDisplayNamesOptionslo {
  @scala.inline
  def apply(): PickDisplayNamesOptionslo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickDisplayNamesOptionslo]
  }
  @scala.inline
  implicit class PickDisplayNamesOptionsloOps[Self <: PickDisplayNamesOptionslo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocaleMatcher(value: lookup | (`best fit`)): Self = {
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

