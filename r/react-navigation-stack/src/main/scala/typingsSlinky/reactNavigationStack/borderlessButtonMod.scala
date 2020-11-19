package typingsSlinky.reactNavigationStack

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.reactNativeGestureHandler.mod.BaseButton
import typingsSlinky.reactNavigationStack.anon.ActiveOpacity
import typingsSlinky.reactNavigationStack.anon.Borderless
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-navigation-stack/lib/typescript/src/vendor/views/BorderlessButton", JSImport.Namespace)
@js.native
object borderlessButtonMod extends js.Object {
  
  @js.native
  trait BorderlessButton
    extends Component[Props, js.Object, js.Any] {
    
    var handleActiveStateChange: js.Any = js.native
    
    var opacity: js.Any = js.native
  }
  
  @js.native
  class default () extends BorderlessButton
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: Borderless = js.native
  }
  
  type Props = ComponentProps[Instantiable0[BaseButton]] with ActiveOpacity
}
