package typingsSlinky.rcSlider

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.rcSlider.anon.Marks
import typingsSlinky.rcSlider.anon.Max
import typingsSlinky.rcSlider.anon.Min
import typingsSlinky.rcSlider.anon.Target
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-slider/es/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def calculateNextValue(func: js.Any, value: js.Any, props: js.Any): js.Any = js.native
  def ensureValueInRange(`val`: Double, hasMaxMin: Min): Double = js.native
  def ensureValuePrecision(`val`: Double, props: js.Any): Double = js.native
  def getClosestPoint(`val`: Double, hasMarksStepMinMax: Marks): Double = js.native
  def getHandleCenterPosition(vertical: Boolean, handle: HTMLElement): Double = js.native
  def getKeyboardValueMutator(e: SyntheticKeyboardEvent[Element], vertical: Boolean, reverse: Boolean): js.Function2[/* value */ js.Any, /* props */ js.Any, _] = js.native
  def getMousePosition(vertical: Boolean, e: SyntheticMouseEvent[Element]): Double = js.native
  def getPrecision(step: Double): Double = js.native
  def getTouchPosition(vertical: Boolean, e: SyntheticTouchEvent[Element]): Double = js.native
  def isEventFromHandle(e: Target, handles: Record[Double, ReactElement]): Boolean = js.native
  def isNotTouchEvent(e: SyntheticTouchEvent[Element]): Boolean = js.native
  def isValueOutOfRange(value: Double, hasMinMax: Max): Boolean = js.native
  def pauseEvent(e: SyntheticEvent[Event, Element]): Unit = js.native
}

