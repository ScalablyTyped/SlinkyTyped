package typingsSlinky.popmotionPose

import org.scalajs.dom.raw.Element
import typingsSlinky.popmotion.valueMod.ValueProps
import typingsSlinky.popmotionPose.typesMod.DomPopmotionConfig
import typingsSlinky.popmotionPose.typesMod.DomPopmotionPoser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion-pose/lib/dom/pose", JSImport.Namespace)
@js.native
object poseMod extends js.Object {
  @js.native
  class Action ()
    extends typingsSlinky.popmotion.actionMod.Action
  
  @js.native
  class ValueReaction protected ()
    extends typingsSlinky.popmotion.mod.ValueReaction {
    def this(props: ValueProps) = this()
  }
  
  def default(element: Element, config: DomPopmotionConfig): DomPopmotionPoser = js.native
}

