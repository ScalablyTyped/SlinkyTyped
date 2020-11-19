package typingsSlinky.oracleOraclejet.ojlabelMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.oracleOraclejet.anon.DefinitionSource
import typingsSlinky.oracleOraclejet.anon.TooltipHelp
import typingsSlinky.oracleOraclejet.mod.baseComponent
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.`for`
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.forChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.help
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.helpChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.labelId
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.labelIdChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.showRequired
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.showRequiredChanged
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojLabel extends baseComponent[ojLabelSettableProperties] {
  
  @JSName("addEventListener")
  def addEventListener_forChanged(`type`: forChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_forChanged(
    `type`: forChanged,
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
  def addEventListener_labelIdChanged(`type`: labelIdChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_labelIdChanged(
    `type`: labelIdChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_showRequiredChanged(`type`: showRequiredChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_showRequiredChanged(
    `type`: showRequiredChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  
  var `for`: String | Null = js.native
  
  @JSName("getProperty")
  def getProperty_for(property: `for`): String | Null = js.native
  @JSName("getProperty")
  def getProperty_help(property: help): DefinitionSource = js.native
  @JSName("getProperty")
  def getProperty_labelId(property: labelId): String | Null = js.native
  @JSName("getProperty")
  def getProperty_showRequired(property: showRequired): Boolean | Null = js.native
  
  var help: DefinitionSource = js.native
  
  var labelId: String | Null = js.native
  
  var onForChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onHelpChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onLabelIdChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  var onShowRequiredChanged: (js.Function1[CustomEvent, _]) | Null = js.native
  
  def setProperties(properties: ojLabelSettablePropertiesLenient): Unit = js.native
  
  @JSName("setProperty")
  def setProperty_for(property: `for`): Unit = js.native
  @JSName("setProperty")
  def setProperty_for(property: `for`, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_help(property: help, value: DefinitionSource): Unit = js.native
  @JSName("setProperty")
  def setProperty_labelId(property: labelId): Unit = js.native
  @JSName("setProperty")
  def setProperty_labelId(property: labelId, value: String): Unit = js.native
  @JSName("setProperty")
  def setProperty_showRequired(property: showRequired): Unit = js.native
  @JSName("setProperty")
  def setProperty_showRequired(property: showRequired, value: Boolean): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: TooltipHelp): Unit = js.native
  
  var showRequired: Boolean | Null = js.native
  
  @JSName("translations")
  var translations_ojLabel: TooltipHelp = js.native
}
