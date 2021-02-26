package typingsSlinky.fluentuiReactComponentRef

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Node
import typingsSlinky.fluentuiReactComponentRef.utilsMod.RefProps
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refForwardMod {
  
  @JSImport("@fluentui/react-component-ref/dist/es/RefForward", "RefForward")
  @js.native
  class RefForward protected ()
    extends Component[RefProps, js.Object, js.Any] {
    def this(props: RefProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RefProps, context: js.Any) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MRefForward(prevProps: RefProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MRefForward(): Unit = js.native
    
    var currentNode: Node | Null = js.native
    
    def handleRefOverride(node: HTMLElement): Unit = js.native
  }
}
