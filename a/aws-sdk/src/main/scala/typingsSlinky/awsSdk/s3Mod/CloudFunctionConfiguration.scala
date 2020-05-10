package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudFunctionConfiguration extends js.Object {
  /**
    * Lambda cloud function ARN that Amazon S3 can invoke when it detects events of the specified type.
    */
  var CloudFunction: js.UndefOr[typingsSlinky.awsSdk.s3Mod.CloudFunction] = js.native
  var Event: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Event] = js.native
  /**
    * Bucket events for which to send notifications.
    */
  var Events: js.UndefOr[EventList] = js.native
  var Id: js.UndefOr[NotificationId] = js.native
  /**
    * The role supporting the invocation of the Lambda function
    */
  var InvocationRole: js.UndefOr[CloudFunctionInvocationRole] = js.native
}

object CloudFunctionConfiguration {
  @scala.inline
  def apply(): CloudFunctionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudFunctionConfiguration]
  }
  @scala.inline
  implicit class CloudFunctionConfigurationOps[Self <: CloudFunctionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudFunction(value: CloudFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Event")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: EventList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(js.undefined)
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
    @scala.inline
    def withInvocationRole(value: CloudFunctionInvocationRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvocationRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvocationRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvocationRole")(js.undefined)
        ret
    }
  }
  
}

