package typingsSlinky.reactSpinners

import typingsSlinky.emotionSerialize.mod.Keyframes
import typingsSlinky.react.mod.PureComponent
import typingsSlinky.reactSpinners.interfacesMod.CalcFunction
import typingsSlinky.reactSpinners.interfacesMod.LoaderSizeProps
import typingsSlinky.reactSpinners.interfacesMod.StyleFunction
import typingsSlinky.reactSpinners.interfacesMod.StyleFunctionWithIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hashLoaderMod {
  
  @JSImport("react-spinners/HashLoader", JSImport.Default)
  @js.native
  class default () extends Loader
  object default {
    
    @JSImport("react-spinners/HashLoader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("react-spinners/HashLoader", "default.defaultProps")
    @js.native
    def defaultProps: LoaderSizeProps = js.native
    @scala.inline
    def defaultProps_=(x: LoaderSizeProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Loader
    extends PureComponent[LoaderSizeProps, js.Object, js.Any] {
    
    var after: CalcFunction[Keyframes] = js.native
    
    var before: CalcFunction[Keyframes] = js.native
    
    var color: CalcFunction[String] = js.native
    
    var lat: CalcFunction[Double] = js.native
    
    var offset: CalcFunction[Double] = js.native
    
    var style: StyleFunctionWithIndex = js.native
    
    var thickness: CalcFunction[Double] = js.native
    
    var wrapper: StyleFunction = js.native
  }
}
