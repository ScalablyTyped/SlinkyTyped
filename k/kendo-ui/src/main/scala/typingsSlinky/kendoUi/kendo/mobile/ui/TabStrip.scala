package typingsSlinky.kendoUi.kendo.mobile.ui

import typingsSlinky.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabStrip
  extends typingsSlinky.kendoUi.kendo.ui.Widget {
  
  def badge(tab: String, value: String): String = js.native
  def badge(tab: String, value: Boolean): String = js.native
  def badge(tab: Double, value: String): String = js.native
  def badge(tab: Double, value: Boolean): String = js.native
  
  def clear(): Unit = js.native
  
  def currentItem(): JQuery = js.native
  
  @JSName("options")
  var options_TabStrip: TabStripOptions = js.native
  
  def switchByFullUrl(url: String): Unit = js.native
  
  def switchTo(url: String): Unit = js.native
  def switchTo(url: Double): Unit = js.native
  
  var wrapper: JQuery = js.native
}
