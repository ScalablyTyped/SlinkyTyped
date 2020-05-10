package typingsSlinky.atom.mod

import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextMenuItemOptions extends ContextMenuOptions {
  /** Place this menu item after the menu items representing the given commands. */
  var after: js.UndefOr[js.Array[String]] = js.native
  /**
    * Place this menu item's group after the containing group of the menu items
    * representing the given commands.
    */
  var afterGroupContaining: js.UndefOr[js.Array[String]] = js.native
  /** Place this menu item before the menu items representing the given commands. */
  var before: js.UndefOr[js.Array[String]] = js.native
  /**
    * Place this menu item's group before the containing group of the menu items
    * representing the given commands.
    */
  var beforeGroupContaining: js.UndefOr[js.Array[String]] = js.native
  /**
    *  The command to invoke on the target of the right click that invoked the
    *  context menu.
    */
  var command: js.UndefOr[String] = js.native
  /**
    *  A function that is called on the item each time a context menu is created
    *  via a right click.
    */
  var created: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.native
  /**
    *  Whether the menu item should be clickable. Disabled menu items typically
    *  appear grayed out. Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** The menu item's label. */
  var label: js.UndefOr[String] = js.native
  /**
    *  A function that is called to determine whether to display this item on a
    *  given context menu deployment.
    */
  var shouldDisplay: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.native
  /** An array of additional items. */
  var submenu: js.UndefOr[js.Array[ContextMenuOptions]] = js.native
  /** Whether the menu item should appear in the menu. Defaults to true. */
  var visible: js.UndefOr[Boolean] = js.native
}

object ContextMenuItemOptions {
  @scala.inline
  def apply(): ContextMenuItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextMenuItemOptions]
  }
  @scala.inline
  implicit class ContextMenuItemOptionsOps[Self <: ContextMenuItemOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterGroupContaining(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterGroupContaining")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterGroupContaining: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterGroupContaining")(js.undefined)
        ret
    }
    @scala.inline
    def withBefore(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeGroupContaining(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeGroupContaining")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeGroupContaining: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeGroupContaining")(js.undefined)
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
    def withCreated(value: /* event */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldDisplay(value: /* event */ Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldDisplay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShouldDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmenu(value: js.Array[ContextMenuOptions]): Self = {
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
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

