package typingsSlinky.pulumiAws.fargateProfileMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.eks.FargateProfileSelector
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FargateProfileState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the EKS Fargate Profile.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the EKS Cluster.
    */
  val clusterName: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the EKS Fargate Profile.
    */
  val fargateProfileName: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Fargate Profile.
    */
  val podExecutionRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block(s) for selecting Kubernetes Pods to execute with this EKS Fargate Profile. Detailed below.
    */
  val selectors: js.UndefOr[Input[js.Array[Input[FargateProfileSelector]]]] = js.native
  /**
    * Status of the EKS Fargate Profile.
    */
  val status: js.UndefOr[Input[String]] = js.native
  /**
    * Identifiers of private EC2 Subnets to associate with the EKS Fargate Profile. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Key-value mapping of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object FargateProfileState {
  @scala.inline
  def apply(): FargateProfileState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FargateProfileState]
  }
  @scala.inline
  implicit class FargateProfileStateOps[Self <: FargateProfileState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
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
    def withClusterName(value: Input[String]): Self = {
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
    def withFargateProfileName(value: Input[String]): Self = {
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
    def withPodExecutionRoleArn(value: Input[String]): Self = {
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
    def withSelectors(value: Input[js.Array[Input[FargateProfileSelector]]]): Self = {
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
    def withStatus(value: Input[String]): Self = {
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
    def withSubnetIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetIds")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
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

