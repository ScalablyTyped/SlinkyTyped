package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.AnonAddedItems
import typingsSlinky.devextreme.AnonEvent
import typingsSlinky.devextreme.AnonItemData
import typingsSlinky.devextreme.AnonItemElement
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import typingsSlinky.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionWidgetOptions[T] extends WidgetOptions[T] {
  /** Binds the widget to data. */
  var dataSource: js.UndefOr[
    String | (js.Array[String | CollectionWidgetItem]) | DataSource | DataSourceOptions
  ] = js.native
  /** The time period in milliseconds before the onItemHold event is raised. */
  var itemHoldTimeout: js.UndefOr[Double] = js.native
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
  var items: js.UndefOr[js.Array[String | CollectionWidgetItem | _]] = js.native
  /** Specifies which data field provides keys for widget items. */
  var keyExpr: js.UndefOr[String | js.Function] = js.native
  /** The text or HTML markup displayed by the widget if the item collection is empty. */
  var noDataText: js.UndefOr[String] = js.native
  /** A function that is executed when a collection item is clicked or tapped. */
  var onItemClick: js.UndefOr[(js.Function1[/* e */ AnonEvent[T], _]) | String] = js.native
  /** A function that is executed when a collection item is right-clicked or pressed. */
  var onItemContextMenu: js.UndefOr[js.Function1[/* e */ AnonEvent[T], _]] = js.native
  /** A function that is executed when a collection item has been held for a specified period. */
  var onItemHold: js.UndefOr[js.Function1[/* e */ AnonItemData[T], _]] = js.native
  /** A function that is executed after a collection item is rendered. */
  var onItemRendered: js.UndefOr[js.Function1[/* e */ AnonItemElement[T], _]] = js.native
  /** A function that is executed when a collection item is selected or selection is canceled. */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ AnonAddedItems[T], _]] = js.native
  /** The index of the currently selected widget item. */
  var selectedIndex: js.UndefOr[Double] = js.native
  /** The selected item object. */
  var selectedItem: js.UndefOr[js.Any] = js.native
  /** Specifies an array of currently selected item keys. */
  var selectedItemKeys: js.UndefOr[js.Array[_]] = js.native
  /** An array of currently selected item objects. */
  var selectedItems: js.UndefOr[js.Array[_]] = js.native
}

object CollectionWidgetOptions {
  @scala.inline
  def apply[T](): CollectionWidgetOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionWidgetOptions[T]]
  }
  @scala.inline
  implicit class CollectionWidgetOptionsOps[Self[t] <: CollectionWidgetOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDataSource(value: String | (js.Array[String | CollectionWidgetItem]) | DataSource | DataSourceOptions): Self[T] = {
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
    def withItemHoldTimeout(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemHoldTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemHoldTimeout: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemHoldTimeout")(js.undefined)
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
    def withItems(value: js.Array[String | CollectionWidgetItem | _]): Self[T] = {
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
    def withKeyExpr(value: String | js.Function): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyExpr: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyExpr")(js.undefined)
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
    def withOnItemClickFunction1(value: /* e */ AnonEvent[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnItemClick(value: (js.Function1[/* e */ AnonEvent[T], _]) | String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnItemClick: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemContextMenu(value: /* e */ AnonEvent[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemContextMenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemContextMenu: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemHold(value: /* e */ AnonItemData[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemHold")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemHold: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemHold")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemRendered(value: /* e */ AnonItemElement[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemRendered")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemRendered: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectionChanged(value: /* e */ AnonAddedItems[T] => _): Self[T] = {
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
    def withSelectedIndex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedIndex: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIndex")(js.undefined)
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
    def withSelectedItemKeys(value: js.Array[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItemKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedItemKeys: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItemKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedItems(value: js.Array[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedItems: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItems")(js.undefined)
        ret
    }
  }
  
}

