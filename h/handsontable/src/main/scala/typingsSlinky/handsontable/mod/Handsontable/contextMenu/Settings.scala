package typingsSlinky.handsontable.mod.Handsontable.contextMenu

import org.scalajs.dom.raw.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var callback: js.UndefOr[
    js.Function3[
      /* key */ String, 
      /* selection */ js.Array[Selection], 
      /* clickEvent */ MouseEvent, 
      Unit
    ]
  ] = js.native
  var items: js.Array[PredefinedMenuItemKey] | MenuConfig = js.native
}

object Settings {
  @scala.inline
  def apply(items: js.Array[PredefinedMenuItemKey] | MenuConfig): Settings = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[PredefinedMenuItemKey] | MenuConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallback(
      value: (/* key */ String, /* selection */ js.Array[Selection], /* clickEvent */ MouseEvent) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
  }
  
}

