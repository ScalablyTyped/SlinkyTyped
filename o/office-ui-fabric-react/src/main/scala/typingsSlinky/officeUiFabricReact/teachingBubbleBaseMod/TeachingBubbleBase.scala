package typingsSlinky.officeUiFabricReact.teachingBubbleBaseMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.anon.CalloutProps
import typingsSlinky.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubbleProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/TeachingBubble/TeachingBubble.base", "TeachingBubbleBase")
@js.native
class TeachingBubbleBase protected ()
  extends Component[ITeachingBubbleProps, ITeachingBubbleState, js.Any] {
  def this(props: ITeachingBubbleProps) = this()
  
  var _defaultCalloutProps: js.Any = js.native
  
  def focus(): Unit = js.native
  
  var rootElement: ReactRef[HTMLDivElement] = js.native
}
/* static members */
@JSImport("office-ui-fabric-react/lib/components/TeachingBubble/TeachingBubble.base", "TeachingBubbleBase")
@js.native
object TeachingBubbleBase extends js.Object {
  
  var defaultProps: CalloutProps = js.native
}
