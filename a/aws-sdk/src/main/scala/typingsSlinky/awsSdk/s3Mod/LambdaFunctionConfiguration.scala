package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaFunctionConfiguration extends js.Object {
  /**
    * The Amazon S3 bucket event for which to invoke the AWS Lambda function. For more information, see Supported Event Types in the Amazon Simple Storage Service Developer Guide.
    */
  var Events: EventList = js.native
  var Filter: js.UndefOr[NotificationConfigurationFilter] = js.native
  var Id: js.UndefOr[NotificationId] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS Lambda function that Amazon S3 invokes when the specified event type occurs.
    */
  var LambdaFunctionArn: typingsSlinky.awsSdk.s3Mod.LambdaFunctionArn = js.native
}

object LambdaFunctionConfiguration {
  @scala.inline
  def apply(Events: EventList, LambdaFunctionArn: LambdaFunctionArn): LambdaFunctionConfiguration = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], LambdaFunctionArn = LambdaFunctionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunctionConfiguration]
  }
  @scala.inline
  implicit class LambdaFunctionConfigurationOps[Self <: LambdaFunctionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: EventList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLambdaFunctionArn(value: LambdaFunctionArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LambdaFunctionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: NotificationConfigurationFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: NotificationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
  }
  
}

