package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.sliderTypesMod.ISliderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/Slider", JSImport.Namespace)
@js.native
object sliderMod extends js.Object {
  
  val ONKEYDOWN_TIMEOUT_DURATION: /* 1000 */ Double = js.native
  
  val Slider: ReactComponentClass[ISliderProps] = js.native
  
  @js.native
  class SliderBase protected ()
    extends typingsSlinky.officeUiFabricReact.sliderBaseMod.SliderBase {
    def this(props: ISliderProps) = this()
  }
  /* static members */
  @js.native
  object SliderBase extends js.Object {
    
    var defaultProps: ISliderProps = js.native
  }
}
