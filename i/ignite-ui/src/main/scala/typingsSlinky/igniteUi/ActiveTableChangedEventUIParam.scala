package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveTableChangedEventUIParam extends js.Object {
  
  /**
    * Gets the current active [Table](ig.excel.WorksheetTable).
    */
  var newActiveTable: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the previous active [Table](ig.excel.WorksheetTable).
    */
  var oldActiveTable: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the spreadsheet widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object ActiveTableChangedEventUIParam {
  
  @scala.inline
  def apply(): ActiveTableChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveTableChangedEventUIParam]
  }
  
  @scala.inline
  implicit class ActiveTableChangedEventUIParamOps[Self <: ActiveTableChangedEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setNewActiveTable(value: js.Any): Self = this.set("newActiveTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewActiveTable: Self = this.set("newActiveTable", js.undefined)
    
    @scala.inline
    def setOldActiveTable(value: js.Any): Self = this.set("oldActiveTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldActiveTable: Self = this.set("oldActiveTable", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
}
