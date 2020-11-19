package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckBoxStateChangedEventUIParam extends js.Object {
  
  /**
    * Gets reference to the grid the RowSelectors are initialized for.
    */
  var grid: js.UndefOr[js.Any] = js.native
  
  /**
    * Checks if the header check box is the one being clicked. In this case no row related args are passed.
    */
  var isHeader: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets reference to the igGridRowSelectors.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the row the clicked row selector resides in.
    */
  var row: js.UndefOr[String] = js.native
  
  /**
    * Gets the index of the row the clicked row selector resides in.
    */
  var rowIndex: js.UndefOr[Double] = js.native
  
  /**
    * Gets the key of the row the clicked row selector resides in.
    */
  var rowKey: js.UndefOr[String] = js.native
  
  /**
    * Gets reference to the row selector cell.
    */
  var rowSelector: js.UndefOr[String] = js.native
  
  /**
    * Gets the state of the checkbox ("on","off").
    */
  var state: js.UndefOr[String] = js.native
}
object CheckBoxStateChangedEventUIParam {
  
  @scala.inline
  def apply(): CheckBoxStateChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckBoxStateChangedEventUIParam]
  }
  
  @scala.inline
  implicit class CheckBoxStateChangedEventUIParamOps[Self <: CheckBoxStateChangedEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setGrid(value: js.Any): Self = this.set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    
    @scala.inline
    def setIsHeader(value: Boolean): Self = this.set("isHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsHeader: Self = this.set("isHeader", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setRow(value: String): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
    
    @scala.inline
    def setRowKey(value: String): Self = this.set("rowKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowKey: Self = this.set("rowKey", js.undefined)
    
    @scala.inline
    def setRowSelector(value: String): Self = this.set("rowSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowSelector: Self = this.set("rowSelector", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
