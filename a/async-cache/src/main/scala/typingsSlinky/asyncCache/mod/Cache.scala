package typingsSlinky.asyncCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cache[T] extends js.Object {
  
  def del(key: String): Unit = js.native
  
  def get(key: String, cb: js.Function2[/* error */ js.Any, /* value */ T, Unit]): Unit = js.native
  
  def has(key: String): Boolean = js.native
  
  val itemCount: Double = js.native
  
  def keys(): js.Array[String] = js.native
  
  def peek(key: String): js.UndefOr[T] = js.native
  
  def reset(): Unit = js.native
  
  def set(key: String, value: T): Boolean = js.native
  def set(key: String, value: T, maxAge: Double): Boolean = js.native
}
