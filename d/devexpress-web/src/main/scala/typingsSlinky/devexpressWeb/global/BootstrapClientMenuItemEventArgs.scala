package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events related to manipulations on menu items.
  */
@JSGlobal("BootstrapClientMenuItemEventArgs")
@js.native
class BootstrapClientMenuItemEventArgs protected ()
  extends typingsSlinky.devexpressWeb.BootstrapClientMenuItemEventArgs {
  /**
    * Initializes a new object of the BootstrapClientMenuItemEventArgs type with the specified value.
    * @param item An BootstrapClientMenuItem object representing the group related to the event.
    */
  def this(item: typingsSlinky.devexpressWeb.BootstrapClientMenuItem) = this()
  /**
    * Gets the menu item object related to the event.
    */
  /* CompleteClass */
  override var item: typingsSlinky.devexpressWeb.BootstrapClientMenuItem = js.native
}

