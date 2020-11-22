package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Declares client constants that identify the reason the popup window closes.
  */
@JSGlobal("ASPxClientPopupControlCloseReason")
@js.native
class ASPxClientPopupControlCloseReason ()
  extends typingsSlinky.devexpressWeb.ASPxClientPopupControlCloseReason
/* static members */
@JSGlobal("ASPxClientPopupControlCloseReason")
@js.native
object ASPxClientPopupControlCloseReason extends js.Object {
  
  /**
    * The window has been closed by an API.
    */
  val API: String = js.native
  
  /**
    * An end-user clicks the close header button.
    */
  val CloseButton: String = js.native
  
  /**
    * An end-user presses the ESC key.
    */
  val Escape: String = js.native
  
  /**
    * An end-user moves the mouse pointer out of the window region.
    */
  val MouseOut: String = js.native
  
  /**
    * An end-user clicks outside the window's region
    */
  val OuterMouseClick: String = js.native
}
