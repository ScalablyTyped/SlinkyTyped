package typingsSlinky.reactToolbox.listItemActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemActionTheme extends js.Object {
  /**
    * Used for each action element (left/right).
    */
  var itemAction: js.UndefOr[String] = js.native
}

object ListItemActionTheme {
  @scala.inline
  def apply(): ListItemActionTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemActionTheme]
  }
  @scala.inline
  implicit class ListItemActionThemeOps[Self <: ListItemActionTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemAction")(js.undefined)
        ret
    }
  }
  
}

