package typingsSlinky.agGrid.floatingFilterWrapperMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.floatingFilterMod.FloatingFilterChange
import typingsSlinky.agGrid.floatingFilterMod.IFloatingFilterParams
import typingsSlinky.agGrid.iComponentMod.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFloatingFilterWrapperComp[M, F /* <: FloatingFilterChange */, PC /* <: IFloatingFilterParams[M, F] */, P /* <: IFloatingFilterWrapperParams[M, F, PC] */]
  extends IFloatingFilterWrapper[M]
     with IComponent[P]
object IFloatingFilterWrapperComp {
  
  @scala.inline
  def apply[M, F /* <: FloatingFilterChange */, PC /* <: IFloatingFilterParams[M, F] */, P /* <: IFloatingFilterWrapperParams[M, F, PC] */](getGui: () => HTMLElement, onParentModelChanged: M => Unit): IFloatingFilterWrapperComp[M, F, PC, P] = {
    val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui), onParentModelChanged = js.Any.fromFunction1(onParentModelChanged))
    __obj.asInstanceOf[IFloatingFilterWrapperComp[M, F, PC, P]]
  }
}
