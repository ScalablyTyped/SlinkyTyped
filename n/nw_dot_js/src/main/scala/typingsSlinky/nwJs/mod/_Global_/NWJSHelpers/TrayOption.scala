package typingsSlinky.nwJs.mod._Global_.NWJSHelpers

import typingsSlinky.nwJs.mod._Global_.nw.Menu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *  Option for tray that contains initial settings for the Tray.
  */
@js.native
trait TrayOption extends js.Object {
  /**
    * {string} alternate
    */
  var alticon: js.UndefOr[String] = js.native
  /**
    * {string} icon
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * {boolean} whether icons are templates
    */
  var iconsAreTemplates: js.UndefOr[Boolean] = js.native
  /**
    * {Menu} popup menu
    */
  var menu: js.UndefOr[Menu] = js.native
  /**
    * {string} title
    */
  var title: js.UndefOr[String] = js.native
  /**
    * {string} tooltip
    */
  var tooltip: js.UndefOr[String] = js.native
}

object TrayOption {
  @scala.inline
  def apply(): TrayOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrayOption]
  }
  @scala.inline
  implicit class TrayOptionOps[Self <: TrayOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlticon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alticon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlticon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alticon")(js.undefined)
        ret
    }
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
    def withIconsAreTemplates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconsAreTemplates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconsAreTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconsAreTemplates")(js.undefined)
        ret
    }
    @scala.inline
    def withMenu(value: Menu): Self = {
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
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
  }
  
}

