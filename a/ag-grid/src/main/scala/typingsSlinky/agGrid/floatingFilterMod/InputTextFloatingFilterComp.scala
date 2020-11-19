package typingsSlinky.agGrid.floatingFilterMod

import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.KeyboardEvent
import typingsSlinky.agGrid.componentMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/filter/floatingFilter", "InputTextFloatingFilterComp")
@js.native
abstract class InputTextFloatingFilterComp[M, P /* <: IFloatingFilterParams[M, BaseFloatingFilterChange[M]] */] ()
  extends Component
     with IFloatingFilter[M, BaseFloatingFilterChange[M], P] {
  
  def asFloatingFilterText(parentModel: M): String = js.native
  
  def asParentModel(): M = js.native
  
  def currentParentModel(): M = js.native
  
  var eColumnFloatingFilter: HTMLInputElement = js.native
  
  def equalModels(left: js.Any, right: js.Any): Boolean = js.native
  
  @JSName("init")
  def init_MInputTextFloatingFilterComp(params: P): Unit = js.native
  
  var lastKnownModel: M = js.native
  
  def onFloatingFilterChanged(change: BaseFloatingFilterChange[M]): Boolean = js.native
  
  def parseAsText(model: M): String = js.native
  
  def syncUpWithParentFilter(e: KeyboardEvent): Unit = js.native
}
