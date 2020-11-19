package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains scroll extender methods that can be used to support scrolling under touch UI devices.
  */
@JSGlobal("ASPxClientTouchUI")
@js.native
class ASPxClientTouchUI ()
  extends typingsSlinky.devexpressWeb.ASPxClientTouchUI
/* static members */
@JSGlobal("ASPxClientTouchUI")
@js.native
object ASPxClientTouchUI extends js.Object {
  
  /**
    * Extends the specified element's functionality with scrolling via touch behavior (one finger) and customized scrollbar-related options. A ScrollExtender object allowing you to apply the current scroll extender to another element.
    * @param options An ASPxClientTouchUIOptions object that provides options affecting the touch scrolling functionality.
    */
  def MakeScrollable(id: String): typingsSlinky.devexpressWeb.ScrollExtender = js.native
  def MakeScrollable(id: String, options: typingsSlinky.devexpressWeb.ASPxClientTouchUIOptions): typingsSlinky.devexpressWeb.ScrollExtender = js.native
  def MakeScrollable(id: js.Any): typingsSlinky.devexpressWeb.ScrollExtender = js.native
  def MakeScrollable(id: js.Any, options: typingsSlinky.devexpressWeb.ASPxClientTouchUIOptions): typingsSlinky.devexpressWeb.ScrollExtender = js.native
}
