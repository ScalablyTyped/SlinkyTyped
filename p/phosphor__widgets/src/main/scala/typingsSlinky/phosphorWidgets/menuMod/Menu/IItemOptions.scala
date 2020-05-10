package typingsSlinky.phosphorWidgets.menuMod.Menu

import typingsSlinky.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for creating a menu item.
  */
@js.native
trait IItemOptions extends js.Object {
  /**
    * The arguments for the command.
    *
    * The default value is an empty object.
    */
  var args: js.UndefOr[ReadonlyJSONObject] = js.native
  /**
    * The command to execute when the item is triggered.
    *
    * The default value is an empty string.
    */
  var command: js.UndefOr[String] = js.native
  /**
    * The submenu for a `'submenu'` type item.
    *
    * The default value is `null`.
    */
  var submenu: js.UndefOr[typingsSlinky.phosphorWidgets.menuMod.Menu | Null] = js.native
  /**
    * The type of the menu item.
    *
    * The default value is `'command'`.
    */
  var `type`: js.UndefOr[ItemType] = js.native
}

object IItemOptions {
  @scala.inline
  def apply(): IItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IItemOptions]
  }
  @scala.inline
  implicit class IItemOptionsOps[Self <: IItemOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: ReadonlyJSONObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmenu(value: typingsSlinky.phosphorWidgets.menuMod.Menu): Self = {
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
    @scala.inline
    def withSubmenuNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submenu")(null)
        ret
    }
    @scala.inline
    def withType(value: ItemType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

