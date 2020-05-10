package typingsSlinky.muicss

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.muicss.reactMod.InputProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("muicss/lib/react/input", JSImport.Namespace)
@js.native
object inputMod extends js.Object {
  @js.native
  trait Input
    extends Component[InputProps, js.Object, js.Any] {
    var controlEl: js.UndefOr[HTMLInputElement] = js.native
  }
  
  @js.native
  class default () extends Input
  
}

