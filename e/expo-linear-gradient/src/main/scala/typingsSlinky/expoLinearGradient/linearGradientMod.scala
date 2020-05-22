package typingsSlinky.expoLinearGradient

import typingsSlinky.expoLinearGradient.anon.AccessibilityActions
import typingsSlinky.expoLinearGradient.anon.Colors
import typingsSlinky.expoLinearGradient.anon.TypeofView
import typingsSlinky.expoLinearGradient.anon.X
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-linear-gradient/build/LinearGradient", JSImport.Namespace)
@js.native
object linearGradientMod extends js.Object {
  @js.native
  trait LinearGradient
    extends Component[Props, js.Object, js.Any]
  
  @js.native
  class default () extends LinearGradient
  
  /* static members */
  @js.native
  object default extends js.Object {
    var propTypes: AccessibilityActions = js.native
  }
  
  type Point = X | (js.Tuple2[Double, Double])
  type Props = Colors with ComponentProps[TypeofView]
}

