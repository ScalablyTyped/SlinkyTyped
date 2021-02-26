package typingsSlinky.activexDao.DAO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Relations extends StObject {
  
  def apply(Item: String): Relation = js.native
  def apply(Item: Double): Relation = js.native
  
  def Append(Relation: Relation): Unit = js.native
  
  val Count: Double = js.native
  
  def Delete(Name: String): Unit = js.native
  
  def Item(Item: String): Relation = js.native
  def Item(Item: Double): Relation = js.native
  
  def Refresh(): Unit = js.native
}
