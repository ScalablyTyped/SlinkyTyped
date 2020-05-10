package typingsSlinky.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.extjs.Ext.IClass because Already inherited
- typingsSlinky.extjs.Ext.IBase because Already inherited
- typingsSlinky.extjs.Ext.IQueryable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined child, down, query, queryBy, queryById */ @js.native
trait IButton extends IComponent {
  /** [Config Option] (Boolean) */
  var allowDepress: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var arrowAlign: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var arrowCls: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Object) */
  var baseParams: js.UndefOr[js.Any] = js.native
  /** [Method] Retrieves the first direct child of this container which matches the passed selector or component
  		* @param selector String/Ext.Component An Ext.ComponentQuery selector. If no selector is specified, the first child will be returned.
  		* @returns Object Ext.Component The matching child Ext.Component (or null if no match was found).
  		*/
  var child: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.native
  /** [Config Option] (String) */
  var clickEvent: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Boolean) */
  var destroyMenu: js.UndefOr[Boolean] = js.native
  /** [Method] inherit docs
  		* @param silent Object
  		*/
  @JSName("disable")
  var disable_IButton: js.UndefOr[js.Function1[/* silent */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Retrieves the first descendant of this container which matches the passed selector
  		* @param selector String/Ext.Component An Ext.ComponentQuery selector or Ext.Component. If no selector is specified, the first child will be returned.
  		* @returns Object Ext.Component The matching descendant Ext.Component (or null if no match was found).
  		*/
  var down: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.native
  /** [Config Option] (Boolean) */
  var enableToggle: js.UndefOr[Boolean] = js.native
  /** [Method] inherit docs
  		* @param silent Object
  		*/
  @JSName("enable")
  var enable_IButton: js.UndefOr[js.Function1[/* silent */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (String) */
  var focusCls: js.UndefOr[java.lang.String] = js.native
  /** [Method] This method returns an object which provides substitution parameters for the XTemplate used to create this Button s D
  		* @returns Object Substitution data for a Template. The default implementation which provides data for the default template returns an Object containing the following properties:
  		*/
  var getTemplateArgs: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Gets the text for this Button
  		* @returns String The button text
  		*/
  var getText: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Config Option] (Number/String) */
  var glyph: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var handleMouseEvents: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.native
  /** [Method] Returns true if the button has a menu and it is visible
  		* @returns Boolean
  		*/
  var hasVisibleMenu: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Hides this button s menu if it has one
  		* @returns Ext.button.Button this
  		*/
  var hideMenu: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Config Option] (String) */
  var href: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var hrefTarget: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var icon: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var iconAlign: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[java.lang.String] = js.native
  /** [Property] (Boolean) */
  var isAction: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Ext.menu.Menu/String/Object) */
  var menu: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var menuActiveCls: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var menuAlign: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var overflowText: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Object) */
  var params: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var pressed: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var pressedCls: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Boolean) */
  var preventDefault: js.UndefOr[Boolean] = js.native
  /** [Method] Retrieves all descendant components which match the passed selector
  		* @param selector String Selector complying to an Ext.ComponentQuery selector. If no selector is specified all items will be returned.
  		* @returns Ext.Component[] Components which matched the selector
  		*/
  var query: js.UndefOr[js.Function1[js.UndefOr[java.lang.String], Array]] = js.native
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
  var queryById: js.UndefOr[js.Function1[js.UndefOr[java.lang.String], IComponent]] = js.native
  /** [Config Option] (Boolean/Object) */
  var repeat: js.UndefOr[js.Any] = js.native
  /** [Config Option] ("small"/"medium"/"large") */
  var scale: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.native
  /** [Method] Sets this button s glyph
  		* @param glyph Number/String the numeric charCode or string charCode/font-family. This parameter expects a format consistent with that of glyph
  		* @returns Ext.button.Button this
  		*/
  var setGlyph: js.UndefOr[js.Function1[/* glyph */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Assigns this Button s click handler
  		* @param handler Function The function to call when the button is clicked
  		* @param scope Object The scope (this reference) in which the handler function is executed. Defaults to this Button.
  		* @returns Ext.button.Button this
  		*/
  var setHandler: js.UndefOr[
    js.Function2[/* handler */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], this.type]
  ] = js.native
  /** [Method] Sets the href of the embedded anchor element to the passed URL
  		* @param href String The URL to set in the anchor element.
  		*/
  var setHref: js.UndefOr[js.Function1[/* href */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the background image inline style of the button
  		* @param icon String The path to an image to display in the button
  		* @returns Ext.button.Button this
  		*/
  var setIcon: js.UndefOr[js.Function1[/* icon */ js.UndefOr[java.lang.String], this.type]] = js.native
  /** [Method] Sets the CSS class that provides a background image to use as the button s icon
  		* @param cls String The CSS class providing the icon image
  		* @returns Ext.button.Button this
  		*/
  var setIconCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], this.type]] = js.native
  /** [Method] Sets the href of the link dynamically according to the params passed and any baseParams configured
  		* @param params Object Parameters to use in the href URL.
  		*/
  var setParams: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Method to change the scale of the button
  		* @param scale String The scale to change to.
  		*/
  var setScale: js.UndefOr[js.Function1[/* scale */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets this Button s text
  		* @param text String The button text
  		* @returns Ext.button.Button this
  		*/
  var setText: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], this.type]] = js.native
  /** [Method] Sets the text alignment for this button
  		* @param align String The new alignment of the button text. See textAlign.
  		*/
  var setTextAlign: js.UndefOr[js.Function1[/* align */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the tooltip for this Button
  		* @param tooltip String/Object This may be:  String : A string to be used as innerHTML (html tags are accepted) to show in a tooltip Object : A configuration object for Ext.tip.QuickTipManager.register.
  		* @returns Ext.button.Button this
  		*/
  var setTooltip: js.UndefOr[js.Function1[/* tooltip */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] inherit docs
  		* @param ui Object
  		*/
  @JSName("setUI")
  var setUI_IButton: js.UndefOr[js.Function1[/* ui */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var showEmptyMenu: js.UndefOr[Boolean] = js.native
  /** [Method] Shows this button s menu if it has one
  		* @param fromEvent Object
  		*/
  var showMenu: js.UndefOr[js.Function1[/* fromEvent */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Number) */
  var tabIndex: js.UndefOr[Double] = js.native
  /** [Property] (Ext.Template) */
  var template: js.UndefOr[ITemplate] = js.native
  /** [Config Option] (String) */
  var text: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var textAlign: js.UndefOr[java.lang.String] = js.native
  /** [Method] If a state it passed it becomes the pressed state otherwise the current state is toggled
  		* @param state Boolean Force a particular state
  		* @param suppressEvent Boolean True to stop events being fired when calling this method.
  		* @returns Ext.button.Button this
  		*/
  var toggle: js.UndefOr[
    js.Function2[/* state */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean], this.type]
  ] = js.native
  /** [Config Option] (String) */
  var toggleGroup: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Function) */
  var toggleHandler: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Object) */
  var tooltip: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var tooltipType: js.UndefOr[java.lang.String] = js.native
}

object IButton {
  @scala.inline
  def apply(): IButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IButton]
  }
  @scala.inline
  implicit class IButtonOps[Self <: IButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowDepress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDepress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDepress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDepress")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowAlign(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowCls(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowCls")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseParams")(js.undefined)
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
    def withClickEvent(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickEvent")(js.undefined)
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
    def withDisable(value: /* silent */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.undefined)
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
    def withEnable(value: /* silent */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableToggle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableToggle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableToggle")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusCls(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTemplateArgs(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTemplateArgs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTemplateArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTemplateArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withGetText(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getText")(js.undefined)
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
    def withHandleMouseEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleMouseEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleMouseEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleMouseEvents")(js.undefined)
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
    def withHasVisibleMenu(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasVisibleMenu")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHasVisibleMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasVisibleMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withHideMenu(value: () => IButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideMenu")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHideMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withHref(value: java.lang.String): Self = {
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
    def withHrefTarget(value: java.lang.String): Self = {
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
    def withIcon(value: java.lang.String): Self = {
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
    def withIconAlign(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withIconCls(value: java.lang.String): Self = {
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
    def withIsAction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAction")(js.undefined)
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
    def withMenuActiveCls(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuActiveCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuActiveCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuActiveCls")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuAlign(value: java.lang.String): Self = {
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
    def withOverflowText(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowText")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withPressed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPressed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressed")(js.undefined)
        ret
    }
    @scala.inline
    def withPressedCls(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressedCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPressedCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressedCls")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: js.UndefOr[java.lang.String] => Array): Self = {
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
    def withQueryById(value: js.UndefOr[java.lang.String] => IComponent): Self = {
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
    def withRepeat(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withSetGlyph(value: /* glyph */ js.UndefOr[js.Any] => IButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGlyph")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetGlyph: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGlyph")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHandler(value: (/* handler */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IButton): Self = {
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
    def withSetHref(value: /* href */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHref")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHref")(js.undefined)
        ret
    }
    @scala.inline
    def withSetIcon(value: /* icon */ js.UndefOr[java.lang.String] => IButton): Self = {
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
    def withSetIconCls(value: /* cls */ js.UndefOr[java.lang.String] => IButton): Self = {
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
    def withSetParams(value: /* params */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParams")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParams")(js.undefined)
        ret
    }
    @scala.inline
    def withSetScale(value: /* scale */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScale")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScale")(js.undefined)
        ret
    }
    @scala.inline
    def withSetText(value: /* text */ js.UndefOr[java.lang.String] => IButton): Self = {
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
    def withSetTextAlign(value: /* align */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTextAlign")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTextAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTextAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTooltip(value: /* tooltip */ js.UndefOr[js.Any] => IButton): Self = {
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
    def withSetUI(value: /* ui */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUI")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetUI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUI")(js.undefined)
        ret
    }
    @scala.inline
    def withShowEmptyMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEmptyMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowEmptyMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEmptyMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMenu(value: /* fromEvent */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShowMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: ITemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: java.lang.String): Self = {
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
    def withTextAlign(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withToggle(value: (/* state */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => IButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleGroup(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleHandler(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleHandler")(js.undefined)
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
    def withTooltipType(value: java.lang.String): Self = {
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

