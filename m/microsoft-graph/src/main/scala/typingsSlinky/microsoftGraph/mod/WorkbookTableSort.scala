package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookTableSort extends Entity {
  
  // Represents the current conditions used to last sort the table. Read-only.
  var fields: js.UndefOr[js.Array[WorkbookSortField]] = js.native
  
  // Represents whether the casing impacted the last sort of the table. Read-only.
  var matchCase: js.UndefOr[Boolean] = js.native
  
  /**
    * Represents Chinese character ordering method last used to sort the table. The possible values are: PinYin, StrokeCount.
    * Read-only.
    */
  var method: js.UndefOr[String] = js.native
}
object WorkbookTableSort {
  
  @scala.inline
  def apply(): WorkbookTableSort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookTableSort]
  }
  
  @scala.inline
  implicit class WorkbookTableSortOps[Self <: WorkbookTableSort] (val x: Self) extends AnyVal {
    
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
    def setFieldsVarargs(value: WorkbookSortField*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[WorkbookSortField]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setMatchCase(value: Boolean): Self = this.set("matchCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchCase: Self = this.set("matchCase", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
  }
}
