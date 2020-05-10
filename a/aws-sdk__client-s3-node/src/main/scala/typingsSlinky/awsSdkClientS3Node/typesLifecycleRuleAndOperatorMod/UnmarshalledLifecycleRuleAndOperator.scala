package typingsSlinky.awsSdkClientS3Node.typesLifecycleRuleAndOperatorMod

import typingsSlinky.awsSdkClientS3Node.typesTagMod.UnmarshalledTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledLifecycleRuleAndOperator extends LifecycleRuleAndOperator {
  /**
    * <p>All of these tags must exist in the object's tag set in order for the rule to apply.</p>
    */
  @JSName("Tags")
  var Tags_UnmarshalledLifecycleRuleAndOperator: js.UndefOr[js.Array[UnmarshalledTag]] = js.native
}

object UnmarshalledLifecycleRuleAndOperator {
  @scala.inline
  def apply(): UnmarshalledLifecycleRuleAndOperator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledLifecycleRuleAndOperator]
  }
  @scala.inline
  implicit class UnmarshalledLifecycleRuleAndOperatorOps[Self <: UnmarshalledLifecycleRuleAndOperator] (val x: Self) extends AnyVal {
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

