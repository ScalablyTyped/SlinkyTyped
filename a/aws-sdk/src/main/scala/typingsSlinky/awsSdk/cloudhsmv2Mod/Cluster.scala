package typingsSlinky.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster extends js.Object {
  /**
    * The cluster's backup policy.
    */
  var BackupPolicy: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.BackupPolicy] = js.native
  /**
    * Contains one or more certificates or a certificate signing request (CSR).
    */
  var Certificates: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.Certificates] = js.native
  /**
    * The cluster's identifier (ID).
    */
  var ClusterId: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.ClusterId] = js.native
  /**
    * The date and time when the cluster was created.
    */
  var CreateTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The type of HSM that the cluster contains.
    */
  var HsmType: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.HsmType] = js.native
  /**
    * Contains information about the HSMs in the cluster.
    */
  var Hsms: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.Hsms] = js.native
  /**
    * The default password for the cluster's Pre-Crypto Officer (PRECO) user.
    */
  var PreCoPassword: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.PreCoPassword] = js.native
  /**
    * The identifier (ID) of the cluster's security group.
    */
  var SecurityGroup: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.SecurityGroup] = js.native
  /**
    * The identifier (ID) of the backup used to create the cluster. This value exists only when the cluster was created from a backup.
    */
  var SourceBackupId: js.UndefOr[BackupId] = js.native
  /**
    * The cluster's state.
    */
  var State: js.UndefOr[ClusterState] = js.native
  /**
    * A description of the cluster's state.
    */
  var StateMessage: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.StateMessage] = js.native
  /**
    * A map from availability zone to the cluster’s subnet in that availability zone.
    */
  var SubnetMapping: js.UndefOr[ExternalSubnetMapping] = js.native
  var TagList: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.TagList] = js.native
  /**
    * The identifier (ID) of the virtual private cloud (VPC) that contains the cluster.
    */
  var VpcId: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.VpcId] = js.native
}

object Cluster {
  @scala.inline
  def apply(): Cluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cluster]
  }
  @scala.inline
  implicit class ClusterOps[Self <: Cluster] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupPolicy(value: BackupPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificates(value: Certificates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Certificates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Certificates")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterId(value: ClusterId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withHsmType(value: HsmType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsmType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmType")(js.undefined)
        ret
    }
    @scala.inline
    def withHsms(value: Hsms): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hsms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hsms")(js.undefined)
        ret
    }
    @scala.inline
    def withPreCoPassword(value: PreCoPassword): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreCoPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreCoPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreCoPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroup(value: SecurityGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceBackupId(value: BackupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceBackupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceBackupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceBackupId")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: ClusterState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withStateMessage(value: StateMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetMapping(value: ExternalSubnetMapping): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withTagList(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TagList")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcId(value: VpcId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(js.undefined)
        ret
    }
  }
  
}

