package typingsSlinky.expoLinearGradient

import typingsSlinky.expoLinearGradient.anon.EndPoint
import typingsSlinky.expoLinearGradient.anon.TypeofView
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-linear-gradient/build/NativeLinearGradient.android", JSImport.Namespace)
@js.native
object nativeLinearGradientAndroidMod extends js.Object {
  @js.native
  trait NativeLinearGradient
    extends Component[Props, js.Object, js.Any]
  
  @js.native
  class default () extends NativeLinearGradient
  
  type Point = js.Tuple2[Double, Double]
  type Props = EndPoint with ComponentProps[TypeofView]
}

