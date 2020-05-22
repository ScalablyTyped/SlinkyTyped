package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  /**
    * Gets the panel currently being processed.
    */
  /* CompleteClass */
  override var panel: typingsSlinky.devexpressWeb.ASPxClientDockPanel = js.native
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  override var processOnServer: Boolean = js.native
  /**
    * Gets the zone currently being processed.
    */
  /* CompleteClass */
  override var zone: typingsSlinky.devexpressWeb.ASPxClientDockZone = js.native
}

