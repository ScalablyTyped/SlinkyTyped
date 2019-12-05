package typingsSlinky.reactDashAsync

import typingsSlinky.reactDashAsync.reactDashAsyncNumbers.`false`
import typingsSlinky.reactDashAsync.reactDashAsyncNumbers.`true`
import typingsSlinky.reactDashAsync.reactDashAsyncStrings.rejected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataErrorFalseFinishedAt[T] extends js.Object {
  var data: js.UndefOr[T] = js.undefined
  var error: js.Error
  var finishedAt: js.Date
  var isFulfilled: `false`
  var isInitial: `false`
  var isLoading: `false`
  var isPending: `false`
  var isRejected: `true`
  var isResolved: `false`
  var isSettled: `true`
  var startedAt: js.Date
  var status: rejected
  var value: js.Error
}

object Anon_DataErrorFalseFinishedAt {
  @scala.inline
  def apply[T](
    error: js.Error,
    finishedAt: js.Date,
    isFulfilled: `false`,
    isInitial: `false`,
    isLoading: `false`,
    isPending: `false`,
    isRejected: `true`,
    isResolved: `false`,
    isSettled: `true`,
    startedAt: js.Date,
    status: rejected,
    value: js.Error,
    data: T = null
  ): Anon_DataErrorFalseFinishedAt[T] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], finishedAt = finishedAt.asInstanceOf[js.Any], isFulfilled = isFulfilled.asInstanceOf[js.Any], isInitial = isInitial.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], isPending = isPending.asInstanceOf[js.Any], isRejected = isRejected.asInstanceOf[js.Any], isResolved = isResolved.asInstanceOf[js.Any], isSettled = isSettled.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataErrorFalseFinishedAt[T]]
  }
}

