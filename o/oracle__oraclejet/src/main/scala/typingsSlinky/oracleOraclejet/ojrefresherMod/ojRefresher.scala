package typingsSlinky.oracleOraclejet.ojrefresherMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.mod.baseComponent
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.refreshContentChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.target
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.targetChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.text
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.textChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.threshold
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.thresholdChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojRefresher extends baseComponent[ojRefresherSettableProperties] {
  
  @JSName("addEventListener")
  def addEventListener_refreshContentChanged(`type`: refreshContentChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_refreshContentChanged(
    `type`: refreshContentChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_targetChanged(`type`: targetChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_targetChanged(
    `type`: targetChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_textChanged(`type`: textChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_textChanged(
    `type`: textChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_thresholdChanged(`type`: thresholdChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_thresholdChanged(
    `type`: thresholdChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  
  @JSName("getProperty")
  def getProperty_target(property: target): Element = js.native
  @JSName("getProperty")
  def getProperty_text(property: text): String = js.native
  @JSName("getProperty")
  def getProperty_threshold(property: threshold): Double = js.native
  
  var onRefreshContentChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onTargetChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onTextChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onThresholdChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  def refreshContent(): js.Promise[_] = js.native
  
  def setProperties(properties: ojRefresherSettablePropertiesLenient): Unit = js.native
  
  @JSName("setProperty")
  def setProperty_target(property: target, value: Element): Unit = js.native
  @JSName("setProperty")
  def setProperty_text(property: text, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_threshold(property: threshold, value: Double): Unit = js.native
  
  var target: Element = js.native
  
  var text: String = js.native
  
  var threshold: Double = js.native
}
