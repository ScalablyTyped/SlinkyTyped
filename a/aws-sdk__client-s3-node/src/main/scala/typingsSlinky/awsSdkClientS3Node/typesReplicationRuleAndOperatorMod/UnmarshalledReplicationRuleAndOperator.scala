package typingsSlinky.awsSdkClientS3Node.typesReplicationRuleAndOperatorMod

import typingsSlinky.awsSdkClientS3Node.typesTagMod.UnmarshalledTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledReplicationRuleAndOperator extends ReplicationRuleAndOperator {
  /**
    * _TagSet shape
    */
  @JSName("Tags")
  var Tags_UnmarshalledReplicationRuleAndOperator: js.UndefOr[js.Array[UnmarshalledTag]] = js.native
}

object UnmarshalledReplicationRuleAndOperator {
  @scala.inline
  def apply(): UnmarshalledReplicationRuleAndOperator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledReplicationRuleAndOperator]
  }
  @scala.inline
  implicit class UnmarshalledReplicationRuleAndOperatorOps[Self <: UnmarshalledReplicationRuleAndOperator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTags(value: js.Array[UnmarshalledTag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

