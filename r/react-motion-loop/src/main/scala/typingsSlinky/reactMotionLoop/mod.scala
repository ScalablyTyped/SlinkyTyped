package typingsSlinky.reactMotionLoop

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.reactMotion.mod.PlainStyle
import typingsSlinky.reactMotion.mod.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-motion-loop", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ReactMotionLoop ()
    extends Component[ReactMotionLoopProps, js.Object, js.Any]
  
  /* Inlined parent std.Partial<react-motion.react-motion.MotionProps> */
  @js.native
  trait ReactMotionLoopProps extends js.Object {
    var children: js.UndefOr[js.Function1[/* interpolatedStyle */ PlainStyle, ReactElement]] = js.native
    var defaultStyle: js.UndefOr[PlainStyle] = js.native
    var onRest: js.UndefOr[js.Function0[Unit]] = js.native
    var style: js.UndefOr[Style] = js.native
    var styleFrom: Style = js.native
    var styleTo: Style = js.native
  }
  
}

