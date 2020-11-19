package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Form extends Widget {
  
  def clear(): Unit = js.native
  
  @JSName("options")
  var options_Form: FormOptions = js.native
  
  def setOptions(options: js.Any): Unit = js.native
  
  def validate(): Unit = js.native
  
  var wrapper: JQuery = js.native
}
