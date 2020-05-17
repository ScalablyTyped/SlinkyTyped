package typingsSlinky.blueprintjsCore

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.blueprintjsCore.anon.Instantiable
import typingsSlinky.blueprintjsCore.constructorMod.IConstructor
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/context-menu/contextMenuTarget", JSImport.Namespace)
@js.native
object contextMenuTargetMod extends js.Object {
  @js.native
  trait IContextMenuTargetComponent
    extends Component[js.Object, js.Object, js.Any] {
    var onContextMenuClose: js.UndefOr[js.Function0[Unit]] = js.native
    def renderContextMenu(e: SyntheticMouseEvent[HTMLElement]): js.UndefOr[ReactElement] = js.native
  }
  
  def ContextMenuTarget[T /* <: IConstructor[IContextMenuTargetComponent] */](WrappedComponent: T): Instantiable with T = js.native
}

