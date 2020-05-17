package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client ASPxFilterControl.
  */
@js.native
trait ASPxClientFilterControl extends ASPxClientControl {
  /**
    * Occurs after a new filter expression has been applied.
    */
  var Applied: ASPxClientEvent[ASPxClientFilterAppliedEventHandler[ASPxClientFilterControl]] = js.native
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientFilterControl]] = js.native
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientFilterControl.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientFilterControl]] = js.native
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientFilterControl]] = js.native
  /**
    * Applies a filter constructed by an end-user.
    */
  def Apply(): Unit = js.native
  /**
    * Returns the applied filter expression.
    */
  def GetAppliedFilterExpression(): String = js.native
  /**
    * Returns the editor used to edit operand values for the specified filter column. An ASPxClientEditBase descendant that represents the editor used to edit operand values for the specified filter column.
    * @param editorIndex An integer value that identifies the filter column by its index within the collection.
    */
  def GetEditor(editorIndex: Double): ASPxClientEditBase = js.native
  /**
    * Returns the filter expression.
    */
  def GetFilterExpression(): String = js.native
  /**
    * Returns a value indicating whether the filter expression being currently composed on the client side is valid - all expression conditions are filled.
    */
  def IsFilterExpressionValid(): Boolean = js.native
  /**
    * Resets the current filter expression to a previously applied filter expression.
    */
  def Reset(): Unit = js.native
}

object ASPxClientFilterControl {
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    Applied: ASPxClientEvent[ASPxClientFilterAppliedEventHandler[ASPxClientFilterControl]],
    Apply: () => Unit,
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientFilterControl]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientFilterControl]],
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientFilterControl]],
    GetAppliedFilterExpression: () => String,
    GetClientVisible: () => Boolean,
    GetEditor: Double => ASPxClientEditBase,
    GetFilterExpression: () => String,
    GetHeight: () => Double,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    IsFilterExpressionValid: () => Boolean,
    Reset: () => Unit,
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetHeight: Double => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    name: String
  ): ASPxClientFilterControl = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), Applied = Applied.asInstanceOf[js.Any], Apply = js.Any.fromFunction0(Apply), BeginCallback = BeginCallback.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], EndCallback = EndCallback.asInstanceOf[js.Any], GetAppliedFilterExpression = js.Any.fromFunction0(GetAppliedFilterExpression), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEditor = js.Any.fromFunction1(GetEditor), GetFilterExpression = js.Any.fromFunction0(GetFilterExpression), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], IsFilterExpressionValid = js.Any.fromFunction0(IsFilterExpressionValid), Reset = js.Any.fromFunction0(Reset), SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFilterControl]
  }
  @scala.inline
  implicit class ASPxClientFilterControlOps[Self <: ASPxClientFilterControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplied(value: ASPxClientEvent[ASPxClientFilterAppliedEventHandler[ASPxClientFilterControl]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Applied")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApply(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Apply")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBeginCallback(value: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientFilterControl]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BeginCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallbackError(value: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientFilterControl]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallbackError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndCallback(value: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientFilterControl]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAppliedFilterExpression(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAppliedFilterExpression")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEditor(value: Double => ASPxClientEditBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetEditor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFilterExpression(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetFilterExpression")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsFilterExpressionValid(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsFilterExpressionValid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reset")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

