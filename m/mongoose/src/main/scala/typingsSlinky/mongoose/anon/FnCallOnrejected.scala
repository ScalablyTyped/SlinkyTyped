package typingsSlinky.mongoose.anon

import typingsSlinky.mongoose.mod.Connection_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallOnrejected extends js.Object {
  
  def apply[TResult](): js.Promise[Connection_ | TResult] = js.native
  def apply[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): js.Promise[Connection_ | TResult] = js.native
}
