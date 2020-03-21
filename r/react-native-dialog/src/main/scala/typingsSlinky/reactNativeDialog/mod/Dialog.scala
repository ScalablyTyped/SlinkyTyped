package typingsSlinky.reactNativeDialog.mod

import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.TextInputProps
import typingsSlinky.reactNative.mod.TextProps
import typingsSlinky.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-dialog", "Dialog")
@js.native
object Dialog extends js.Object {
  @js.native
  class Button ()
    extends Component[ButtonProps with ViewProps with TextProps, js.Object, js.Any]
  
  @js.native
  class Container ()
    extends Component[ContainerProps with ViewProps with reactNativeModalContainerProps, js.Object, js.Any]
  
  @js.native
  class Description ()
    extends Component[DescriptionProps with ViewProps with TextProps, js.Object, js.Any]
  
  @js.native
  class Input[T] ()
    extends Component[InputProps[T] with ViewProps with TextInputProps, js.Object, js.Any]
  
  @js.native
  class Title ()
    extends Component[TitleProps with ViewProps with TextProps, js.Object, js.Any]
  
}

