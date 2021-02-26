package typingsSlinky.blueprintjsCore.mod

import slinky.core.ReactComponentClass
import typingsSlinky.blueprintjsCore.anon.LabelPrecision
import typingsSlinky.blueprintjsCore.handlePropsMod.IHandleProps
import typingsSlinky.blueprintjsCore.multiSliderMod.IMultiSliderProps
import typingsSlinky.blueprintjsCore.multiSliderMod.ISliderBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "MultiSlider")
@js.native
class MultiSlider protected ()
  extends typingsSlinky.blueprintjsCore.componentsMod.MultiSlider {
  def this(props: IMultiSliderProps) = this()
  def this(props: IMultiSliderProps, context: js.Any) = this()
}
/* static members */
object MultiSlider {
  
  @JSImport("@blueprintjs/core", "MultiSlider")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "MultiSlider.Handle")
  @js.native
  def Handle: ReactComponentClass[IHandleProps] = js.native
  @scala.inline
  def Handle_=(x: ReactComponentClass[IHandleProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Handle")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "MultiSlider.defaultProps")
  @js.native
  def defaultProps: IMultiSliderProps = js.native
  @scala.inline
  def defaultProps_=(x: IMultiSliderProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "MultiSlider.defaultSliderProps")
  @js.native
  def defaultSliderProps: ISliderBaseProps = js.native
  @scala.inline
  def defaultSliderProps_=(x: ISliderBaseProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSliderProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "MultiSlider.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "MultiSlider.getDerivedStateFromProps")
  @js.native
  def getDerivedStateFromProps(props: IMultiSliderProps): LabelPrecision = js.native
  
  @JSImport("@blueprintjs/core", "MultiSlider.getLabelPrecision")
  @js.native
  def getLabelPrecision: js.Any = js.native
  @scala.inline
  def getLabelPrecision_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getLabelPrecision")(x.asInstanceOf[js.Any])
}
