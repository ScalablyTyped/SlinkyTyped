package typingsSlinky.pgFormat

import typingsSlinky.pgFormat.anon.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pg-format", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(fmt: String, args: js.Any*): String = js.native
  
  def config(): Unit = js.native
  def config(config: Pattern): Unit = js.native
  
  def ident(`val`: String): String = js.native
  def ident(`val`: js.Array[_]): String = js.native
  def ident(`val`: Boolean): String = js.native
  def ident(`val`: Double): String = js.native
  def ident(`val`: js.Date): String = js.native
  
  def literal(): String = js.native
  def literal(`val`: String): String = js.native
  def literal(`val`: js.Array[_]): String = js.native
  def literal(`val`: js.Object): String = js.native
  def literal(`val`: Boolean): String = js.native
  def literal(`val`: Double): String = js.native
  def literal(`val`: js.Date): String = js.native
  
  def string(): String = js.native
  def string(`val`: String): String = js.native
  def string(`val`: js.Array[_]): String = js.native
  def string(`val`: js.Object): String = js.native
  def string(`val`: Boolean): String = js.native
  def string(`val`: Double): String = js.native
  def string(`val`: js.Date): String = js.native
  
  def withArray(fmt: String, array: js.Array[_]): String = js.native
}
