package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the popup control's cancellable client events, such as the ASPxClientPopupControlBase.Closing.
  */
@JSGlobal("ASPxClientPopupWindowCancelEventArgs")
@js.native
class ASPxClientPopupWindowCancelEventArgs protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientPopupWindowCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientPopupWindowCancelEventArgs class with the specified settings.
    * @param window An ASPxClientPopupWindow object that is a popup window related to the generated event.
    * @param closeReason One of the ASPxClientPopupControlCloseReason enumeration values that specifies the reason the popup window is about to close.
    */
  def this(
    window: typingsSlinky.devexpressWeb.ASPxClientPopupWindow,
    closeReason: typingsSlinky.devexpressWeb.ASPxClientPopupControlCloseReason
  ) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Gets the value that identifies the reason the popup window is about to close.
    */
  /* CompleteClass */
  override var closeReason: typingsSlinky.devexpressWeb.ASPxClientPopupControlCloseReason = js.native
  /**
    * Gets the popup window object related to the event.
    */
  /* CompleteClass */
  override var window: typingsSlinky.devexpressWeb.ASPxClientPopupWindow = js.native
}

