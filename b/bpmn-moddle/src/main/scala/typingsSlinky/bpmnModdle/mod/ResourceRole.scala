package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceRole extends BaseElement {
  var ResourceParameterBindings: js.Array[ResourceParameterBinding] = js.native
  var name: String = js.native
  var resourceAssignmentExpression: ResourceAssignmentExpression = js.native
  var resourceRef: Resource = js.native
}

object ResourceRole {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    ResourceParameterBindings: js.Array[ResourceParameterBinding],
    id: String,
    name: String,
    resourceAssignmentExpression: ResourceAssignmentExpression,
    resourceRef: Resource
  ): ResourceRole = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], ResourceParameterBindings = ResourceParameterBindings.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceAssignmentExpression = resourceAssignmentExpression.asInstanceOf[js.Any], resourceRef = resourceRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceRole]
  }
  @scala.inline
  implicit class ResourceRoleOps[Self <: ResourceRole] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceParameterBindings(value: js.Array[ResourceParameterBinding]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceParameterBindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceAssignmentExpression(value: ResourceAssignmentExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceAssignmentExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceRef(value: Resource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceRef")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

