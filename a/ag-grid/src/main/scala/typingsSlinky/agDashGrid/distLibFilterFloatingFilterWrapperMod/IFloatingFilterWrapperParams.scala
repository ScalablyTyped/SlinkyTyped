package typingsSlinky.agDashGrid.distLibFilterFloatingFilterWrapperMod

import typingsSlinky.agDashGrid.distLibEntitiesColumnMod.Column
import typingsSlinky.agDashGrid.distLibFilterFloatingFilterMod.FloatingFilterChange
import typingsSlinky.agDashGrid.distLibFilterFloatingFilterMod.IFloatingFilterComp
import typingsSlinky.agDashGrid.distLibFilterFloatingFilterMod.IFloatingFilterParams
import typingsSlinky.agDashGrid.distLibUtilsMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFloatingFilterWrapperParams[M, F /* <: FloatingFilterChange */, P /* <: IFloatingFilterParams[M, F] */] extends js.Object {
  var column: Column
  var floatingFilterComp: Promise[IFloatingFilterComp[M, F, P]]
  var suppressFilterButton: Boolean
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
}

