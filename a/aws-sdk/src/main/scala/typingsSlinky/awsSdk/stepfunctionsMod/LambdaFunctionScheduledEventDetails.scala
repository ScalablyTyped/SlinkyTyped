package typingsSlinky.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaFunctionScheduledEventDetails extends js.Object {
  /**
    * The JSON data input to the lambda function.
    */
  var input: js.UndefOr[SensitiveData] = js.native
  /**
    * The Amazon Resource Name (ARN) of the scheduled lambda function.
    */
  var resource: Arn = js.native
  /**
    * The maximum allowed duration of the lambda function.
    */
  var timeoutInSeconds: js.UndefOr[TimeoutInSeconds] = js.native
}

object LambdaFunctionScheduledEventDetails {
  @scala.inline
  def apply(resource: Arn): LambdaFunctionScheduledEventDetails = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunctionScheduledEventDetails]
  }
  @scala.inline
  implicit class LambdaFunctionScheduledEventDetailsOps[Self <: LambdaFunctionScheduledEventDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResource(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: SensitiveData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutInSeconds(value: TimeoutInSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutInSeconds")(js.undefined)
        ret
    }
  }
  
}

