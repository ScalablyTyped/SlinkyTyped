package typingsSlinky.blueprintjsCore.componentsMod

import slinky.core.ReactComponentClass
import typingsSlinky.blueprintjsCore.anon.LabelPrecision
import typingsSlinky.blueprintjsCore.handlePropsMod.IHandleProps
import typingsSlinky.blueprintjsCore.multiSliderMod.IMultiSliderProps
import typingsSlinky.blueprintjsCore.multiSliderMod.ISliderBaseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "MultiSlider")
@js.native
class MultiSlider ()
  extends typingsSlinky.blueprintjsCore.multiSliderMod.MultiSlider
/* static members */
@JSImport("@blueprintjs/core/lib/esm/components", "MultiSlider")
@js.native
object MultiSlider extends js.Object {
  
  var Handle: ReactComponentClass[IHandleProps] = js.native
  
  var defaultProps: IMultiSliderProps = js.native
  
  var defaultSliderProps: ISliderBaseProps = js.native
  
  var displayName: String = js.native
  
  def getDerivedStateFromProps(props: IMultiSliderProps): LabelPrecision = js.native
  
  var getLabelPrecision: js.Any = js.native
}
