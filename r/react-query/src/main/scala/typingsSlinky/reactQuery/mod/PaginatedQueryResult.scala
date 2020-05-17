package typingsSlinky.reactQuery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactQuery.mod.PaginatedQueryLoadingResult[TResult]
  - typingsSlinky.reactQuery.mod.PaginatedQueryErrorResult[TResult]
  - typingsSlinky.reactQuery.mod.PaginatedQuerySuccessResult[TResult]
*/
trait PaginatedQueryResult[TResult] extends js.Object

object PaginatedQueryResult {
  @scala.inline
  implicit def apply[TResult](value: PaginatedQueryErrorResult[TResult]): PaginatedQueryResult[TResult] = value.asInstanceOf[PaginatedQueryResult[TResult]]
  @scala.inline
  implicit def apply[TResult](value: PaginatedQueryLoadingResult[TResult]): PaginatedQueryResult[TResult] = value.asInstanceOf[PaginatedQueryResult[TResult]]
  @scala.inline
  implicit def apply[TResult](value: PaginatedQuerySuccessResult[TResult]): PaginatedQueryResult[TResult] = value.asInstanceOf[PaginatedQueryResult[TResult]]
}

