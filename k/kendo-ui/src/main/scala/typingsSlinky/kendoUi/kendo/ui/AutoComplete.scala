package typingsSlinky.kendoUi.kendo.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.kendoUi.JQuery
import typingsSlinky.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoComplete extends Widget {
  
  def close(): Unit = js.native
  
  def dataItem(index: Element): js.Any = js.native
  def dataItem(index: Double): js.Any = js.native
  def dataItem(index: JQuery): js.Any = js.native
  
  var dataSource: DataSource = js.native
  
  def enable(enable: Boolean): Unit = js.native
  
  def focus(): Unit = js.native
  
  def items(): js.Any = js.native
  
  var list: JQuery = js.native
  
  @JSName("options")
  var options_AutoComplete: AutoCompleteOptions = js.native
  
  var popup: Popup = js.native
  
  def readonly(readonly: Boolean): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def search(word: String): Unit = js.native
  
  def select(item: String): Unit = js.native
  def select(item: Element): Unit = js.native
  def select(item: JQuery): Unit = js.native
  
  def setDataSource(dataSource: DataSource): Unit = js.native
  
  def suggest(value: String): Unit = js.native
  
  var ul: JQuery = js.native
  
  def value(): String = js.native
  def value(value: String): Unit = js.native
  
  var wrapper: JQuery = js.native
}
