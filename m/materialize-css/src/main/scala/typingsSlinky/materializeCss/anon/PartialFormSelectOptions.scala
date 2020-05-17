package typingsSlinky.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.FormSelectOptions> */
@js.native
trait PartialFormSelectOptions extends js.Object {
  var classes: js.UndefOr[String] = js.native
  var dropdownOptions: js.UndefOr[PartialDropdownOptionsAlignment] = js.native
}

object PartialFormSelectOptions {
  @scala.inline
  def apply(): PartialFormSelectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFormSelectOptions]
  }
  @scala.inline
  implicit class PartialFormSelectOptionsOps[Self <: PartialFormSelectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClasses(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownOptions(value: PartialDropdownOptionsAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownOptions")(js.undefined)
        ret
    }
  }
  
}

