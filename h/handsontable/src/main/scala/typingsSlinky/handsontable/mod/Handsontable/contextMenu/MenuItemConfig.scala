package typingsSlinky.handsontable.mod.Handsontable.contextMenu

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuItemConfig extends js.Object {
  var callback: js.UndefOr[
    js.ThisFunction3[
      /* this */ Core, 
      /* key */ String, 
      /* selection */ js.Array[Selection], 
      /* clickEvent */ MouseEvent, 
      Unit
    ]
  ] = js.native
  var disableSelection: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean | (js.ThisFunction0[/* this */ Core, Boolean | Unit])] = js.native
  var hidden: js.UndefOr[Boolean | (js.ThisFunction0[/* this */ Core, Boolean | Unit])] = js.native
  var isCommand: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[String] = js.native
  var name: js.UndefOr[String | (js.ThisFunction0[/* this */ Core, String])] = js.native
  var renderer: js.UndefOr[
    js.ThisFunction6[
      /* this */ this.type, 
      /* hot */ Core, 
      /* wrapper */ HTMLElement, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ Double | String, 
      /* itemValue */ String, 
      HTMLElement
    ]
  ] = js.native
  var submenu: js.UndefOr[SubmenuConfig] = js.native
}

object MenuItemConfig {
  @scala.inline
  def apply(): MenuItemConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuItemConfig]
  }
  @scala.inline
  implicit class MenuItemConfigOps[Self <: MenuItemConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(
      value: js.ThisFunction3[
          /* this */ Core, 
          /* key */ String, 
          /* selection */ js.Array[Selection], 
          /* clickEvent */ MouseEvent, 
          Unit
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean | (js.ThisFunction0[/* this */ Core, Boolean | Unit])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean | (js.ThisFunction0[/* this */ Core, Boolean | Unit])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCommand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCommand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCommand")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String | (js.ThisFunction0[/* this */ Core, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderer(
      value: js.ThisFunction6[
          MenuItemConfig, 
          /* hot */ Core, 
          /* wrapper */ HTMLElement, 
          /* row */ Double, 
          /* col */ Double, 
          /* prop */ Double | String, 
          /* itemValue */ String, 
          HTMLElement
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmenu(value: SubmenuConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submenu")(js.undefined)
        ret
    }
  }
  
}

