package typingsSlinky.fluentuiReactComponentRef

import org.scalajs.dom.raw.Node
import typingsSlinky.fluentuiReactComponentRef.utilsMod.RefProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fluentui/react-component-ref/dist/es/RefFindNode", JSImport.Namespace)
@js.native
object refFindNodeMod extends js.Object {
  
  @js.native
  class RefFindNode ()
    extends Component[RefProps, js.Object, js.Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MRefFindNode(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MRefFindNode(prevProps: RefProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MRefFindNode(): Unit = js.native
    
    var prevNode: Node | Null = js.native
  }
}
