package typingsSlinky.reactSpinners

import typingsSlinky.react.mod.PureComponent
import typingsSlinky.reactSpinners.interfacesMod.LoaderSizeProps
import typingsSlinky.reactSpinners.interfacesMod.StyleFunction
import typingsSlinky.reactSpinners.interfacesMod.StyleFunctionWithIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dotLoaderMod {
  
  @JSImport("react-spinners/DotLoader", JSImport.Default)
  @js.native
  class default () extends Loader
  object default {
    
    @JSImport("react-spinners/DotLoader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("react-spinners/DotLoader", "default.defaultProps")
    @js.native
    def defaultProps: LoaderSizeProps = js.native
    @scala.inline
    def defaultProps_=(x: LoaderSizeProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Loader
    extends PureComponent[LoaderSizeProps, js.Object, js.Any] {
    
    var style: StyleFunctionWithIndex = js.native
    
    var wrapper: StyleFunction = js.native
  }
}
