package typingsSlinky.jqueryDynatree

import org.scalajs.dom.raw.Event
import typingsSlinky.jquery.JQueryAjaxSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynatreeOptions extends StObject {
  
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
  var onBlur: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ Event, Boolean]] = js.native
  
  // Low level event handlers: onEvent(dtnode, event): return false, to stop default processing
  var onClick: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ Event, Boolean]] = js.native
  
  // Callback(dtnode) before a node is rendered. Return a HTML string to override.
  var onCreate: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* nodeSpan */ js.Any, Unit]] = js.native
  
  // Callback(dtnode) when a lazy node is expanded for the first time.
  var onCustomRender: js.UndefOr[js.Function1[/* dtnode */ DynaTreeNode, Unit]] = js.native
  
  // null: generate focus, expand, activate, select events.
  var onDblClick: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ Event, Boolean]] = js.native
  
  // Callback(dtnode) when a node is activated.
  var onDeactivate: js.UndefOr[js.Function1[/* dtnode */ DynaTreeNode, Unit]] = js.native
  
  // Callback(flag, dtnode) when a node is (de)selected.
  var onExpand: js.UndefOr[js.Function2[/* flag */ String, /* dtnode */ DynaTreeNode, Unit]] = js.native
  
  // (No default actions.)
  var onFocus: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ Event, Boolean]] = js.native
  
  // (No default actions.)
  var onKeydown: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ Event, Boolean]] = js.native
  
  // null: generate keyboard navigation (focus, expand, activate).
  var onKeypress: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ Event, Boolean]] = js.native
  
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
  implicit class DynatreeOptionsMutableBuilder[Self <: DynatreeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveVisible(value: Boolean): Self = StObject.set(x, "activeVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveVisibleUndefined: Self = StObject.set(x, "activeVisible", js.undefined)
    
    @scala.inline
    def setAjaxDefaults(value: DynaTreeAjaxOptions): Self = StObject.set(x, "ajaxDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAjaxDefaultsUndefined: Self = StObject.set(x, "ajaxDefaults", js.undefined)
    
    @scala.inline
    def setAutoCollapse(value: Boolean): Self = StObject.set(x, "autoCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCollapseUndefined: Self = StObject.set(x, "autoCollapse", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    @scala.inline
    def setCheckbox(value: Boolean): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckboxUndefined: Self = StObject.set(x, "checkbox", js.undefined)
    
    @scala.inline
    def setChildren(value: js.Array[DynaTreeDataModel]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: DynaTreeDataModel*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setClassNames(value: DynatreeClassNamesOptions): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
    
    @scala.inline
    def setClickFolderMode(value: Double): Self = StObject.set(x, "clickFolderMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickFolderModeUndefined: Self = StObject.set(x, "clickFolderMode", js.undefined)
    
    @scala.inline
    def setCookie(value: DynaTreeCookieOptions): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieId(value: String): Self = StObject.set(x, "cookieId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieIdUndefined: Self = StObject.set(x, "cookieId", js.undefined)
    
    @scala.inline
    def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
    
    @scala.inline
    def setDebugLevel(value: Double): Self = StObject.set(x, "debugLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugLevelUndefined: Self = StObject.set(x, "debugLevel", js.undefined)
    
    @scala.inline
    def setDnd(value: DynaTreeDNDOptions): Self = StObject.set(x, "dnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDndUndefined: Self = StObject.set(x, "dnd", js.undefined)
    
    @scala.inline
    def setFx(value: js.Any): Self = StObject.set(x, "fx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFxUndefined: Self = StObject.set(x, "fx", js.undefined)
    
    @scala.inline
    def setGenerateIds(value: Boolean): Self = StObject.set(x, "generateIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateIdsUndefined: Self = StObject.set(x, "generateIds", js.undefined)
    
    @scala.inline
    def setIdPrefix(value: String): Self = StObject.set(x, "idPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdPrefixUndefined: Self = StObject.set(x, "idPrefix", js.undefined)
    
    @scala.inline
    def setImagePath(value: String): Self = StObject.set(x, "imagePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePathUndefined: Self = StObject.set(x, "imagePath", js.undefined)
    
    @scala.inline
    def setInitAjax(value: JQueryAjaxSettings): Self = StObject.set(x, "initAjax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitAjaxUndefined: Self = StObject.set(x, "initAjax", js.undefined)
    
    @scala.inline
    def setInitId(value: String): Self = StObject.set(x, "initId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitIdUndefined: Self = StObject.set(x, "initId", js.undefined)
    
    @scala.inline
    def setKeyPathSeparator(value: String): Self = StObject.set(x, "keyPathSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPathSeparatorUndefined: Self = StObject.set(x, "keyPathSeparator", js.undefined)
    
    @scala.inline
    def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    @scala.inline
    def setMinExpandLevel(value: Double): Self = StObject.set(x, "minExpandLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinExpandLevelUndefined: Self = StObject.set(x, "minExpandLevel", js.undefined)
    
    @scala.inline
    def setNoLink(value: Boolean): Self = StObject.set(x, "noLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoLinkUndefined: Self = StObject.set(x, "noLink", js.undefined)
    
    @scala.inline
    def setOnActivate(value: /* dtnode */ DynaTreeNode => Unit): Self = StObject.set(x, "onActivate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnActivateUndefined: Self = StObject.set(x, "onActivate", js.undefined)
    
    @scala.inline
    def setOnBlur(value: (/* dtnode */ DynaTreeNode, /* event */ Event) => Boolean): Self = StObject.set(x, "onBlur", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnClick(value: (/* dtnode */ DynaTreeNode, /* event */ Event) => Boolean): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnCreate(value: (/* dtnode */ DynaTreeNode, /* nodeSpan */ js.Any) => Unit): Self = StObject.set(x, "onCreate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnCreateUndefined: Self = StObject.set(x, "onCreate", js.undefined)
    
    @scala.inline
    def setOnCustomRender(value: /* dtnode */ DynaTreeNode => Unit): Self = StObject.set(x, "onCustomRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCustomRenderUndefined: Self = StObject.set(x, "onCustomRender", js.undefined)
    
    @scala.inline
    def setOnDblClick(value: (/* dtnode */ DynaTreeNode, /* event */ Event) => Boolean): Self = StObject.set(x, "onDblClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnDblClickUndefined: Self = StObject.set(x, "onDblClick", js.undefined)
    
    @scala.inline
    def setOnDeactivate(value: /* dtnode */ DynaTreeNode => Unit): Self = StObject.set(x, "onDeactivate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDeactivateUndefined: Self = StObject.set(x, "onDeactivate", js.undefined)
    
    @scala.inline
    def setOnExpand(value: (/* flag */ String, /* dtnode */ DynaTreeNode) => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
    
    @scala.inline
    def setOnFocus(value: (/* dtnode */ DynaTreeNode, /* event */ Event) => Boolean): Self = StObject.set(x, "onFocus", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnKeydown(value: (/* dtnode */ DynaTreeNode, /* event */ Event) => Boolean): Self = StObject.set(x, "onKeydown", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnKeydownUndefined: Self = StObject.set(x, "onKeydown", js.undefined)
    
    @scala.inline
    def setOnKeypress(value: (/* dtnode */ DynaTreeNode, /* event */ Event) => Boolean): Self = StObject.set(x, "onKeypress", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnKeypressUndefined: Self = StObject.set(x, "onKeypress", js.undefined)
    
    @scala.inline
    def setOnLazyRead(value: /* dtnode */ DynaTreeNode => Unit): Self = StObject.set(x, "onLazyRead", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLazyReadUndefined: Self = StObject.set(x, "onLazyRead", js.undefined)
    
    @scala.inline
    def setOnPostInit(value: (/* isReloading */ Boolean, /* isError */ Boolean) => Unit): Self = StObject.set(x, "onPostInit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnPostInitUndefined: Self = StObject.set(x, "onPostInit", js.undefined)
    
    @scala.inline
    def setOnQueryActivate(value: (/* flag */ String, /* dtnode */ DynaTreeNode) => Unit): Self = StObject.set(x, "onQueryActivate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnQueryActivateUndefined: Self = StObject.set(x, "onQueryActivate", js.undefined)
    
    @scala.inline
    def setOnQueryExpand(value: (/* flag */ String, /* dtnode */ DynaTreeNode) => Unit): Self = StObject.set(x, "onQueryExpand", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnQueryExpandUndefined: Self = StObject.set(x, "onQueryExpand", js.undefined)
    
    @scala.inline
    def setOnQuerySelect(value: (/* flag */ String, /* dtnode */ DynaTreeNode) => Unit): Self = StObject.set(x, "onQuerySelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnQuerySelectUndefined: Self = StObject.set(x, "onQuerySelect", js.undefined)
    
    @scala.inline
    def setOnRender(value: (/* dtnode */ DynaTreeNode, /* nodeSpan */ js.Any) => Unit): Self = StObject.set(x, "onRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
    
    @scala.inline
    def setOnSelect(value: (/* flag */ String, /* dtnode */ DynaTreeNode) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    @scala.inline
    def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
    
    @scala.inline
    def setPostProcess(value: (/* data */ js.Any, /* dataType */ js.Any) => Unit): Self = StObject.set(x, "postProcess", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPostProcessUndefined: Self = StObject.set(x, "postProcess", js.undefined)
    
    @scala.inline
    def setSelectMode(value: Double): Self = StObject.set(x, "selectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectModeUndefined: Self = StObject.set(x, "selectMode", js.undefined)
    
    @scala.inline
    def setStrings(value: DynaTreeStringsOptions): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
