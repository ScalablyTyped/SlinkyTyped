package typingsSlinky.expoLinearGradient

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-linear-gradient/build/NativeLinearGradient.web", JSImport.Namespace)
@js.native
object nativeLinearGradientWebMod extends js.Object {
  val default: ReactComponentClass[Props] = js.native
  type Point = js.Tuple2[Double, Double]
  type Props = AnonOnLayout with ComponentProps[TypeofView]
}

