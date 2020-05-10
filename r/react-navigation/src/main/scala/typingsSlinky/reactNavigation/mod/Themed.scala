package typingsSlinky.reactNavigation.mod

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation", "Themed")
@js.native
object Themed extends js.Object {
  @js.native
  class StatusBar protected ()
    extends Component[ThemedStatusBarProps, js.Object, js.Any] {
    def this(props: ThemedStatusBarProps) = this()
    def this(props: ThemedStatusBarProps, context: js.Any) = this()
  }
  
  @js.native
  class Text protected ()
    extends Component[ThemedTextProps, js.Object, js.Any] {
    def this(props: ThemedTextProps) = this()
    def this(props: ThemedTextProps, context: js.Any) = this()
  }
  
  @js.native
  class TextInput protected ()
    extends Component[ThemedTextInputProps, js.Object, js.Any] {
    def this(props: ThemedTextInputProps) = this()
    def this(props: ThemedTextInputProps, context: js.Any) = this()
  }
  
  @js.native
  object StatusBar extends TopLevel[ReactComponentClass[ThemedStatusBarProps]]
  
  @js.native
  object Text extends TopLevel[ReactComponentClass[ThemedTextProps]]
  
  @js.native
  object TextInput extends TopLevel[ReactComponentClass[ThemedTextInputProps]]
  
}

