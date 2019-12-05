package typingsSlinky.popmotionDashPose.libTypesMod

import org.scalajs.dom.raw.Element
import typingsSlinky.popmotion.libActionTypesMod.ColdSubscription
import typingsSlinky.popmotion.popmotionMod.Action
import typingsSlinky.poseDashCore.libTypesMod.Poser
import typingsSlinky.poseDashCore.libTypesMod.PoserConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomPopmotionPoser extends Poser[Value, Action, ColdSubscription, DomPopmotionPoser] {
  def addChild(element: Element, config: PoserConfig[Value]): DomPopmotionPoser = js.native
  def flip(op: js.Function): js.Promise[_] = js.native
  def measure(): BoundingBox = js.native
}

