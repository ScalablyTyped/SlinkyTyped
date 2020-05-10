package typingsSlinky.pulumiAws.inputMod.dlm

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecyclePolicyPolicyDetailsSchedule extends js.Object {
  /**
    * Copy all user-defined tags on a source volume to snapshots of the volume created by this policy.
    */
  var copyTags: js.UndefOr[Input[Boolean]] = js.native
  /**
    * See the `createRule` block. Max of 1 per schedule.
    */
  var createRule: Input[LifecyclePolicyPolicyDetailsScheduleCreateRule] = js.native
  /**
    * A name for the schedule.
    */
  var name: Input[String] = js.native
  /**
    * See the `retainRule` block. Max of 1 per schedule.
    */
  var retainRule: Input[LifecyclePolicyPolicyDetailsScheduleRetainRule] = js.native
  /**
    * A mapping of tag keys and their values. DLM lifecycle policies will already tag the snapshot with the tags on the volume. This configuration adds extra tags on top of these.
    */
  var tagsToAdd: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object LifecyclePolicyPolicyDetailsSchedule {
  @scala.inline
  def apply(
    createRule: Input[LifecyclePolicyPolicyDetailsScheduleCreateRule],
    name: Input[String],
    retainRule: Input[LifecyclePolicyPolicyDetailsScheduleRetainRule]
  ): LifecyclePolicyPolicyDetailsSchedule = {
    val __obj = js.Dynamic.literal(createRule = createRule.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], retainRule = retainRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePolicyPolicyDetailsSchedule]
  }
  @scala.inline
  implicit class LifecyclePolicyPolicyDetailsScheduleOps[Self <: LifecyclePolicyPolicyDetailsSchedule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateRule(value: Input[LifecyclePolicyPolicyDetailsScheduleCreateRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetainRule(value: Input[LifecyclePolicyPolicyDetailsScheduleRetainRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retainRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopyTags(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyTags")(js.undefined)
        ret
    }
    @scala.inline
    def withTagsToAdd(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagsToAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagsToAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagsToAdd")(js.undefined)
        ret
    }
  }
  
}

