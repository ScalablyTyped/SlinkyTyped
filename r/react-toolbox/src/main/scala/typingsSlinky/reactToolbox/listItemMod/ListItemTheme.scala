package typingsSlinky.reactToolbox.listItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemTheme extends js.Object {
  /**
    * Used for the root element of the list.
    */
  var listItem: js.UndefOr[String] = js.native
}

object ListItemTheme {
  @scala.inline
  def apply(): ListItemTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemTheme]
  }
  @scala.inline
  implicit class ListItemThemeOps[Self <: ListItemTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListItem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItem")(js.undefined)
        ret
    }
  }
  
}

