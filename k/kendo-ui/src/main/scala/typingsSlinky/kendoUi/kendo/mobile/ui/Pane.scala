package typingsSlinky.kendoUi.kendo.mobile.ui

import typingsSlinky.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pane
  extends typingsSlinky.kendoUi.kendo.ui.Widget {
  
  def hideLoading(): Unit = js.native
  
  def navigate(url: String, transition: String): Unit = js.native
  
  @JSName("options")
  var options_Pane: PaneOptions = js.native
  
  def replace(url: String, transition: String): Unit = js.native
  
  def showLoading(): Unit = js.native
  
  def view(): View = js.native
  
  var wrapper: JQuery = js.native
}
