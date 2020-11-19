package typingsSlinky.kendoUi.kendo.mobile

import typingsSlinky.kendoUi.kendo.Observable
import typingsSlinky.kendoUi.kendo.Router
import typingsSlinky.kendoUi.kendo.mobile.ui.Pane
import typingsSlinky.kendoUi.kendo.mobile.ui.Scroller
import typingsSlinky.kendoUi.kendo.mobile.ui.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Application extends Observable {
  
  def changeLoadingMessage(text: String): Unit = js.native
  
  def hideLoading(): Unit = js.native
  
  def init(): Unit = js.native
  def init(element: js.UndefOr[scala.Nothing], options: ApplicationOptions): Unit = js.native
  def init(element: js.Any): Unit = js.native
  def init(element: js.Any, options: ApplicationOptions): Unit = js.native
  
  def navigate(url: String): Unit = js.native
  def navigate(url: String, transition: String): Unit = js.native
  
  var options: ApplicationOptions = js.native
  
  var pane: Pane = js.native
  
  def replace(url: String): Unit = js.native
  def replace(url: String, transition: String): Unit = js.native
  
  var router: Router = js.native
  
  def scroller(): Scroller = js.native
  
  def showLoading(): Unit = js.native
  
  def view(): View = js.native
}
