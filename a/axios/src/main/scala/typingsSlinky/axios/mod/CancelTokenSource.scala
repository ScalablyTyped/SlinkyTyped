package typingsSlinky.axios.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelTokenSource extends js.Object {
  
  def cancel(): Unit = js.native
  def cancel(message: String): Unit = js.native
  @JSName("cancel")
  var cancel_Original: Canceler = js.native
  
  var token: CancelToken = js.native
}
