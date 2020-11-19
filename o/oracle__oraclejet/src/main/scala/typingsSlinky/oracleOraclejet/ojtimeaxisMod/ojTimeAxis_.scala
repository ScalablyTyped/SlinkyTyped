package typingsSlinky.oracleOraclejet.ojtimeaxisMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.anon.LabelAndValue
import typingsSlinky.oracleOraclejet.ojdvtBaseMod.dvtBaseComponent
import typingsSlinky.oracleOraclejet.ojtimeaxisMod.ojTimeAxis.Converters
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.converter
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.converterChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.days
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.end
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.endChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hours
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.minutes
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.months
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.quarters
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.scale
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.scaleChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.seconds
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.start
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.startChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.weeks
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojTimeAxis_ extends dvtBaseComponent[ojTimeAxisSettableProperties] {
  
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
  
  var converter: Converters | Converter[String] = js.native
  
  var end: String = js.native
  
  @JSName("getProperty")
  def getProperty_converter(property: converter): Converters | Converter[String] = js.native
  @JSName("getProperty")
  def getProperty_end(property: end): String = js.native
  @JSName("getProperty")
  def getProperty_scale(property: scale): seconds | minutes | hours | days | weeks | months | quarters | years = js.native
  @JSName("getProperty")
  def getProperty_start(property: start): String = js.native
  
  var onConverterChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onEndChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onScaleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onStartChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var scale: seconds | minutes | hours | days | weeks | months | quarters | years = js.native
  
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
  def setProperty_translations(property: translations, value: LabelAndValue): Unit = js.native
  
  var start: String = js.native
  
  @JSName("translations")
  var translations_ojTimeAxis_ : LabelAndValue = js.native
}
