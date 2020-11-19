package typingsSlinky.activexDao.DAO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connections extends js.Object {
  
  def apply(Item: String): Connection = js.native
  def apply(Item: Double): Connection = js.native
  
  val Count: Double = js.native
  
  def Item(Item: String): Connection = js.native
  def Item(Item: Double): Connection = js.native
  
  def Refresh(): Unit = js.native
}
