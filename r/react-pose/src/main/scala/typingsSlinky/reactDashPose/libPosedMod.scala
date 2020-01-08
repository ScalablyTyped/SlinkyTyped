package typingsSlinky.reactDashPose

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.popmotionDashPose.libTypesMod.DomPopmotionConfig
import typingsSlinky.react.reactMod.HTMLProps
import typingsSlinky.reactDashPose.libComponentsPoseElementTypesMod.PoseElementProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-pose/lib/posed", JSImport.Namespace)
@js.native
object libPosedMod extends js.Object {
  @js.native
  trait Posed extends /* key */ StringDictionary[ComponentFactory[HTMLProps[_]]] {
    def apply[T](component: ReactComponentClass[T]): ComponentFactory[T] = js.native
  }
  
  val default: Posed = js.native
  type ComponentFactory[T] = js.Function1[
    /* poseConfig */ js.UndefOr[DomPopmotionConfig | DomPopmotionConfigFactory[T]], 
    ReactComponentClass[PoseElementProps with T]
  ]
  type DomPopmotionConfigFactory[T] = js.Function1[/* props */ PoseElementProps with T, DomPopmotionConfig]
}

