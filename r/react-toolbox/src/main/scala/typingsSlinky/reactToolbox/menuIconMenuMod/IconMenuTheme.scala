package typingsSlinky.reactToolbox.menuIconMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconMenuTheme extends js.Object {
  /**
    * Used for the icon element.
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * Used for the root element of the icon menu.
    */
  var iconMenu: js.UndefOr[String] = js.native
}

object IconMenuTheme {
  @scala.inline
  def apply(): IconMenuTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconMenuTheme]
  }
  @scala.inline
  implicit class IconMenuThemeOps[Self <: IconMenuTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIconMenu(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconMenu")(js.undefined)
        ret
    }
  }
  
}

