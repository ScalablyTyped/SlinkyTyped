package typingsSlinky.reactToolbox.libMenuMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuTheme extends js.Object {
  /**
    * Added to the root element when menu is active.
    */
  var active: js.UndefOr[String] = js.native
  /**
    * Added to the root when position is bottom left.
    */
  var bottomLeft: js.UndefOr[String] = js.native
  /**
    * Added to the root when position is bottom right.
    */
  var bottomRight: js.UndefOr[String] = js.native
  /**
    * Used for the root element of the menu.
    */
  var menu: js.UndefOr[String] = js.native
  /**
    * Used for the inner wrapper.
    */
  var menuInner: js.UndefOr[String] = js.native
  /**
    * Used to draw the outline.
    */
  var outline: js.UndefOr[String] = js.native
  /**
    * Added to the menu in case if should have ripple.
    */
  var rippled: js.UndefOr[String] = js.native
  /**
    * Added to the root in case its static.
    */
  var static: js.UndefOr[String] = js.native
  /**
    * Added to the root when position is top left.
    */
  var topLeft: js.UndefOr[String] = js.native
  /**
    * Added to the root when position is top right.
    */
  var topRight: js.UndefOr[String] = js.native
}

object MenuTheme {
  @scala.inline
  def apply(): MenuTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuTheme]
  }
  @scala.inline
  implicit class MenuThemeOps[Self <: MenuTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withBottomLeft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withBottomRight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomRight")(js.undefined)
        ret
    }
    @scala.inline
    def withMenu(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuInner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuInner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuInner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuInner")(js.undefined)
        ret
    }
    @scala.inline
    def withOutline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(js.undefined)
        ret
    }
    @scala.inline
    def withRippled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRippled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippled")(js.undefined)
        ret
    }
    @scala.inline
    def withStatic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(js.undefined)
        ret
    }
    @scala.inline
    def withTopLeft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withTopRight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topRight")(js.undefined)
        ret
    }
  }
  
}

