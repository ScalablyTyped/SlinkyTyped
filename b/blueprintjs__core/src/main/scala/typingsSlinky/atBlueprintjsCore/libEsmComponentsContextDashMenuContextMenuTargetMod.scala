package typingsSlinky.atBlueprintjsCore

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.atBlueprintjsCore.libEsmCommonConstructorMod.IConstructor
import typingsSlinky.atBlueprintjsCore.libEsmComponentsContextDashMenuContextMenuTargetMod.IContextMenuTargetComponent
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/context-menu/contextMenuTarget", JSImport.Namespace)
@js.native
object libEsmComponentsContextDashMenuContextMenuTargetMod extends js.Object {
  @js.native
  trait IContextMenuTargetComponent
    extends Component[js.Object, js.Object, js.Any] {
    var onContextMenuClose: js.UndefOr[js.Function0[Unit]] = js.native
    def renderContextMenu(e: SyntheticMouseEvent[HTMLElement]): js.UndefOr[Element] = js.native
  }
  
  def ContextMenuTarget[T /* <: IConstructor[IContextMenuTargetComponent] */](WrappedComponent: T): Anon_Args with T = js.native
}

