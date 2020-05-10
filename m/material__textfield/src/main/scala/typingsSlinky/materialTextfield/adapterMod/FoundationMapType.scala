package typingsSlinky.materialTextfield.adapterMod

import typingsSlinky.materialTextfield.helperTextMod.MDCTextFieldHelperTextFoundation
import typingsSlinky.materialTextfield.iconMod.MDCTextFieldIconFoundation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FoundationMapType extends js.Object {
  var helperText: js.UndefOr[MDCTextFieldHelperTextFoundation] = js.native
  var icon: js.UndefOr[MDCTextFieldIconFoundation] = js.native
}

object FoundationMapType {
  @scala.inline
  def apply(): FoundationMapType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FoundationMapType]
  }
  @scala.inline
  implicit class FoundationMapTypeOps[Self <: FoundationMapType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHelperText(value: MDCTextFieldHelperTextFoundation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helperText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelperText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helperText")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: MDCTextFieldIconFoundation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
  }
  
}

