package typingsSlinky.popmotionPose

import org.scalajs.dom.raw.Element
import typingsSlinky.popmotionPose.typesMod.DomPopmotionConfig
import typingsSlinky.popmotionPose.typesMod.DomPopmotionPoser
import typingsSlinky.poseCore.typesMod.ActiveActions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("popmotion-pose/lib/dom/events", JSImport.Namespace)
@js.native
object eventsMod extends js.Object {
  
  def default(
    element: Element,
    activeActions: ActiveActions[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ _
    ],
    poser: DomPopmotionPoser,
    hasProps: DomPopmotionConfig
  ): Unit = js.native
}
