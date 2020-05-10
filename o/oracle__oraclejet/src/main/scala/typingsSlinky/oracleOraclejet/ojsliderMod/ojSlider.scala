package typingsSlinky.oracleOraclejet.ojsliderMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.AnonInvalidStep
import typingsSlinky.oracleOraclejet.ojeditablevalueMod.editableValue
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.`type`
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.fromMax
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.fromMin
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.horizontal
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.max
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.maxChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.min
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.minChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.orientation
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.orientationChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.single
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.step
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.stepChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.transientValueChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.typeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.value
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojSlider extends editableValue[Double | Null, ojSliderSettableProperties, Double | Null, Double | Null] {
  var max: Double | Null = js.native
  var min: Double | Null = js.native
  var onMaxChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onMinChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojSlider: (js.Function1[CustomEvent, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojSlider: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOrientationChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onStepChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTransientValueChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTypeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var orientation: horizontal | vertical = js.native
  var step: Double | Null = js.native
  val transientValue: Double = js.native
  @JSName("translations")
  var translations_ojSlider: AnonInvalidStep = js.native
  var `type`: fromMin | fromMax | single = js.native
  def addEventListener(`type`: orientationChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: orientationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: typeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: typeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxChanged(`type`: maxChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_maxChanged(
    `type`: maxChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minChanged(`type`: minChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_minChanged(
    `type`: minChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stepChanged(`type`: stepChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stepChanged(
    `type`: stepChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transientValueChanged(`type`: transientValueChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transientValueChanged(
    `type`: transientValueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_max(property: max): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_min(property: min): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_orientation(property: orientation): horizontal | vertical = js.native
  @JSName("getProperty")
  def getProperty_step(property: step): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_transientValue(property: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.transientValue): Double = js.native
  @JSName("getProperty")
  def getProperty_type(property: `type`): fromMin | fromMax | single = js.native
  def setProperties(properties: ojSliderSettablePropertiesLenient): Unit = js.native
  def setProperty(property: `type`, value: fromMax): Unit = js.native
  def setProperty(property: `type`, value: fromMin): Unit = js.native
  def setProperty(property: `type`, value: single): Unit = js.native
  def setProperty(property: orientation, value: horizontal): Unit = js.native
  def setProperty(property: orientation, value: vertical): Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: max): Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: max, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: min): Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: min, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_step(property: step): Unit = js.native
  @JSName("setProperty")
  def setProperty_step(property: step, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_transientValue(property: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.transientValue, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonInvalidStep): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value, value: Double): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojslider", "ojSlider")
@js.native
object ojSlider extends js.Object {
  type ojAnimateEnd = CustomEvent
  type ojAnimateStart = CustomEvent
}

