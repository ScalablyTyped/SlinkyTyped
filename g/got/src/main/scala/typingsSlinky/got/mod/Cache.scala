package typingsSlinky.got.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cache extends js.Object {
  
  def delete(key: String): js.Any = js.native
  
  def get(key: String): js.Any = js.native
  
  def set(key: String, value: js.Any): js.Any = js.native
  def set(key: String, value: js.Any, ttl: Double): js.Any = js.native
}
