package typingsSlinky.atOracleOraclejet.ojtimeaxisMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atOracleOraclejet.Anon_ComponentNameLabelAndValue
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.converter
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.converterChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.days
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.end
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.endChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.hours
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.minutes
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.months
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.quarters
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.scale
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.scaleChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.seconds
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.start
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.startChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.translations
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.weeks
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.years
import typingsSlinky.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponent
import typingsSlinky.atOracleOraclejet.ojtimeaxisMod.ojTimeAxis.Converters
import typingsSlinky.atOracleOraclejet.ojvalidationDashBaseMod.Converter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("ojTimeAxis")
@js.native
trait ojTimeAxis_ extends dvtBaseComponent[ojTimeAxisSettableProperties] {
  var converter: Converters | Converter[String] = js.native
  var end: String = js.native
  var onConverterChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onEndChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onScaleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onStartChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var scale: seconds | minutes | hours | days | weeks | months | quarters | years = js.native
  var start: String = js.native
  @JSName("translations")
  var translations_ojTimeAxis_ : Anon_ComponentNameLabelAndValue = js.native
  def addEventListener(`type`: scaleChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: scaleChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_converterChanged(`type`: converterChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_converterChanged(
    `type`: converterChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_endChanged(`type`: endChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_endChanged(
    `type`: endChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_startChanged(`type`: startChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_startChanged(
    `type`: startChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_converter(property: converter): Converters | Converter[String] = js.native
  @JSName("getProperty")
  def getProperty_end(property: end): String = js.native
  @JSName("getProperty")
  def getProperty_scale(property: scale): seconds | minutes | hours | days | weeks | months | quarters | years = js.native
  @JSName("getProperty")
  def getProperty_start(property: start): String = js.native
  def setProperties(properties: ojTimeAxisSettablePropertiesLenient): Unit = js.native
  def setProperty(property: scale, value: days): Unit = js.native
  def setProperty(property: scale, value: hours): Unit = js.native
  def setProperty(property: scale, value: minutes): Unit = js.native
  def setProperty(property: scale, value: months): Unit = js.native
  def setProperty(property: scale, value: quarters): Unit = js.native
  def setProperty(property: scale, value: seconds): Unit = js.native
  def setProperty(property: scale, value: weeks): Unit = js.native
  def setProperty(property: scale, value: years): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: Converters): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: Converter[String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_end(property: end, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_start(property: start, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: Anon_ComponentNameLabelAndValue): Unit = js.native
}

