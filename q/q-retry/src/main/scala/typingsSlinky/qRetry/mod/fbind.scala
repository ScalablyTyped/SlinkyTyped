package typingsSlinky.qRetry.mod

import typingsSlinky.q.mod.IWhenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("q-retry", "fbind")
@js.native
object fbind extends js.Object {
  
  def apply[T](method: js.Function1[/* repeated */ js.Any, IWhenable[T]], args: js.Any*): js.Function1[/* repeated */ js.Any, typingsSlinky.q.mod.Promise[T]] = js.native
}
