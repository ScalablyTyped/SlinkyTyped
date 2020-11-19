package typingsSlinky.firebaseDatabase.anon

import typingsSlinky.firebaseDatabase.referenceMod.Reference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallOnrejected extends js.Object {
  
  def apply[TResult](): js.Promise[Reference | TResult] = js.native
  def apply[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): js.Promise[Reference | TResult] = js.native
}
