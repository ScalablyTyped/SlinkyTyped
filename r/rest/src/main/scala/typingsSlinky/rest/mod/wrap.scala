package typingsSlinky.rest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rest", "wrap")
@js.native
object wrap extends js.Object {
  
  def apply[T](interceptor: Interceptor[T]): Client = js.native
  def apply[T](interceptor: Interceptor[T], config: T): Client = js.native
}
