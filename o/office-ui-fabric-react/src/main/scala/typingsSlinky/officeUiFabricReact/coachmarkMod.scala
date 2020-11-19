package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.anon.PartialICoachmarkProps
import typingsSlinky.officeUiFabricReact.coachmarkTypesMod.ICoachmarkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/Coachmark", JSImport.Namespace)
@js.native
object coachmarkMod extends js.Object {
  
  val COACHMARK_ATTRIBUTE_NAME: /* "data-coachmarkid" */ String = js.native
  
  val Coachmark: ReactComponentClass[ICoachmarkProps] = js.native
  
  @js.native
  class CoachmarkBase protected ()
    extends typingsSlinky.officeUiFabricReact.coachmarkBaseMod.CoachmarkBase {
    def this(props: ICoachmarkProps) = this()
  }
  /* static members */
  @js.native
  object CoachmarkBase extends js.Object {
    
    var defaultProps: PartialICoachmarkProps = js.native
  }
}
