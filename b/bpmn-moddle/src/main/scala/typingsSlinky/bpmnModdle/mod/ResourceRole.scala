package typingsSlinky.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ResourceRoleMutableBuilder[Self <: ResourceRole] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceAssignmentExpression(value: ResourceAssignmentExpression): Self = StObject.set(x, "resourceAssignmentExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceParameterBindings(value: js.Array[ResourceParameterBinding]): Self = StObject.set(x, "ResourceParameterBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceParameterBindingsVarargs(value: ResourceParameterBinding*): Self = StObject.set(x, "ResourceParameterBindings", js.Array(value :_*))
    
    @scala.inline
    def setResourceRef(value: Resource): Self = StObject.set(x, "resourceRef", value.asInstanceOf[js.Any])
  }
}
