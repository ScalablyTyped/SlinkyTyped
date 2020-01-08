package typingsSlinky.reactDashSpinners

import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashSpinners.interfacesMod.LoaderSizeProps
import typingsSlinky.reactDashSpinners.interfacesMod.StyleFunction
import typingsSlinky.reactDashSpinners.interfacesMod.StyleFunctionWithIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-spinners/PropagateLoader", JSImport.Namespace)
@js.native
object propagateLoaderMod extends js.Object {
  @js.native
  trait Loader
    extends Component[LoaderSizeProps, js.Object, js.Any] {
    var style: StyleFunctionWithIndex = js.native
    var wrapper: StyleFunction = js.native
  }
  
  @js.native
  class default () extends Loader
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: LoaderSizeProps = js.native
  }
  
}

