package typingsSlinky.reactQuery.mod

import typingsSlinky.reactQuery.reactQueryStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuerySuccessResult[TResult]
  extends QueryResultBase[TResult]
     with QueryResult[TResult] {
  var data: TResult = js.native
  @JSName("error")
  var error_QuerySuccessResult: Null = js.native
  @JSName("status")
  var status_QuerySuccessResult: success = js.native
}

