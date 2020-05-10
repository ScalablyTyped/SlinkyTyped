package typingsSlinky.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A UI element that supports being toggled on or off. This can only be used within a KeyValue widget.
  *
  *     var switchKeyValue = CardService.newKeyValue()
  *         .setTopLabel("Switch key value widget label")
  *         .setContent("This is a key value widget with a switch on the right")
  *         .setSwitch(CardService.newSwitch()
  *             .setFieldName("form_input_switch_key")
  *             .setValue("form_input_switch_value")
  *             .setOnChangeAction(CardService.newAction()
  *                 .setFunctionName("handleSwitchChange")));
  */
@js.native
trait Switch extends js.Object {
  def setFieldName(fieldName: String): Switch = js.native
  def setOnChangeAction(action: Action): Switch = js.native
  def setSelected(selected: Boolean): Switch = js.native
  def setValue(value: String): Switch = js.native
}

object Switch {
  @scala.inline
  def apply(
    setFieldName: String => Switch,
    setOnChangeAction: Action => Switch,
    setSelected: Boolean => Switch,
    setValue: String => Switch
  ): Switch = {
    val __obj = js.Dynamic.literal(setFieldName = js.Any.fromFunction1(setFieldName), setOnChangeAction = js.Any.fromFunction1(setOnChangeAction), setSelected = js.Any.fromFunction1(setSelected), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[Switch]
  }
  @scala.inline
  implicit class SwitchOps[Self <: Switch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetFieldName(value: String => Switch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFieldName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOnChangeAction(value: Action => Switch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOnChangeAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSelected(value: Boolean => Switch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetValue(value: String => Switch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

