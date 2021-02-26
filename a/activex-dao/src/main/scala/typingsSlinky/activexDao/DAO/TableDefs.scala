package typingsSlinky.activexDao.DAO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableDefs extends StObject {
  
  def apply(Item: String): TableDef = js.native
  def apply(Item: Double): TableDef = js.native
  
  def Append(TableDef: TableDef): Unit = js.native
  
  val Count: Double = js.native
  
  def Delete(Name: String): Unit = js.native
  
  def Item(Item: String): TableDef = js.native
  def Item(Item: Double): TableDef = js.native
  
  def Refresh(): Unit = js.native
}
