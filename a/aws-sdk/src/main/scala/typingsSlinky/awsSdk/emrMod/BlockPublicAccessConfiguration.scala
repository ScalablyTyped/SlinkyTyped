package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockPublicAccessConfiguration extends js.Object {
  /**
    * Indicates whether EMR block public access is enabled (true) or disabled (false). By default, the value is false for accounts that have created EMR clusters before July 2019. For accounts created after this, the default is true.
    */
  var BlockPublicSecurityGroupRules: Boolean = js.native
  /**
    * Specifies ports and port ranges that are permitted to have security group rules that allow inbound traffic from all public sources. For example, if Port 23 (Telnet) is specified for PermittedPublicSecurityGroupRuleRanges, Amazon EMR allows cluster creation if a security group associated with the cluster has a rule that allows inbound traffic on Port 23 from IPv4 0.0.0.0/0 or IPv6 port ::/0 as the source. By default, Port 22, which is used for SSH access to the cluster EC2 instances, is in the list of PermittedPublicSecurityGroupRuleRanges.
    */
  var PermittedPublicSecurityGroupRuleRanges: js.UndefOr[PortRanges] = js.native
}

object BlockPublicAccessConfiguration {
  @scala.inline
  def apply(BlockPublicSecurityGroupRules: Boolean): BlockPublicAccessConfiguration = {
    val __obj = js.Dynamic.literal(BlockPublicSecurityGroupRules = BlockPublicSecurityGroupRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockPublicAccessConfiguration]
  }
  @scala.inline
  implicit class BlockPublicAccessConfigurationOps[Self <: BlockPublicAccessConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockPublicSecurityGroupRules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockPublicSecurityGroupRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermittedPublicSecurityGroupRuleRanges(value: PortRanges): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PermittedPublicSecurityGroupRuleRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermittedPublicSecurityGroupRuleRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PermittedPublicSecurityGroupRuleRanges")(js.undefined)
        ret
    }
  }
  
}

