package typingsSlinky.oracleOraclejet.ojswipeactionsMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.AnonAriaHideActionsDescription
import typingsSlinky.oracleOraclejet.mod.baseComponent
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ojAction
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojSwipeActions extends baseComponent[ojSwipeActionsSettableProperties] {
  var onOjAction: (js.Function1[CustomEvent, _]) | Null = js.native
  @JSName("translations")
  var translations_ojSwipeActions: AnonAriaHideActionsDescription = js.native
  @JSName("addEventListener")
  def addEventListener_ojAction(`type`: ojAction, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ojAction(
    `type`: ojAction,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  def setProperties(properties: ojSwipeActionsSettablePropertiesLenient): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonAriaHideActionsDescription): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojswipeactions", "ojSwipeActions")
@js.native
object ojSwipeActions extends js.Object {
  type ojAction = CustomEvent
}

