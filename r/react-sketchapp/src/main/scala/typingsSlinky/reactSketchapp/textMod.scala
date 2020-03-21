package typingsSlinky.reactSketchapp

import typingsSlinky.react.mod.Component
import typingsSlinky.reactSketchapp.propsMod.TextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sketchapp/lib/components/Svg/Text", JSImport.Namespace)
@js.native
object textMod extends js.Object {
  @js.native
  trait Text
    extends Component[TextProps, js.Object, js.Any] {
    def getChildContext(): AnonIsInAParentText = js.native
  }
  
  @js.native
  class default () extends Text
  
}

