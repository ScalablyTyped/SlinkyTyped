package typingsSlinky.reactQuery.mod

import typingsSlinky.reactQuery.reactQueryStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaginatedQueryErrorResult[TResult]
  extends QueryResultBase[TResult]
     with PaginatedQueryResult[TResult] {
  
   // even when error, data can have stale data
  var latestData: js.UndefOr[TResult] = js.native
  
  var resolvedData: js.UndefOr[TResult] = js.native
  
  @JSName("status")
  var status_PaginatedQueryErrorResult: error = js.native
}
