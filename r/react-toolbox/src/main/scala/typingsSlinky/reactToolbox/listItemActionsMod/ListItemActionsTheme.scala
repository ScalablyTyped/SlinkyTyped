package typingsSlinky.reactToolbox.listItemActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemActionsTheme extends js.Object {
  /**
    * Added for the element that wraps left actions.
    */
  var left: js.UndefOr[String] = js.native
  /**
    * Added for the element that wraps right actions.
    */
  var right: js.UndefOr[String] = js.native
}

object ListItemActionsTheme {
  @scala.inline
  def apply(): ListItemActionsTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemActionsTheme]
  }
  @scala.inline
  implicit class ListItemActionsThemeOps[Self <: ListItemActionsTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
  }
  
}

