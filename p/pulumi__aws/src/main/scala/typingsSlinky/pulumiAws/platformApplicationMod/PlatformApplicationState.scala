package typingsSlinky.pulumiAws.platformApplicationMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformApplicationState extends js.Object {
  /**
    * The ARN of the SNS platform application
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * SNS Topic triggered when a delivery to any of the platform endpoints associated with your platform application encounters a permanent failure.
    */
  val eventDeliveryFailureTopicArn: js.UndefOr[Input[String]] = js.native
  /**
    * SNS Topic triggered when a new platform endpoint is added to your platform application.
    */
  val eventEndpointCreatedTopicArn: js.UndefOr[Input[String]] = js.native
  /**
    * SNS Topic triggered when an existing platform endpoint is deleted from your platform application.
    */
  val eventEndpointDeletedTopicArn: js.UndefOr[Input[String]] = js.native
  /**
    * SNS Topic triggered when an existing platform endpoint is changed from your platform application.
    */
  val eventEndpointUpdatedTopicArn: js.UndefOr[Input[String]] = js.native
  /**
    * The IAM role permitted to receive failure feedback for this application.
    */
  val failureFeedbackRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * The friendly name for the SNS platform application
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The platform that the app is registered with. See [Platform][1] for supported platforms.
    */
  val platform: js.UndefOr[Input[String]] = js.native
  /**
    * Application Platform credential. See [Credential][1] for type of credential required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
    */
  val platformCredential: js.UndefOr[Input[String]] = js.native
  /**
    * Application Platform principal. See [Principal][2] for type of principal required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
    */
  val platformPrincipal: js.UndefOr[Input[String]] = js.native
  /**
    * The IAM role permitted to receive success feedback for this application.
    */
  val successFeedbackRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * The percentage of success to sample (0-100)
    */
  val successFeedbackSampleRate: js.UndefOr[Input[String]] = js.native
}

object PlatformApplicationState {
  @scala.inline
  def apply(): PlatformApplicationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformApplicationState]
  }
  @scala.inline
  implicit class PlatformApplicationStateOps[Self <: PlatformApplicationState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withEventDeliveryFailureTopicArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDeliveryFailureTopicArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventDeliveryFailureTopicArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDeliveryFailureTopicArn")(js.undefined)
        ret
    }
    @scala.inline
    def withEventEndpointCreatedTopicArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventEndpointCreatedTopicArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventEndpointCreatedTopicArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventEndpointCreatedTopicArn")(js.undefined)
        ret
    }
    @scala.inline
    def withEventEndpointDeletedTopicArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventEndpointDeletedTopicArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventEndpointDeletedTopicArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventEndpointDeletedTopicArn")(js.undefined)
        ret
    }
    @scala.inline
    def withEventEndpointUpdatedTopicArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventEndpointUpdatedTopicArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventEndpointUpdatedTopicArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventEndpointUpdatedTopicArn")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureFeedbackRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureFeedbackRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureFeedbackRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureFeedbackRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformCredential(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformCredential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformCredential: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformCredential")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformPrincipal(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformPrincipal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformPrincipal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformPrincipal")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessFeedbackRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successFeedbackRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessFeedbackRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successFeedbackRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessFeedbackSampleRate(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successFeedbackSampleRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessFeedbackSampleRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successFeedbackSampleRate")(js.undefined)
        ret
    }
  }
  
}

