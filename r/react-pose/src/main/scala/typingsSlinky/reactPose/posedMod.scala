package typingsSlinky.reactPose

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.popmotionPose.typesMod.DomPopmotionConfig
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.reactPose.typesMod.PoseElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object posedMod extends Shortcut {
  
  @JSImport("react-pose/lib/posed", JSImport.Default)
  @js.native
  val default: Posed = js.native
  
  type ComponentFactory[T] = js.Function1[
    /* poseConfig */ js.UndefOr[DomPopmotionConfig | DomPopmotionConfigFactory[T]], 
    ReactComponentClass[PoseElementProps with T]
  ]
  
  type DomPopmotionConfigFactory[T] = js.Function1[/* props */ PoseElementProps with T, DomPopmotionConfig]
  
  @js.native
  trait Posed extends /* key */ StringDictionary[ComponentFactory[HTMLProps[_]]] {
    
    def apply[T](component: ReactComponentClass[T]): ComponentFactory[T] = js.native
  }
  
  type _To = Posed
  
  /* This means you don't have to write `default`, but can instead just say `posedMod.foo` */
  override def _to: Posed = default
}
