package typingsSlinky.antdMobile

import org.scalajs.dom.raw.HTMLSpanElement
import typingsSlinky.antdMobile.viewMod.ViewProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile/lib/text", JSImport.Namespace)
@js.native
object textMod extends js.Object {
  @js.native
  trait Text
    extends Component[ViewProps[HTMLSpanElement], js.Any, js.Any]
  
  @js.native
  class default () extends Text
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: AnonComponent = js.native
  }
  
}

