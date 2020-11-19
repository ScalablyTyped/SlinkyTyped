package typingsSlinky.expoLinearGradient

import typingsSlinky.expoLinearGradient.anon.Colors
import typingsSlinky.expoLinearGradient.anon.TypeofView
import typingsSlinky.expoLinearGradient.anon.X
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-linear-gradient/build/LinearGradient", JSImport.Namespace)
@js.native
object linearGradientMod extends js.Object {
  
  @js.native
  trait LinearGradient
    extends Component[LinearGradientProps, js.Object, js.Any]
  
  @js.native
  class default () extends LinearGradient
  
  type LinearGradienPoint = X | (js.Tuple2[Double, Double])
  
  type LinearGradientProps = Colors with ComponentProps[TypeofView]
}
