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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxMenuBaseOptions[T] extends HierarchicalCollectionWidgetOptions[T] {
  
  /** @name dxMenuBase.Options.animation */
  var animation: js.UndefOr[Hide] = js.native
  
  /** @name dxMenuBase.Options.cssClass */
  var cssClass: js.UndefOr[String] = js.native
  
  /** @name dxMenuBase.Options.dataSource */
  @JSName("dataSource")
  var dataSource_dxMenuBaseOptions: js.UndefOr[String | js.Array[dxMenuBaseItem] | DataSource | DataSourceOptions] = js.native
  
  /** @name dxMenuBase.Options.items */
  @JSName("items")
  var items_dxMenuBaseOptions: js.UndefOr[js.Array[dxMenuBaseItem]] = js.native
  
  /** @name dxMenuBase.Options.selectByClick */
  var selectByClick: js.UndefOr[Boolean] = js.native
  
  /** @name dxMenuBase.Options.selectionMode */
  var selectionMode: js.UndefOr[none | single_] = js.native
  
  /** @name dxMenuBase.Options.showSubmenuMode */
  var showSubmenuMode: js.UndefOr[DelayName | onClick | onHover] = js.native
}
object dxMenuBaseOptions {
  
  @scala.inline
  def apply[T](): dxMenuBaseOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxMenuBaseOptions[T]]
  }
  
  @scala.inline
  implicit class dxMenuBaseOptionsOps[Self <: dxMenuBaseOptions[_], T] (val x: Self with dxMenuBaseOptions[T]) extends AnyVal {
    
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
    def setAnimation(value: Hide): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: dxMenuBaseItem*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: String | js.Array[dxMenuBaseItem] | DataSource | DataSourceOptions): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: dxMenuBaseItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[dxMenuBaseItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setSelectByClick(value: Boolean): Self = this.set("selectByClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectByClick: Self = this.set("selectByClick", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: none | single_): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    
    @scala.inline
    def setShowSubmenuMode(value: DelayName | onClick | onHover): Self = this.set("showSubmenuMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSubmenuMode: Self = this.set("showSubmenuMode", js.undefined)
  }
}
