package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.teachingBubbleBaseMod.ITeachingBubbleState
import typingsSlinky.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubbleProps
import typingsSlinky.officeUiFabricReact.utilitiesMod.BaseComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/TeachingBubble/TeachingBubbleContent.base", JSImport.Namespace)
@js.native
object teachingBubbleContentBaseMod extends js.Object {
  @js.native
  class TeachingBubbleContentBase protected () extends BaseComponent[ITeachingBubbleProps, ITeachingBubbleState] {
    def this(props: ITeachingBubbleProps) = this()
    var _onKeyDown: js.Any = js.native
    var rootElement: ReactRef[HTMLDivElement] = js.native
    @JSName("componentDidMount")
    def componentDidMount_MTeachingBubbleContentBase(): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MTeachingBubbleContentBase(): Unit = js.native
    def focus(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object TeachingBubbleContentBase extends js.Object {
    var defaultProps: AnonHasCondensedHeadline = js.native
  }
  
}

