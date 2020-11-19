package typingsSlinky.oracleOraclejet.ojmenuMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.anon.AriaFocusSkipLink
import typingsSlinky.oracleOraclejet.mod.baseComponent
import typingsSlinky.oracleOraclejet.ojmenuMod.ojMenu.OpenOptions
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.disabled
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.disabledChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojAction
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojAnimateEnd
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojAnimateStart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojBeforeOpen
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojClose
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojOpen
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.openOptions
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.openOptionsChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojMenu_ extends baseComponent[ojMenuSettableProperties] {
  
  @JSName("addEventListener")
  def addEventListener_disabledChanged(`type`: disabledChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_disabledChanged(
    `type`: disabledChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAction(`type`: ojAction, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAction(
    `type`: ojAction,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(`type`: ojAnimateEnd, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateEnd(
    `type`: ojAnimateEnd,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(`type`: ojAnimateStart, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAnimateStart(
    `type`: ojAnimateStart,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeOpen(`type`: ojBeforeOpen, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeOpen(
    `type`: ojBeforeOpen,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojClose(`type`: ojClose, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojClose(
    `type`: ojClose,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojOpen(`type`: ojOpen, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojOpen(
    `type`: ojOpen,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_openOptionsChanged(`type`: openOptionsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_openOptionsChanged(
    `type`: openOptionsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  
  var disabled: Boolean = js.native
  
  @JSName("getProperty")
  def getProperty_disabled(property: disabled): Boolean = js.native
  @JSName("getProperty")
  def getProperty_openOptions(property: openOptions): OpenOptions = js.native
  
  var onDisabledChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onOjAction: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onOjAnimateEnd: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onOjAnimateStart: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onOjBeforeOpen: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onOjClose: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onOjOpen: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onOpenOptionsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  def open(): Unit = js.native
  def open(event: js.UndefOr[scala.Nothing], openOptions: OpenOptions): Unit = js.native
  def open(event: js.Object): Unit = js.native
  def open(event: js.Object, openOptions: OpenOptions): Unit = js.native
  
  var openOptions: OpenOptions = js.native
  
  def setProperties(properties: ojMenuSettablePropertiesLenient): Unit = js.native
  
  @JSName("setProperty")
  def setProperty_disabled(property: disabled, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_openOptions(property: openOptions, value: OpenOptions): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AriaFocusSkipLink): Unit = js.native
  
  @JSName("translations")
  var translations_ojMenu_ : AriaFocusSkipLink = js.native
}
