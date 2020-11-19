package typingsSlinky.kendoUi.kendo.ooxml

import typingsSlinky.kendoUi.JQueryPromise
import typingsSlinky.kendoUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Workbook extends Observable {
  
  var options: WorkbookOptions = js.native
  
  var sheets: js.Array[WorkbookSheet] = js.native
  
  def toDataURL(): String = js.native
  
  def toDataURLAsync(): JQueryPromise[_] = js.native
}
