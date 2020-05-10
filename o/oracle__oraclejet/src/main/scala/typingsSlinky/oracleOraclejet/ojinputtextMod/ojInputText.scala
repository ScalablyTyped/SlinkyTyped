package typingsSlinky.oracleOraclejet.ojinputtextMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.always
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.clearIcon
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.clearIconChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.conditional
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.converter
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.converterChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.email
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.list
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.listChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.never
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.number
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rawValueChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.search
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.tel
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.text
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.url
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valueChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.virtualKeyboard
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.virtualKeyboardChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojInputText
  extends inputBase[js.Any, ojInputTextSettableProperties, js.Any, js.Any] {
  var clearIcon: never | always | conditional = js.native
  var converter: Converter[_] | RegisteredConverter | Null = js.native
  var list: String = js.native
  var onClearIconChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onConverterChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onListChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojInputText: (js.Function1[CustomEvent, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojInputText: (js.Function1[CustomEvent, _]) | Null = js.native
  var onVirtualKeyboardChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var virtualKeyboard: auto | email | number | search | tel | text | url = js.native
  def addEventListener(`type`: clearIconChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: clearIconChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: rawValueChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: rawValueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: valueChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: valueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(`type`: virtualKeyboardChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: virtualKeyboardChanged,
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
  def addEventListener_listChanged(`type`: listChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_listChanged(
    `type`: listChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_clearIcon(property: clearIcon): never | always | conditional = js.native
  @JSName("getProperty")
  def getProperty_converter(property: converter): Converter[_] | RegisteredConverter | Null = js.native
  @JSName("getProperty")
  def getProperty_list(property: list): String = js.native
  @JSName("getProperty")
  def getProperty_virtualKeyboard(property: virtualKeyboard): auto | email | number | search | tel | text | url = js.native
  def setProperties(properties: ojInputTextSettablePropertiesLenient): Unit = js.native
  def setProperty(property: clearIcon, value: always): Unit = js.native
  def setProperty(property: clearIcon, value: conditional): Unit = js.native
  def setProperty(property: clearIcon, value: never): Unit = js.native
  def setProperty(property: virtualKeyboard, value: auto): Unit = js.native
  def setProperty(property: virtualKeyboard, value: email): Unit = js.native
  def setProperty(property: virtualKeyboard, value: number): Unit = js.native
  def setProperty(property: virtualKeyboard, value: search): Unit = js.native
  def setProperty(property: virtualKeyboard, value: tel): Unit = js.native
  def setProperty(property: virtualKeyboard, value: text): Unit = js.native
  def setProperty(property: virtualKeyboard, value: url): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: Converter[_]): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: RegisteredConverter): Unit = js.native
  @JSName("setProperty")
  def setProperty_list(property: list, value: String): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojinputtext", "ojInputText")
@js.native
object ojInputText extends js.Object {
  type ojAnimateEnd = CustomEvent
  type ojAnimateStart = CustomEvent
}

