package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateIPSetRequest extends js.Object {
  /**
    * The updated boolean value that specifies whether the IPSet is active or not.
    */
  var Activate: js.UndefOr[Boolean] = js.native
  /**
    * The detectorID that specifies the GuardDuty service whose IPSet you want to update.
    */
  var DetectorId: typingsSlinky.awsSdk.guarddutyMod.DetectorId = js.native
  /**
    * The unique ID that specifies the IPSet that you want to update.
    */
  var IpSetId: String = js.native
  /**
    * The updated URI of the file that contains the IPSet. For example (https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key).
    */
  var Location: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.Location] = js.native
  /**
    * The unique ID that specifies the IPSet that you want to update.
    */
  var Name: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.Name] = js.native
}

object UpdateIPSetRequest {
  @scala.inline
  def apply(DetectorId: DetectorId, IpSetId: String): UpdateIPSetRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], IpSetId = IpSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIPSetRequest]
  }
  @scala.inline
  implicit class UpdateIPSetRequestOps[Self <: UpdateIPSetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetectorId(value: DetectorId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetectorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpSetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Activate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Activate")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Location")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
  }
  
}

