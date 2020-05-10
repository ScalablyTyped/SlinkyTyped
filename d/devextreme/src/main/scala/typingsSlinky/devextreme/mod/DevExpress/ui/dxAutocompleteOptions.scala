package typingsSlinky.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxAutocompleteOptions extends dxDropDownListOptions[dxAutocomplete] {
  /** Specifies the maximum count of items displayed by the widget. */
  var maxItemCount: js.UndefOr[Double] = js.native
}

object dxAutocompleteOptions {
  @scala.inline
  def apply(): dxAutocompleteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxAutocompleteOptions]
  }
  @scala.inline
  implicit class dxAutocompleteOptionsOps[Self <: dxAutocompleteOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxItemCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxItemCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxItemCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxItemCount")(js.undefined)
        ret
    }
  }
  
}

