package typingsSlinky.reactSpinners

import typingsSlinky.emotionSerialize.mod.Keyframes
import typingsSlinky.react.mod.Component
import typingsSlinky.reactSpinners.interfacesMod.CalcFunction
import typingsSlinky.reactSpinners.interfacesMod.LoaderSizeProps
import typingsSlinky.reactSpinners.interfacesMod.StyleFunction
import typingsSlinky.reactSpinners.interfacesMod.StyleFunctionWithIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-spinners/HashLoader", JSImport.Namespace)
@js.native
object hashLoaderMod extends js.Object {
  
  @js.native
  trait Loader
    extends Component[LoaderSizeProps, js.Object, js.Any] {
    
    var after: CalcFunction[Keyframes] = js.native
    
    var before: CalcFunction[Keyframes] = js.native
    
    var color: CalcFunction[String] = js.native
    
    var lat: CalcFunction[Double] = js.native
    
    var offset: CalcFunction[Double] = js.native
    
    var style: StyleFunctionWithIndex = js.native
    
    var thickness: CalcFunction[Double] = js.native
    
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
