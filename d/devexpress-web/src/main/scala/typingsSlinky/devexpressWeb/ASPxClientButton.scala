package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ASPxButton control.
  */
@js.native
trait ASPxClientButton extends ASPxClientControl {
  /**
    * Occurs on the client side when the button's checked state is changed.
    */
  var CheckedChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientButton]] = js.native
  /**
    * Occurs on the client side after a button is clicked.
    */
  var Click: ASPxClientEvent[ASPxClientButtonClickEventHandler[ASPxClientButton]] = js.native
  /**
    * Fires on the client side when the button receives input focus.
    */
  var GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientButton]] = js.native
  /**
    * Fires on the client side when the button loses input focus.
    */
  var LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientButton]] = js.native
  /**
    * Simulates a mouse click action on the button control.
    */
  def DoClick(): Unit = js.native
  /**
    * Sets input focus to the button.
    */
  def Focus(): Unit = js.native
  /**
    * Returns a value indicating whether the button is checked.
    */
  def GetChecked(): Boolean = js.native
  /**
    * Returns a value indicating whether the button is enabled.
    */
  def GetEnabled(): Boolean = js.native
  /**
    * Returns the URL pointing to the image displayed within the button.
    */
  def GetImageUrl(): String = js.native
  /**
    * Returns the text displayed within the button.
    */
  def GetText(): String = js.native
  /**
    * Sets a value that specifies the button's checked status.
    * @param value true if the button is checked; otherwise, false.
    */
  def SetChecked(value: Boolean): Unit = js.native
  /**
    * Sets a value specifying whether the button is enabled.
    * @param value true to enable the button; false to disable it.
    */
  def SetEnabled(value: Boolean): Unit = js.native
  /**
    * Sets the URL pointing to the image displayed within the button.
    * @param value A string value that is the URL to the image displayed within the button.
    */
  def SetImageUrl(value: String): Unit = js.native
  /**
    * Sets the text to be displayed within the button.
    * @param value A string value specifying the text to be displayed within the button.
    */
  def SetText(value: String): Unit = js.native
}

object ASPxClientButton {
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    CheckedChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientButton]],
    Click: ASPxClientEvent[ASPxClientButtonClickEventHandler[ASPxClientButton]],
    DoClick: () => Unit,
    Focus: () => Unit,
    GetChecked: () => Boolean,
    GetClientVisible: () => Boolean,
    GetEnabled: () => Boolean,
    GetHeight: () => Double,
    GetImageUrl: () => String,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
    GetText: () => String,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientButton]],
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientButton]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetChecked: Boolean => Unit,
    SetClientVisible: Boolean => Unit,
    SetEnabled: Boolean => Unit,
    SetHeight: Double => Unit,
    SetImageUrl: String => Unit,
    SetText: String => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    name: String
  ): ASPxClientButton = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), CheckedChanged = CheckedChanged.asInstanceOf[js.Any], Click = Click.asInstanceOf[js.Any], DoClick = js.Any.fromFunction0(DoClick), Focus = js.Any.fromFunction0(Focus), GetChecked = js.Any.fromFunction0(GetChecked), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEnabled = js.Any.fromFunction0(GetEnabled), GetHeight = js.Any.fromFunction0(GetHeight), GetImageUrl = js.Any.fromFunction0(GetImageUrl), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), GotFocus = GotFocus.asInstanceOf[js.Any], InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], LostFocus = LostFocus.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetChecked = js.Any.fromFunction1(SetChecked), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetHeight = js.Any.fromFunction1(SetHeight), SetImageUrl = js.Any.fromFunction1(SetImageUrl), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientButton]
  }
  @scala.inline
  implicit class ASPxClientButtonOps[Self <: ASPxClientButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckedChanged(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientButton]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckedChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClick(value: ASPxClientEvent[ASPxClientButtonClickEventHandler[ASPxClientButton]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DoClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Focus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetChecked(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetChecked")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetImageUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetImageUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGotFocus(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientButton]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GotFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLostFocus(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientButton]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LostFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetChecked(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetChecked")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetEnabled(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetEnabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetImageUrl(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetImageUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetText(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetText")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

