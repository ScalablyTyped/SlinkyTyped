package typingsSlinky.reactDashSketchapp

import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashSketchapp.libComponentsSvgPropsMod.TextProps
import typingsSlinky.reactDashSketchapp.libComponentsSvgTextMod.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sketchapp/lib/components/Svg/Text", JSImport.Namespace)
@js.native
object libComponentsSvgTextMod extends js.Object {
  @js.native
  trait Text
    extends Component[TextProps, js.Object, js.Any] {
    def getChildContext(): Anon_IsInAParentText = js.native
  }
  
  @js.native
  class default () extends Text
  
}

