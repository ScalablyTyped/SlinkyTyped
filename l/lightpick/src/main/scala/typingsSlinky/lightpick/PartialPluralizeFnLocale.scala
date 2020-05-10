package typingsSlinky.lightpick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<lightpick.lightpick.Options.Locale.PluralizeFnLocale> */
@js.native
trait PartialPluralizeFnLocale extends js.Object {
  var one: js.UndefOr[String] = js.native
  var other: js.UndefOr[String] = js.native
}

object PartialPluralizeFnLocale {
  @scala.inline
  def apply(): PartialPluralizeFnLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPluralizeFnLocale]
  }
  @scala.inline
  implicit class PartialPluralizeFnLocaleOps[Self <: PartialPluralizeFnLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOne(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("one")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOne: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("one")(js.undefined)
        ret
    }
    @scala.inline
    def withOther(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOther: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(js.undefined)
        ret
    }
  }
  
}

