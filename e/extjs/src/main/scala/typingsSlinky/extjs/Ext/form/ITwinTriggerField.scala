package typingsSlinky.extjs.Ext.form

import typingsSlinky.extjs.Ext.ICompositeElement
import typingsSlinky.extjs.Ext.IElement
import typingsSlinky.extjs.Ext.IEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITwinTriggerField
  extends typingsSlinky.extjs.Ext.form.field.IText {
  /** [Config Option] (Boolean) */
  var editable: js.UndefOr[Boolean] = js.native
  /** [Method] Get the total width of the trigger button area
  		* @returns Number The total trigger width
  		*/
  var getTriggerWidth: js.UndefOr[js.Function0[Double]] = js.native
  /** [Config Option] (Boolean) */
  var hideTrigger: js.UndefOr[Boolean] = js.native
  /** [Property] (Ext.Element) */
  var inputCell: js.UndefOr[IElement] = js.native
  /** [Method] The function that should handle the trigger s click event
  		* @param e Ext.EventObject
  		*/
  var onTriggerClick: js.UndefOr[js.Function1[/* e */ js.UndefOr[IEventObject], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var repeatTriggerClick: js.UndefOr[Boolean] = js.native
  /** [Method] Sets the editable state of this field
  		* @param editable Boolean True to allow the user to directly edit the field text. If false is passed, the user will only be able to modify the field using the trigger. Will also add a click event to the text field which will call the trigger.
  		*/
  var setEditable: js.UndefOr[js.Function1[/* editable */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (String) */
  var triggerBaseCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var triggerCls: js.UndefOr[String] = js.native
  /** [Property] (Ext.CompositeElement) */
  var triggerEl: js.UndefOr[ICompositeElement] = js.native
  /** [Config Option] (String) */
  var triggerNoEditCls: js.UndefOr[String] = js.native
  /** [Property] (Ext.Element) */
  var triggerWrap: js.UndefOr[IElement] = js.native
  /** [Config Option] (String) */
  var triggerWrapCls: js.UndefOr[String] = js.native
}

object ITwinTriggerField {
  @scala.inline
  def apply(): ITwinTriggerField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITwinTriggerField]
  }
  @scala.inline
  implicit class ITwinTriggerFieldOps[Self <: ITwinTriggerField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTriggerWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTriggerWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTriggerWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTriggerWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withHideTrigger(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTrigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTrigger")(js.undefined)
        ret
    }
    @scala.inline
    def withInputCell(value: IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputCell")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTriggerClick(value: /* e */ js.UndefOr[IEventObject] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTriggerClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTriggerClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTriggerClick")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeatTriggerClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatTriggerClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeatTriggerClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatTriggerClick")(js.undefined)
        ret
    }
    @scala.inline
    def withSetEditable(value: /* editable */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEditable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEditable")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerBaseCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerBaseCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerBaseCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerBaseCls")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerCls")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerEl(value: ICompositeElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerEl")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerNoEditCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerNoEditCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerNoEditCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerNoEditCls")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerWrap(value: IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerWrap")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerWrapCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerWrapCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerWrapCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerWrapCls")(js.undefined)
        ret
    }
  }
  
}

