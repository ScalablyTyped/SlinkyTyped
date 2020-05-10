package typingsSlinky.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FargateProfile extends js.Object {
  /**
    * The name of the Amazon EKS cluster that the Fargate profile belongs to.
    */
  var clusterName: js.UndefOr[String] = js.native
  /**
    * The Unix epoch timestamp in seconds for when the Fargate profile was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  /**
    * The full Amazon Resource Name (ARN) of the Fargate profile.
    */
  var fargateProfileArn: js.UndefOr[String] = js.native
  /**
    * The name of the Fargate profile.
    */
  var fargateProfileName: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the pod execution role to use for pods that match the selectors in the Fargate profile. For more information, see Pod Execution Role in the Amazon EKS User Guide.
    */
  var podExecutionRoleArn: js.UndefOr[String] = js.native
  /**
    * The selectors to match for pods to use this Fargate profile.
    */
  var selectors: js.UndefOr[FargateProfileSelectors] = js.native
  /**
    * The current status of the Fargate profile.
    */
  var status: js.UndefOr[FargateProfileStatus] = js.native
  /**
    * The IDs of subnets to launch pods into.
    */
  var subnets: js.UndefOr[StringList] = js.native
  /**
    * The metadata applied to the Fargate profile to assist with categorization and organization. Each tag consists of a key and an optional value, both of which you define. Fargate profile tags do not propagate to any other resources associated with the Fargate profile, such as the pods that are scheduled with it.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object FargateProfile {
  @scala.inline
  def apply(): FargateProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FargateProfile]
  }
  @scala.inline
  implicit class FargateProfileOps[Self <: FargateProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterName")(js.undefined)
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
    def withFargateProfileArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fargateProfileArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFargateProfileArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fargateProfileArn")(js.undefined)
        ret
    }
    @scala.inline
    def withFargateProfileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fargateProfileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFargateProfileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fargateProfileName")(js.undefined)
        ret
    }
    @scala.inline
    def withPodExecutionRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("podExecutionRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPodExecutionRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("podExecutionRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectors(value: FargateProfileSelectors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectors")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: FargateProfileStatus): Self = {
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
    def withSubnets(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnets")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

