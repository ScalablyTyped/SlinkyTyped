package typingsSlinky.popmotionPose

import org.scalajs.dom.raw.Element
import typingsSlinky.popmotionPose.typesMod.DomPopmotionConfig
import typingsSlinky.popmotionPose.typesMod.DomPopmotionPoser
import typingsSlinky.poseCore.typesMod.ActiveActions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  @JSImport("popmotion-pose/lib/dom/events", JSImport.Default)
  @js.native
  def default(
    element: Element,
    activeActions: ActiveActions[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ _
    ],
    poser: DomPopmotionPoser,
    hasProps: DomPopmotionConfig
  ): Unit = js.native
}
