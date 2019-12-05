package typingsSlinky.atOracleOraclejet.ojeditablevalueMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atOracleOraclejet.Anon_ConverterHint
import typingsSlinky.atOracleOraclejet.Anon_Definition
import typingsSlinky.atOracleOraclejet.Anon_Instruction
import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.baseComponent
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.describedBy
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.describedByChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.disabled
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.disabledChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.displayOptions
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.displayOptionsChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.help
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.helpChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.helpHints
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.helpHintsChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.invalidHidden
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.invalidShown
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.labelHint
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.labelHintChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.messagesCustom
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.messagesCustomChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ojAnimateEnd
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ojAnimateStart
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.pending
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.validChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.value
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.valueChanged
import typingsSlinky.atOracleOraclejet.ojmessagingMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait editableValue[V, SP /* <: editableValueSettableProperties[V, SV, RV] */, SV, RV] extends baseComponent[SP] {
  var describedBy: String | Null = js.native
  var disabled: Boolean = js.native
  var displayOptions: Anon_ConverterHint = js.native
  var help: Anon_Instruction = js.native
  var helpHints: Anon_Definition = js.native
  var labelHint: String = js.native
  var messagesCustom: js.Array[^] = js.native
  var onDescribedByChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDisabledChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onDisplayOptionsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHelpChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onHelpHintsChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onLabelHintChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onMessagesCustomChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjAnimateEnd: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjAnimateStart: (js.Function1[CustomEvent, _]) | Null = js.native
  var onValidChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onValueChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  val valid: typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.valid | pending | invalidHidden | invalidShown = js.native
  var value: V = js.native
  def addEventListener(`type`: validChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: validChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_describedByChanged(`type`: describedByChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_describedByChanged(
    `type`: describedByChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_disabledChanged(`type`: disabledChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_disabledChanged(
    `type`: disabledChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_displayOptionsChanged(`type`: displayOptionsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_displayOptionsChanged(
    `type`: displayOptionsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_helpChanged(`type`: helpChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_helpChanged(
    `type`: helpChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_helpHintsChanged(`type`: helpHintsChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_helpHintsChanged(
    `type`: helpHintsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelHintChanged(`type`: labelHintChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelHintChanged(
    `type`: labelHintChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messagesCustomChanged(`type`: messagesCustomChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messagesCustomChanged(
    `type`: messagesCustomChanged,
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
  def addEventListener_valueChanged(`type`: valueChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_valueChanged(
    `type`: valueChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_describedBy(property: describedBy): String | Null = js.native
  @JSName("getProperty")
  def getProperty_disabled(property: disabled): Boolean = js.native
  @JSName("getProperty")
  def getProperty_displayOptions(property: displayOptions): Anon_ConverterHint = js.native
  @JSName("getProperty")
  def getProperty_help(property: help): Anon_Instruction = js.native
  @JSName("getProperty")
  def getProperty_helpHints(property: helpHints): Anon_Definition = js.native
  @JSName("getProperty")
  def getProperty_labelHint(property: labelHint): String = js.native
  @JSName("getProperty")
  def getProperty_messagesCustom(property: messagesCustom): js.Array[^] = js.native
  @JSName("getProperty")
  def getProperty_valid(property: typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.valid): typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.valid | pending | invalidHidden | invalidShown = js.native
  @JSName("getProperty")
  def getProperty_value(property: value): V = js.native
  def reset(): Unit = js.native
  def setProperties(properties: editableValueSettablePropertiesLenient[V, SV, RV]): Unit = js.native
  def setProperty(property: typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.valid, value: invalidHidden): Unit = js.native
  def setProperty(property: typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.valid, value: invalidShown): Unit = js.native
  def setProperty(property: typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.valid, value: pending): Unit = js.native
  @JSName("setProperty")
  def setProperty_describedBy(property: describedBy): Unit = js.native
  @JSName("setProperty")
  def setProperty_describedBy(property: describedBy, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_disabled(property: disabled, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_displayOptions(property: displayOptions, value: Anon_ConverterHint): Unit = js.native
  @JSName("setProperty")
  def setProperty_help(property: help, value: Anon_Instruction): Unit = js.native
  @JSName("setProperty")
  def setProperty_helpHints(property: helpHints, value: Anon_Definition): Unit = js.native
  @JSName("setProperty")
  def setProperty_labelHint(property: labelHint, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_messagesCustom(property: messagesCustom, value: js.Array[^]): Unit = js.native
  @JSName("setProperty")
  def setProperty_valid(
    property: typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.valid,
    value: typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.valid
  ): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value, value: SV): Unit = js.native
  def showMessages(): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojeditablevalue", "editableValue")
@js.native
object editableValue extends js.Object {
  type ojAnimateEnd = CustomEvent
  type ojAnimateStart = CustomEvent
}

