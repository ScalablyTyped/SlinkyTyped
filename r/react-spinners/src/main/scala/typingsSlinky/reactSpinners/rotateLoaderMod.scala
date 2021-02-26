package typingsSlinky.reactSpinners

import typingsSlinky.react.mod.PureComponent
import typingsSlinky.reactSpinners.interfacesMod.LoaderSizeMarginProps
import typingsSlinky.reactSpinners.interfacesMod.StyleFunction
import typingsSlinky.reactSpinners.interfacesMod.StyleFunctionWithIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rotateLoaderMod {
  
  @JSImport("react-spinners/RotateLoader", JSImport.Default)
  @js.native
  class default () extends Loader
  object default {
    
    @JSImport("react-spinners/RotateLoader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("react-spinners/RotateLoader", "default.defaultProps")
    @js.native
    def defaultProps: LoaderSizeMarginProps = js.native
    @scala.inline
    def defaultProps_=(x: LoaderSizeMarginProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Loader
    extends PureComponent[LoaderSizeMarginProps, js.Object, js.Any] {
    
    var ball: StyleFunction = js.native
    
    var long: StyleFunction = js.native
    
    var short: StyleFunction = js.native
    
    var style: StyleFunctionWithIndex = js.native
    
    var wrapper: StyleFunction = js.native
  }
}
