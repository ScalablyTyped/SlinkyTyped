package typingsSlinky.reactDashSpinners

import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashSpinners.interfacesMod.CalcFunction
import typingsSlinky.reactDashSpinners.interfacesMod.LoaderSizeProps
import typingsSlinky.reactDashSpinners.interfacesMod.PrecompiledCss
import typingsSlinky.reactDashSpinners.interfacesMod.StyleFunction
import typingsSlinky.reactDashSpinners.moonLoaderMod.BallStyleFunction
import typingsSlinky.reactDashSpinners.moonLoaderMod.Loader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-spinners/MoonLoader", JSImport.Namespace)
@js.native
object moonLoaderMod extends js.Object {
  @js.native
  trait Loader
    extends Component[LoaderSizeProps, js.Object, js.Any] {
    var ball: CalcFunction[PrecompiledCss] = js.native
    var ballStyle: BallStyleFunction = js.native
    var circle: CalcFunction[PrecompiledCss] = js.native
    var moonSize: CalcFunction[Double] = js.native
    var wrapper: StyleFunction = js.native
  }
  
  @js.native
  class default () extends Loader
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: LoaderSizeProps = js.native
  }
  
  type BallStyleFunction = js.Function1[/* size */ Double, PrecompiledCss]
}

