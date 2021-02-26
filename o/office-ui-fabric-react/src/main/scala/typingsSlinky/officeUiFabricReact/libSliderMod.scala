package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.sliderTypesMod.ISliderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSliderMod {
  
  @JSImport("office-ui-fabric-react/lib/Slider", "ONKEYDOWN_TIMEOUT_DURATION")
  @js.native
  val ONKEYDOWN_TIMEOUT_DURATION: /* 1000 */ Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/Slider", "Slider")
  @js.native
  val Slider: ReactComponentClass[ISliderProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Slider", "SliderBase")
  @js.native
  class SliderBase protected ()
    extends typingsSlinky.officeUiFabricReact.sliderMod.SliderBase {
    def this(props: ISliderProps) = this()
  }
  /* static members */
  object SliderBase {
    
    @JSImport("office-ui-fabric-react/lib/Slider", "SliderBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Slider", "SliderBase.defaultProps")
    @js.native
    def defaultProps: ISliderProps = js.native
    @scala.inline
    def defaultProps_=(x: ISliderProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
