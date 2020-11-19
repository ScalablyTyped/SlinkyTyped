package typingsSlinky.isPromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("is-promise", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default[T, S](obj: S): /* is std.PromiseLike<T> */ Boolean = js.native
  def default[T, S](obj: js.Thenable[T]): /* is std.PromiseLike<T> */ Boolean = js.native
}
