package typingsSlinky.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Properties extends js.Object {
  
  def apply(Index: String): AccessProperty = js.native
  def apply(Index: Double): AccessProperty = js.native
  
  val Application: typingsSlinky.activexAccess.Access.Application = js.native
  
  val Count: Double = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  def Item(Index: String): AccessProperty = js.native
  def Item(Index: Double): AccessProperty = js.native
  
  val Parent: js.Any = js.native
}
