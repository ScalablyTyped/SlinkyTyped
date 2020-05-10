package typingsSlinky.jqueryMenuaim

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryMenuAimOptions extends js.Object {
  /** Function to call when a row is purposefully activated. Use this
    * to show a submenu's content for the activated row.
    */
  var activate: js.UndefOr[js.Function0[Unit]] = js.native
  /** Function to call when a row is deactivated.
    */
  var deactivate: js.UndefOr[js.Function0[Unit]] = js.native
  /** Function to call when mouse enters a menu row. Entering a row
    * does not mean the row has been activated, as the user may be
    * mousing over to a submenu.
    */
  var enter: js.UndefOr[js.Function0[Unit]] = js.native
  /** Function to call when mouse exits a menu row.
    */
  var exit: js.UndefOr[js.Function0[Unit]] = js.native
  /** Function to call when mouse exits the entire menu. If this returns
    * true, the current row's deactivation event and callback function
    * will be fired. Otherwise, if this isn't supplied or it returns
    * false, the currently activated row will stay activated when the
    * mouse leaves the menu entirely.
    */
  var exitMenu: js.UndefOr[js.Function0[Unit]] = js.native
  /** Selector for identifying which elements in the menu are rows
    * that can trigger the above events. Defaults to "> li".
    * rowSelector: "> li",
    */
  var rowSelector: js.UndefOr[String] = js.native
  /** Direction the submenu opens relative to the main menu. This
    * controls which direction is "forgiving" as the user moves their
    * cursor from the main menu into the submenu. Can be one of "right",
    * "left", "above", or "below". Defaults to "right".
    * submenuDirection: "right"
    */
  var submenuDirection: js.UndefOr[String] = js.native
  /** You may have some menu rows that aren't submenus and therefore
    * shouldn't ever need to "activate." If so, filter submenu rows w/
    * this selector. Defaults to "*" (all elements).
    * submenuSelector: "*",
    */
  var submenuSelector: js.UndefOr[String] = js.native
}

object JQueryMenuAimOptions {
  @scala.inline
  def apply(): JQueryMenuAimOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryMenuAimOptions]
  }
  @scala.inline
  implicit class JQueryMenuAimOptionsOps[Self <: JQueryMenuAimOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutActivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(js.undefined)
        ret
    }
    @scala.inline
    def withDeactivate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDeactivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivate")(js.undefined)
        ret
    }
    @scala.inline
    def withEnter(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(js.undefined)
        ret
    }
    @scala.inline
    def withExit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(js.undefined)
        ret
    }
    @scala.inline
    def withExitMenu(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitMenu")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutExitMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withRowSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmenuDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submenuDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmenuDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submenuDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmenuSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submenuSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmenuSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submenuSelector")(js.undefined)
        ret
    }
  }
  
}

