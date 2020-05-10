package typingsSlinky.extjs.Ext.menu

import typingsSlinky.extjs.Ext.IComponent
import typingsSlinky.extjs.Ext.panel.IPanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMenu extends IPanel {
  /** [Method] Invoked after the Component is shown after onShow is called */
  @JSName("afterShow")
  var afterShow_IMenu: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var allowOtherMenus: js.UndefOr[Boolean] = js.native
  /** [Method] Returns whether a menu item can be activated or not
  		* @param item Object
  		* @returns Boolean
  		*/
  var canActivateItem: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Deactivates the current active item on the menu if one exists
  		* @param andBlurFocusedItem Object
  		*/
  var deactivateActiveItem: js.UndefOr[js.Function1[/* andBlurFocusedItem */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var enableKeyNav: js.UndefOr[Boolean] = js.native
  /** [Method] Hides this Component setting it to invisible using the configured hideMode
  		* @returns Ext.Component this
  		*/
  @JSName("hide")
  var hide_IMenu: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Config Option] (Boolean) */
  var ignoreParentClicks: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var isMenu: js.UndefOr[Boolean] = js.native
  /** [Method] Menus are never contained and must not ascertain their visibility from the ancestor hierarchy
  		* @returns Boolean true if this component is visible, false otherwise.
  		*/
  @JSName("isVisible")
  var isVisible_IMenu: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Property] (Ext.menu.Menu) */
  var parentMenu: js.UndefOr[IMenu] = js.native
  /** [Config Option] (Boolean) */
  var plain: js.UndefOr[Boolean] = js.native
  /** [Method] Shows this component by the specified Component or Element
  		* @param cmp Object
  		* @param pos Object
  		* @param off Object
  		* @returns Ext.Component this
  		*/
  @JSName("showBy")
  var showBy_IMenu: js.UndefOr[
    js.Function3[
      /* cmp */ js.UndefOr[js.Any], 
      /* pos */ js.UndefOr[js.Any], 
      /* off */ js.UndefOr[js.Any], 
      IComponent
    ]
  ] = js.native
  /** [Config Option] (Boolean) */
  var showSeparator: js.UndefOr[Boolean] = js.native
}

object IMenu {
  @scala.inline
  def apply(): IMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMenu]
  }
  @scala.inline
  implicit class IMenuOps[Self <: IMenu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterShow")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowOtherMenus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowOtherMenus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowOtherMenus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowOtherMenus")(js.undefined)
        ret
    }
    @scala.inline
    def withCanActivateItem(value: /* item */ js.UndefOr[js.Any] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canActivateItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCanActivateItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canActivateItem")(js.undefined)
        ret
    }
    @scala.inline
    def withDeactivateActiveItem(value: /* andBlurFocusedItem */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivateActiveItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDeactivateActiveItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivateActiveItem")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableKeyNav(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableKeyNav")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableKeyNav: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableKeyNav")(js.undefined)
        ret
    }
    @scala.inline
    def withHide(value: () => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreParentClicks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreParentClicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreParentClicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreParentClicks")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withIsVisible(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withParentMenu(value: IMenu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withPlain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plain")(js.undefined)
        ret
    }
    @scala.inline
    def withShowBy(
      value: (/* cmp */ js.UndefOr[js.Any], /* pos */ js.UndefOr[js.Any], /* off */ js.UndefOr[js.Any]) => IComponent
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBy")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutShowBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBy")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSeparator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSeparator")(js.undefined)
        ret
    }
  }
  
}

