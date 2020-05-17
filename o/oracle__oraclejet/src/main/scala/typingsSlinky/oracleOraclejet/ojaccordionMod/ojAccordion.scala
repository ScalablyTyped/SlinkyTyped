package typingsSlinky.oracleOraclejet.ojaccordionMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.anon.Id
import typingsSlinky.oracleOraclejet.mod.baseComponent
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.expanded
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.expandedChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.multiple
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.multipleChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojBeforeCollapse
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojBeforeExpand
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojCollapse
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojExpand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojAccordion extends baseComponent[ojAccordionSettableProperties] {
  var expanded: js.Array[Id] | Null = js.native
  var multiple: Boolean = js.native
  var onExpandedChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onMultipleChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeCollapse: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjBeforeExpand: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjCollapse: (js.Function1[CustomEvent, _]) | Null = js.native
  var onOjExpand: (js.Function1[CustomEvent, _]) | Null = js.native
  @JSName("addEventListener")
  def addEventListener_expandedChanged(`type`: expandedChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_expandedChanged(
    `type`: expandedChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_multipleChanged(`type`: multipleChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_multipleChanged(
    `type`: multipleChanged,
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
  def getProperty_expanded(property: expanded): js.Array[Id] | Null = js.native
  @JSName("getProperty")
  def getProperty_multiple(property: multiple): Boolean = js.native
  def setProperties(properties: ojAccordionSettablePropertiesLenient): Unit = js.native
  @JSName("setProperty")
  def setProperty_expanded(property: expanded): Unit = js.native
  @JSName("setProperty")
  def setProperty_expanded(property: expanded, value: js.Array[Double | Id | String]): Unit = js.native
  @JSName("setProperty")
  def setProperty_multiple(property: multiple, value: Boolean): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojaccordion", "ojAccordion")
@js.native
object ojAccordion extends js.Object {
  type ojBeforeCollapse = CustomEvent
  type ojBeforeExpand = CustomEvent
  type ojCollapse = CustomEvent
  type ojExpand = CustomEvent
}

