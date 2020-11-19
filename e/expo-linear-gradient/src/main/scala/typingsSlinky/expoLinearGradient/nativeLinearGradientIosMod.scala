package typingsSlinky.expoLinearGradient

import typingsSlinky.expoLinearGradient.anon.Locations
import typingsSlinky.expoLinearGradient.anon.TypeofView
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-linear-gradient/build/NativeLinearGradient.ios", JSImport.Namespace)
@js.native
object nativeLinearGradientIosMod extends js.Object {
  
  @js.native
  trait NativeLinearGradient
    extends Component[Props, js.Object, js.Any]
  
  @js.native
  class default () extends NativeLinearGradient
  
  type Point = js.Tuple2[Double, Double]
  
  type Props = Locations with ComponentProps[TypeofView]
}
