package typingsSlinky.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Forms extends js.Object {
  
  def apply(Index: String): Form = js.native
  def apply(Index: Double): Form = js.native
  
  val Application: typingsSlinky.activexAccess.Access.Application = js.native
  
  val Count: Double = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  def Item(Index: String): Form = js.native
  def Item(Index: Double): Form = js.native
  
  val Parent: js.Any = js.native
}
