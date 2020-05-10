package typingsSlinky.agGrid.floatingFilterWrapperMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.componentMod.Component
import typingsSlinky.agGrid.floatingFilterMod.FloatingFilterChange
import typingsSlinky.agGrid.floatingFilterMod.IFloatingFilterParams
import typingsSlinky.agGrid.utilsMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/filter/floatingFilterWrapper", "BaseFilterWrapperComp")
@js.native
abstract class BaseFilterWrapperComp[M, F /* <: FloatingFilterChange */, PC /* <: IFloatingFilterParams[M, F] */, P /* <: IFloatingFilterWrapperParams[M, F, PC] */] ()
  extends Component
     with IFloatingFilterWrapper[M] {
  var beans: js.Any = js.native
  var column: Column = js.native
  var columnHoverService: js.Any = js.native
  var context: js.Any = js.native
  var eventService: js.Any = js.native
  /* private */ def addColumnHoverListener(): js.Any = js.native
  def enrichBody(body: HTMLElement): Unit = js.native
  @JSName("init")
  def init_MBaseFilterWrapperComp(params: P): Unit | Promise[Unit] = js.native
  /* private */ def onColumnHover(): js.Any = js.native
  /* private */ def onColumnWidthChanged(): js.Any = js.native
  /* private */ def setupWidth(): js.Any = js.native
}

