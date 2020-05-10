package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.devextremeStrings.`space-around`
import typingsSlinky.devextreme.devextremeStrings.`space-between`
import typingsSlinky.devextreme.devextremeStrings.center
import typingsSlinky.devextreme.devextremeStrings.col
import typingsSlinky.devextreme.devextremeStrings.end
import typingsSlinky.devextreme.devextremeStrings.row
import typingsSlinky.devextreme.devextremeStrings.start
import typingsSlinky.devextreme.devextremeStrings.stretch
import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxBoxOptions extends CollectionWidgetOptions[dxBox] {
  /** Specifies how widget items are aligned along the main direction. */
  var align: js.UndefOr[center | end | `space-around` | `space-between` | start] = js.native
  /** Specifies how widget items are aligned cross-wise. */
  var crossAlign: js.UndefOr[center | end | start | stretch] = js.native
  /** Binds the widget to data. */
  @JSName("dataSource")
  var dataSource_dxBoxOptions: js.UndefOr[String | (js.Array[String | dxBoxItem | _]) | DataSource | DataSourceOptions] = js.native
  /** Specifies the direction of item positioning in the widget. */
  var direction: js.UndefOr[col | row] = js.native
  /** An array of items displayed by the widget. */
  @JSName("items")
  var items_dxBoxOptions: js.UndefOr[js.Array[String | dxBoxItem | _]] = js.native
}

object dxBoxOptions {
  @scala.inline
  def apply(): dxBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxBoxOptions]
  }
  @scala.inline
  implicit class dxBoxOptionsOps[Self <: dxBoxOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: center | end | `space-around` | `space-between` | start): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossAlign(value: center | end | start | stretch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: String | (js.Array[String | dxBoxItem | _]) | DataSource | DataSourceOptions): Self = {
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
    def withDirection(value: col | row): Self = {
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
    def withItems(value: js.Array[String | dxBoxItem | _]): Self = {
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
  }
  
}

