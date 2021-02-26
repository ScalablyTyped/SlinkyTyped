package typingsSlinky.reactSpinners

import typingsSlinky.react.mod.PureComponent
import typingsSlinky.reactSpinners.interfacesMod.LoaderHeightWidthRadiusProps
import typingsSlinky.reactSpinners.interfacesMod.StyleFunctionWithIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scaleLoaderMod {
  
  @JSImport("react-spinners/ScaleLoader", JSImport.Default)
  @js.native
  class default () extends Loader
  object default {
    
    @JSImport("react-spinners/ScaleLoader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("react-spinners/ScaleLoader", "default.defaultProps")
    @js.native
    def defaultProps: LoaderHeightWidthRadiusProps = js.native
    @scala.inline
    def defaultProps_=(x: LoaderHeightWidthRadiusProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Loader
    extends PureComponent[LoaderHeightWidthRadiusProps, js.Object, js.Any] {
    
    var style: StyleFunctionWithIndex = js.native
  }
}
