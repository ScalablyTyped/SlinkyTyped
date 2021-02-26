package typingsSlinky.blueprintjsCore

import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.anon.DisplayName
import typingsSlinky.blueprintjsCore.constructorMod.IConstructor
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hotkeysTargetMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeysTarget", "HotkeysTarget")
  @js.native
  def HotkeysTarget[T /* <: IConstructor[IHotkeysTargetComponent] */](WrappedComponent: T): DisplayName with T = js.native
  
  @js.native
  trait IHotkeysTargetComponent
    extends Component[js.Object, js.Object, js.Any] {
    
    /**
      * Components decorated with the `@HotkeysTarget` decorator must implement
      * this method, and it must return a `Hotkeys` React element.
      */
    def renderHotkeys(): ReactElement = js.native
  }
}
