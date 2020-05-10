package typingsSlinky.oracleOraclejet.ojgaugeMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.Anon9
import typingsSlinky.oracleOraclejet.AnonSource
import typingsSlinky.oracleOraclejet.ojgaugeMod.ojRatingGauge.Threshold
import typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`0.5`
import typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`1`
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.changed
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.changedChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.changedState
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.changedStateChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.horizontal
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hoverState
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hoverStateChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.max
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.maxChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.meet
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.min
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.minChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.orientation
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.orientationChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.preserveAspectRatio
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.preserveAspectRatioChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.readonlyChanged_
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.readonly_
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectedState
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectedStateChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.step
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.stepChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.thresholds
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.thresholdsChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.tooltip
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.tooltipChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.transientValueChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.unselectedState
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.unselectedStateChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.value
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valueChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.vertical
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.visualEffects
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.visualEffectsChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojRatingGauge_ extends dvtBaseGauge[ojRatingGaugeSettableProperties] {
  var changed: Boolean = js.native
  var changedState: AnonSource = js.native
  var hoverState: AnonSource = js.native
  var max: Double = js.native
  var min: Double = js.native
  var onChangedChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onChangedStateChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHoverStateChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onMaxChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onMinChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOrientationChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onPreserveAspectRatioChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onReadonlyChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectedStateChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onStepChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onThresholdsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTooltipChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onTransientValueChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onUnselectedStateChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onValueChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onVisualEffectsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var orientation: vertical | horizontal = js.native
  var preserveAspectRatio: none | meet = js.native
  var readonly: Boolean = js.native
  var selectedState: AnonSource = js.native
  var step: `0.5` | `1` = js.native
  var thresholds: js.Array[Threshold] = js.native
  var tooltip: Anon9 = js.native
  val transientValue: Double | Null = js.native
  var unselectedState: AnonSource = js.native
  var value: Double | Null = js.native
  var visualEffects: none | auto = js.native
  def addEventListener(`type`: orientationChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: orientationChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: preserveAspectRatioChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]
  ): Unit = js.native
  def addEventListener(
    `type`: preserveAspectRatioChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: stepChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: stepChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: visualEffectsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: visualEffectsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_changedChanged(`type`: changedChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_changedChanged(
    `type`: changedChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_changedStateChanged(`type`: changedStateChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_changedStateChanged(
    `type`: changedStateChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hoverStateChanged(`type`: hoverStateChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hoverStateChanged(
    `type`: hoverStateChanged,
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
  def addEventListener_readonlyChanged(`type`: readonlyChanged_, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readonlyChanged(
    `type`: readonlyChanged_,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectedStateChanged(`type`: selectedStateChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectedStateChanged(
    `type`: selectedStateChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_thresholdsChanged(`type`: thresholdsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_thresholdsChanged(
    `type`: thresholdsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(`type`: tooltipChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tooltipChanged(
    `type`: tooltipChanged,
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
  @JSName("addEventListener")
  def addEventListener_unselectedStateChanged(`type`: unselectedStateChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unselectedStateChanged(
    `type`: unselectedStateChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(`type`: valueChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(
    `type`: valueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_changed(property: changed): Boolean = js.native
  @JSName("getProperty")
  def getProperty_changedState(property: changedState): AnonSource = js.native
  @JSName("getProperty")
  def getProperty_hoverState(property: hoverState): AnonSource = js.native
  @JSName("getProperty")
  def getProperty_max(property: max): Double = js.native
  @JSName("getProperty")
  def getProperty_min(property: min): Double = js.native
  @JSName("getProperty")
  def getProperty_orientation(property: orientation): vertical | horizontal = js.native
  @JSName("getProperty")
  def getProperty_preserveAspectRatio(property: preserveAspectRatio): none | meet = js.native
  @JSName("getProperty")
  def getProperty_readonly(property: readonly_): Boolean = js.native
  @JSName("getProperty")
  def getProperty_selectedState(property: selectedState): AnonSource = js.native
  @JSName("getProperty")
  def getProperty_step(property: step): `0.5` | `1` = js.native
  @JSName("getProperty")
  def getProperty_thresholds(property: thresholds): js.Array[Threshold] = js.native
  @JSName("getProperty")
  def getProperty_tooltip(property: tooltip): Anon9 = js.native
  @JSName("getProperty")
  def getProperty_transientValue(property: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.transientValue): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_unselectedState(property: unselectedState): AnonSource = js.native
  @JSName("getProperty")
  def getProperty_value(property: value): Double | Null = js.native
  @JSName("getProperty")
  def getProperty_visualEffects(property: visualEffects): none | auto = js.native
  def setProperties(properties: ojRatingGaugeSettablePropertiesLenient): Unit = js.native
  def setProperty(property: orientation, value: horizontal): Unit = js.native
  def setProperty(property: orientation, value: vertical): Unit = js.native
  def setProperty(property: preserveAspectRatio, value: meet): Unit = js.native
  def setProperty(property: preserveAspectRatio, value: none): Unit = js.native
  def setProperty(property: step, value: `0.5`): Unit = js.native
  def setProperty(property: step, value: `1`): Unit = js.native
  def setProperty(property: visualEffects, value: auto): Unit = js.native
  def setProperty(property: visualEffects, value: none): Unit = js.native
  @JSName("setProperty")
  def setProperty_changed(property: changed, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_changedState(property: changedState, value: AnonSource): Unit = js.native
  @JSName("setProperty")
  def setProperty_hoverState(property: hoverState, value: AnonSource): Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: max, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_min(property: min, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_readonly(property: readonly_, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectedState(property: selectedState, value: AnonSource): Unit = js.native
  @JSName("setProperty")
  def setProperty_thresholds(property: thresholds, value: js.Array[Threshold]): Unit = js.native
  @JSName("setProperty")
  def setProperty_tooltip(property: tooltip, value: Anon9): Unit = js.native
  @JSName("setProperty")
  def setProperty_transientValue(property: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.transientValue): Unit = js.native
  @JSName("setProperty")
  def setProperty_transientValue(property: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.transientValue, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_unselectedState(property: unselectedState, value: AnonSource): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value, value: Double): Unit = js.native
}

