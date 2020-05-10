package typingsSlinky.globalize.globalizeMod

import typingsSlinky.globalize.globalizeStrings.accounting
import typingsSlinky.globalize.globalizeStrings.code
import typingsSlinky.globalize.globalizeStrings.name
import typingsSlinky.globalize.globalizeStrings.symbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrencyFormatterOptions extends CommonNumberFormatterOptions {
  /**
  		* symbol (default), accounting, code or name.
  		*/
  var style: js.UndefOr[symbol | accounting | code | name] = js.native
}

object CurrencyFormatterOptions {
  @scala.inline
  def apply(): CurrencyFormatterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrencyFormatterOptions]
  }
  @scala.inline
  implicit class CurrencyFormatterOptionsOps[Self <: CurrencyFormatterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyle(value: symbol | accounting | code | name): Self = {
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
  }
  
}

