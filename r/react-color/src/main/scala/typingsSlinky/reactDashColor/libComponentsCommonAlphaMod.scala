package typingsSlinky.reactDashColor

import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashColor.libComponentsCommonAlphaMod.Alpha
import typingsSlinky.reactDashColor.libComponentsCommonAlphaMod.AlphaProps
import typingsSlinky.reactDashColor.reactDashColorMod.CustomPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-color/lib/components/common/Alpha", JSImport.Namespace)
@js.native
object libComponentsCommonAlphaMod extends js.Object {
  @js.native
  trait Alpha
    extends Component[AlphaProps, js.Object, js.Any]
  
  @js.native
  class default ()
    extends Component[AlphaProps, js.Object, js.Any]
  
  type AlphaProps = CustomPickerProps[Alpha]
}

