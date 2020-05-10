package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Service extends js.Object {
  /**
    * Information about the activity described in a finding.
    */
  var Action: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.Action] = js.native
  /**
    * Indicates whether this finding is archived.
    */
  var Archived: js.UndefOr[Boolean] = js.native
  /**
    * Total count of the occurrences of this finding type.
    */
  var Count: js.UndefOr[Integer] = js.native
  /**
    * Detector ID for the GuardDuty service.
    */
  var DetectorId: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.DetectorId] = js.native
  /**
    * First seen timestamp of the activity that prompted GuardDuty to generate this finding.
    */
  var EventFirstSeen: js.UndefOr[String] = js.native
  /**
    * Last seen timestamp of the activity that prompted GuardDuty to generate this finding.
    */
  var EventLastSeen: js.UndefOr[String] = js.native
  /**
    * An evidence object associated with the service.
    */
  var Evidence: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.Evidence] = js.native
  /**
    * Resource role information for this finding.
    */
  var ResourceRole: js.UndefOr[String] = js.native
  /**
    * The name of the AWS service (GuardDuty) that generated a finding.
    */
  var ServiceName: js.UndefOr[String] = js.native
  /**
    * Feedback left about the finding.
    */
  var UserFeedback: js.UndefOr[String] = js.native
}

object Service {
  @scala.inline
  def apply(): Service = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Service]
  }
  @scala.inline
  implicit class ServiceOps[Self <: Service] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: Action): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(js.undefined)
        ret
    }
    @scala.inline
    def withArchived(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Archived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArchived: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Archived")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(js.undefined)
        ret
    }
    @scala.inline
    def withDetectorId(value: DetectorId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetectorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetectorId")(js.undefined)
        ret
    }
    @scala.inline
    def withEventFirstSeen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventFirstSeen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventFirstSeen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventFirstSeen")(js.undefined)
        ret
    }
    @scala.inline
    def withEventLastSeen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventLastSeen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventLastSeen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventLastSeen")(js.undefined)
        ret
    }
    @scala.inline
    def withEvidence(value: Evidence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Evidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Evidence")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceRole")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceName")(js.undefined)
        ret
    }
    @scala.inline
    def withUserFeedback(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserFeedback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserFeedback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserFeedback")(js.undefined)
        ret
    }
  }
  
}

