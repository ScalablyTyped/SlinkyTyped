package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.devextremeStrings.multiple
import typingsSlinky.devextreme.devextremeStrings.single_
import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTabsOptions[T] extends CollectionWidgetOptions[T] {
  /** Binds the widget to data. */
  @JSName("dataSource")
  var dataSource_dxTabsOptions: js.UndefOr[String | (js.Array[String | dxTabsItem | _]) | DataSource | DataSourceOptions] = js.native
  /** An array of items displayed by the widget. */
  @JSName("items")
  var items_dxTabsOptions: js.UndefOr[js.Array[String | dxTabsItem | _]] = js.native
  /** Specifies whether to repaint only those elements whose data changed. */
  var repaintChangesOnly: js.UndefOr[Boolean] = js.native
  /** Specifies whether or not an end-user can scroll tabs by swiping. */
  var scrollByContent: js.UndefOr[Boolean] = js.native
  /** Specifies whether or not an end-user can scroll tabs. */
  var scrollingEnabled: js.UndefOr[Boolean] = js.native
  /** An array of currently selected item objects. */
  @JSName("selectedItems")
  var selectedItems_dxTabsOptions: js.UndefOr[js.Array[String | Double | _]] = js.native
  /** Specifies whether the widget enables an end-user to select only a single item or multiple items. */
  var selectionMode: js.UndefOr[multiple | single_] = js.native
  /** Specifies whether navigation buttons should be available when tabs exceed the widget's width. */
  var showNavButtons: js.UndefOr[Boolean] = js.native
}

object dxTabsOptions {
  @scala.inline
  def apply[T](): dxTabsOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTabsOptions[T]]
  }
  @scala.inline
  implicit class dxTabsOptionsOps[Self[t] <: dxTabsOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDataSource(value: String | (js.Array[String | dxTabsItem | _]) | DataSource | DataSourceOptions): Self[T] = {
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
    def withItems(value: js.Array[String | dxTabsItem | _]): Self[T] = {
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
    def withRepaintChangesOnly(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repaintChangesOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepaintChangesOnly: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repaintChangesOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollByContent(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollByContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollByContent: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollByContent")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollingEnabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollingEnabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedItems(value: js.Array[String | Double | _]): Self[T] = {
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
    @scala.inline
    def withSelectionMode(value: multiple | single_): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMode: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNavButtons(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNavButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNavButtons: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNavButtons")(js.undefined)
        ret
    }
  }
  
}

