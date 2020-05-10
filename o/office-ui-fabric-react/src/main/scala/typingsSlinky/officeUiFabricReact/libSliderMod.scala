package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.sliderTypesMod.ISliderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Slider", JSImport.Namespace)
@js.native
object libSliderMod extends js.Object {
  @js.native
  class SliderBase protected ()
    extends typingsSlinky.officeUiFabricReact.sliderMod.SliderBase {
    def this(props: ISliderProps) = this()
  }
  
  val ONKEYDOWN_TIMEOUT_DURATION: /* 1000 */ Double = js.native
  val Slider: ReactComponentClass[ISliderProps] = js.native
  /* static members */
  @js.native
  object SliderBase extends js.Object {
    var defaultProps: ISliderProps = js.native
  }
  
}

