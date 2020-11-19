package typingsSlinky.fastMemoryCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemoryCache extends js.Object {
  
  def clear(): Unit = js.native
  
  def delete(key: String): Unit = js.native
  
  def get(key: String): js.Any = js.native
  
  def set(key: String, value: js.Any): Unit = js.native
  def set(key: String, value: js.Any, expireTime: Double): Unit = js.native
}
