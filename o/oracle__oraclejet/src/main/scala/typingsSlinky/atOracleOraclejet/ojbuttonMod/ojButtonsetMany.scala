package typingsSlinky.atOracleOraclejet.ojbuttonMod

import org.scalajs.dom.raw.CustomEvent
import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.all
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.chroming
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.chromingChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.disabled
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.disabledChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.display
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.displayChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.focusManagement
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.focusManagementChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.full
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.half
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.icons
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.none
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.oneTabstop
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.outlined
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.value
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.valueChanged
import typingsSlinky.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojButtonsetMany extends ojButtonset[ojButtonsetManySettableProperties] {
  var chroming: full | half | outlined = js.native
  var disabled: Boolean = js.native
  var display: all | icons = js.native
  var focusManagement: oneTabstop | none = js.native
  var onChromingChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDisabledChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDisplayChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onFocusManagementChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onValueChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var value: js.Array[_] | Null = js.native
  def addEventListener(
    `type`: chromingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[full | half | outlined], _]
  ): Unit = js.native
  def addEventListener(
    `type`: chromingChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[full | half | outlined], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: displayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[all | icons], _]
  ): Unit = js.native
  def addEventListener(
    `type`: displayChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[all | icons], _],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: focusManagementChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[oneTabstop | none], _]
  ): Unit = js.native
  def addEventListener(
    `type`: focusManagementChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[oneTabstop | none], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_disabledChanged(
    `type`: disabledChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_disabledChanged(
    `type`: disabledChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(
    `type`: valueChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(
    `type`: valueChanged,
    listener: js.ThisFunction1[/* this */ org.scalajs.dom.raw.HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_chroming(property: chroming): full | half | outlined = js.native
  @JSName("getProperty")
  def getProperty_disabled(property: disabled): Boolean = js.native
  @JSName("getProperty")
  def getProperty_display(property: display): all | icons = js.native
  @JSName("getProperty")
  def getProperty_focusManagement(property: focusManagement): oneTabstop | none = js.native
  @JSName("getProperty")
  def getProperty_value(property: value): js.Array[_] | Null = js.native
  def setProperties(properties: ojButtonsetManySettablePropertiesLenient): Unit = js.native
  def setProperty(property: chroming, value: full): Unit = js.native
  def setProperty(property: chroming, value: half): Unit = js.native
  def setProperty(property: chroming, value: outlined): Unit = js.native
  def setProperty(property: display, value: all): Unit = js.native
  def setProperty(property: display, value: icons): Unit = js.native
  def setProperty(property: focusManagement, value: none): Unit = js.native
  def setProperty(property: focusManagement, value: oneTabstop): Unit = js.native
  @JSName("setProperty")
  def setProperty_disabled(property: disabled, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value, value: js.Array[_]): Unit = js.native
}

