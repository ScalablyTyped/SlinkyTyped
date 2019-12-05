package typingsSlinky.popmotionDashPose

import org.scalajs.dom.raw.Element
import typingsSlinky.popmotion.libReactionsValueMod.ValueProps
import typingsSlinky.popmotionDashPose.libTypesMod.DomPopmotionConfig
import typingsSlinky.popmotionDashPose.libTypesMod.DomPopmotionPoser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion-pose/lib/dom/pose", JSImport.Namespace)
@js.native
object libDomPoseMod extends js.Object {
  @js.native
  class Action ()
    extends typingsSlinky.popmotion.libActionMod.Action
  
  @js.native
  class ValueReaction protected ()
    extends typingsSlinky.popmotion.popmotionMod.ValueReaction {
    def this(props: ValueProps) = this()
  }
  
  def default(element: Element, config: DomPopmotionConfig): DomPopmotionPoser = js.native
}

