package typingsSlinky.gapiClientMirror.gapi.client.mirror

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuValue extends js.Object {
  /**
    * The name to display for the menu item. If you specify this property for a built-in menu item, the default contextual voice command for that menu item
    * is not shown.
    */
  var displayName: js.UndefOr[String] = js.native
  /** URL of an icon to display with the menu item. */
  var iconUrl: js.UndefOr[String] = js.native
  /**
    * The state that this value applies to. Allowed values are:
    * - DEFAULT - Default value shown when displayed in the menuItems list.
    * - PENDING - Value shown when the menuItem has been selected by the user but can still be cancelled.
    * - CONFIRMED - Value shown when the menuItem has been selected by the user and can no longer be cancelled.
    */
  var state: js.UndefOr[String] = js.native
}

object MenuValue {
  @scala.inline
  def apply(): MenuValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuValue]
  }
  @scala.inline
  implicit class MenuValueOps[Self <: MenuValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

