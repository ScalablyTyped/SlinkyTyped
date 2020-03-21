package typingsSlinky.qRetry.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "denodeify")
@js.native
object denodeify extends js.Object {
  def apply[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], args: js.Any*): js.Function1[/* repeated */ js.Any, typingsSlinky.q.mod.Promise[T]] = js.native
}

