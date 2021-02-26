package typingsSlinky.blueprintjsCore.mod

import typingsSlinky.blueprintjsCore.sliderMod.ISliderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Slider")
@js.native
class Slider protected ()
  extends typingsSlinky.blueprintjsCore.componentsMod.Slider {
  def this(props: ISliderProps) = this()
  def this(props: ISliderProps, context: js.Any) = this()
}
/* static members */
object Slider {
  
  @JSImport("@blueprintjs/core", "Slider")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "Slider.defaultProps")
  @js.native
  def defaultProps: ISliderProps = js.native
  @scala.inline
  def defaultProps_=(x: ISliderProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "Slider.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
