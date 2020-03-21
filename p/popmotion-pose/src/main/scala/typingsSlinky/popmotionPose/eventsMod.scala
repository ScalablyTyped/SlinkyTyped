package typingsSlinky.popmotionPose

import org.scalajs.dom.raw.Element
import typingsSlinky.popmotion.typesMod.ColdSubscription
import typingsSlinky.popmotionPose.typesMod.DomPopmotionConfig
import typingsSlinky.popmotionPose.typesMod.DomPopmotionPoser
import typingsSlinky.poseCore.typesMod.ActiveActions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion-pose/lib/dom/events", JSImport.Namespace)
@js.native
object eventsMod extends js.Object {
  def default(
    element: Element,
    activeActions: ActiveActions[ColdSubscription],
    poser: DomPopmotionPoser,
    hasProps: DomPopmotionConfig
  ): Unit = js.native
}

