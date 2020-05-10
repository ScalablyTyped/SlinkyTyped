package typingsSlinky.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFargateProfileRequest extends js.Object {
  /**
    * The name of the Amazon EKS cluster associated with the Fargate profile.
    */
  var clusterName: String = js.native
  /**
    * The name of the Fargate profile to describe.
    */
  var fargateProfileName: String = js.native
}

object DescribeFargateProfileRequest {
  @scala.inline
  def apply(clusterName: String, fargateProfileName: String): DescribeFargateProfileRequest = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], fargateProfileName = fargateProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFargateProfileRequest]
  }
  @scala.inline
  implicit class DescribeFargateProfileRequestOps[Self <: DescribeFargateProfileRequest] (val x: Self) extends AnyVal {
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
    def withFargateProfileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fargateProfileName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

