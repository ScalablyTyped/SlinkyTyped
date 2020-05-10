package typingsSlinky.extjs.Ext.panel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPanel extends IAbstractPanel {
  /** [Method] Add tools to this panel
  		* @param tools Object[]/Ext.panel.Tool[] The tools to add
  		*/
  var addTool: js.UndefOr[js.Function1[/* tools */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Invoked after the Panel is Collapsed
  		* @param animated Boolean
  		*/
  var afterCollapse: js.UndefOr[js.Function1[/* animated */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Invoked after the Panel is Expanded
  		* @param animated Boolean
  		*/
  var afterExpand: js.UndefOr[js.Function1[/* animated */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var animCollapse: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object/Object[]) */
  var bbar: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var buttonAlign: js.UndefOr[String] = js.native
  /** [Config Option] (Object/Object[]) */
  var buttons: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var closable: js.UndefOr[Boolean] = js.native
  /** [Method] Closes the Panel  */
  var close: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  var closeAction: js.UndefOr[String] = js.native
  /** [Method] Collapses the panel body so that the body becomes hidden
  		* @param direction String The direction to collapse towards. Must be one of  Ext.Component.DIRECTION_TOP Ext.Component.DIRECTION_RIGHT Ext.Component.DIRECTION_BOTTOM Ext.Component.DIRECTION_LEFT Defaults to collapseDirection.
  		* @param animate Boolean True to animate the transition, else false (defaults to the value of the animCollapse panel config). May also be specified as the animation duration in milliseconds.
  		* @returns Ext.panel.Panel this
  		*/
  var collapse: js.UndefOr[
    js.Function2[/* direction */ js.UndefOr[String], /* animate */ js.UndefOr[Boolean], this.type]
  ] = js.native
  /** [Config Option] (String) */
  var collapseDirection: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var collapseFirst: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var collapseMode: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var collapsed: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var collapsedCls: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var collapsible: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var constrainHeader: js.UndefOr[Boolean] = js.native
  /** [Method] converts a collapsdDir into an anchor argument for Element slideIn overridden in rtl mode to switch l and r
  		* @param collapseDir Object
  		*/
  var convertCollapseDir: js.UndefOr[js.Function1[/* collapseDir */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Property] (Ext.dd.DragSource/Ext.util.ComponentDragger) */
  var dd: js.UndefOr[js.Any] = js.native
  /** [Method] Expands the panel body so that it becomes visible
  		* @param animate Boolean True to animate the transition, else false (defaults to the value of the animCollapse panel config). May also be specified as the animation duration in milliseconds.
  		* @returns Ext.panel.Panel this
  		*/
  var expand: js.UndefOr[js.Function1[/* animate */ js.UndefOr[Boolean], this.type]] = js.native
  /** [Config Option] (Object/Object[]) */
  var fbar: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var floatable: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var frameHeader: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the current collapsed state of the panel
  		* @returns Boolean/String False when not collapsed, otherwise the value of collapseDirection.
  		*/
  var getCollapsed: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Gets the Header for this panel  */
  var getHeader: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Number/String) */
  var glyph: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean/Object) */
  var header: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var headerOverCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var headerPosition: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var hideCollapseTool: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var icon: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[String] = js.native
  /** [Method] Returns true if this component is visible
  		* @param deep Object
  		* @returns Boolean true if this component is visible, false otherwise.
  		*/
  @JSName("isVisible")
  var isVisible_IPanel: js.UndefOr[js.Function1[/* deep */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Config Option] (Object/Object[]) */
  var lbar: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var manageHeight: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var minButtonWidth: js.UndefOr[Double] = js.native
  /** [Method] Possibly animates down to a target element  */
  @JSName("onHide")
  var onHide_IPanel: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Method to manage awareness of when components are removed from their respective Container firing a removed event
  		* @param destroying Object
  		*/
  @JSName("onRemoved")
  var onRemoved_IPanel: js.UndefOr[js.Function1[/* destroying */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Allows addition of behavior to the show operation  */
  @JSName("onShow")
  var onShow_IPanel: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var overlapHeader: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Ext.Component/Object) */
  var placeholder: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number) */
  var placeholderCollapseHideMode: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var preventHeader: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object/Object[]) */
  var rbar: js.UndefOr[js.Any] = js.native
  /** [Method]
  		* @param border Object
  		* @param targetEl Object
  		*/
  @JSName("setBorder")
  var setBorder_IPanel: js.UndefOr[
    js.Function2[/* border */ js.UndefOr[js.Any], /* targetEl */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Set the glyph for the panel s header
  		* @param newGlyph Number/String The new glyph This parameter expects a format consistent with that of glyph
  		*/
  var setGlyph: js.UndefOr[js.Function1[/* newGlyph */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Set the icon for the panel s header
  		* @param newIcon String The new icon path
  		*/
  var setIcon: js.UndefOr[js.Function1[/* newIcon */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Set the iconCls for the panel s header
  		* @param newIconCls String The new CSS class name
  		*/
  var setIconCls: js.UndefOr[js.Function1[/* newIconCls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Set a title for the panel s header
  		* @param newTitle String
  		*/
  var setTitle: js.UndefOr[js.Function1[/* newTitle */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the UI for the component
  		* @param ui Object
  		*/
  @JSName("setUI")
  var setUI_IPanel: js.UndefOr[js.Function1[/* ui */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var simpleDrag: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object/Object[]) */
  var tbar: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var title: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var titleAlign: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var titleCollapse: js.UndefOr[Boolean] = js.native
  /** [Method] Shortcut for performing an expand or collapse based on the current state of the panel
  		* @returns Ext.panel.Panel this
  		*/
  var toggleCollapse: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Config Option] (Object[]/Ext.panel.Tool[]) */
  var tools: js.UndefOr[js.Any] = js.native
}

object IPanel {
  @scala.inline
  def apply(): IPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPanel]
  }
  @scala.inline
  implicit class IPanelOps[Self <: IPanel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddTool(value: /* tools */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTool")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddTool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTool")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterCollapse(value: /* animated */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCollapse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCollapse")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterExpand(value: /* animated */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterExpand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimCollapse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animCollapse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animCollapse")(js.undefined)
        ret
    }
    @scala.inline
    def withBbar(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bbar")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withButtons(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(js.undefined)
        ret
    }
    @scala.inline
    def withClosable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closable")(js.undefined)
        ret
    }
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeAction")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapse(value: (/* direction */ js.UndefOr[String], /* animate */ js.UndefOr[Boolean]) => IPanel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapseDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapseFirst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapseMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseMode")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsedCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsedCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsedCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsedCls")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsible")(js.undefined)
        ret
    }
    @scala.inline
    def withConstrainHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstrainHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withConvertCollapseDir(value: /* collapseDir */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertCollapseDir")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutConvertCollapseDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertCollapseDir")(js.undefined)
        ret
    }
    @scala.inline
    def withDd(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dd")(js.undefined)
        ret
    }
    @scala.inline
    def withExpand(value: /* animate */ js.UndefOr[Boolean] => IPanel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.undefined)
        ret
    }
    @scala.inline
    def withFbar(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fbar")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatable")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCollapsed(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCollapsed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCollapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHeader(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeader")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeader")(js.undefined)
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
    def withHeader(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderOverCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerOverCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderOverCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerOverCls")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withHideCollapseTool(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideCollapseTool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideCollapseTool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideCollapseTool")(js.undefined)
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
    def withIsVisible(value: /* deep */ js.UndefOr[js.Any] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withLbar(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lbar")(js.undefined)
        ret
    }
    @scala.inline
    def withManageHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manageHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManageHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manageHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinButtonWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minButtonWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinButtonWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minButtonWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRemoved(value: /* destroying */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemoved")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRemoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemoved")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlapHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlapHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlapHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlapHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderCollapseHideMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderCollapseHideMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderCollapseHideMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderCollapseHideMode")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withRbar(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rbar")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBorder(value: (/* border */ js.UndefOr[js.Any], /* targetEl */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBorder")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withSetGlyph(value: /* newGlyph */ js.UndefOr[js.Any] => Unit): Self = {
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
    def withSetIcon(value: /* newIcon */ js.UndefOr[String] => Unit): Self = {
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
    def withSetIconCls(value: /* newIconCls */ js.UndefOr[String] => Unit): Self = {
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
    def withSetTitle(value: /* newTitle */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.undefined)
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
    def withSimpleDrag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimpleDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withTbar(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tbar")(js.undefined)
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
    def withTitleAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleCollapse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleCollapse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleCollapse")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleCollapse(value: () => IPanel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleCollapse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutToggleCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleCollapse")(js.undefined)
        ret
    }
    @scala.inline
    def withTools(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tools")(js.undefined)
        ret
    }
  }
  
}

