package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDockManager.AfterDock event.
  */
@JSGlobal("ASPxClientDockManagerProcessingModeEventArgs")
@js.native
class ASPxClientDockManagerProcessingModeEventArgs protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientDockManagerProcessingModeEventArgs {
  /**
    * Initializes a new object of the ASPxClientDockManagerProcessingModeEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param panel An ASPxClientDockPanel object that is a panel related to the event.
    * @param zone An ASPxClientDockZone object that is a zone related to the event.
    */
  def this(
    processOnServer: Boolean,
    panel: typingsSlinky.devexpressWeb.ASPxClientDockPanel,
    zone: typingsSlinky.devexpressWeb.ASPxClientDockZone
  ) = this()
}
