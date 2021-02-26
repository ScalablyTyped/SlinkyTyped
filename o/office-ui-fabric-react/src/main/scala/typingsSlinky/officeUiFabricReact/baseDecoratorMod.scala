package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseDecoratorMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/decorators/BaseDecorator", "BaseDecorator")
  @js.native
  class BaseDecorator[TProps, TState] protected ()
    extends Component[TProps, TState, js.Any] {
    def this(props: TProps) = this()
    
    var _composedComponentInstance: ReactComponentClass[TProps] = js.native
    
    var _hoisted: js.Any = js.native
    
    /**
      * Updates the ref to the component composed by the decorator, which will also take care of hoisting
      * (and unhoisting as appropriate) methods from said component.
      *
      * Pass this method as the argument to the 'ref' property of the composed component.
      */
    /* protected */ def _updateComposedComponentRef(composedComponentInstance: ReactComponentClass[TProps]): Unit = js.native
  }
}
