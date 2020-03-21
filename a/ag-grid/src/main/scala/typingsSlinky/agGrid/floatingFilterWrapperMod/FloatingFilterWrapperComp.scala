package typingsSlinky.agGrid.floatingFilterWrapperMod

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.agGrid.baseFilterMod.CombinedFilter
import typingsSlinky.agGrid.floatingFilterMod.FloatingFilterChange
import typingsSlinky.agGrid.floatingFilterMod.IFloatingFilterComp
import typingsSlinky.agGrid.floatingFilterMod.IFloatingFilterParams
import typingsSlinky.agGrid.utilsMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/filter/floatingFilterWrapper", "FloatingFilterWrapperComp")
@js.native
class FloatingFilterWrapperComp[M, F /* <: FloatingFilterChange */, PC /* <: IFloatingFilterParams[M, F] */, P /* <: IFloatingFilterWrapperParams[M, F, PC] */] () extends BaseFilterWrapperComp[M, F, PC, P] {
  var eButtonShowMainFilter: HTMLInputElement = js.native
  var floatingFilterCompPromise: Promise[IFloatingFilterComp[M, F, PC]] = js.native
  var gridOptionsWrapper: js.Any = js.native
  var menuFactory: js.Any = js.native
  var suppressFilterButton: Boolean = js.native
  /* private */ def addEventListeners(): js.Any = js.native
  @JSName("init")
  def init_MFloatingFilterWrapperComp(params: P): Unit = js.native
  def onParentModelChanged(parentModel: CombinedFilter[M]): Unit = js.native
  /* private */ def showParentFilter(): js.Any = js.native
}

