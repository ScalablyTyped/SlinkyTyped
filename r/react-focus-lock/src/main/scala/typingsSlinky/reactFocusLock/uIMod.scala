package typingsSlinky.reactFocusLock

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactFocusLock.interfacesMod.AutoFocusProps
import typingsSlinky.reactFocusLock.interfacesMod.FreeFocusProps
import typingsSlinky.reactFocusLock.interfacesMod.InFocusGuardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-focus-lock/UI/UI", JSImport.Namespace)
@js.native
object uIMod extends js.Object {
  @js.native
  class AutoFocusInside ()
    extends Component[AutoFocusProps, js.Object, js.Any]
  
  @js.native
  class FreeFocusInside ()
    extends Component[FreeFocusProps, js.Object, js.Any]
  
  @js.native
  class InFocusGuard ()
    extends Component[InFocusGuardProps, js.Object, js.Any]
  
  @js.native
  class MoveFocusInside ()
    extends Component[AutoFocusProps, js.Object, js.Any]
  
  /**
    * Traps Focus inside a Lock
    */
  val default: ReactComponentClass[ReactFocusLockPropsReactN] = js.native
}

