package typingsSlinky.arangodb.queuesMod

import typingsSlinky.arangodb.anon.DocumentJob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobOptions extends js.Object {
  var backOff: js.UndefOr[(js.Function1[/* failureCount */ Double, Double]) | Double] = js.undefined
  var delayUntil: js.UndefOr[Double | js.Date] = js.undefined
  var failure: js.UndefOr[JobCallback] = js.undefined
  var maxFailures: js.UndefOr[Double] = js.undefined
  var repeatDelay: js.UndefOr[Double] = js.undefined
  var repeatTimes: js.UndefOr[Double] = js.undefined
  var repeatUntil: js.UndefOr[Double | js.Date] = js.undefined
  var success: js.UndefOr[JobCallback] = js.undefined
}

object JobOptions {
  @scala.inline
  def apply(
    backOff: (js.Function1[/* failureCount */ Double, Double]) | Double = null,
    delayUntil: Double | js.Date = null,
    failure: (/* result */ js.Any, /* jobData */ js.Any, /* job */ DocumentJob) => Unit = null,
    maxFailures: js.UndefOr[Double] = js.undefined,
    repeatDelay: js.UndefOr[Double] = js.undefined,
    repeatTimes: js.UndefOr[Double] = js.undefined,
    repeatUntil: Double | js.Date = null,
    success: (/* result */ js.Any, /* jobData */ js.Any, /* job */ DocumentJob) => Unit = null
  ): JobOptions = {
    val __obj = js.Dynamic.literal()
    if (backOff != null) __obj.updateDynamic("backOff")(backOff.asInstanceOf[js.Any])
    if (delayUntil != null) __obj.updateDynamic("delayUntil")(delayUntil.asInstanceOf[js.Any])
    if (failure != null) __obj.updateDynamic("failure")(js.Any.fromFunction3(failure))
    if (!js.isUndefined(maxFailures)) __obj.updateDynamic("maxFailures")(maxFailures.get.asInstanceOf[js.Any])
    if (!js.isUndefined(repeatDelay)) __obj.updateDynamic("repeatDelay")(repeatDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(repeatTimes)) __obj.updateDynamic("repeatTimes")(repeatTimes.get.asInstanceOf[js.Any])
    if (repeatUntil != null) __obj.updateDynamic("repeatUntil")(repeatUntil.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction3(success))
    __obj.asInstanceOf[JobOptions]
  }
}

