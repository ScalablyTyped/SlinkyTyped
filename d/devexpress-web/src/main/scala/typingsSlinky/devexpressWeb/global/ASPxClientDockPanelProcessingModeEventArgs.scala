package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDockPanel.AfterFloat event.
  */
@JSGlobal("ASPxClientDockPanelProcessingModeEventArgs")
@js.native
class ASPxClientDockPanelProcessingModeEventArgs protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientDockPanelProcessingModeEventArgs {
  /**
    * For internal use only.
    */
  def this(processOnServer: Boolean, zone: typingsSlinky.devexpressWeb.ASPxClientDockZone) = this()
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

