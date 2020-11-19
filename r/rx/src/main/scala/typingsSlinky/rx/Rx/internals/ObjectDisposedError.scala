package typingsSlinky.rx.Rx.internals

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectDisposedError extends Error
object ObjectDisposedError {
  
  @scala.inline
  def apply(message: String, name: String): ObjectDisposedError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectDisposedError]
  }
}
