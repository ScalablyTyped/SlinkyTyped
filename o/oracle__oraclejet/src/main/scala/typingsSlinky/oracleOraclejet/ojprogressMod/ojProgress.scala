package typingsSlinky.oracleOraclejet.ojprogressMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.anon.AriaIndeterminateProgressText
import typingsSlinky.oracleOraclejet.mod.baseComponent
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.`type`
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.bar
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.circle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.max
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.maxChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.typeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.value
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valueChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojProgress extends baseComponent[ojProgressSettableProperties] {
  
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
  def addEventListener_valueChanged(`type`: valueChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(
    `type`: valueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  
  @JSName("getProperty")
  def getProperty_max(property: max): Double = js.native
  @JSName("getProperty")
  def getProperty_type(property: `type`): bar | circle = js.native
  @JSName("getProperty")
  def getProperty_value(property: value): Double = js.native
  
  var max: Double = js.native
  
  var onMaxChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onTypeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onValueChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  def setProperties(properties: ojProgressSettablePropertiesLenient): Unit = js.native
  
  def setProperty(property: `type`, value: bar): Unit = js.native
  def setProperty(property: `type`, value: circle): Unit = js.native
  @JSName("setProperty")
  def setProperty_max(property: max, value: Double): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AriaIndeterminateProgressText): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value, value: Double): Unit = js.native
  
  @JSName("translations")
  var translations_ojProgress: AriaIndeterminateProgressText = js.native
  
  var `type`: bar | circle = js.native
  
  var value: Double = js.native
}
