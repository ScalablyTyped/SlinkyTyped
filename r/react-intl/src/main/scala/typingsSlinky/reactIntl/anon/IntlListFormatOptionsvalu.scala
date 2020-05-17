package typingsSlinky.reactIntl.anon

import slinky.core.TagMod
import typingsSlinky.reactIntl.reactIntlStrings.`best fit`
import typingsSlinky.reactIntl.reactIntlStrings.conjunction
import typingsSlinky.reactIntl.reactIntlStrings.disjunction
import typingsSlinky.reactIntl.reactIntlStrings.long
import typingsSlinky.reactIntl.reactIntlStrings.lookup
import typingsSlinky.reactIntl.reactIntlStrings.narrow
import typingsSlinky.reactIntl.reactIntlStrings.short
import typingsSlinky.reactIntl.reactIntlStrings.unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @formatjs/intl-listformat.@formatjs/intl-listformat.IntlListFormatOptions & {  value  :std.Array<react.react.ReactNode>} */
@js.native
trait IntlListFormatOptionsvalu extends js.Object {
  /**
    * The locale matching algorithm to use.
    * Possible values are "lookup" and "best fit"; the default is "best fit".
    * For information about this option, see
    * https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_negotiation.
    */
  var localeMatcher: js.UndefOr[(`best fit`) | lookup] = js.native
  /**
    * The length of the internationalized message. Possible values are:
    * - "long" (default, e.g., in 1 month)
    * - "short" (e.g., in 1 mo.),
    * - or "narrow" (e.g., in 1 mo.).
    * The narrow style could be similar to the short style for some locales.
    */
  var style: js.UndefOr[long | short | narrow] = js.native
  /**
    * The format of output message. Possible values are:
    * - "always" (default, e.g., 1 day ago),
    * - or "auto" (e.g., yesterday).
    * The "auto" value allows to not always have to
    * use numeric values in the output.
    */
  var `type`: js.UndefOr[conjunction | disjunction | unit] = js.native
  var value: js.Array[TagMod[Any]] = js.native
}

object IntlListFormatOptionsvalu {
  @scala.inline
  def apply(value: js.Array[TagMod[Any]]): IntlListFormatOptionsvalu = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntlListFormatOptionsvalu]
  }
  @scala.inline
  implicit class IntlListFormatOptionsvaluOps[Self <: IntlListFormatOptionsvalu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: js.Array[TagMod[Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocaleMatcher(value: (`best fit`) | lookup): Self = {
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
    @scala.inline
    def withStyle(value: long | short | narrow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: conjunction | disjunction | unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

