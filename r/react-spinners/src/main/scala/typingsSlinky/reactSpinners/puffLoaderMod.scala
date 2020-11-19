package typingsSlinky.reactSpinners

import typingsSlinky.react.mod.Component
import typingsSlinky.reactSpinners.anon.RequiredLoaderSizeProps
import typingsSlinky.reactSpinners.interfacesMod.LoaderSizeProps
import typingsSlinky.reactSpinners.interfacesMod.StyleFunction
import typingsSlinky.reactSpinners.interfacesMod.StyleFunctionWithIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-spinners/PuffLoader", JSImport.Namespace)
@js.native
object puffLoaderMod extends js.Object {
  
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
    
    var defaultProps: RequiredLoaderSizeProps = js.native
  }
}
