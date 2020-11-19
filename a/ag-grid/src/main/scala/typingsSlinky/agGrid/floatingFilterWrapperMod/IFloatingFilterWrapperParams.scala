package typingsSlinky.agGrid.floatingFilterWrapperMod

import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.floatingFilterMod.FloatingFilterChange
import typingsSlinky.agGrid.floatingFilterMod.IFloatingFilterComp
import typingsSlinky.agGrid.floatingFilterMod.IFloatingFilterParams
import typingsSlinky.agGrid.utilsMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFloatingFilterWrapperParams[M, F /* <: FloatingFilterChange */, P /* <: IFloatingFilterParams[M, F] */] extends js.Object {
  
  var column: Column = js.native
  
  var floatingFilterComp: Promise[IFloatingFilterComp[M, F, P]] = js.native
  
  var suppressFilterButton: Boolean = js.native
}
object IFloatingFilterWrapperParams {
  
  @scala.inline
  def apply[M, F /* <: FloatingFilterChange */, P /* <: IFloatingFilterParams[M, F] */](
    column: Column,
    floatingFilterComp: Promise[IFloatingFilterComp[M, F, P]],
    suppressFilterButton: Boolean
  ): IFloatingFilterWrapperParams[M, F, P] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], floatingFilterComp = floatingFilterComp.asInstanceOf[js.Any], suppressFilterButton = suppressFilterButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFloatingFilterWrapperParams[M, F, P]]
  }
  
  @scala.inline
  implicit class IFloatingFilterWrapperParamsOps[Self <: IFloatingFilterWrapperParams[_, _, _], M, F /* <: FloatingFilterChange */, P /* <: IFloatingFilterParams[M, F] */] (val x: Self with (IFloatingFilterWrapperParams[M, F, P])) extends AnyVal {
    
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
    def setColumn(value: Column): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingFilterComp(value: Promise[IFloatingFilterComp[M, F, P]]): Self = this.set("floatingFilterComp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressFilterButton(value: Boolean): Self = this.set("suppressFilterButton", value.asInstanceOf[js.Any])
  }
}
