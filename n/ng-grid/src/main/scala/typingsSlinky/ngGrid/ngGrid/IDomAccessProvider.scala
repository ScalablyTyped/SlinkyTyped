package typingsSlinky.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDomAccessProvider extends js.Object {
  var grid: IGridInstance = js.native
  var previousColumn: IColumn = js.native
  def changeUserSelect(
    elm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any,
    value: String
  ): Unit = js.native
  def focusCellElement($scope: IGridScope, index: Double): Unit = js.native
  def selectionHandlers(
    $scope: IGridScope,
    elm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any
  ): Unit = js.native
}

object IDomAccessProvider {
  @scala.inline
  def apply(
    changeUserSelect: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any, String) => Unit,
    focusCellElement: (IGridScope, Double) => Unit,
    grid: IGridInstance,
    previousColumn: IColumn,
    selectionHandlers: (IGridScope, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any) => Unit
  ): IDomAccessProvider = {
    val __obj = js.Dynamic.literal(changeUserSelect = js.Any.fromFunction2(changeUserSelect), focusCellElement = js.Any.fromFunction2(focusCellElement), grid = grid.asInstanceOf[js.Any], previousColumn = previousColumn.asInstanceOf[js.Any], selectionHandlers = js.Any.fromFunction2(selectionHandlers))
    __obj.asInstanceOf[IDomAccessProvider]
  }
  @scala.inline
  implicit class IDomAccessProviderOps[Self <: IDomAccessProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeUserSelect(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any, String) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeUserSelect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFocusCellElement(value: (IGridScope, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusCellElement")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGrid(value: IGridInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousColumn(value: IColumn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionHandlers(
      value: (IGridScope, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionHandlers")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

