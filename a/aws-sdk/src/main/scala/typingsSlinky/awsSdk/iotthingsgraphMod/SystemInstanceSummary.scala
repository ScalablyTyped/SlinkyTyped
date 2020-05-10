package typingsSlinky.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemInstanceSummary extends js.Object {
  /**
    * The ARN of the system instance.
    */
  var arn: js.UndefOr[Arn] = js.native
  /**
    * The date when the system instance was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  /**
    * The ID of the Greengrass group where the system instance is deployed.
    */
  var greengrassGroupId: js.UndefOr[GreengrassGroupId] = js.native
  /**
    * The ID of the Greengrass group where the system instance is deployed.
    */
  var greengrassGroupName: js.UndefOr[GroupName] = js.native
  /**
    * The version of the Greengrass group where the system instance is deployed.
    */
  var greengrassGroupVersionId: js.UndefOr[GreengrassGroupVersionId] = js.native
  /**
    * The ID of the system instance.
    */
  var id: js.UndefOr[Urn] = js.native
  /**
    * The status of the system instance.
    */
  var status: js.UndefOr[SystemInstanceDeploymentStatus] = js.native
  /**
    * The target of the system instance.
    */
  var target: js.UndefOr[DeploymentTarget] = js.native
  /**
    *  The date and time when the system instance was last updated.
    */
  var updatedAt: js.UndefOr[js.Date] = js.native
}

object SystemInstanceSummary {
  @scala.inline
  def apply(): SystemInstanceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemInstanceSummary]
  }
  @scala.inline
  implicit class SystemInstanceSummaryOps[Self <: SystemInstanceSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Arn): Self = {
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
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(js.undefined)
        ret
    }
    @scala.inline
    def withGreengrassGroupId(value: GreengrassGroupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greengrassGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreengrassGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greengrassGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withGreengrassGroupName(value: GroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greengrassGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreengrassGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greengrassGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withGreengrassGroupVersionId(value: GreengrassGroupVersionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greengrassGroupVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreengrassGroupVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greengrassGroupVersionId")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Urn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: SystemInstanceDeploymentStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: DeploymentTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedAt")(js.undefined)
        ret
    }
  }
  
}

