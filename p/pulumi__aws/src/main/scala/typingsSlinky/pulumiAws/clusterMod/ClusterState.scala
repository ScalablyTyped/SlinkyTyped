package typingsSlinky.pulumiAws.clusterMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.cloudhsmv2.ClusterClusterCertificates
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterState extends js.Object {
  /**
    * The list of cluster certificates.
    * * `cluster_certificates.0.cluster_certificate` - The cluster certificate issued (signed) by the issuing certificate authority (CA) of the cluster's owner.
    * * `cluster_certificates.0.cluster_csr` - The certificate signing request (CSR). Available only in UNINITIALIZED state after an hsm instance is added to the cluster.
    * * `cluster_certificates.0.aws_hardware_certificate` - The HSM hardware certificate issued (signed) by AWS CloudHSM.
    * * `cluster_certificates.0.hsm_certificate` - The HSM certificate issued (signed) by the HSM hardware.
    * * `cluster_certificates.0.manufacturer_hardware_certificate` - The HSM hardware certificate issued (signed) by the hardware manufacturer.
    */
  val clusterCertificates: js.UndefOr[Input[ClusterClusterCertificates]] = js.native
  /**
    * The id of the CloudHSM cluster.
    */
  val clusterId: js.UndefOr[Input[String]] = js.native
  /**
    * The state of the cluster.
    */
  val clusterState: js.UndefOr[Input[String]] = js.native
  /**
    * The type of HSM module in the cluster. Currently, only hsm1.medium is supported.
    */
  val hsmType: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the security group associated with the CloudHSM cluster.
    */
  val securityGroupId: js.UndefOr[Input[String]] = js.native
  /**
    * The id of Cloud HSM v2 cluster backup to be restored.
    */
  val sourceBackupIdentifier: js.UndefOr[Input[String]] = js.native
  /**
    * The IDs of subnets in which cluster will operate.
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The id of the VPC that the CloudHSM cluster resides in.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}

object ClusterState {
  @scala.inline
  def apply(): ClusterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterState]
  }
  @scala.inline
  implicit class ClusterStateOps[Self <: ClusterState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterCertificates(value: Input[ClusterClusterCertificates]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterCertificates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterCertificates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterCertificates")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterId")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterState(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterState")(js.undefined)
        ret
    }
    @scala.inline
    def withHsmType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsmType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsmType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsmType")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroupId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceBackupIdentifier(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceBackupIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceBackupIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceBackupIdentifier")(js.undefined)
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
    @scala.inline
    def withVpcId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(js.undefined)
        ret
    }
  }
  
}

