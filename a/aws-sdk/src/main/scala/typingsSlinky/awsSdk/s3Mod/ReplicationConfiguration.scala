package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationConfiguration extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that Amazon S3 assumes when replicating objects. For more information, see How to Set Up Replication in the Amazon Simple Storage Service Developer Guide.
    */
  var Role: typingsSlinky.awsSdk.s3Mod.Role = js.native
  /**
    * A container for one or more replication rules. A replication configuration must have at least one rule and can contain a maximum of 1,000 rules. 
    */
  var Rules: ReplicationRules = js.native
}

object ReplicationConfiguration {
  @scala.inline
  def apply(Role: Role, Rules: ReplicationRules): ReplicationConfiguration = {
    val __obj = js.Dynamic.literal(Role = Role.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationConfiguration]
  }
  @scala.inline
  implicit class ReplicationConfigurationOps[Self <: ReplicationConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRole(value: Role): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRules(value: ReplicationRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

