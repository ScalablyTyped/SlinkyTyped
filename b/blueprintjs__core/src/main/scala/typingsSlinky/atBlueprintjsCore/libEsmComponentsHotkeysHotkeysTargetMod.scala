package typingsSlinky.atBlueprintjsCore

import slinky.core.facade.ReactElement
import typingsSlinky.atBlueprintjsCore.libEsmCommonConstructorMod.IConstructor
import typingsSlinky.atBlueprintjsCore.libEsmComponentsHotkeysHotkeysTargetMod.IHotkeysTargetComponent
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeysTarget", JSImport.Namespace)
@js.native
object libEsmComponentsHotkeysHotkeysTargetMod extends js.Object {
  @js.native
  trait IHotkeysTargetComponent
    extends Component[js.Object, js.Object, js.Any] {
    /**
      * Components decorated with the `@HotkeysTarget` decorator must implement
      * this method, and it must return a `Hotkeys` React element.
      */
    def renderHotkeys(): ReactElement = js.native
  }
  
  def HotkeysTarget[T /* <: IConstructor[IHotkeysTargetComponent] */](WrappedComponent: T): Anon_ArgsDisplayName with T = js.native
}

