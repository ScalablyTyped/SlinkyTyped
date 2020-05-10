package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.AnonItemElementItemIndex
import typingsSlinky.devextreme.AnonModelSelectedItem
import typingsSlinky.devextreme.AnonPreviousValue
import typingsSlinky.devextreme.devextremeStrings.contains
import typingsSlinky.devextreme.devextremeStrings.startswith
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import typingsSlinky.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.devextreme.mod.DevExpress.ui.DataExpressionMixinOptions because var conflicts: value. Inlined dataSource, displayExpr, itemTemplate, items, valueExpr */ @js.native
trait dxDropDownListOptions[T] extends dxDropDownEditorOptions[T] {
  /** Binds the widget to data. */
  var dataSource: js.UndefOr[String | (js.Array[CollectionWidgetItem | _]) | DataSource | DataSourceOptions] = js.native
  /** Specifies the data field whose values should be displayed. */
  var displayExpr: js.UndefOr[String | (js.Function1[/* item */ js.Any, String])] = js.native
  /** Returns the value currently displayed by the widget. */
  var displayValue: js.UndefOr[String] = js.native
  /** Specifies a custom template for group captions. */
  var groupTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  /** Specifies whether data items should be grouped. */
  var grouped: js.UndefOr[Boolean] = js.native
  /** Specifies a custom template for items. */
  var itemTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  /** An array of items displayed by the widget. */
  var items: js.UndefOr[js.Array[CollectionWidgetItem | _]] = js.native
  /** The minimum number of characters that must be entered into the text box to begin a search. Applies only if searchEnabled is true. */
  var minSearchLength: js.UndefOr[Double] = js.native
  /** The text or HTML markup displayed by the widget if the item collection is empty. */
  var noDataText: js.UndefOr[String] = js.native
  /** A function that is executed when a list item is clicked or tapped. */
  var onItemClick: js.UndefOr[js.Function1[/* e */ AnonItemElementItemIndex[T], _]] = js.native
  /** A function that is executed when a list item is selected or selection is canceled. */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ AnonModelSelectedItem[T], _]] = js.native
  /** A function that is executed after the widget's value is changed. */
  @JSName("onValueChanged")
  var onValueChanged_dxDropDownListOptions: js.UndefOr[js.Function1[/* e */ AnonPreviousValue[T], _]] = js.native
  /** Specifies whether to allow searching. */
  var searchEnabled: js.UndefOr[Boolean] = js.native
  /** Specifies the name of a data source item field or an expression whose value is compared to the search criterion. */
  var searchExpr: js.UndefOr[String | js.Function | (js.Array[String | js.Function])] = js.native
  /** Specifies a comparison operation used to search widget items. */
  var searchMode: js.UndefOr[contains | startswith] = js.native
  /** Specifies the time delay, in milliseconds, after the last character has been typed in, before a search is executed. */
  var searchTimeout: js.UndefOr[Double] = js.native
  /** Gets the currently selected item. */
  var selectedItem: js.UndefOr[js.Any] = js.native
  /** Specifies whether or not the widget displays unfiltered values until a user types a number of characters exceeding the minSearchLength option value. */
  var showDataBeforeSearch: js.UndefOr[Boolean] = js.native
  /** Specifies which data field provides unique values to the widget's value. */
  var valueExpr: js.UndefOr[String | (js.Function1[/* item */ js.Any, String | Double | Boolean])] = js.native
  /** Specifies whether text that exceeds the drop-down list width should be wrapped. */
  var wrapItemText: js.UndefOr[Boolean] = js.native
}

object dxDropDownListOptions {
  @scala.inline
  def apply[T](): dxDropDownListOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDropDownListOptions[T]]
  }
  @scala.inline
  implicit class dxDropDownListOptionsOps[Self[t] <: dxDropDownListOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDataSource(value: String | (js.Array[CollectionWidgetItem | _]) | DataSource | DataSourceOptions): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayExprFunction1(value: /* item */ js.Any => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayExpr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisplayExpr(value: String | (js.Function1[/* item */ js.Any, String])): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayExpr: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayValue(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupTemplateElement(value: Element): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | Element | JQuery
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupTemplate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGroupTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupTemplate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withGrouped(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrouped: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouped")(js.undefined)
        ret
    }
    @scala.inline
    def withItemTemplateElement(value: Element): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | Element | JQuery
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTemplate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withItemTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemTemplate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[CollectionWidgetItem | _]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSearchLength(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSearchLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSearchLength: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSearchLength")(js.undefined)
        ret
    }
    @scala.inline
    def withNoDataText(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDataText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoDataText: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDataText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemClick(value: /* e */ AnonItemElementItemIndex[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemClick: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectionChanged(value: /* e */ AnonModelSelectedItem[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectionChanged: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValueChanged(value: /* e */ AnonPreviousValue[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnValueChanged: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchEnabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchEnabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchExpr(value: String | js.Function | (js.Array[String | js.Function])): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchExpr: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchMode(value: contains | startswith): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchMode: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchTimeout(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchTimeout: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedItem(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedItem: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItem")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDataBeforeSearch(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDataBeforeSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDataBeforeSearch: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDataBeforeSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withValueExprFunction1(value: /* item */ js.Any => String | Double | Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueExpr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValueExpr(value: String | (js.Function1[/* item */ js.Any, String | Double | Boolean])): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueExpr: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapItemText(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapItemText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapItemText: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapItemText")(js.undefined)
        ret
    }
  }
  
}

