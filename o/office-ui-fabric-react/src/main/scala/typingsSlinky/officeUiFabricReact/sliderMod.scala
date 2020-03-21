package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.officeUiFabricReactNumbers.`1000`
import typingsSlinky.officeUiFabricReact.sliderTypesMod.ISliderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Slider", JSImport.Namespace)
@js.native
object sliderMod extends js.Object {
  @js.native
  class SliderBase protected ()
    extends typingsSlinky.officeUiFabricReact.sliderBaseMod.SliderBase {
    def this(props: ISliderProps) = this()
  }
  
  val ONKEYDOWN_TIMEOUT_DURATION: `1000` = js.native
  val Slider: ReactComponentClass[ISliderProps] = js.native
  /* static members */
  @js.native
  object SliderBase extends js.Object {
    var defaultProps: ISliderProps = js.native
  }
  
}

