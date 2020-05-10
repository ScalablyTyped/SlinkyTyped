package typingsSlinky.globalize.globalizeMod

import typingsSlinky.globalize.globalizeStrings.long
import typingsSlinky.globalize.globalizeStrings.narrow
import typingsSlinky.globalize.globalizeStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnitFormatterOptions extends js.Object {
  /**
  		 * form: [String] eg. "long", "short" or "narrow".
  		 */
  var form: js.UndefOr[long | short | narrow] = js.native
  /**
  		 * numberFormatter: [Function] a number formatter function. Defaults to Globalize .numberFormatter() for the current locale using the default options.
  		 */
  var numberFormatter: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberFormatterOptions */ js.Any
  ] = js.native
}

object UnitFormatterOptions {
  @scala.inline
  def apply(): UnitFormatterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnitFormatterOptions]
  }
  @scala.inline
  implicit class UnitFormatterOptionsOps[Self <: UnitFormatterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForm(value: long | short | narrow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberFormatter(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberFormatterOptions */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberFormatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberFormatter")(js.undefined)
        ret
    }
  }
  
}

