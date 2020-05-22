package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ReportToolbarClientSideEvents.ItemValueChanged event.
  */
@JSGlobal("ASPxClientToolbarItemValueChangedEventArgs")
@js.native
class ASPxClientToolbarItemValueChangedEventArgs protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientToolbarItemValueChangedEventArgs {
  /**
    * For internal use. Initializes a new instance of the ASPxClientToolbarItemValueChangedEventArgs class with the specified settings.
    */
  def this(
    processOnServer: Boolean,
    item: typingsSlinky.devexpressWeb.ASPxClientMenuItem,
    editor: typingsSlinky.devexpressWeb.ASPxClientControl
  ) = this()
  /**
    * Provides access to the toolbar's value editor on the client.
    */
  /* CompleteClass */
  override var editor: typingsSlinky.devexpressWeb.ASPxClientControl = js.native
  /**
    * Gets the menu item object related to the event.
    */
  /* CompleteClass */
  override var item: typingsSlinky.devexpressWeb.ASPxClientMenuItem = js.native
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  override var processOnServer: Boolean = js.native
}

