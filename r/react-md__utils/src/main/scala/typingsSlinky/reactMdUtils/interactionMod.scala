package typingsSlinky.reactMdUtils

import slinky.core.facade.ReactElement
import typingsSlinky.reactMdUtils.interactionModeMod.InteractionModeListenerProps
import typingsSlinky.reactMdUtils.useModeDetectionMod.UserInteractionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/utils/types/interaction", JSImport.Namespace)
@js.native
object interactionMod extends js.Object {
  
  def useIsUserInteractionMode(mode: UserInteractionMode): Boolean = js.native
  
  def useUserInteractionMode(): UserInteractionMode = js.native
  
  @js.native
  object InteractionModeListener extends js.Object {
    
    def apply(hasChildren: InteractionModeListenerProps): ReactElement = js.native
    
    @js.native
    object propTypes extends js.Object {
      
      var children: js.Any = js.native
    }
  }
}
