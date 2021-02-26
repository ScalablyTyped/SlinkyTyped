package typingsSlinky.activexExcel.Excel

import typingsSlinky.activexAdodb.ADODB.Recordset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryTables extends StObject {
  
  def apply(Index: String): QueryTable = js.native
  def apply(Index: Double): QueryTable = js.native
  
  def Add(Connection: String, Destination: Range): QueryTable = js.native
  def Add(Connection: String, Destination: Range, Sql: String): QueryTable = js.native
  def Add(Connection: Recordset, Destination: Range): QueryTable = js.native
  def Add(Connection: typingsSlinky.activexDao.DAO.Recordset, Destination: Range): QueryTable = js.native
  def Add(Connection: QueryTable, Destination: Range): QueryTable = js.native
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: String): QueryTable = js.native
  def Item(Index: Double): QueryTable = js.native
  
  val Parent: js.Any = js.native
  
  def _Default(Index: js.Any): QueryTable = js.native
}
