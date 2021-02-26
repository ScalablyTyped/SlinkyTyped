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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("rc-slider/lib/utils", "calculateNextValue")
  @js.native
  def calculateNextValue(func: js.Any, value: js.Any, props: js.Any): js.Any = js.native
  
  @JSImport("rc-slider/lib/utils", "ensureValueInRange")
  @js.native
  def ensureValueInRange(`val`: Double, hasMaxMin: Min): Double = js.native
  
  @JSImport("rc-slider/lib/utils", "ensureValuePrecision")
  @js.native
  def ensureValuePrecision(`val`: Double, props: js.Any): Double = js.native
  
  @JSImport("rc-slider/lib/utils", "getClosestPoint")
  @js.native
  def getClosestPoint(`val`: Double, hasMarksStepMinMax: Marks): Double = js.native
  
  @JSImport("rc-slider/lib/utils", "getHandleCenterPosition")
  @js.native
  def getHandleCenterPosition(vertical: Boolean, handle: HTMLElement): Double = js.native
  
  @JSImport("rc-slider/lib/utils", "getKeyboardValueMutator")
  @js.native
  def getKeyboardValueMutator(e: SyntheticKeyboardEvent[Element], vertical: Boolean, reverse: Boolean): js.Function2[/* value */ js.Any, /* props */ js.Any, _] = js.native
  
  @JSImport("rc-slider/lib/utils", "getMousePosition")
  @js.native
  def getMousePosition(vertical: Boolean, e: SyntheticMouseEvent[Element]): Double = js.native
  
  @JSImport("rc-slider/lib/utils", "getPrecision")
  @js.native
  def getPrecision(step: Double): Double = js.native
  
  @JSImport("rc-slider/lib/utils", "getTouchPosition")
  @js.native
  def getTouchPosition(vertical: Boolean, e: SyntheticTouchEvent[Element]): Double = js.native
  
  @JSImport("rc-slider/lib/utils", "isEventFromHandle")
  @js.native
  def isEventFromHandle(e: Target, handles: Record[Double, ReactElement]): Boolean = js.native
  
  @JSImport("rc-slider/lib/utils", "isNotTouchEvent")
  @js.native
  def isNotTouchEvent(e: SyntheticTouchEvent[Element]): Boolean = js.native
  
  @JSImport("rc-slider/lib/utils", "isValueOutOfRange")
  @js.native
  def isValueOutOfRange(value: Double, hasMinMax: Max): Boolean = js.native
  
  @JSImport("rc-slider/lib/utils", "pauseEvent")
  @js.native
  def pauseEvent(e: SyntheticEvent[Event, Element]): Unit = js.native
}
