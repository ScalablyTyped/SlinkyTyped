package typingsSlinky.algoliaClientCommon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@algolia/client-common", "createWaitablePromise")
@js.native
object createWaitablePromise extends js.Object {
  
  def apply[TResponse](promise: js.Promise[TResponse]): WaitablePromise[TResponse] = js.native
  def apply[TResponse](promise: js.Promise[TResponse], wait: Wait[TResponse]): WaitablePromise[TResponse] = js.native
}
