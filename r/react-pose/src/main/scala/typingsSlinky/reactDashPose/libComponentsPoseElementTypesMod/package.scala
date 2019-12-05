package typingsSlinky.reactDashPose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsPoseElementTypesMod {
  import org.scalajs.dom.raw.Element
  import typingsSlinky.popmotionDashPose.libTypesMod.DomPopmotionConfig
  import typingsSlinky.reactDashPose.Anon_ChildrenInitialPose
  import typingsSlinky.reactDashPose.Anon_ElementType

  type ConfigFactory = js.Function1[/* props */ PoseElementProps, DomPopmotionConfig]
  type CurrentPose = String | js.Array[String]
  type PoseElementInternalProps = PoseElementProps with Anon_ElementType
  type PoseElementProps = Anon_ChildrenInitialPose with PoseContextProps
  type RefFunc = js.Function1[/* el */ Element, js.Any]
}
