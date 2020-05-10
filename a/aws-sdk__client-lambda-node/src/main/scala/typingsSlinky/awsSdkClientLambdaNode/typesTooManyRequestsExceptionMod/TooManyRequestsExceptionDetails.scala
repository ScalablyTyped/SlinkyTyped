package typingsSlinky.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod

import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.CallerRateLimitExceeded
import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ConcurrentInvocationLimitExceeded
import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.FunctionInvocationRateLimitExceeded
import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ReservedFunctionConcurrentInvocationLimitExceeded
import typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ReservedFunctionInvocationRateLimitExceeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooManyRequestsExceptionDetails extends js.Object {
  /**
    * _ThrottleReason shape
    */
  var Reason: js.UndefOr[
    ConcurrentInvocationLimitExceeded | FunctionInvocationRateLimitExceeded | ReservedFunctionConcurrentInvocationLimitExceeded | ReservedFunctionInvocationRateLimitExceeded | CallerRateLimitExceeded | String
  ] = js.native
  /**
    * _String shape
    */
  var Type: js.UndefOr[String] = js.native
  /**
    * _String shape
    */
  var message: js.UndefOr[String] = js.native
  /**
    * <p>The number of seconds the caller should wait before retrying.</p>
    */
  var retryAfterSeconds: js.UndefOr[String] = js.native
}

object TooManyRequestsExceptionDetails {
  @scala.inline
  def apply(): TooManyRequestsExceptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooManyRequestsExceptionDetails]
  }
  @scala.inline
  implicit class TooManyRequestsExceptionDetailsOps[Self <: TooManyRequestsExceptionDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReason(
      value: ConcurrentInvocationLimitExceeded | FunctionInvocationRateLimitExceeded | ReservedFunctionConcurrentInvocationLimitExceeded | ReservedFunctionInvocationRateLimitExceeded | CallerRateLimitExceeded | String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reason")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryAfterSeconds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryAfterSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryAfterSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryAfterSeconds")(js.undefined)
        ret
    }
  }
  
}

