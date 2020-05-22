package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientPopupControlBase.CloseUp event.
  */
@JSGlobal("ASPxClientPopupWindowCloseUpEventArgs")
@js.native
class ASPxClientPopupWindowCloseUpEventArgs protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientPopupWindowCloseUpEventArgs {
  /**
    * Initializes a new instance of the ASPxClientPopupWindowCloseUpEventArgs class with the specified settings.
    * @param window An ASPxClientPopupWindow object that is a popup window related to the generated event.
    * @param closeReason One of the ASPxClientPopupControlCloseReason enumeration values that specifies the reason the popup window closes.
    */
  def this(
    window: typingsSlinky.devexpressWeb.ASPxClientPopupWindow,
    closeReason: typingsSlinky.devexpressWeb.ASPxClientPopupControlCloseReason
  ) = this()
  /**
    * Gets the value that identifies the reason the popup window closes.
    */
  /* CompleteClass */
  override var closeReason: typingsSlinky.devexpressWeb.ASPxClientPopupControlCloseReason = js.native
  /**
    * Gets the popup window object related to the event.
    */
  /* CompleteClass */
  override var window: typingsSlinky.devexpressWeb.ASPxClientPopupWindow = js.native
}

