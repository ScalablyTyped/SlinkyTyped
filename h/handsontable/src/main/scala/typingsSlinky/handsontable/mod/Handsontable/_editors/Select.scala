package typingsSlinky.handsontable.mod.Handsontable._editors

import typingsSlinky.handsontable.mod.Handsontable.CellValue
import typingsSlinky.handsontable.mod.Handsontable.RowObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Select extends Base {
  
  def prepareOptions(): Unit = js.native
  def prepareOptions(optionsToPrepare: js.Array[CellValue]): Unit = js.native
  def prepareOptions(optionsToPrepare: RowObject): Unit = js.native
  
  def refreshDimensions(): Unit = js.native
  
  def refreshValue(): Unit = js.native
  
  def registerHooks(): Unit = js.native
}
