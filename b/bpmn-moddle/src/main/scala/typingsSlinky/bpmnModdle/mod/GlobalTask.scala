package typingsSlinky.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalTask extends CallableElement {
  
  var resources: ResourceRole = js.native
}
object GlobalTask {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    ioBinding: InputOutputBinding,
    ioSpecification: InputOutputSpecification,
    name: String,
    resources: ResourceRole,
    supportedInterfaceRef: Interface
  ): GlobalTask = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ioBinding = ioBinding.asInstanceOf[js.Any], ioSpecification = ioSpecification.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], supportedInterfaceRef = supportedInterfaceRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalTask]
  }
  
  @scala.inline
  implicit class GlobalTaskMutableBuilder[Self <: GlobalTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResources(value: ResourceRole): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
  }
}
