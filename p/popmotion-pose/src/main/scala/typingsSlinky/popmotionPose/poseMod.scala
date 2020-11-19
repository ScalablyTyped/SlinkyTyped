package typingsSlinky.popmotionPose

import org.scalajs.dom.raw.Element
import typingsSlinky.popmotion.actionTypesMod.ColdSubscription
import typingsSlinky.popmotion.valueMod.ValueProps
import typingsSlinky.popmotionPose.typesMod.DomPopmotionConfig
import typingsSlinky.popmotionPose.typesMod.DomPopmotionPoser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("popmotion-pose/lib/dom/pose", JSImport.Namespace)
@js.native
object poseMod extends js.Object {
  
  def default(element: Element, config: DomPopmotionConfig): DomPopmotionPoser = js.native
  
  @js.native
  class Action[Sub /* <: ColdSubscription */] ()
    extends typingsSlinky.popmotion.actionMod.Action[Sub]
  
  @js.native
  class ValueReaction protected ()
    extends typingsSlinky.popmotion.mod.ValueReaction {
    def this(props: ValueProps) = this()
  }
}
