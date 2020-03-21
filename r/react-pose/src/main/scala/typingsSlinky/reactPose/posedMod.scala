package typingsSlinky.reactPose

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.popmotionPose.typesMod.DomPopmotionConfig
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.reactPose.typesMod.PoseElementProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-pose/lib/posed", JSImport.Namespace)
@js.native
object posedMod extends js.Object {
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

