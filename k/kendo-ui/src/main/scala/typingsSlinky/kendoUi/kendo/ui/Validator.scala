package typingsSlinky.kendoUi.kendo.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Validator extends Widget {
  
  def errors(): js.Any = js.native
  
  def hideMessages(): Unit = js.native
  
  def hideValidationSummary(): Unit = js.native
  
  @JSName("options")
  var options_Validator: ValidatorOptions = js.native
  
  def showValidationSummary(): Unit = js.native
  
  def validate(): Boolean = js.native
  
  def validateInput(input: JQuery): Boolean = js.native
  def validateInput(input: Element): Boolean = js.native
  
  var wrapper: JQuery = js.native
}
