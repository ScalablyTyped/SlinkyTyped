package typingsSlinky.mongoose.anon

import typingsSlinky.mongoose.mod.Connection_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends js.Object {
  
  def apply[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
  def apply[TResult1, TResult2](
    onfulfilled: js.UndefOr[scala.Nothing],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): js.Promise[TResult1 | TResult2] = js.native
  def apply[TResult1, TResult2](onfulfilled: js.Function1[/* value */ Connection_, TResult1 | js.Thenable[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
  def apply[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ Connection_, TResult1 | js.Thenable[TResult1]],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): js.Promise[TResult1 | TResult2] = js.native
  def apply[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
}
