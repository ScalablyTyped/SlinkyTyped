package typingsSlinky.awsSdkClientS3Node.typesReplicationRuleFilterMod

import typingsSlinky.awsSdkClientS3Node.typesReplicationRuleAndOperatorMod.UnmarshalledReplicationRuleAndOperator
import typingsSlinky.awsSdkClientS3Node.typesTagMod.UnmarshalledTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledReplicationRuleFilter extends ReplicationRuleFilter {
  /**
    * <p>Container for specifying rule filters. These filters determine the subset of objects to which the rule applies. The element is required only if you specify more than one filter. For example: </p> <ul> <li> <p>You specify both a <code>Prefix</code> and a <code>Tag</code> filters. Then you wrap these in an <code>And</code> tag.</p> </li> <li> <p>You specify filter based on multiple tags. Then you wrap the <code>Tag</code> elements in an <code>And</code> tag.</p> </li> </ul>
    */
  @JSName("And")
  var And_UnmarshalledReplicationRuleFilter: js.UndefOr[UnmarshalledReplicationRuleAndOperator] = js.native
  /**
    * <p>Container for specifying a tag key and value. </p> <p>The rule applies only to objects having the tag in its tagset.</p>
    */
  @JSName("Tag")
  var Tag_UnmarshalledReplicationRuleFilter: js.UndefOr[UnmarshalledTag] = js.native
}

object UnmarshalledReplicationRuleFilter {
  @scala.inline
  def apply(): UnmarshalledReplicationRuleFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledReplicationRuleFilter]
  }
  @scala.inline
  implicit class UnmarshalledReplicationRuleFilterOps[Self <: UnmarshalledReplicationRuleFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnd(value: UnmarshalledReplicationRuleAndOperator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("And")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("And")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: UnmarshalledTag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(js.undefined)
        ret
    }
  }
  
}

