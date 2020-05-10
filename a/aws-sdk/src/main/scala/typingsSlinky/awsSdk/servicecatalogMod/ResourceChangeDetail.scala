package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceChangeDetail extends js.Object {
  /**
    * The ID of the entity that caused the change.
    */
  var CausingEntity: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.CausingEntity] = js.native
  /**
    * For static evaluations, the value of the resource attribute will change and the new value is known. For dynamic evaluations, the value might change, and any new value will be determined when the plan is updated.
    */
  var Evaluation: js.UndefOr[EvaluationType] = js.native
  /**
    * Information about the resource attribute to be modified.
    */
  var Target: js.UndefOr[ResourceTargetDefinition] = js.native
}

object ResourceChangeDetail {
  @scala.inline
  def apply(): ResourceChangeDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceChangeDetail]
  }
  @scala.inline
  implicit class ResourceChangeDetailOps[Self <: ResourceChangeDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCausingEntity(value: CausingEntity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CausingEntity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCausingEntity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CausingEntity")(js.undefined)
        ret
    }
    @scala.inline
    def withEvaluation(value: EvaluationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Evaluation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvaluation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Evaluation")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: ResourceTargetDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Target")(js.undefined)
        ret
    }
  }
  
}

