package typingsSlinky.extjs.Ext.form

import typingsSlinky.extjs.Ext.IElement
import typingsSlinky.extjs.Ext.form.field.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICheckbox extends IBase {
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterBoxLabelTextTpl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterBoxLabelTpl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeBoxLabelTextTpl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeBoxLabelTpl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var boxLabel: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var boxLabelAlign: js.UndefOr[String] = js.native
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var boxLabelAttrTpl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var boxLabelCls: js.UndefOr[String] = js.native
  /** [Property] (Ext.Element) */
  var boxLabelEl: js.UndefOr[IElement] = js.native
  /** [Config Option] (Boolean) */
  var checked: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var checkedCls: js.UndefOr[String] = js.native
  /** [Method] Returns the checked state of the checkbox
  		* @returns Boolean True if checked, else false
  		*/
  @JSName("getRawValue")
  var getRawValue_ICheckbox: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the checked state of the checkbox
  		* @returns Boolean True if checked, else false
  		*/
  @JSName("getValue")
  var getValue_ICheckbox: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var inputValue: js.UndefOr[String] = js.native
  /** [Method] Resets the field s originalValue property so it matches the current value
  		* @param fromBoxInGroup Object
  		*/
  @JSName("resetOriginalValue")
  var resetOriginalValue_ICheckbox: js.UndefOr[js.Function1[/* fromBoxInGroup */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the boxLabel for this checkbox
  		* @param boxLabel String The new label
  		*/
  var setBoxLabel: js.UndefOr[js.Function1[/* boxLabel */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the checked state of the checkbox
  		* @param value Boolean/String/Number The following values will check the checkbox: true, 'true', '1', 1, or 'on', as well as a String that matches the inputValue. Any other value will uncheck the checkbox.
  		* @returns Boolean the new checked state of the checkbox
  		*/
  @JSName("setRawValue")
  var setRawValue_ICheckbox: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Sets the read only state of this field
  		* @param readOnly Object
  		*/
  @JSName("setReadOnly")
  var setReadOnly_ICheckbox: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the checked state of the checkbox and invokes change detection
  		* @param checked Boolean/String The following values will check the checkbox: true, 'true', '1', or 'on', as well as a String that matches the inputValue. Any other value will uncheck the checkbox.
  		* @returns Ext.form.field.Checkbox this
  		*/
  @JSName("setValue")
  var setValue_ICheckbox: js.UndefOr[js.Function1[/* checked */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Config Option] (String) */
  var uncheckedValue: js.UndefOr[String] = js.native
}

object ICheckbox {
  @scala.inline
  def apply(): ICheckbox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICheckbox]
  }
  @scala.inline
  implicit class ICheckboxOps[Self <: ICheckbox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterBoxLabelTextTpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterBoxLabelTextTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterBoxLabelTextTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterBoxLabelTextTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterBoxLabelTpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterBoxLabelTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterBoxLabelTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterBoxLabelTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeBoxLabelTextTpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBoxLabelTextTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeBoxLabelTextTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBoxLabelTextTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeBoxLabelTpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBoxLabelTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeBoxLabelTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBoxLabelTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxLabelAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxLabelAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxLabelAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxLabelAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxLabelAttrTpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxLabelAttrTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxLabelAttrTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxLabelAttrTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxLabelCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxLabelCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxLabelCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxLabelCls")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxLabelEl(value: IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxLabelEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxLabelEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxLabelEl")(js.undefined)
        ret
    }
    @scala.inline
    def withChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckedCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckedCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRawValue(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRawValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRawValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRawValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGetValue(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.undefined)
        ret
    }
    @scala.inline
    def withHandler(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(js.undefined)
        ret
    }
    @scala.inline
    def withInputValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputValue")(js.undefined)
        ret
    }
    @scala.inline
    def withResetOriginalValue(value: /* fromBoxInGroup */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOriginalValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResetOriginalValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOriginalValue")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBoxLabel(value: /* boxLabel */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBoxLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBoxLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBoxLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRawValue(value: /* value */ js.UndefOr[js.Any] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRawValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRawValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRawValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSetReadOnly(value: /* readOnly */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setReadOnly")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setReadOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSetValue(value: /* checked */ js.UndefOr[js.Any] => ICheckbox): Self = {
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
    @scala.inline
    def withUncheckedValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncheckedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUncheckedValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncheckedValue")(js.undefined)
        ret
    }
  }
  
}

