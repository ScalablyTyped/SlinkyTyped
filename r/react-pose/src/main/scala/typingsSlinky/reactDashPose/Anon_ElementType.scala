package typingsSlinky.reactDashPose

import typingsSlinky.popmotionDashPose.libTypesMod.DomPopmotionConfig
import typingsSlinky.reactDashPose.libComponentsPoseElementTypesMod.ConfigFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ElementType extends js.Object {
  var elementType: js.Any
  var poseConfig: DomPopmotionConfig | ConfigFactory
}

object Anon_ElementType {
  @scala.inline
  def apply(elementType: js.Any, poseConfig: DomPopmotionConfig | ConfigFactory): Anon_ElementType = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], poseConfig = poseConfig.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ElementType]
  }
}

