package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDockZone.BeforeDock event.
  */
@JSGlobal("ASPxClientDockZoneCancelEventArgs")
@js.native
class ASPxClientDockZoneCancelEventArgs protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientDockZoneCancelEventArgs {
  /**
    * Initializes a new object of the ASPxClientDockZoneCancelEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param panel An ASPxClientDockPanel object that is a panel related to the event.
    */
  def this(processOnServer: Boolean, panel: typingsSlinky.devexpressWeb.ASPxClientDockPanel) = this()
}
