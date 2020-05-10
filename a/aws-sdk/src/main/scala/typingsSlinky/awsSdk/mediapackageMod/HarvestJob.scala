package typingsSlinky.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HarvestJob extends js.Object {
  /**
    * The Amazon Resource Name (ARN) assigned to the HarvestJob.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * The ID of the Channel that the HarvestJob will harvest from.
    */
  var ChannelId: js.UndefOr[string] = js.native
  /**
    * The time the HarvestJob was submitted
    */
  var CreatedAt: js.UndefOr[string] = js.native
  /**
    * The end of the time-window which will be harvested.
    */
  var EndTime: js.UndefOr[string] = js.native
  /**
    * The ID of the HarvestJob. The ID must be unique within the region
  and it cannot be changed after the HarvestJob is submitted.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * The ID of the OriginEndpoint that the HarvestJob will harvest from.
  This cannot be changed after the HarvestJob is submitted.
    */
  var OriginEndpointId: js.UndefOr[string] = js.native
  var S3Destination: js.UndefOr[typingsSlinky.awsSdk.mediapackageMod.S3Destination] = js.native
  /**
    * The start of the time-window which will be harvested.
    */
  var StartTime: js.UndefOr[string] = js.native
  /**
    * The current status of the HarvestJob. Consider setting up a CloudWatch Event to listen for
  HarvestJobs as they succeed or fail. In the event of failure, the CloudWatch Event will
  include an explanation of why the HarvestJob failed.
    */
  var Status: js.UndefOr[typingsSlinky.awsSdk.mediapackageMod.Status] = js.native
}

object HarvestJob {
  @scala.inline
  def apply(): HarvestJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HarvestJob]
  }
  @scala.inline
  implicit class HarvestJobOps[Self <: HarvestJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: string): Self = {
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
    def withOriginEndpointId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginEndpointId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginEndpointId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginEndpointId")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Destination(value: S3Destination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Destination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Destination")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

