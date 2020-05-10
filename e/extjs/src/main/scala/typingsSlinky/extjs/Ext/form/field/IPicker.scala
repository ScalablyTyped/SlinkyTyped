package typingsSlinky.extjs.Ext.form.field

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPicker extends ITrigger {
  /** [Method] Aligns the picker to the input element */
  var alignPicker: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Collapses this field s picker dropdown  */
  var collapse: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Creates and returns the component to be used as this field s picker  */
  var createPicker: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Expands this field s picker dropdown  */
  var expand: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns a reference to the picker component for this field creating it if necessary by calling createPicker
  		* @returns Ext.Component The picker component
  		*/
  var getPicker: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Property] (Boolean) */
  var isExpanded: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var matchFieldWidth: js.UndefOr[Boolean] = js.native
  /** [Method] Handles the trigger click by default toggles between expanding and collapsing the picker component  */
  @JSName("onTriggerClick")
  var onTriggerClick_IPicker: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  var openCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var pickerAlign: js.UndefOr[String] = js.native
  /** [Config Option] (Number[]) */
  var pickerOffset: js.UndefOr[Array] = js.native
}

object IPicker {
  @scala.inline
  def apply(): IPicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPicker]
  }
  @scala.inline
  implicit class IPickerOps[Self <: IPicker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignPicker(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignPicker")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAlignPicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignPicker")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapse(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatePicker(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createPicker")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCreatePicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createPicker")(js.undefined)
        ret
    }
    @scala.inline
    def withExpand(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPicker(value: () => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPicker")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPicker")(js.undefined)
        ret
    }
    @scala.inline
    def withIsExpanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpanded")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchFieldWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchFieldWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchFieldWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchFieldWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTriggerClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTriggerClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnTriggerClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTriggerClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openCls")(js.undefined)
        ret
    }
    @scala.inline
    def withPickerAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPickerAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withPickerOffset(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPickerOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerOffset")(js.undefined)
        ret
    }
  }
  
}

