package typingsSlinky.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetAttributes extends js.Object {
  /**
    * The ID of the agent that is installed on the EC2 instance where the finding is generated.
    */
  var agentId: js.UndefOr[AgentId] = js.native
  /**
    * The ID of the Amazon Machine Image (AMI) that is installed on the EC2 instance where the finding is generated.
    */
  var amiId: js.UndefOr[AmiId] = js.native
  /**
    * The Auto Scaling group of the EC2 instance where the finding is generated.
    */
  var autoScalingGroup: js.UndefOr[AutoScalingGroup] = js.native
  /**
    * The hostname of the EC2 instance where the finding is generated.
    */
  var hostname: js.UndefOr[Hostname] = js.native
  /**
    * The list of IP v4 addresses of the EC2 instance where the finding is generated.
    */
  var ipv4Addresses: js.UndefOr[Ipv4AddressList] = js.native
  /**
    * An array of the network interfaces interacting with the EC2 instance where the finding is generated.
    */
  var networkInterfaces: js.UndefOr[NetworkInterfaces] = js.native
  /**
    * The schema version of this data type.
    */
  var schemaVersion: NumericVersion = js.native
  /**
    * The tags related to the EC2 instance where the finding is generated.
    */
  var tags: js.UndefOr[Tags] = js.native
}

object AssetAttributes {
  @scala.inline
  def apply(schemaVersion: NumericVersion): AssetAttributes = {
    val __obj = js.Dynamic.literal(schemaVersion = schemaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetAttributes]
  }
  @scala.inline
  implicit class AssetAttributesOps[Self <: AssetAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSchemaVersion(value: NumericVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAgentId(value: AgentId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentId")(js.undefined)
        ret
    }
    @scala.inline
    def withAmiId(value: AmiId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmiId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amiId")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoScalingGroup(value: AutoScalingGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScalingGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScalingGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScalingGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withHostname(value: Hostname): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(js.undefined)
        ret
    }
    @scala.inline
    def withIpv4Addresses(value: Ipv4AddressList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv4Addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv4Addresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv4Addresses")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkInterfaces(value: NetworkInterfaces): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInterfaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaces")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
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

