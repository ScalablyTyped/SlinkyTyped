package typingsSlinky.reactSpinners

import typingsSlinky.react.mod.Component
import typingsSlinky.reactSpinners.interfacesMod.LoaderSizeMarginProps
import typingsSlinky.reactSpinners.interfacesMod.StyleFunction
import typingsSlinky.reactSpinners.interfacesMod.StyleFunctionWithIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-spinners/RotateLoader", JSImport.Namespace)
@js.native
object rotateLoaderMod extends js.Object {
  
  @js.native
  trait Loader
    extends Component[LoaderSizeMarginProps, js.Object, js.Any] {
    
    var ball: StyleFunction = js.native
    
    var long: StyleFunction = js.native
    
    var short: StyleFunction = js.native
    
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
