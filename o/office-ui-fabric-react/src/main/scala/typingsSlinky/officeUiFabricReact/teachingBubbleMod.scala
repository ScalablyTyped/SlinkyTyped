package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.anon.CalloutProps
import typingsSlinky.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubbleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/TeachingBubble", JSImport.Namespace)
@js.native
object teachingBubbleMod extends js.Object {
  
  val TeachingBubble: ReactComponentClass[ITeachingBubbleProps] = js.native
  
  val TeachingBubbleContent: ReactComponentClass[ITeachingBubbleProps] = js.native
  
  @js.native
  class TeachingBubbleBase protected ()
    extends typingsSlinky.officeUiFabricReact.teachingBubbleBaseMod.TeachingBubbleBase {
    def this(props: ITeachingBubbleProps) = this()
  }
  /* static members */
  @js.native
  object TeachingBubbleBase extends js.Object {
    
    var defaultProps: CalloutProps = js.native
  }
  
  @js.native
  class TeachingBubbleContentBase protected ()
    extends typingsSlinky.officeUiFabricReact.teachingBubbleContentBaseMod.TeachingBubbleContentBase {
    def this(props: ITeachingBubbleProps) = this()
  }
}
