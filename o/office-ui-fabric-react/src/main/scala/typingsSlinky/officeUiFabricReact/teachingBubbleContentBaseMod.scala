package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.teachingBubbleBaseMod.ITeachingBubbleState
import typingsSlinky.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubbleProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/TeachingBubble/TeachingBubbleContent.base", JSImport.Namespace)
@js.native
object teachingBubbleContentBaseMod extends js.Object {
  
  @js.native
  class TeachingBubbleContentBase protected ()
    extends Component[ITeachingBubbleProps, ITeachingBubbleState, js.Any] {
    def this(props: ITeachingBubbleProps) = this()
    
    var _onKeyDown: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MTeachingBubbleContentBase(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MTeachingBubbleContentBase(): Unit = js.native
    
    def focus(): Unit = js.native
    
    var rootElement: ReactRef[HTMLDivElement] = js.native
  }
}
