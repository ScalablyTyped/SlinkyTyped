package typingsSlinky.jqueryFancytree.Fancytree

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jquery.JQueryEventObject
import typingsSlinky.jqueryFancytree.AnonBottom
import typingsSlinky.jqueryFancytree.AnonCache
import typingsSlinky.jqueryFancytree.Fancytree.Extensions.DragAndDrop5
import typingsSlinky.jqueryFancytree.Fancytree.Extensions.Filter
import typingsSlinky.jqueryFancytree.Fancytree.Extensions.Table
import typingsSlinky.jqueryFancytree.JQuery
import typingsSlinky.jqueryFancytree.jqueryFancytreeBooleans.`false`
import typingsSlinky.jqueryFancytree.jqueryFancytreeNumbers.`0`
import typingsSlinky.jqueryFancytree.jqueryFancytreeNumbers.`1`
import typingsSlinky.jqueryFancytree.jqueryFancytreeNumbers.`2`
import typingsSlinky.jqueryFancytree.jqueryFancytreeNumbers.`3`
import typingsSlinky.jqueryFancytree.jqueryFancytreeNumbers.`4`
import typingsSlinky.jqueryFancytree.jqueryFancytreeStrings.dnd5
import typingsSlinky.jqueryFancytree.jqueryFancytreeStrings.filter
import typingsSlinky.jqueryFancytree.jqueryFancytreeStrings.table
import typingsSlinky.jqueryui.JQueryUI.EffectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FancytreeOptions
  extends FancytreeEvents
     with /** Options for misc extensions - see docs for typings */
/* extension */ StringDictionary[js.Any] {
  /** Make sure that the active node is always visible, i.e. its parents are expanded (default: true). */
  var activeVisible: js.UndefOr[Boolean] = js.native
  /** Default options for ajax requests. */
  var ajax: js.UndefOr[AnonCache] = js.native
  /** (default: false) Add WAI-ARIA attributes to markup */
  var aria: js.UndefOr[Boolean] = js.native
  /** Activate a node when focused with the keyboard (default: true) */
  var autoActivate: js.UndefOr[Boolean] = js.native
  /** Automatically collapse all siblings, when a node is expanded (default: false). */
  var autoCollapse: js.UndefOr[Boolean] = js.native
  /** Scroll node into visible area, when focused by keyboard (default: false). */
  var autoScroll: js.UndefOr[Boolean] = js.native
  /** Display checkboxes to allow selection (default: false) */
  var checkbox: js.UndefOr[
    Boolean | String | (js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Boolean])
  ] = js.native
  /** Defines what happens, when the user click a folder node. (default: activate_dblclick_expands) */
  var clickFolderMode: js.UndefOr[FancytreeClickFolderMode] = js.native
  /** 0..4 (null: use global setting $.ui.fancytree.debugInfo) */
  var debugLevel: js.UndefOr[`0` | `1` | `2` | `3` | `4`] = js.native
  /** callback(node) is called for new nodes without a key. Must return a new unique key. (default null: generates default keys like that: "_" + counter) */
  var defaultKey: js.UndefOr[js.Function1[/* node */ FancytreeNode, String]] = js.native
  ////////////////
  // EXTENSIONS //
  ////////////////
  var dnd5: js.UndefOr[DragAndDrop5] = js.native
  /** Accept passing ajax data in a property named `d` (default: true). */
  var enableAspx: js.UndefOr[Boolean] = js.native
  /** Enable titles (default: false) */
  var enableTitles: js.UndefOr[Boolean] = js.native
  /** List of active extensions (default: []) */
  var extensions: js.UndefOr[js.Array[dnd5 | filter | table | String]] = js.native
  var filter: js.UndefOr[Filter] = js.native
  /** Set focus when node is checked by a mouse click (default: false) */
  var focusOnSelect: js.UndefOr[Boolean] = js.native
  /** Add `id="..."` to node markup (default: true). */
  var generateIds: js.UndefOr[Boolean] = js.native
  /** Node icon url, if only filename, please use imagePath to set the path */
  var icon: js.UndefOr[Boolean | String] = js.native
  /** Prefix (default: "ft_") */
  var idPrefix: js.UndefOr[String] = js.native
  /** Path to a folder containing icons (default: null, using 'skin/' subdirectory). */
  var imagePath: js.UndefOr[String] = js.native
  /** (default: "/") */
  var keyPathSeparator: js.UndefOr[String] = js.native
  /** Support keyboard navigation (default: true). */
  var keyboard: js.UndefOr[Boolean] = js.native
  /** 2: top-level nodes are not collapsible (default: 1) */
  var minExpandLevel: js.UndefOr[Double] = js.native
  /** navigate to next node by typing the first letters (default: false) */
  var quicksearch: js.UndefOr[Boolean] = js.native
  /** optional margins for node.scrollIntoView() (default: {top: 0, bottom: 0}) */
  var scrollOfs: js.UndefOr[AnonBottom] = js.native
  /** scrollable container for node.scrollIntoView() (default: $container) */
  var scrollParent: js.UndefOr[JQuery | Null] = js.native
  /** default: multi_hier */
  var selectMode: js.UndefOr[FancytreeSelectMode] = js.native
  /** Used to Initialize the tree. */
  var source: js.UndefOr[js.Array[_] | js.Any] = js.native
  /** Translation table */
  var strings: js.UndefOr[TranslationTable] = js.native
  /** Add tabindex='0' to container, so tree can be reached using TAB */
  var tabbable: js.UndefOr[Boolean] = js.native
  var table: js.UndefOr[Table] = js.native
  /** Add tabindex='0' to node title span, so it can receive keyboard focus */
  var titlesTabbable: js.UndefOr[Boolean] = js.native
  /** Animation options, false:off (default: { effect: "blind", options: {direction: "vertical", scale: "box"}, duration: 200 }) */
  var toggleEffect: js.UndefOr[`false` | EffectOptions] = js.native
  /** Tooltips */
  var tooltip: js.UndefOr[Boolean] = js.native
  /** (dynamic Option)Prevent (de-)selection using mouse or keyboard. */
  var unselectable: js.UndefOr[
    Boolean | (js.Function2[/* event */ JQueryEventObject, /* data */ EventData, js.UndefOr[Boolean]])
  ] = js.native
  /** (dynamic Option)Ignore this node when calculating the partsel status of parent nodes in selectMode 3 propagation. */
  var unselectableIgnore: js.UndefOr[
    Boolean | (js.Function2[/* event */ JQueryEventObject, /* data */ EventData, js.UndefOr[Boolean]])
  ] = js.native
  /** (dynamic Option)Use this as constant selected value (overriding selectMode 3 propagation). */
  var unselectableStatus: js.UndefOr[
    Boolean | (js.Function2[/* event */ JQueryEventObject, /* data */ EventData, js.UndefOr[Boolean]])
  ] = js.native
}

object FancytreeOptions {
  @scala.inline
  def apply(): FancytreeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FancytreeOptions]
  }
  @scala.inline
  implicit class FancytreeOptionsOps[Self <: FancytreeOptions] (val x: Self) extends AnyVal {
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
    def withAjax(value: AnonCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajax")(js.undefined)
        ret
    }
    @scala.inline
    def withAria(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoActivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoActivate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoActivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoActivate")(js.undefined)
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
    def withAutoScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckboxFunction2(value: (/* event */ JQueryEventObject, /* data */ EventData) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkbox")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCheckbox(
      value: Boolean | String | (js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Boolean])
    ): Self = {
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
    def withClickFolderMode(value: FancytreeClickFolderMode): Self = {
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
    def withDebugLevel(value: `0` | `1` | `2` | `3` | `4`): Self = {
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
    def withDefaultKey(value: /* node */ FancytreeNode => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDefaultKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultKey")(js.undefined)
        ret
    }
    @scala.inline
    def withDnd5(value: DragAndDrop5): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnd5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnd5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnd5")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAspx(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAspx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAspx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAspx")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTitles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTitles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTitles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTitles")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[dnd5 | filter | table | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: Filter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusOnSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOnSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOnSelect")(js.undefined)
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
    def withIcon(value: Boolean | String): Self = {
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
    def withQuicksearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quicksearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuicksearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quicksearch")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollOfs(value: AnonBottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOfs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollOfs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOfs")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollParent(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollParent")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollParentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollParent")(null)
        ret
    }
    @scala.inline
    def withSelectMode(value: FancytreeSelectMode): Self = {
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
    def withSource(value: js.Array[_] | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withStrings(value: TranslationTable): Self = {
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
    def withTabbable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabbable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabbable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabbable")(js.undefined)
        ret
    }
    @scala.inline
    def withTable(value: Table): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(js.undefined)
        ret
    }
    @scala.inline
    def withTitlesTabbable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titlesTabbable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitlesTabbable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titlesTabbable")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleEffect(value: `false` | EffectOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleEffect")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: Boolean): Self = {
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
    def withUnselectableFunction2(value: (/* event */ JQueryEventObject, /* data */ EventData) => js.UndefOr[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectable")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnselectable(
      value: Boolean | (js.Function2[/* event */ JQueryEventObject, /* data */ EventData, js.UndefOr[Boolean]])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnselectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectable")(js.undefined)
        ret
    }
    @scala.inline
    def withUnselectableIgnoreFunction2(value: (/* event */ JQueryEventObject, /* data */ EventData) => js.UndefOr[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectableIgnore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnselectableIgnore(
      value: Boolean | (js.Function2[/* event */ JQueryEventObject, /* data */ EventData, js.UndefOr[Boolean]])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectableIgnore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnselectableIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectableIgnore")(js.undefined)
        ret
    }
    @scala.inline
    def withUnselectableStatusFunction2(value: (/* event */ JQueryEventObject, /* data */ EventData) => js.UndefOr[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectableStatus")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnselectableStatus(
      value: Boolean | (js.Function2[/* event */ JQueryEventObject, /* data */ EventData, js.UndefOr[Boolean]])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectableStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnselectableStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectableStatus")(js.undefined)
        ret
    }
  }
  
}

