package typingsSlinky.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Headers extends js.Object {
  
  def append(name: String, value: String): Unit = js.native
  
  def delete(name: String): Unit = js.native
  
  def forEach(callback: js.Function): Unit = js.native
  def forEach(callback: js.Function, thisArg: js.Any): Unit = js.native
  
  def get(name: String): String | Null = js.native
  
  def has(name: String): Boolean = js.native
  
  def set(name: String, value: String): Unit = js.native
}
