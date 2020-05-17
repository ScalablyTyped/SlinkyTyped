package typingsSlinky.lambdaWrapper.anon

import typingsSlinky.awsLambda.handlerMod.ClientContext
import typingsSlinky.awsLambda.handlerMod.CognitoIdentity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<aws-lambda.aws-lambda.Context> */
@js.native
trait PartialContext extends js.Object {
  var awsRequestId: js.UndefOr[String] = js.native
  var callbackWaitsForEmptyEventLoop: js.UndefOr[Boolean] = js.native
  var clientContext: js.UndefOr[ClientContext] = js.native
  var done: js.UndefOr[js.Function0[Unit]] = js.native
  var fail: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
  var functionName: js.UndefOr[String] = js.native
  var functionVersion: js.UndefOr[String] = js.native
  var getRemainingTimeInMillis: js.UndefOr[js.Function0[Double]] = js.native
  var identity: js.UndefOr[CognitoIdentity] = js.native
  var invokedFunctionArn: js.UndefOr[String] = js.native
  var logGroupName: js.UndefOr[String] = js.native
  var logStreamName: js.UndefOr[String] = js.native
  var memoryLimitInMB: js.UndefOr[String] = js.native
  var succeed: js.UndefOr[js.Function1[/* messageOrObject */ js.Any, Unit]] = js.native
}

object PartialContext {
  @scala.inline
  def apply(): PartialContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialContext]
  }
  @scala.inline
  implicit class PartialContextOps[Self <: PartialContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsRequestId")(js.undefined)
        ret
    }
    @scala.inline
    def withCallbackWaitsForEmptyEventLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackWaitsForEmptyEventLoop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbackWaitsForEmptyEventLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackWaitsForEmptyEventLoop")(js.undefined)
        ret
    }
    @scala.inline
    def withClientContext(value: ClientContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientContext")(js.undefined)
        ret
    }
    @scala.inline
    def withDone(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.undefined)
        ret
    }
    @scala.inline
    def withFail(value: /* error */ js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionName")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRemainingTimeInMillis(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRemainingTimeInMillis")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRemainingTimeInMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRemainingTimeInMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentity(value: CognitoIdentity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(js.undefined)
        ret
    }
    @scala.inline
    def withInvokedFunctionArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invokedFunctionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvokedFunctionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invokedFunctionArn")(js.undefined)
        ret
    }
    @scala.inline
    def withLogGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withLogStreamName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logStreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogStreamName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logStreamName")(js.undefined)
        ret
    }
    @scala.inline
    def withMemoryLimitInMB(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryLimitInMB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemoryLimitInMB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryLimitInMB")(js.undefined)
        ret
    }
    @scala.inline
    def withSucceed(value: /* messageOrObject */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("succeed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSucceed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("succeed")(js.undefined)
        ret
    }
  }
  
}

