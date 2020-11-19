package typingsSlinky.reactFocusLock

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.reactFocusLock.interfacesMod.AutoFocusProps
import typingsSlinky.reactFocusLock.interfacesMod.FreeFocusProps
import typingsSlinky.reactFocusLock.interfacesMod.InFocusGuardProps
import typingsSlinky.reactFocusLock.interfacesMod.ReactFocusLockProps
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-focus-lock", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * Traps Focus inside a Lock
    */
  val default: ReactComponentClass[ReactFocusLockProps[ReactElement, Record[String, js.Any]]] = js.native
  
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
}
