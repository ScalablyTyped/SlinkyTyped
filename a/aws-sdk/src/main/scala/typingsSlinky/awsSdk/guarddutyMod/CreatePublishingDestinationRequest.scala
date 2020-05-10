package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePublishingDestinationRequest extends js.Object {
  /**
    * The idempotency token for the request.
    */
  var ClientToken: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.ClientToken] = js.native
  /**
    * Properties of the publishing destination, including the ARNs for the destination and the KMS key used for encryption.
    */
  var DestinationProperties: typingsSlinky.awsSdk.guarddutyMod.DestinationProperties = js.native
  /**
    * The type of resource for the publishing destination. Currently only S3 is supported.
    */
  var DestinationType: typingsSlinky.awsSdk.guarddutyMod.DestinationType = js.native
  /**
    * The ID of the GuardDuty detector associated with the publishing destination.
    */
  var DetectorId: typingsSlinky.awsSdk.guarddutyMod.DetectorId = js.native
}

object CreatePublishingDestinationRequest {
  @scala.inline
  def apply(
    DestinationProperties: DestinationProperties,
    DestinationType: DestinationType,
    DetectorId: DetectorId
  ): CreatePublishingDestinationRequest = {
    val __obj = js.Dynamic.literal(DestinationProperties = DestinationProperties.asInstanceOf[js.Any], DestinationType = DestinationType.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePublishingDestinationRequest]
  }
  @scala.inline
  implicit class CreatePublishingDestinationRequestOps[Self <: CreatePublishingDestinationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationProperties(value: DestinationProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationType(value: DestinationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetectorId(value: DetectorId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetectorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientToken(value: ClientToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(js.undefined)
        ret
    }
  }
  
}

