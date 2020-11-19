package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Errors extends js.Object {
  
  def apply(Index: Double): Error = js.native
  def apply(Index: XlErrorChecks): Error = js.native
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: Double): Error = js.native
  def Item(Index: XlErrorChecks): Error = js.native
  
  val Parent: js.Any = js.native
  
  def _Default(Index: js.Any): Error = js.native
}
