package typingsSlinky.oracleOraclejet.ojtrainMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.AnonMessageType
import typingsSlinky.oracleOraclejet.mod.baseComponent
import typingsSlinky.oracleOraclejet.ojtrainMod.ojTrain.Step
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojBeforeDeselect
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojBeforeSelect
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojDeselect
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojSelect
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectedStep
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.selectedStepChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.steps
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.stepsChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojTrain_ extends baseComponent[ojTrainSettableProperties] {
  var onOjBeforeDeselect: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeSelect: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjDeselect: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjSelect: (js.Function1[CustomEvent, _]) | Null = js.native
  var onSelectedStepChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onStepsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var selectedStep: String = js.native
  var steps: js.Array[Step] = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeDeselect(`type`: ojBeforeDeselect, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeDeselect(
    `type`: ojBeforeDeselect,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeSelect(`type`: ojBeforeSelect, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeSelect(
    `type`: ojBeforeSelect,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDeselect(`type`: ojDeselect, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojDeselect(
    `type`: ojDeselect,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSelect(`type`: ojSelect, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojSelect(
    `type`: ojSelect,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectedStepChanged(`type`: selectedStepChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectedStepChanged(
    `type`: selectedStepChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stepsChanged(`type`: stepsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stepsChanged(
    `type`: stepsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def getNextSelectableStep(): String | Null = js.native
  def getPreviousSelectableStep(): String | Null = js.native
  @JSName("getProperty")
  def getProperty_selectedStep(property: selectedStep): String = js.native
  @JSName("getProperty")
  def getProperty_steps(property: steps): js.Array[Step] = js.native
  def getStep(id: String): Step | Null = js.native
  def setProperties(properties: ojTrainSettablePropertiesLenient): Unit = js.native
  @JSName("setProperty")
  def setProperty_selectedStep(property: selectedStep, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_steps(property: steps, value: js.Array[Step]): Unit = js.native
  def updateStep(id: String, stepProperties: AnonMessageType): Unit = js.native
}

