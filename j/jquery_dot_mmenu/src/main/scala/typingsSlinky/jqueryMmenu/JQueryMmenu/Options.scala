package typingsSlinky.jqueryMmenu.JQueryMmenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * A collection of extension names to enable for the menu.
    * You'll need this option when using the extensions.
    * Default: []
    */
  var extensions: js.UndefOr[js.Array[js.Object]] = js.native
  /**
    * navbar options
    */
  var navbar: js.UndefOr[NavbarOptions] = js.native
  /**
    * onClick options
    */
  var onClick: js.UndefOr[OnclickOptions] = js.native
  /**
    * Whether or not submenus should come sliding in from the right.
    * If false, submenus expand below their parent.
    * To expand a single submenu below its parent item, add the class "Vertical" to it.
    * Default: true
    */
  var slidingSubmenus: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtensions(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withNavbar(value: NavbarOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navbar")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: OnclickOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withSlidingSubmenus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidingSubmenus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlidingSubmenus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slidingSubmenus")(js.undefined)
        ret
    }
  }
  
}

