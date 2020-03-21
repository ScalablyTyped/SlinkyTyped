package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.coachmarkTypesMod.ICoachmarkProps
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.`data-coachmarkid`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Coachmark", JSImport.Namespace)
@js.native
object libCoachmarkMod extends js.Object {
  @js.native
  class CoachmarkBase protected ()
    extends typingsSlinky.officeUiFabricReact.coachmarkMod.CoachmarkBase {
    def this(props: ICoachmarkProps) = this()
  }
  
  val COACHMARK_ATTRIBUTE_NAME: `data-coachmarkid` = js.native
  val Coachmark: ReactComponentClass[ICoachmarkProps] = js.native
  /* static members */
  @js.native
  object CoachmarkBase extends js.Object {
    var defaultProps: PartialICoachmarkProps = js.native
  }
  
}

