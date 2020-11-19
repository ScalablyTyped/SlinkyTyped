package typingsSlinky.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Operations extends js.Object {
  
  def apply(Index: String): Operation = js.native
  def apply(Index: Double): Operation = js.native
  
  val Count: Double = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  def Item(Index: String): Operation = js.native
  def Item(Index: Double): Operation = js.native
  
  val Parent: js.Any = js.native
}
