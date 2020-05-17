package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.anon.BaseSize
import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxResponsiveBoxOptions extends CollectionWidgetOptions[dxResponsiveBox] {
  /** Specifies the collection of columns for the grid used to position layout elements. */
  var cols: js.UndefOr[js.Array[BaseSize]] = js.native
  /** Binds the widget to data. */
  @JSName("dataSource")
  var dataSource_dxResponsiveBoxOptions: js.UndefOr[
    String | (js.Array[String | dxResponsiveBoxItem | _]) | DataSource | DataSourceOptions
  ] = js.native
  /** An array of items displayed by the widget. */
  @JSName("items")
  var items_dxResponsiveBoxOptions: js.UndefOr[js.Array[String | dxResponsiveBoxItem | _]] = js.native
  /** Specifies the collection of rows for the grid used to position layout elements. */
  var rows: js.UndefOr[js.Array[BaseSize]] = js.native
  /** Specifies the function returning the size qualifier depending on the screen's width. */
  var screenByWidth: js.UndefOr[js.Function] = js.native
  /** Specifies on which screens all layout elements should be arranged in a single column. Accepts a single or several size qualifiers separated by a space. */
  var singleColumnScreen: js.UndefOr[String] = js.native
}

object dxResponsiveBoxOptions {
  @scala.inline
  def apply(): dxResponsiveBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxResponsiveBoxOptions]
  }
  @scala.inline
  implicit class dxResponsiveBoxOptionsOps[Self <: dxResponsiveBoxOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCols(value: js.Array[BaseSize]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: String | (js.Array[String | dxResponsiveBoxItem | _]) | DataSource | DataSourceOptions): Self = {
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
    def withItems(value: js.Array[String | dxResponsiveBoxItem | _]): Self = {
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
    def withRows(value: js.Array[BaseSize]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenByWidth(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenByWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenByWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenByWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleColumnScreen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleColumnScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleColumnScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleColumnScreen")(js.undefined)
        ret
    }
  }
  
}

