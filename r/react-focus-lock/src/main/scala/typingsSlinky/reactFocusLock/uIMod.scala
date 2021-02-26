package typingsSlinky.reactFocusLock

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Component
import typingsSlinky.reactFocusLock.anon.ReactFocusLockPropsReactN
import typingsSlinky.reactFocusLock.interfacesMod.AutoFocusProps
import typingsSlinky.reactFocusLock.interfacesMod.FreeFocusProps
import typingsSlinky.reactFocusLock.interfacesMod.InFocusGuardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uIMod extends Shortcut {
  
  /**
    * Traps Focus inside a Lock
    */
  @JSImport("react-focus-lock/UI/UI", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ReactFocusLockPropsReactN] = js.native
  
  @JSImport("react-focus-lock/UI/UI", "AutoFocusInside")
  @js.native
  class AutoFocusInside protected ()
    extends Component[AutoFocusProps, js.Object, js.Any] {
    def this(props: AutoFocusProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AutoFocusProps, context: js.Any) = this()
  }
  
  @JSImport("react-focus-lock/UI/UI", "FreeFocusInside")
  @js.native
  class FreeFocusInside protected ()
    extends Component[FreeFocusProps, js.Object, js.Any] {
    def this(props: FreeFocusProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FreeFocusProps, context: js.Any) = this()
  }
  
  @JSImport("react-focus-lock/UI/UI", "InFocusGuard")
  @js.native
  class InFocusGuard protected ()
    extends Component[InFocusGuardProps, js.Object, js.Any] {
    def this(props: InFocusGuardProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: InFocusGuardProps, context: js.Any) = this()
  }
  
  @JSImport("react-focus-lock/UI/UI", "MoveFocusInside")
  @js.native
  class MoveFocusInside protected ()
    extends Component[AutoFocusProps, js.Object, js.Any] {
    def this(props: AutoFocusProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AutoFocusProps, context: js.Any) = this()
  }
  
  @JSImport("react-focus-lock/UI/UI", "useFocusInside")
  @js.native
  def useFocusInside(node: ReactRef[HTMLElement]): Unit = js.native
  
  type _To = ReactComponentClass[ReactFocusLockPropsReactN]
  
  /* This means you don't have to write `default`, but can instead just say `uIMod.foo` */
  override def _to: ReactComponentClass[ReactFocusLockPropsReactN] = default
}
