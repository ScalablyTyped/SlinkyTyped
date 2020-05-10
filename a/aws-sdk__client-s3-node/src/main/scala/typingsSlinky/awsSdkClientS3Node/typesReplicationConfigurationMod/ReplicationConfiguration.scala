package typingsSlinky.awsSdkClientS3Node.typesReplicationConfigurationMod

import typingsSlinky.awsSdkClientS3Node.typesReplicationRuleMod.ReplicationRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationConfiguration extends js.Object {
  /**
    * <p>Amazon Resource Name (ARN) of an IAM role for Amazon S3 to assume when replicating the objects.</p>
    */
  var Role: String = js.native
  /**
    * <p>Container for one or more replication rules. Replication configuration must have at least one rule and can contain up to 1,000 rules. </p>
    */
  var Rules: js.Array[ReplicationRule] | js.Iterable[ReplicationRule] = js.native
}

object ReplicationConfiguration {
  @scala.inline
  def apply(Role: String, Rules: js.Array[ReplicationRule] | js.Iterable[ReplicationRule]): ReplicationConfiguration = {
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
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRulesIterable(value: js.Iterable[ReplicationRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRules(value: js.Array[ReplicationRule] | js.Iterable[ReplicationRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

