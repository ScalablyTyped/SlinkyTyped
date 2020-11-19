package typingsSlinky.jqueryElang

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IELangBase extends js.Object {
  
  def appendAsLastChild(node: JQuery[HTMLElement], element: JQuery[HTMLElement]): JQuery[HTMLElement] = js.native
  
  def createContent(): Unit = js.native
  
  def createRadioGroup(
    node: JQuery[HTMLElement],
    isMethodAppend: Boolean,
    buttonNumber: Double,
    defaultButton: Double,
    btnLabels: js.Array[String],
    clickHandler: js.Function
  ): Unit = js.native
  def createRadioGroup(
    node: JQuery[HTMLElement],
    isMethodAppend: Boolean,
    buttonNumber: Double,
    defaultButton: Double,
    btnLabels: js.Array[String],
    clickHandler: js.Function,
    btnTooltips: js.Array[String]
  ): Unit = js.native
  
  var defaults: IELangBaseDefaults = js.native
  
  var delegates: js.Any = js.native
  
  var description: String = js.native
  
  var element: JQuery[HTMLElement] = js.native
  
  var events: js.Any = js.native
  
  def getLastChild(node: JQuery[HTMLElement]): JQuery[HTMLElement] = js.native
  
  def initialize(target: HTMLElement, options: js.Any): Unit = js.native
  
  def isRdoChecked(eSrc: HTMLElement, rdoId: String): Boolean = js.native
  
  var name: String = js.native
  
  var options: js.Any = js.native
  
  def processCommand(command: String): JQuery[HTMLElement] = js.native
  
  def setOptions(options: js.Any): Unit = js.native
}
