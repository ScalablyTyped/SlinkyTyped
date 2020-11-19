package typingsSlinky.oracleOraclejet.ojdvtBaseMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.anon.LabelCountWithTotal
import typingsSlinky.oracleOraclejet.mod.baseComponent
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.trackResize
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.trackResizeChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dvtBaseComponent[SP /* <: dvtBaseComponentSettableProperties */] extends baseComponent[SP] {
  
  def addEventListener(`type`: trackResizeChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: trackResizeChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  
  @JSName("getProperty")
  def getProperty_trackResize(property: trackResize): on | off = js.native
  
  var onTrackResizeChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  def setProperties(properties: dvtBaseComponentSettablePropertiesLenient): Unit = js.native
  
  def setProperty(property: trackResize, value: off): Unit = js.native
  def setProperty(property: trackResize, value: on): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: LabelCountWithTotal): Unit = js.native
  
  var trackResize: on | off = js.native
  
  @JSName("translations")
  var translations_dvtBaseComponent: LabelCountWithTotal = js.native
}
