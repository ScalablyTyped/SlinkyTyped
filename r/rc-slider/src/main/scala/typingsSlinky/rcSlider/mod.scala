package typingsSlinky.rcSlider

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.rcSlider.anon.ContextType
import typingsSlinky.rcSlider.anon.Dictx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-slider", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def createSliderWithTooltip(Component: js.Any): ContextType = js.native
  
  @js.native
  class Handle ()
    extends typingsSlinky.rcSlider.handleMod.Handle
  
  @js.native
  class Range protected () extends Dictx {
    def this(props: js.Any) = this()
  }
  @js.native
  object Range
    extends /* x */ StringDictionary[js.Any]
       with Instantiable1[/* props */ js.Any, Dictx] {
    
    var defaultProps: js.Any = js.native
    
    var displayName: String = js.native
  }
  
  @js.native
  class default protected () extends Dictx {
    def this(props: js.Any) = this()
  }
  @js.native
  object default
    extends /* x */ StringDictionary[js.Any]
       with Instantiable1[/* props */ js.Any, Dictx] {
    
    var defaultProps: js.Any = js.native
    
    var displayName: String = js.native
  }
}
