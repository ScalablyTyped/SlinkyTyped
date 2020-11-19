package typingsSlinky.reactSpinners

import typingsSlinky.react.mod.Component
import typingsSlinky.reactSpinners.interfacesMod.LoaderSizeMarginProps
import typingsSlinky.reactSpinners.interfacesMod.StyleFunctionWithIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-spinners/SyncLoader", JSImport.Namespace)
@js.native
object syncLoaderMod extends js.Object {
  
  @js.native
  trait Loader
    extends Component[LoaderSizeMarginProps, js.Object, js.Any] {
    
    var style: StyleFunctionWithIndex = js.native
  }
  
  @js.native
  class default () extends Loader
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: LoaderSizeMarginProps = js.native
  }
}
