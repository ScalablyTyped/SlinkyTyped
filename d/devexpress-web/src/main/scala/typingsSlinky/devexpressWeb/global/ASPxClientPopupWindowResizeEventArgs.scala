package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientPopupControlBase.Resize event.
  */
@JSGlobal("ASPxClientPopupWindowResizeEventArgs")
@js.native
class ASPxClientPopupWindowResizeEventArgs protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientPopupWindowResizeEventArgs {
  /**
    * Initializes a new instance of the ASPxClientPopupWindowResizeEventArgs class with the specified settings.
    * @param window An ASPxClientPopupWindow object that is a popup window related to the generated event.
    * @param resizeState The integer value determining the window state.
    */
  def this(window: typingsSlinky.devexpressWeb.ASPxClientPopupWindow, resizeState: Double) = this()
  /**
    * Returns the value indicating the window state after resizing.
    */
  /* CompleteClass */
  override var resizeState: Double = js.native
  /**
    * Gets the popup window object related to the event.
    */
  /* CompleteClass */
  override var window: typingsSlinky.devexpressWeb.ASPxClientPopupWindow = js.native
}

