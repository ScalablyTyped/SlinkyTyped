package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDockManager.BeforeDock event.
  */
@JSGlobal("ASPxClientDockManagerProcessingModeCancelEventArgs")
@js.native
class ASPxClientDockManagerProcessingModeCancelEventArgs protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientDockManagerProcessingModeCancelEventArgs {
  /**
    * For internal use only.
    */
  def this(
    processOnServer: Boolean,
    panel: typingsSlinky.devexpressWeb.ASPxClientDockPanel,
    zone: typingsSlinky.devexpressWeb.ASPxClientDockZone
  ) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
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

