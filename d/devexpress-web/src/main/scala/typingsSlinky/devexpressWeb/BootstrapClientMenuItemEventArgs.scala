package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events related to manipulations on menu items.
  */
@js.native
trait BootstrapClientMenuItemEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the menu item object related to the event.
    */
  var item: BootstrapClientMenuItem = js.native
}

object BootstrapClientMenuItemEventArgs {
  @scala.inline
  def apply(item: BootstrapClientMenuItem): BootstrapClientMenuItemEventArgs = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientMenuItemEventArgs]
  }
  @scala.inline
  implicit class BootstrapClientMenuItemEventArgsOps[Self <: BootstrapClientMenuItemEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: BootstrapClientMenuItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

