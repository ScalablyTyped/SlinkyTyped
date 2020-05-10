package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resource extends js.Object {
  /**
    * The IAM access key details (IAM user information) of a user that engaged in the activity that prompted GuardDuty to generate a finding.
    */
  var AccessKeyDetails: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.AccessKeyDetails] = js.native
  /**
    * The information about the EC2 instance associated with the activity that prompted GuardDuty to generate a finding.
    */
  var InstanceDetails: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.InstanceDetails] = js.native
  /**
    * The type of the AWS resource.
    */
  var ResourceType: js.UndefOr[String] = js.native
}

object Resource {
  @scala.inline
  def apply(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  implicit class ResourceOps[Self <: Resource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessKeyDetails(value: AccessKeyDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessKeyDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessKeyDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessKeyDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceDetails(value: InstanceDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(js.undefined)
        ret
    }
  }
  
}

