package typingsSlinky.agGrid.floatingFilterWrapperMod

import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.floatingFilterMod.FloatingFilterChange
import typingsSlinky.agGrid.floatingFilterMod.IFloatingFilterComp
import typingsSlinky.agGrid.floatingFilterMod.IFloatingFilterParams
import typingsSlinky.agGrid.utilsMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFloatingFilterWrapperParams[M, F /* <: FloatingFilterChange */, P /* <: IFloatingFilterParams[M, F] */] extends js.Object {
  var column: Column = js.native
  var floatingFilterComp: Promise[IFloatingFilterComp[M, F, P]] = js.native
  var suppressFilterButton: Boolean = js.native
}

object IFloatingFilterWrapperParams {
  @scala.inline
  def apply[M, F, P](
    column: Column,
    floatingFilterComp: Promise[IFloatingFilterComp[M, F, P]],
    suppressFilterButton: Boolean
  ): IFloatingFilterWrapperParams[M, F, P] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], floatingFilterComp = floatingFilterComp.asInstanceOf[js.Any], suppressFilterButton = suppressFilterButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFloatingFilterWrapperParams[M, F, P]]
  }
  @scala.inline
  implicit class IFloatingFilterWrapperParamsOps[Self[m, f, p] <: IFloatingFilterWrapperParams[m, f, p], M, F, P] (val x: Self[M, F, P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[M, F, P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[M, F, P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[M, F, P]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[M, F, P]) with Other]
    @scala.inline
    def withColumn(value: Column): Self[M, F, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFloatingFilterComp(value: Promise[IFloatingFilterComp[M, F, P]]): Self[M, F, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatingFilterComp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuppressFilterButton(value: Boolean): Self[M, F, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressFilterButton")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

