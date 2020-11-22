package typingsSlinky.rcSlider.interfaceMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.rcSlider.anon.Value
import typingsSlinky.react.mod.Component
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenericSliderClass[Props, State]
  extends Component[Props, State, js.Any] {
  
  def getLowerBound(): Double = js.native
  
  def getUpperBound(): Double = js.native
  
  def onChange(state: Value): Unit = js.native
  
  def onEnd(): Unit = js.native
  def onEnd(force: Boolean): Unit = js.native
  
  def onKeyboard(e: SyntheticKeyboardEvent[HTMLDivElement]): Unit = js.native
  
  def onMove(e: SyntheticMouseEvent[HTMLDivElement], position: Double): Unit = js.native
  def onMove(e: SyntheticTouchEvent[HTMLDivElement], position: Double): Unit = js.native
  
  def onStart(position: Double): Unit = js.native
  
  def trimAlignValue(v: Double): Double = js.native
  def trimAlignValue(v: Double, nextProps: Partial[Props]): Double = js.native
}
