package typingsSlinky.pulumiAws.outputMod.ecs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskDefinitionPlacementConstraint extends js.Object {
  /**
    * Cluster Query Language expression to apply to the constraint.
    * For more information, see [Cluster Query Language in the Amazon EC2 Container
    * Service Developer
    * Guide](http://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html).
    */
  var expression: js.UndefOr[String] = js.native
  /**
    * The proxy type. The default value is `APPMESH`. The only supported value is `APPMESH`.
    */
  var `type`: String = js.native
}

object TaskDefinitionPlacementConstraint {
  @scala.inline
  def apply(`type`: String): TaskDefinitionPlacementConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskDefinitionPlacementConstraint]
  }
  @scala.inline
  implicit class TaskDefinitionPlacementConstraintOps[Self <: TaskDefinitionPlacementConstraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

