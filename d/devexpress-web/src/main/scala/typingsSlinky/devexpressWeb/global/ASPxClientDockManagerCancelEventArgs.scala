package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDockManager.BeforeDock event.
  */
@JSGlobal("ASPxClientDockManagerCancelEventArgs")
@js.native
class ASPxClientDockManagerCancelEventArgs protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientDockManagerCancelEventArgs {
  /**
    * For internal use only.
    */
  def this(panel: typingsSlinky.devexpressWeb.ASPxClientDockPanel) = this()
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
}

