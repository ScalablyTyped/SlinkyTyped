package typingsSlinky.oracleOraclejet.ojeditablevalueMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.anon.ConverterHint
import typingsSlinky.oracleOraclejet.anon.Definition
import typingsSlinky.oracleOraclejet.anon.Instruction
import typingsSlinky.oracleOraclejet.mod.baseComponent
import typingsSlinky.oracleOraclejet.ojmessagingMod.^
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.describedBy
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.describedByChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.disabled
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.disabledChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.displayOptions
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.displayOptionsChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.help
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.helpChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.helpHints
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.helpHintsChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.labelHint
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.labelHintChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.messagesCustom
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.messagesCustomChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojAnimateEnd
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojAnimateStart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.pending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.validChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.value
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valueChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait editableValue[V, SP /* <: editableValueSettableProperties[V, SV, RV] */, SV, RV] extends baseComponent[SP] {
  var describedBy: String | Null = js.native
  var disabled: Boolean = js.native
  var displayOptions: ConverterHint = js.native
  var help: Instruction = js.native
  var helpHints: Definition = js.native
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
  val valid: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown = js.native
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
  def getProperty_displayOptions(property: displayOptions): ConverterHint = js.native
  @JSName("getProperty")
  def getProperty_help(property: help): Instruction = js.native
  @JSName("getProperty")
  def getProperty_helpHints(property: helpHints): Definition = js.native
  @JSName("getProperty")
  def getProperty_labelHint(property: labelHint): String = js.native
  @JSName("getProperty")
  def getProperty_messagesCustom(property: messagesCustom): js.Array[^] = js.native
  @JSName("getProperty")
  def getProperty_valid(property: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid): typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown = js.native
  @JSName("getProperty")
  def getProperty_value(property: value): V = js.native
  def reset(): Unit = js.native
  def setProperties(properties: editableValueSettablePropertiesLenient[V, SV, RV]): Unit = js.native
  def setProperty(property: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid, value: invalidHidden): Unit = js.native
  def setProperty(property: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid, value: invalidShown): Unit = js.native
  def setProperty(property: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid, value: pending): Unit = js.native
  @JSName("setProperty")
  def setProperty_describedBy(property: describedBy): Unit = js.native
  @JSName("setProperty")
  def setProperty_describedBy(property: describedBy, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_disabled(property: disabled, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_displayOptions(property: displayOptions, value: ConverterHint): Unit = js.native
  @JSName("setProperty")
  def setProperty_help(property: help, value: Instruction): Unit = js.native
  @JSName("setProperty")
  def setProperty_helpHints(property: helpHints, value: Definition): Unit = js.native
  @JSName("setProperty")
  def setProperty_labelHint(property: labelHint, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_messagesCustom(property: messagesCustom, value: js.Array[^]): Unit = js.native
  @JSName("setProperty")
  def setProperty_valid(
    property: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid,
    value: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.valid
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

