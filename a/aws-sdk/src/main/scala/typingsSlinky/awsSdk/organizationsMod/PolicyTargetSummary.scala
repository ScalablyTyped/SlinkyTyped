package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyTargetSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the policy target. For more information about ARNs in Organizations, see ARN Formats Supported by Organizations in the AWS Organizations User Guide.
    */
  var Arn: js.UndefOr[GenericArn] = js.native
  /**
    * The friendly name of the policy target. The regex pattern that is used to validate this parameter is a string of any of the characters in the ASCII character range.
    */
  var Name: js.UndefOr[TargetName] = js.native
  /**
    * The unique identifier (ID) of the policy target. The regex pattern for a target ID string requires one of the following:   Root: A string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.   Account: A string that consists of exactly 12 digits.   Organizational unit (OU): A string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that the OU is in). This string is followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.  
    */
  var TargetId: js.UndefOr[PolicyTargetId] = js.native
  /**
    * The type of the policy target.
    */
  var Type: js.UndefOr[TargetType] = js.native
}

object PolicyTargetSummary {
  @scala.inline
  def apply(): PolicyTargetSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyTargetSummary]
  }
  @scala.inline
  implicit class PolicyTargetSummaryOps[Self <: PolicyTargetSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: GenericArn): Self = {
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
    def withName(value: TargetName): Self = {
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
    @scala.inline
    def withTargetId(value: PolicyTargetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetId")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: TargetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

