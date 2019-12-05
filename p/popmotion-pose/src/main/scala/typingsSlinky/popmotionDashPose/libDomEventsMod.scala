package typingsSlinky.popmotionDashPose

import org.scalajs.dom.raw.Element
import typingsSlinky.popmotion.libActionTypesMod.ColdSubscription
import typingsSlinky.popmotionDashPose.libTypesMod.DomPopmotionConfig
import typingsSlinky.popmotionDashPose.libTypesMod.DomPopmotionPoser
import typingsSlinky.poseDashCore.libTypesMod.ActiveActions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion-pose/lib/dom/events", JSImport.Namespace)
@js.native
object libDomEventsMod extends js.Object {
  def default(
    element: Element,
    activeActions: ActiveActions[ColdSubscription],
    poser: DomPopmotionPoser,
    hasProps: DomPopmotionConfig
  ): Unit = js.native
}

