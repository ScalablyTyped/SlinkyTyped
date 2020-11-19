package typingsSlinky.expoLinearGradient

import slinky.core.ReactComponentClass
import typingsSlinky.expoLinearGradient.anon.OnLayout
import typingsSlinky.expoLinearGradient.anon.TypeofView
import typingsSlinky.react.mod.ComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-linear-gradient/build/NativeLinearGradient.web", JSImport.Namespace)
@js.native
object nativeLinearGradientWebMod extends js.Object {
  
  val default: ReactComponentClass[Props] = js.native
  
  type Point = js.Tuple2[Double, Double]
  
  type Props = OnLayout with ComponentProps[TypeofView]
}
