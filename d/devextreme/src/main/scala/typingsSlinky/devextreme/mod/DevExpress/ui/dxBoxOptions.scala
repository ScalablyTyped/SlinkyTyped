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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxBoxOptions extends CollectionWidgetOptions[dxBox] {
  
  /** @name dxBox.Options.align */
  var align: js.UndefOr[center | end | `space-around` | `space-between` | start] = js.native
  
  /** @name dxBox.Options.crossAlign */
  var crossAlign: js.UndefOr[center | end | start | stretch] = js.native
  
  /** @name dxBox.Options.dataSource */
  @JSName("dataSource")
  var dataSource_dxBoxOptions: js.UndefOr[String | (js.Array[String | dxBoxItem | _]) | DataSource | DataSourceOptions] = js.native
  
  /** @name dxBox.Options.direction */
  var direction: js.UndefOr[col | row] = js.native
  
  /** @name dxBox.Options.items */
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlign(value: center | end | `space-around` | `space-between` | start): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setCrossAlign(value: center | end | start | stretch): Self = this.set("crossAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossAlign: Self = this.set("crossAlign", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: (String | dxBoxItem | js.Any)*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: String | (js.Array[String | dxBoxItem | _]) | DataSource | DataSourceOptions): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDirection(value: col | row): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: (String | dxBoxItem | js.Any)*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[String | dxBoxItem | _]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
}
