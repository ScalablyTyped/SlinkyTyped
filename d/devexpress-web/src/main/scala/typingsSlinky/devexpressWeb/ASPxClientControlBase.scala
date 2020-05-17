package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as the base type for all the objects included in the client-side object model.
  */
@js.native
trait ASPxClientControlBase extends js.Object {
  /**
    * Occurs on the client side after the control has been initialized.
    */
  var Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]] = js.native
  /**
    * Gets the unique, hierarchically-qualified identifier for the control.
    */
  var name: String = js.native
  /** @deprecated Use the GetVisible method instead. */
  /**
    * Returns a value specifying whether a control is displayed.
    */
  def GetClientVisible(): Boolean = js.native
  /**
    * Returns an HTML element that is the root of the control's hierarchy.
    */
  def GetMainElement(): js.Any = js.native
  /**
    * Returns a client instance of the control that is the parent for a specified control.
    */
  def GetParentControl(): js.Any = js.native
  /**
    * Returns a value specifying whether a control is displayed.
    */
  def GetVisible(): Boolean = js.native
  /**
    * Returns a value that determines whether a callback request sent by a web control is being currently processed on the server side.
    */
  def InCallback(): Boolean = js.native
  /**
    * Specifies the text that Assistive Technologies (screen readers or braille display, for example) will provide to a user.
    * @param message A String value that specifies a text.
    */
  def SendMessageToAssistiveTechnology(message: String): Unit = js.native
  /** @deprecated Use the SetVisible method instead. */
  /**
    * Specifies whether a control is displayed.
    */
  def SetClientVisible(visible: Boolean): Unit = js.native
  /**
    * Specifies whether a control is displayed.
    * @param visible true to make a control visible; false to make it hidden.
    */
  def SetVisible(visible: Boolean): Unit = js.native
}

object ASPxClientControlBase {
  @scala.inline
  def apply(
    GetClientVisible: () => Boolean,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
    GetVisible: () => Boolean,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetVisible: Boolean => Unit,
    name: String
  ): ASPxClientControlBase = {
    val __obj = js.Dynamic.literal(GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetVisible = js.Any.fromFunction1(SetVisible), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientControlBase]
  }
  @scala.inline
  implicit class ASPxClientControlBaseOps[Self <: ASPxClientControlBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetClientVisible(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetClientVisible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMainElement(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetMainElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParentControl(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetParentControl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVisible(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetVisible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInCallback(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InCallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInit(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Init")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSendMessageToAssistiveTechnology(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendMessageToAssistiveTechnology")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetClientVisible(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetClientVisible")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetVisible(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetVisible")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

