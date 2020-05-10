package typingsSlinky.pulumiAws.inputMod.dlm

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecyclePolicyPolicyDetails extends js.Object {
  /**
    * A list of resource types that should be targeted by the lifecycle policy. `VOLUME` is currently the only allowed value.
    */
  var resourceTypes: Input[js.Array[Input[String]]] = js.native
  /**
    * See the `schedule` configuration block.
    */
  var schedules: Input[js.Array[Input[LifecyclePolicyPolicyDetailsSchedule]]] = js.native
  /**
    * A mapping of tag keys and their values. Any resources that match the `resourceTypes` and are tagged with _any_ of these tags will be targeted.
    */
  var targetTags: Input[StringDictionary[_]] = js.native
}

object LifecyclePolicyPolicyDetails {
  @scala.inline
  def apply(
    resourceTypes: Input[js.Array[Input[String]]],
    schedules: Input[js.Array[Input[LifecyclePolicyPolicyDetailsSchedule]]],
    targetTags: Input[StringDictionary[_]]
  ): LifecyclePolicyPolicyDetails = {
    val __obj = js.Dynamic.literal(resourceTypes = resourceTypes.asInstanceOf[js.Any], schedules = schedules.asInstanceOf[js.Any], targetTags = targetTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePolicyPolicyDetails]
  }
  @scala.inline
  implicit class LifecyclePolicyPolicyDetailsOps[Self <: LifecyclePolicyPolicyDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceTypes(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchedules(value: Input[js.Array[Input[LifecyclePolicyPolicyDetailsSchedule]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetTags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

