package typingsSlinky.popmotionPose.typesMod

import org.scalajs.dom.raw.Element
import typingsSlinky.popmotion.actionTypesMod.ColdSubscription
import typingsSlinky.popmotion.mod.Action_
import typingsSlinky.poseCore.typesMod.Poser
import typingsSlinky.poseCore.typesMod.PoserConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomPopmotionPoser extends Poser[Value, Action_[ColdSubscription], ColdSubscription, DomPopmotionPoser] {
  def addChild(element: Element, config: PoserConfig[Value]): DomPopmotionPoser = js.native
  def flip(op: js.Function): js.Promise[_] = js.native
  def measure(): BoundingBox = js.native
}

