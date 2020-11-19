package typingsSlinky.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a collection of all the PivotItems related to their parent PivotField.
  *
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait PivotItemCollectionLoadOptions extends js.Object {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Id of the PivotItem.
    *
    * [Api set: ExcelApi 1.8]
    */
  var id: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Determines whether the item is expanded to show child items or if it's collapsed and child items are hidden.
    *
    * [Api set: ExcelApi 1.8]
    */
  var isExpanded: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Name of the PivotItem.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Specifies if the PivotItem is visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object PivotItemCollectionLoadOptions {
  
  @scala.inline
  def apply(): PivotItemCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotItemCollectionLoadOptions]
  }
  
  @scala.inline
  implicit class PivotItemCollectionLoadOptionsOps[Self <: PivotItemCollectionLoadOptions] (val x: Self) extends AnyVal {
    
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
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsExpanded(value: Boolean): Self = this.set("isExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsExpanded: Self = this.set("isExpanded", js.undefined)
    
    @scala.inline
    def setName(value: Boolean): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
