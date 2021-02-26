package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.anon.CalloutProps
import typingsSlinky.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubbleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTeachingBubbleMod {
  
  @JSImport("office-ui-fabric-react/lib/TeachingBubble", "TeachingBubble")
  @js.native
  val TeachingBubble: ReactComponentClass[ITeachingBubbleProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/TeachingBubble", "TeachingBubbleBase")
  @js.native
  class TeachingBubbleBase protected ()
    extends typingsSlinky.officeUiFabricReact.teachingBubbleMod.TeachingBubbleBase {
    def this(props: ITeachingBubbleProps) = this()
  }
  /* static members */
  object TeachingBubbleBase {
    
    @JSImport("office-ui-fabric-react/lib/TeachingBubble", "TeachingBubbleBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/TeachingBubble", "TeachingBubbleBase.defaultProps")
    @js.native
    def defaultProps: CalloutProps = js.native
    @scala.inline
    def defaultProps_=(x: CalloutProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/TeachingBubble", "TeachingBubbleContent")
  @js.native
  val TeachingBubbleContent: ReactComponentClass[ITeachingBubbleProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/TeachingBubble", "TeachingBubbleContentBase")
  @js.native
  class TeachingBubbleContentBase protected ()
    extends typingsSlinky.officeUiFabricReact.teachingBubbleMod.TeachingBubbleContentBase {
    def this(props: ITeachingBubbleProps) = this()
  }
}
