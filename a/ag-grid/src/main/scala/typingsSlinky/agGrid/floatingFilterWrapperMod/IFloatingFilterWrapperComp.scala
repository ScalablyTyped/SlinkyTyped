package typingsSlinky.agGrid.floatingFilterWrapperMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.floatingFilterMod.FloatingFilterChange
import typingsSlinky.agGrid.floatingFilterMod.IFloatingFilterParams
import typingsSlinky.agGrid.iComponentMod.IAfterGuiAttachedParams
import typingsSlinky.agGrid.iComponentMod.IComponent
import typingsSlinky.agGrid.utilsMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFloatingFilterWrapperComp[M, F /* <: FloatingFilterChange */, PC /* <: IFloatingFilterParams[M, F] */, P /* <: IFloatingFilterWrapperParams[M, F, PC] */]
  extends IFloatingFilterWrapper[M]
     with IComponent[P]

object IFloatingFilterWrapperComp {
  @scala.inline
  def apply[M, F, PC, P](
    getGui: () => HTMLElement,
    onParentModelChanged: M => Unit,
    afterGuiAttached: /* params */ js.UndefOr[IAfterGuiAttachedParams] => Unit = null,
    destroy: () => Unit = null,
    init: P => Promise[Unit] | Unit = null
  ): IFloatingFilterWrapperComp[M, F, PC, P] = {
    val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui), onParentModelChanged = js.Any.fromFunction1(onParentModelChanged))
    if (afterGuiAttached != null) __obj.updateDynamic("afterGuiAttached")(js.Any.fromFunction1(afterGuiAttached))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    __obj.asInstanceOf[IFloatingFilterWrapperComp[M, F, PC, P]]
  }
}

