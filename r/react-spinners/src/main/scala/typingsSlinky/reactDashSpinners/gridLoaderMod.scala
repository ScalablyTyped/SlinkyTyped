package typingsSlinky.reactDashSpinners

import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashSpinners.gridLoaderMod.Loader
import typingsSlinky.reactDashSpinners.interfacesMod.LoaderSizeMarginProps
import typingsSlinky.reactDashSpinners.interfacesMod.StyleFunction
import typingsSlinky.reactDashSpinners.interfacesMod.StyleFunctionWithIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-spinners/GridLoader", JSImport.Namespace)
@js.native
object gridLoaderMod extends js.Object {
  @js.native
  trait Loader
    extends Component[LoaderSizeMarginProps, js.Object, js.Any] {
    var style: StyleFunctionWithIndex = js.native
    var wrapper: StyleFunction = js.native
  }
  
  @js.native
  class default () extends Loader
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: LoaderSizeMarginProps = js.native
  }
  
}

