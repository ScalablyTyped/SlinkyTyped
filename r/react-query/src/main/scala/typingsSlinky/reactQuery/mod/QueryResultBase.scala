package typingsSlinky.reactQuery.mod

import typingsSlinky.reactQuery.anon.Force
import typingsSlinky.reactQuery.reactQueryStrings.error
import typingsSlinky.reactQuery.reactQueryStrings.loading
import typingsSlinky.reactQuery.reactQueryStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryResultBase[TResult] extends js.Object {
  
  var error: Null | js.Any = js.native
  
  var failureCount: Double = js.native
  
  var isFetching: Boolean = js.native
  
  def refetch(): js.Promise[TResult] = js.native
  def refetch(hasForceThrowOnError: Force): js.Promise[TResult] = js.native
  
  var status: loading | error | success = js.native
}
