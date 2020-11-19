package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressBar extends Widget {
  
  def enable(enable: Boolean): Unit = js.native
  
  @JSName("options")
  var options_ProgressBar: ProgressBarOptions = js.native
  
  var progressStatus: JQuery = js.native
  
  var progressWrapper: JQuery = js.native
  
  def value(): Double = js.native
  def value(value: Double): Unit = js.native
  
  var wrapper: JQuery = js.native
}
