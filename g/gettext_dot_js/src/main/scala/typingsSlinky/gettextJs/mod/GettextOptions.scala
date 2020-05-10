package typingsSlinky.gettextJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GettextOptions extends js.Object {
  var ctxt_delimiter: js.UndefOr[String] = js.native
  var domain: js.UndefOr[String] = js.native
  var locale: js.UndefOr[String] = js.native
  var plural_func: js.UndefOr[PluralForm] = js.native
}

object GettextOptions {
  @scala.inline
  def apply(): GettextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GettextOptions]
  }
  @scala.inline
  implicit class GettextOptionsOps[Self <: GettextOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCtxt_delimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctxt_delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCtxt_delimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctxt_delimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withPlural_func(value: /* n */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plural_func")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPlural_func: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plural_func")(js.undefined)
        ret
    }
  }
  
}

