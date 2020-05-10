package typingsSlinky.extjs.Ext.menu

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.extjs.Ext.IClass because Already inherited
- typingsSlinky.extjs.Ext.IBase because Already inherited
- typingsSlinky.extjs.Ext.IQueryable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined child, down, query, queryBy, queryById */ @js.native
trait ITextItem extends IComponent {
  /** [Property] (Boolean) */
  var activated: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var activeCls: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var canActivate: js.UndefOr[Boolean] = js.native
  /** [Method] Retrieves the first direct child of this container which matches the passed selector or component
  		* @param selector String/Ext.Component An Ext.ComponentQuery selector. If no selector is specified, the first child will be returned.
  		* @returns Object Ext.Component The matching child Ext.Component (or null if no match was found).
  		*/
  var child: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.native
  /** [Config Option] (Number) */
  var clickHideDelay: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var destroyMenu: js.UndefOr[Boolean] = js.native
  /** [Method] Retrieves the first descendant of this container which matches the passed selector
  		* @param selector String/Ext.Component An Ext.ComponentQuery selector or Ext.Component. If no selector is specified, the first child will be returned.
  		* @returns Object Ext.Component The matching descendant Ext.Component (or null if no match was found).
  		*/
  var down: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.native
  /** [Config Option] (Number/String) */
  var glyph: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var hideOnClick: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var href: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var hrefTarget: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var icon: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[String] = js.native
  /** [Config Option] (Ext.menu.Menu/Object) */
  var menu: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var menuAlign: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var menuExpandDelay: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var menuHideDelay: js.UndefOr[Double] = js.native
  /** [Method] Method to manage awareness of when components are removed from their respective Container firing a removed event  */
  @JSName("onRemoved")
  var onRemoved_ITextItem: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_ITextItem: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (Ext.menu.Menu) */
  var parentMenu: js.UndefOr[IMenu] = js.native
  /** [Config Option] (Boolean) */
  var plain: js.UndefOr[Boolean] = js.native
  /** [Method] Retrieves all descendant components which match the passed selector
  		* @param selector String Selector complying to an Ext.ComponentQuery selector. If no selector is specified all items will be returned.
  		* @returns Ext.Component[] Components which matched the selector
  		*/
  var query: js.UndefOr[js.Function1[js.UndefOr[String], Array]] = js.native
  /** [Method] Retrieves all descendant components which match the passed function
  		* @param fn Function The matcher function. It will be called with a single argument, the component being tested.
  		* @param scope Object The scope in which to run the function. If not specified, it will default to the active component.
  		* @returns Ext.Component[] Components matched by the passed function
  		*/
  var queryBy: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], Array]] = js.native
  /** [Method] Finds a component at any level under this container matching the id itemId
  		* @param id String The id to find
  		* @returns Ext.Component The matching id, null if not found
  		*/
  var queryById: js.UndefOr[js.Function1[js.UndefOr[String], IComponent]] = js.native
  /** [Method] Sets the click handler of this item
  		* @param fn Function The handler function
  		* @param scope Object The scope of the handler function
  		*/
  var setHandler: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the icon on this item
  		* @param icon String The new icon
  		*/
  var setIcon: js.UndefOr[js.Function1[/* icon */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the iconCls of this item
  		* @param iconCls String The CSS class to set to iconCls
  		*/
  var setIconCls: js.UndefOr[js.Function1[/* iconCls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Set a child menu for this item
  		* @param menu Ext.menu.Menu/Object A menu, or menu configuration. null may be passed to remove the menu.
  		* @param destroyMenu Boolean True to destroy any existing menu. False to prevent destruction. If not specified, the destroyMenu configuration will be used.
  		*/
  var setMenu: js.UndefOr[
    js.Function2[/* menu */ js.UndefOr[js.Any], /* destroyMenu */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Method] Sets the text of this item
  		* @param text String The text
  		*/
  var setText: js.UndefOr[js.Function1[/* text */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the tooltip for this menu item
  		* @param tooltip String/Object This may be:  String : A string to be used as innerHTML (html tags are accepted) to show in a tooltip Object : A configuration object for Ext.tip.QuickTipManager.register.
  		* @returns Ext.menu.Item this
  		*/
  var setTooltip: js.UndefOr[js.Function1[/* tooltip */ js.UndefOr[js.Any], IItem]] = js.native
  /** [Config Option] (String) */
  var text: js.UndefOr[String] = js.native
  /** [Config Option] (String/Object) */
  var tooltip: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var tooltipType: js.UndefOr[String] = js.native
}

object ITextItem {
  @scala.inline
  def apply(): ITextItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITextItem]
  }
  @scala.inline
  implicit class ITextItemOps[Self <: ITextItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activated")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeCls")(js.undefined)
        ret
    }
    @scala.inline
    def withCanActivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canActivate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanActivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canActivate")(js.undefined)
        ret
    }
    @scala.inline
    def withChild(value: js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child")(js.undefined)
        ret
    }
    @scala.inline
    def withClickHideDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickHideDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickHideDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickHideDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroyMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestroyMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withDown(value: js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(js.undefined)
        ret
    }
    @scala.inline
    def withGlyph(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlyph: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyph")(js.undefined)
        ret
    }
    @scala.inline
    def withHandler(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(js.undefined)
        ret
    }
    @scala.inline
    def withHideOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(js.undefined)
        ret
    }
    @scala.inline
    def withHrefTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hrefTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHrefTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hrefTarget")(js.undefined)
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
    def withIconCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconCls")(js.undefined)
        ret
    }
    @scala.inline
    def withMenu(value: js.Any): Self = {
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
    def withMenuAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuExpandDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuExpandDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuExpandDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuExpandDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuHideDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuHideDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuHideDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuHideDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRemoved(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemoved")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnRemoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemoved")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRender(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRender")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRender")(js.undefined)
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
    def withQuery(value: js.UndefOr[String] => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryBy(value: (js.UndefOr[js.Any], js.UndefOr[js.Any]) => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryBy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutQueryBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryBy")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryById(value: js.UndefOr[String] => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryById")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutQueryById: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryById")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHandler(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withSetIcon(value: /* icon */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIcon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withSetIconCls(value: /* iconCls */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIconCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetIconCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIconCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMenu(value: (/* menu */ js.UndefOr[js.Any], /* destroyMenu */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMenu")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withSetText(value: /* text */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setText")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTooltip(value: /* tooltip */ js.UndefOr[js.Any] => IItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTooltip")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: js.Any): Self = {
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
    @scala.inline
    def withTooltipType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipType")(js.undefined)
        ret
    }
  }
  
}

