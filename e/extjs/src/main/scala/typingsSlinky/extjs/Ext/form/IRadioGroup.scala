package typingsSlinky.extjs.Ext.form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRadioGroup extends ICheckboxGroup {
  /** [Method] Sets the value of the radio group
  		* @param value Object The map from names to values to be set.
  		* @returns Ext.form.CheckboxGroup this
  		*/
  @JSName("setValue")
  var setValue_IRadioGroup: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], ICheckboxGroup]] = js.native
}

object IRadioGroup {
  @scala.inline
  def apply(): IRadioGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRadioGroup]
  }
  @scala.inline
  implicit class IRadioGroupOps[Self <: IRadioGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetValue(value: /* value */ js.UndefOr[js.Any] => ICheckboxGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.undefined)
        ret
    }
  }
  
}

