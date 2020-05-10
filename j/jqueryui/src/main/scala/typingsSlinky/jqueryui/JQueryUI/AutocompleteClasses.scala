package typingsSlinky.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutocompleteClasses extends js.Object {
  var `ui-autocomplete`: js.UndefOr[String] = js.native
  var `ui-autocomplete-input`: js.UndefOr[String] = js.native
}

object AutocompleteClasses {
  @scala.inline
  def apply(): AutocompleteClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutocompleteClasses]
  }
  @scala.inline
  implicit class AutocompleteClassesOps[Self <: AutocompleteClasses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withUi-autocomplete`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-autocomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUi-autocomplete`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-autocomplete")(js.undefined)
        ret
    }
    @scala.inline
    def `withUi-autocomplete-input`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-autocomplete-input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUi-autocomplete-input`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui-autocomplete-input")(js.undefined)
        ret
    }
  }
  
}

