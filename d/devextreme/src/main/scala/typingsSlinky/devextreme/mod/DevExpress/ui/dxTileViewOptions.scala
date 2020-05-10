package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.devextremeStrings.horizontal
import typingsSlinky.devextreme.devextremeStrings.vertical
import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTileViewOptions extends CollectionWidgetOptions[dxTileView] {
  /** Specifies the height of the base tile view item. */
  var baseItemHeight: js.UndefOr[Double] = js.native
  /** Specifies the width of the base tile view item. */
  var baseItemWidth: js.UndefOr[Double] = js.native
  /** Binds the widget to data. */
  @JSName("dataSource")
  var dataSource_dxTileViewOptions: js.UndefOr[
    String | (js.Array[String | dxTileViewItem | _]) | DataSource | DataSourceOptions
  ] = js.native
  /** Specifies whether tiles are placed horizontally or vertically. */
  var direction: js.UndefOr[horizontal | vertical] = js.native
  /** Specifies the distance in pixels between adjacent tiles. */
  var itemMargin: js.UndefOr[Double] = js.native
  /** An array of items displayed by the widget. */
  @JSName("items")
  var items_dxTileViewOptions: js.UndefOr[js.Array[String | dxTileViewItem | _]] = js.native
  /** A Boolean value specifying whether or not to display a scrollbar. */
  var showScrollbar: js.UndefOr[Boolean] = js.native
}

object dxTileViewOptions {
  @scala.inline
  def apply(): dxTileViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTileViewOptions]
  }
  @scala.inline
  implicit class dxTileViewOptionsOps[Self <: dxTileViewOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseItemHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseItemHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseItemHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseItemHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseItemWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseItemWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseItemWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseItemWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: String | (js.Array[String | dxTileViewItem | _]) | DataSource | DataSourceOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withItemMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[String | dxTileViewItem | _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withShowScrollbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showScrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowScrollbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showScrollbar")(js.undefined)
        ret
    }
  }
  
}

