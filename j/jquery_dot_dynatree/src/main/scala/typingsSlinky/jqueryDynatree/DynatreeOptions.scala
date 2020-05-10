package typingsSlinky.jqueryDynatree

import typingsSlinky.jquery.JQueryAjaxSettings
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynatreeOptions extends js.Object {
   // 1:activate, 2:expand, 3:activate and expand
  var activeVisible: js.UndefOr[Boolean] = js.native
    // Drag'n'drop support
  var ajaxDefaults: js.UndefOr[DynaTreeAjaxOptions] = js.native
   // Persist expand-status to a cookie
  var autoCollapse: js.UndefOr[Boolean] = js.native
   // Ajax options used to initialize the tree strucuture.
  var autoFocus: js.UndefOr[Boolean] = js.native
   // Make sure, active nodes are visible (expanded).
  var checkbox: js.UndefOr[Boolean] = js.native
   // Path to a folder containing icons. Defaults to 'skin/' subdirectory.
  var children: js.UndefOr[js.Array[DynaTreeDataModel]] = js.native
  // Class names used, when rendering the HTML markup.
  // Note: if only single entries are passed for options.classNames, all other
  // values are still set to default.
  var classNames: js.UndefOr[DynatreeClassNamesOptions] = js.native
   // Automatically collapse all siblings, when a node is expanded.
  var clickFolderMode: js.UndefOr[Double] = js.native
  var cookie: js.UndefOr[DynaTreeCookieOptions] = js.native
   // Used by node.getKeyPath() and tree.loadKeyPath().
  var cookieId: js.UndefOr[String] = js.native
   // Use <span> instead of <a> tags for all nodes
  var debugLevel: js.UndefOr[Double] = js.native
   // Choose a more unique name, to allow multiple trees.
  var dnd: js.UndefOr[DynaTreeDNDOptions] = js.native
   // 1:single, 2:multi, 3:multi-hier
  var fx: js.UndefOr[js.Any] = js.native
   // 0:quiet, 1:normal, 2:debug
  var generateIds: js.UndefOr[Boolean] = js.native
   // Generate id attributes like <span id='dynatree-id-KEY'>
  var idPrefix: js.UndefOr[String] = js.native
   // 1: root node is not collapsible
  var imagePath: js.UndefOr[String] = js.native
   // Init tree structure from a <ul> element with this ID.
  var initAjax: js.UndefOr[JQueryAjaxSettings] = js.native
   // Init tree structure from this object array.
  var initId: js.UndefOr[String] = js.native
   // Used to generate node id's like <span id="dynatree-id-<key>">.
  var keyPathSeparator: js.UndefOr[String] = js.native
   // Set focus to first child, when expanding or lazy-loading.
  var keyboard: js.UndefOr[Boolean] = js.native
   // Tree's name (only used for debug outpu)
  var minExpandLevel: js.UndefOr[Double] = js.native
   // Animations, e.g. null or { height: "toggle", duration: 200 }
  var noLink: js.UndefOr[Boolean] = js.native
  // Callback(isReloading, isError) when tree was (re)loaded.
  var onActivate: js.UndefOr[js.Function1[/* dtnode */ DynaTreeNode, Unit]] = js.native
   // null: set focus to node.
  var onBlur: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ Event_, Boolean]] = js.native
  // Low level event handlers: onEvent(dtnode, event): return false, to stop default processing
  var onClick: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ Event_, Boolean]] = js.native
   // Callback(dtnode) before a node is rendered. Return a HTML string to override.
  var onCreate: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* nodeSpan */ js.Any, Unit]] = js.native
   // Callback(dtnode) when a lazy node is expanded for the first time.
  var onCustomRender: js.UndefOr[js.Function1[/* dtnode */ DynaTreeNode, Unit]] = js.native
   // null: generate focus, expand, activate, select events.
  var onDblClick: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ Event_, Boolean]] = js.native
   // Callback(dtnode) when a node is activated.
  var onDeactivate: js.UndefOr[js.Function1[/* dtnode */ DynaTreeNode, Unit]] = js.native
   // Callback(flag, dtnode) when a node is (de)selected.
  var onExpand: js.UndefOr[js.Function2[/* flag */ String, /* dtnode */ DynaTreeNode, Unit]] = js.native
   // (No default actions.)
  var onFocus: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ Event_, Boolean]] = js.native
   // (No default actions.)
  var onKeydown: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ Event_, Boolean]] = js.native
   // null: generate keyboard navigation (focus, expand, activate).
  var onKeypress: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ Event_, Boolean]] = js.native
   // Callback(flag, dtnode) when a node is expanded/collapsed.
  var onLazyRead: js.UndefOr[js.Function1[/* dtnode */ DynaTreeNode, Unit]] = js.native
  // Callback(flag, dtnode) before a node is expanded/collpsed.
  // High level event handlers
  var onPostInit: js.UndefOr[js.Function2[/* isReloading */ Boolean, /* isError */ Boolean, Unit]] = js.native
   // null: remove focus from node.
  // Pre-event handlers onQueryEvent(flag, dtnode): return false, to stop processing
  var onQueryActivate: js.UndefOr[js.Function2[/* flag */ String, /* dtnode */ DynaTreeNode, Unit]] = js.native
  // Callback(flag, dtnode) before a node is (de)selected.
  var onQueryExpand: js.UndefOr[js.Function2[/* flag */ String, /* dtnode */ DynaTreeNode, Unit]] = js.native
   // Callback(flag, dtnode) before a node is (de)activated.
  var onQuerySelect: js.UndefOr[js.Function2[/* flag */ String, /* dtnode */ DynaTreeNode, Unit]] = js.native
   // Callback(dtnode, nodeSpan) after a node was rendered for the first time.
  var onRender: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* nodeSpan */ js.Any, Unit]] = js.native
   // Callback(dtnode) when a node is deactivated.
  var onSelect: js.UndefOr[js.Function2[/* flag */ String, /* dtnode */ DynaTreeNode, Unit]] = js.native
   // Support keyboard navigation.
  var persist: js.UndefOr[Boolean] = js.native
   // Callback(dtnode, nodeSpan) after a node was rendered.
  var postProcess: js.UndefOr[js.Function2[/* data */ js.Any, /* dataType */ js.Any, Unit]] = js.native
   // Show checkboxes.
  var selectMode: js.UndefOr[Double] = js.native
  // Used by initAjax option
  var strings: js.UndefOr[DynaTreeStringsOptions] = js.native
  var title: js.UndefOr[String] = js.native
}

object DynatreeOptions {
  @scala.inline
  def apply(): DynatreeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynatreeOptions]
  }
  @scala.inline
  implicit class DynatreeOptionsOps[Self <: DynatreeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxDefaults(value: DynaTreeAjaxOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjaxDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxDefaults")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCollapse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCollapse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCollapse")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckbox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkbox")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[DynaTreeDataModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withClassNames(value: DynatreeClassNamesOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNames")(js.undefined)
        ret
    }
    @scala.inline
    def withClickFolderMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickFolderMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickFolderMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickFolderMode")(js.undefined)
        ret
    }
    @scala.inline
    def withCookie(value: DynaTreeCookieOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(js.undefined)
        ret
    }
    @scala.inline
    def withCookieId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieId")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withDnd(value: DynaTreeDNDOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnd")(js.undefined)
        ret
    }
    @scala.inline
    def withFx(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fx")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateIds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerateIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateIds")(js.undefined)
        ret
    }
    @scala.inline
    def withIdPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withImagePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImagePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagePath")(js.undefined)
        ret
    }
    @scala.inline
    def withInitAjax(value: JQueryAjaxSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initAjax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitAjax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initAjax")(js.undefined)
        ret
    }
    @scala.inline
    def withInitId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initId")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyPathSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPathSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyPathSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPathSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withMinExpandLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minExpandLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinExpandLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minExpandLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withNoLink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noLink")(js.undefined)
        ret
    }
    @scala.inline
    def withOnActivate(value: /* dtnode */ DynaTreeNode => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActivate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnActivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActivate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: (/* dtnode */ DynaTreeNode, /* event */ Event_) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: (/* dtnode */ DynaTreeNode, /* event */ Event_) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCreate(value: (/* dtnode */ DynaTreeNode, /* nodeSpan */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCreate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCustomRender(value: /* dtnode */ DynaTreeNode => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCustomRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCustomRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCustomRender")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDblClick(value: (/* dtnode */ DynaTreeNode, /* event */ Event_) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDblClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDblClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDblClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDeactivate(value: /* dtnode */ DynaTreeNode => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeactivate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDeactivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeactivate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExpand(value: (/* flag */ String, /* dtnode */ DynaTreeNode) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpand")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: (/* dtnode */ DynaTreeNode, /* event */ Event_) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeydown(value: (/* dtnode */ DynaTreeNode, /* event */ Event_) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeydown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnKeydown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeydown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeypress(value: (/* dtnode */ DynaTreeNode, /* event */ Event_) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeypress")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnKeypress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeypress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLazyRead(value: /* dtnode */ DynaTreeNode => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLazyRead")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLazyRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLazyRead")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPostInit(value: (/* isReloading */ Boolean, /* isError */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPostInit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPostInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPostInit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnQueryActivate(value: (/* flag */ String, /* dtnode */ DynaTreeNode) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onQueryActivate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnQueryActivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onQueryActivate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnQueryExpand(value: (/* flag */ String, /* dtnode */ DynaTreeNode) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onQueryExpand")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnQueryExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onQueryExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withOnQuerySelect(value: (/* flag */ String, /* dtnode */ DynaTreeNode) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onQuerySelect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnQuerySelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onQuerySelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRender(value: (/* dtnode */ DynaTreeNode, /* nodeSpan */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRender")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: (/* flag */ String, /* dtnode */ DynaTreeNode) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withPersist(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persist")(js.undefined)
        ret
    }
    @scala.inline
    def withPostProcess(value: (/* data */ js.Any, /* dataType */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postProcess")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPostProcess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postProcess")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectMode")(js.undefined)
        ret
    }
    @scala.inline
    def withStrings(value: DynaTreeStringsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(js.undefined)
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
  }
  
}

