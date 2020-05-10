package typingsSlinky.bootstrapTreeview

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapTreeViewOptions extends js.Object {
  var backColor: js.UndefOr[String] = js.native
  var borderColor: js.UndefOr[String] = js.native
  var checkedIcon: js.UndefOr[String] = js.native
  var collapseIcon: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var data: js.UndefOr[js.Array[BootstrapTreeViewNodeData]] = js.native
  var emptyIcon: js.UndefOr[String] = js.native
  var enableLinks: js.UndefOr[Boolean] = js.native
  var expandIcon: js.UndefOr[String] = js.native
  var highlightSearchResults: js.UndefOr[Boolean] = js.native
  var highlightSelected: js.UndefOr[Boolean] = js.native
  var levels: js.UndefOr[Double] = js.native
  var multiSelect: js.UndefOr[Boolean] = js.native
  var nodeIcon: js.UndefOr[String] = js.native
  var onNodeChecked: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.native
  var onNodeCollapsed: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.native
  var onNodeDisabled: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.native
  var onNodeEnabled: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.native
  var onNodeExpanded: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.native
  var onNodeSelected: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.native
  var onNodeUnchecked: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.native
  var onNodeUnselected: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.native
  var onSearchCleared: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.native
  var onSearchComplete: js.UndefOr[js.Function2[/* event */ js.Any, /* node */ BootstrapTreeViewNodeData, Unit]] = js.native
  var onhoverColor: js.UndefOr[String] = js.native
  var searchResultBackColor: js.UndefOr[String] = js.native
  var searchResultColor: js.UndefOr[String] = js.native
  var selectedBackColor: js.UndefOr[String] = js.native
  var selectedColor: js.UndefOr[String] = js.native
  var selectedIcon: js.UndefOr[String] = js.native
  var showBorder: js.UndefOr[Boolean] = js.native
  var showCheckbox: js.UndefOr[Boolean] = js.native
  var showIcon: js.UndefOr[Boolean] = js.native
  var showTags: js.UndefOr[Boolean] = js.native
  var uncheckedIcon: js.UndefOr[Boolean] = js.native
}

object BootstrapTreeViewOptions {
  @scala.inline
  def apply(): BootstrapTreeViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BootstrapTreeViewOptions]
  }
  @scala.inline
  implicit class BootstrapTreeViewOptionsOps[Self <: BootstrapTreeViewOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckedIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckedIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapseIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[BootstrapTreeViewNodeData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightSearchResults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSearchResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightSearchResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSearchResults")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withLevels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levels")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNodeChecked(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeChecked")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnNodeChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeChecked")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNodeCollapsed(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeCollapsed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnNodeCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeCollapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNodeDisabled(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeDisabled")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnNodeDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNodeEnabled(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeEnabled")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnNodeEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNodeExpanded(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeExpanded")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnNodeExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeExpanded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNodeSelected(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeSelected")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnNodeSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNodeUnchecked(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeUnchecked")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnNodeUnchecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeUnchecked")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNodeUnselected(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeUnselected")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnNodeUnselected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeUnselected")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSearchCleared(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearchCleared")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSearchCleared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearchCleared")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSearchComplete(value: (/* event */ js.Any, /* node */ BootstrapTreeViewNodeData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearchComplete")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSearchComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearchComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnhoverColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onhoverColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnhoverColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onhoverColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchResultBackColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchResultBackColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchResultBackColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchResultBackColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchResultColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchResultColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchResultColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchResultColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedBackColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedBackColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedBackColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedBackColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withShowBorder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCheckbox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCheckbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCheckbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCheckbox")(js.undefined)
        ret
    }
    @scala.inline
    def withShowIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTags")(js.undefined)
        ret
    }
    @scala.inline
    def withUncheckedIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncheckedIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUncheckedIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncheckedIcon")(js.undefined)
        ret
    }
  }
  
}

