package typingsSlinky.antDesignProLayout

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/pro-layout/lib/WrapContent", JSImport.Namespace)
@js.native
object wrapContentMod extends js.Object {
  @js.native
  trait WrapContent
    extends Component[AnonClassName, AnonContentSize, js.Any] {
    var ref: HTMLDivElement | Null = js.native
    def resize(): js.Any = js.native
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MWrapContent(_underscore: js.Any, nextState: AnonContentSize): Boolean = js.native
  }
  
  @js.native
  class default () extends WrapContent
  
}

