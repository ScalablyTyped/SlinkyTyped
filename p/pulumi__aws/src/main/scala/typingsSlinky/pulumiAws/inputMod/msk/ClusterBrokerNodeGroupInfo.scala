package typingsSlinky.pulumiAws.inputMod.msk

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterBrokerNodeGroupInfo extends js.Object {
  /**
    * The distribution of broker nodes across availability zones ([documentation](https://docs.aws.amazon.com/msk/1.0/apireference/clusters.html#clusters-model-brokerazdistribution)). Currently the only valid value is `DEFAULT`.
    */
  var azDistribution: js.UndefOr[Input[String]] = js.native
  /**
    * A list of subnets to connect to in client VPC ([documentation](https://docs.aws.amazon.com/msk/1.0/apireference/clusters.html#clusters-prop-brokernodegroupinfo-clientsubnets)).
    */
  var clientSubnets: Input[js.Array[Input[String]]] = js.native
  /**
    * The size in GiB of the EBS volume for the data drive on each broker node.
    */
  var ebsVolumeSize: Input[Double] = js.native
  /**
    * Specify the instance type to use for the kafka brokers. e.g. kafka.m5.large. ([Pricing info](https://aws.amazon.com/msk/pricing/))
    */
  var instanceType: Input[String] = js.native
  /**
    * A list of the security groups to associate with the elastic network interfaces to control who can communicate with the cluster.
    */
  var securityGroups: Input[js.Array[Input[String]]] = js.native
}

object ClusterBrokerNodeGroupInfo {
  @scala.inline
  def apply(
    clientSubnets: Input[js.Array[Input[String]]],
    ebsVolumeSize: Input[Double],
    instanceType: Input[String],
    securityGroups: Input[js.Array[Input[String]]]
  ): ClusterBrokerNodeGroupInfo = {
    val __obj = js.Dynamic.literal(clientSubnets = clientSubnets.asInstanceOf[js.Any], ebsVolumeSize = ebsVolumeSize.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterBrokerNodeGroupInfo]
  }
  @scala.inline
  implicit class ClusterBrokerNodeGroupInfoOps[Self <: ClusterBrokerNodeGroupInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientSubnets(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientSubnets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEbsVolumeSize(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebsVolumeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityGroups(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAzDistribution(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azDistribution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAzDistribution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azDistribution")(js.undefined)
        ret
    }
  }
  
}

