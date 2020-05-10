package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIPSetRequest extends js.Object {
  /**
    * A boolean value that indicates whether GuardDuty is to start using the uploaded IPSet.
    */
  var Activate: Boolean = js.native
  /**
    * The idempotency token for the create request.
    */
  var ClientToken: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.ClientToken] = js.native
  /**
    * The unique ID of the detector of the GuardDuty account for which you want to create an IPSet.
    */
  var DetectorId: typingsSlinky.awsSdk.guarddutyMod.DetectorId = js.native
  /**
    * The format of the file that contains the IPSet.
    */
  var Format: IpSetFormat = js.native
  /**
    * The URI of the file that contains the IPSet. For example (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key)
    */
  var Location: typingsSlinky.awsSdk.guarddutyMod.Location = js.native
  /**
    * The user friendly name to identify the IPSet. This name is displayed in all findings that are triggered by activity that involves IP addresses included in this IPSet.
    */
  var Name: typingsSlinky.awsSdk.guarddutyMod.Name = js.native
  /**
    * The tags to be added to a new IP set resource.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}

object CreateIPSetRequest {
  @scala.inline
  def apply(Activate: Boolean, DetectorId: DetectorId, Format: IpSetFormat, Location: Location, Name: Name): CreateIPSetRequest = {
    val __obj = js.Dynamic.literal(Activate = Activate.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIPSetRequest]
  }
  @scala.inline
  implicit class CreateIPSetRequestOps[Self <: CreateIPSetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Activate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetectorId(value: DetectorId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetectorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: IpSetFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withTags(value: TagMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

