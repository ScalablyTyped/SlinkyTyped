package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.anon.DelayName
import typingsSlinky.devextreme.anon.Hide
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.onClick
import typingsSlinky.devextreme.devextremeStrings.onHover
import typingsSlinky.devextreme.devextremeStrings.single_
import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxMenuBaseOptions[T] extends HierarchicalCollectionWidgetOptions[T] {
  /** Configures widget visibility animations. This object contains two fields: show and hide. */
  var animation: js.UndefOr[Hide] = js.native
  /** Specifies the name of the CSS class to be applied to the root menu level and all submenus. */
  var cssClass: js.UndefOr[String] = js.native
  /** Binds the widget to data. */
  @JSName("dataSource")
  var dataSource_dxMenuBaseOptions: js.UndefOr[String | js.Array[dxMenuBaseItem] | DataSource | DataSourceOptions] = js.native
  /** Holds an array of menu items. */
  @JSName("items")
  var items_dxMenuBaseOptions: js.UndefOr[js.Array[dxMenuBaseItem]] = js.native
  /** Specifies whether or not an item becomes selected if a user clicks it. */
  var selectByClick: js.UndefOr[Boolean] = js.native
  /** Specifies the selection mode supported by the menu. */
  var selectionMode: js.UndefOr[none | single_] = js.native
  /** Specifies options of submenu showing and hiding. */
  var showSubmenuMode: js.UndefOr[DelayName | onClick | onHover] = js.native
}

object dxMenuBaseOptions {
  @scala.inline
  def apply[T](): dxMenuBaseOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxMenuBaseOptions[T]]
  }
  @scala.inline
  implicit class dxMenuBaseOptionsOps[Self[t] <: dxMenuBaseOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAnimation(value: Hide): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: String | js.Array[dxMenuBaseItem] | DataSource | DataSourceOptions): Self[T] = {
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
    def withItems(value: js.Array[dxMenuBaseItem]): Self[T] = {
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
    def withSelectByClick(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectByClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectByClick: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectByClick")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: none | single_): Self[T] = {
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
    def withShowSubmenuMode(value: DelayName | onClick | onHover): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSubmenuMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSubmenuMode: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSubmenuMode")(js.undefined)
        ret
    }
  }
  
}

