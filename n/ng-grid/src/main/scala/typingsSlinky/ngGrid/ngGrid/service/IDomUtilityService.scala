package typingsSlinky.ngGrid.ngGrid.service

import typingsSlinky.ngGrid.ngGrid.IColumn
import typingsSlinky.ngGrid.ngGrid.IDimension
import typingsSlinky.ngGrid.ngGrid.IGridInstance
import typingsSlinky.ngGrid.ngGrid.IGridScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDomUtilityService extends js.Object {
  var LetterW: Double = js.native
  var ScrollH: Double = js.native
  var ScrollW: Double = js.native
  var eventStorage: js.Any = js.native
  var immediate: Double = js.native
  var numberOfGrids: Double = js.native
  def AssignGridContainers(
    $scope: IGridScope,
    rootel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any,
    grid: IGridInstance
  ): Unit = js.native
  def BuildStyles($scope: IGridScope, grid: IGridInstance, digest: Boolean): Unit = js.native
  def RebuildGrid($scope: IGridScope, grid: IGridInstance): Unit = js.native
  def UpdateGridLayout($scope: IGridScope, grid: IGridInstance): Unit = js.native
  def digest($scope: IGridScope): Unit = js.native
  def getRealWidth(obj: IDimension): Double = js.native
  def setColLeft(col: IColumn, colLeft: Double, grid: IGridInstance): Unit = js.native
  def setStyleText(grid: IGridInstance, css: String): Unit = js.native
}

object IDomUtilityService {
  @scala.inline
  def apply(
    AssignGridContainers: (IGridScope, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any, IGridInstance) => Unit,
    BuildStyles: (IGridScope, IGridInstance, Boolean) => Unit,
    LetterW: Double,
    RebuildGrid: (IGridScope, IGridInstance) => Unit,
    ScrollH: Double,
    ScrollW: Double,
    UpdateGridLayout: (IGridScope, IGridInstance) => Unit,
    digest: IGridScope => Unit,
    eventStorage: js.Any,
    getRealWidth: IDimension => Double,
    immediate: Double,
    numberOfGrids: Double,
    setColLeft: (IColumn, Double, IGridInstance) => Unit,
    setStyleText: (IGridInstance, String) => Unit
  ): IDomUtilityService = {
    val __obj = js.Dynamic.literal(AssignGridContainers = js.Any.fromFunction3(AssignGridContainers), BuildStyles = js.Any.fromFunction3(BuildStyles), LetterW = LetterW.asInstanceOf[js.Any], RebuildGrid = js.Any.fromFunction2(RebuildGrid), ScrollH = ScrollH.asInstanceOf[js.Any], ScrollW = ScrollW.asInstanceOf[js.Any], UpdateGridLayout = js.Any.fromFunction2(UpdateGridLayout), digest = js.Any.fromFunction1(digest), eventStorage = eventStorage.asInstanceOf[js.Any], getRealWidth = js.Any.fromFunction1(getRealWidth), immediate = immediate.asInstanceOf[js.Any], numberOfGrids = numberOfGrids.asInstanceOf[js.Any], setColLeft = js.Any.fromFunction3(setColLeft), setStyleText = js.Any.fromFunction2(setStyleText))
    __obj.asInstanceOf[IDomUtilityService]
  }
  @scala.inline
  implicit class IDomUtilityServiceOps[Self <: IDomUtilityService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignGridContainers(
      value: (IGridScope, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any, IGridInstance) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssignGridContainers")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withBuildStyles(value: (IGridScope, IGridInstance, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BuildStyles")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withLetterW(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LetterW")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRebuildGrid(value: (IGridScope, IGridInstance) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RebuildGrid")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withScrollH(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScrollH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollW(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScrollW")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateGridLayout(value: (IGridScope, IGridInstance) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateGridLayout")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDigest(value: IGridScope => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEventStorage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetRealWidth(value: IDimension => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRealWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withImmediate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfGrids(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfGrids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetColLeft(value: (IColumn, Double, IGridInstance) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setColLeft")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetStyleText(value: (IGridInstance, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyleText")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

