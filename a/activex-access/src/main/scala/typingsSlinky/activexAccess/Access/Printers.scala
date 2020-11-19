package typingsSlinky.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Printers extends js.Object {
  
  def apply(Index: String): Printer = js.native
  def apply(Index: Double): Printer = js.native
  
  val Application: typingsSlinky.activexAccess.Access.Application = js.native
  
  val Count: Double = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  def Item(Index: String): Printer = js.native
  def Item(Index: Double): Printer = js.native
  
  val Parent: js.Any = js.native
}
