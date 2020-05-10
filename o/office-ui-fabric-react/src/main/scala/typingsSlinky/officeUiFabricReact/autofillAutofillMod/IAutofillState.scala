package typingsSlinky.officeUiFabricReact.autofillAutofillMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAutofillState extends js.Object {
  var displayValue: js.UndefOr[String] = js.native
}

object IAutofillState {
  @scala.inline
  def apply(): IAutofillState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAutofillState]
  }
  @scala.inline
  implicit class IAutofillStateOps[Self <: IAutofillState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayValue")(js.undefined)
        ret
    }
  }
  
}

