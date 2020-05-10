package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskDefinitionPlacementConstraint extends js.Object {
  /**
    * A cluster query language expression to apply to the constraint. For more information, see Cluster Query Language in the Amazon Elastic Container Service Developer Guide.
    */
  var expression: js.UndefOr[String] = js.native
  /**
    * The type of constraint. The MemberOf constraint restricts selection to be from a group of valid candidates.
    */
  var `type`: js.UndefOr[TaskDefinitionPlacementConstraintType] = js.native
}

object TaskDefinitionPlacementConstraint {
  @scala.inline
  def apply(): TaskDefinitionPlacementConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskDefinitionPlacementConstraint]
  }
  @scala.inline
  implicit class TaskDefinitionPlacementConstraintOps[Self <: TaskDefinitionPlacementConstraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: TaskDefinitionPlacementConstraintType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

