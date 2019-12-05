package typingsSlinky.reactDashSelect

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.reactDashSelect.srcAnimatedInputMod.AnimatedInputProps
import typingsSlinky.reactDashSelect.srcAnimatedMultiValueMod.AnimatedMultiValueProps
import typingsSlinky.reactDashSelect.srcAnimatedPlaceholderMod.AnimatedPlaceholderProps
import typingsSlinky.reactDashSelect.srcAnimatedSingleValueMod.AnimatedSingleValueProps
import typingsSlinky.reactDashSelect.srcAnimatedValueContainerMod.AnimatedValueContainerProps
import typingsSlinky.reactDashSelect.srcComponentsMod.SelectComponents
import typingsSlinky.reactDashSelect.srcComponentsMod.SelectComponentsConfig
import typingsSlinky.reactDashSelect.srcTypesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/animated", JSImport.Namespace)
@js.native
object srcAnimatedMod extends js.Object {
  @js.native
  class Input protected ()
    extends Component[AnimatedInputProps, ComponentState, js.Any] {
    def this(props: AnimatedInputProps) = this()
    def this(props: AnimatedInputProps, context: js.Any) = this()
  }
  
  @js.native
  class MultiValue protected ()
    extends Component[AnimatedMultiValueProps[js.Any], ComponentState, js.Any] {
    def this(props: AnimatedMultiValueProps[_]) = this()
    def this(props: AnimatedMultiValueProps[_], context: js.Any) = this()
  }
  
  @js.native
  class Placeholder protected ()
    extends Component[AnimatedPlaceholderProps[js.Any], ComponentState, js.Any] {
    def this(props: AnimatedPlaceholderProps[_]) = this()
    def this(props: AnimatedPlaceholderProps[_], context: js.Any) = this()
  }
  
  @js.native
  class SingleValue protected ()
    extends Component[AnimatedSingleValueProps[js.Any], ComponentState, js.Any] {
    def this(props: AnimatedSingleValueProps[_]) = this()
    def this(props: AnimatedSingleValueProps[_], context: js.Any) = this()
  }
  
  @js.native
  class ValueContainer protected ()
    extends Component[AnimatedValueContainerProps[js.Any], ComponentState, js.Any] {
    def this(props: AnimatedValueContainerProps[_]) = this()
    def this(props: AnimatedValueContainerProps[_], context: js.Any) = this()
  }
  
  val Input: ReactComponentClass[AnimatedInputProps] = js.native
  val MultiValue: ReactComponentClass[AnimatedMultiValueProps[js.Any]] = js.native
  val Placeholder: ReactComponentClass[AnimatedPlaceholderProps[js.Any]] = js.native
  val SingleValue: ReactComponentClass[AnimatedSingleValueProps[js.Any]] = js.native
  val ValueContainer: ReactComponentClass[AnimatedValueContainerProps[js.Any]] = js.native
  def default[OptionType /* <: OptionTypeBase */](): SelectComponents[OptionType] = js.native
  def default[OptionType /* <: OptionTypeBase */](externalComponents: SelectComponentsConfig[OptionType]): SelectComponents[OptionType] = js.native
  def makeAnimated[OptionType /* <: OptionTypeBase */](): SelectComponents[OptionType] = js.native
  def makeAnimated[OptionType /* <: OptionTypeBase */](externalComponents: SelectComponentsConfig[OptionType]): SelectComponents[OptionType] = js.native
}

