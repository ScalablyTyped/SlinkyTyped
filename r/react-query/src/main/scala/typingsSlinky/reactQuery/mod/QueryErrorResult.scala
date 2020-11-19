package typingsSlinky.reactQuery.mod

import typingsSlinky.reactQuery.reactQueryStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryErrorResult[TResult]
  extends QueryResultBase[TResult]
     with QueryResult[TResult] {
  
  var data: js.UndefOr[TResult] = js.native
  
  @JSName("status")
  var status_QueryErrorResult: error = js.native
}
