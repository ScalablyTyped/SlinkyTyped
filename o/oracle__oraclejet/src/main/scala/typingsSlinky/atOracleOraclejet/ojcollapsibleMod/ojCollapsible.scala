package typingsSlinky.atOracleOraclejet.ojcollapsibleMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.baseComponent
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.disabled
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.disabledChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.disclosureIcon
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.expandArea
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.expandAreaChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.expanded
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.expandedChanged
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.header
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeCollapse
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ojBeforeExpand
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ojCollapse
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ojExpand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojCollapsible extends baseComponent[ojCollapsibleSettableProperties] {
  var disabled: Boolean = js.native
  var expandArea: header | disclosureIcon = js.native
  var expanded: Boolean = js.native
  var onDisabledChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onExpandAreaChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onExpandedChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeCollapse: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeExpand: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjCollapse: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjExpand: (js.Function1[CustomEvent, _]) | Null = js.native
  def addEventListener(`type`: expandAreaChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  def addEventListener(
    `type`: expandAreaChanged,
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
  def addEventListener_expandedChanged(`type`: expandedChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_expandedChanged(
    `type`: expandedChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCollapse(`type`: ojBeforeCollapse, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeCollapse(
    `type`: ojBeforeCollapse,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeExpand(`type`: ojBeforeExpand, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojBeforeExpand(
    `type`: ojBeforeExpand,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCollapse(`type`: ojCollapse, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojCollapse(
    `type`: ojCollapse,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojExpand(`type`: ojExpand, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojExpand(
    `type`: ojExpand,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_disabled(property: disabled): Boolean = js.native
  @JSName("getProperty")
  def getProperty_expandArea(property: expandArea): header | disclosureIcon = js.native
  @JSName("getProperty")
  def getProperty_expanded(property: expanded): Boolean = js.native
  def setProperties(properties: ojCollapsibleSettablePropertiesLenient): Unit = js.native
  def setProperty(property: expandArea, value: disclosureIcon): Unit = js.native
  def setProperty(property: expandArea, value: header): Unit = js.native
  @JSName("setProperty")
  def setProperty_disabled(property: disabled, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_expanded(property: expanded, value: Boolean): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojcollapsible", "ojCollapsible")
@js.native
object ojCollapsible extends js.Object {
  type ojBeforeCollapse = CustomEvent
  type ojBeforeExpand = CustomEvent
  type ojCollapse = CustomEvent
  type ojExpand = CustomEvent
}

