package typingsSlinky.blueprintjsTable.headerCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInternalHeaderCellProps extends IHeaderCellProps {
  
  /**
    * Specifies if the cell is selected.
    */
  var isSelected: js.UndefOr[Boolean] = js.native
}
object IInternalHeaderCellProps {
  
  @scala.inline
  def apply(): IInternalHeaderCellProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInternalHeaderCellProps]
  }
  
  @scala.inline
  implicit class IInternalHeaderCellPropsOps[Self <: IInternalHeaderCellProps] (val x: Self) extends AnyVal {
    
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
    def setIsSelected(value: Boolean): Self = this.set("isSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSelected: Self = this.set("isSelected", js.undefined)
  }
}
