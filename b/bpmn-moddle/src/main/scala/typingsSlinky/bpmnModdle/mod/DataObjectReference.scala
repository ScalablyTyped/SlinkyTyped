package typingsSlinky.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.bpmnModdle.mod.TypeDerived because Already inherited
- typingsSlinky.bpmnModdle.mod.BaseElement because Already inherited
- typingsSlinky.bpmnModdle.mod.FlowElement because var conflicts: $attrs, $parent, $type, documentation, extensionDefinitions, extensionElements, id. Inlined name, auditing, monitoring, categoryValueRef */ @js.native
trait DataObjectReference extends ItemAwareElement {
  
  var auditing: Auditing = js.native
  
  var categoryValueRef: js.Array[CategoryValue] = js.native
  
  var dataObjectRef: DataObject = js.native
  
  var monitoring: Monitoring = js.native
  
  var name: js.UndefOr[String] = js.native
}
object DataObjectReference {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    auditing: Auditing,
    categoryValueRef: js.Array[CategoryValue],
    dataObjectRef: DataObject,
    dataState: DataState,
    id: String,
    itemSubjectRef: ItemDefinition,
    monitoring: Monitoring
  ): DataObjectReference = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], dataObjectRef = dataObjectRef.asInstanceOf[js.Any], dataState = dataState.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemSubjectRef = itemSubjectRef.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObjectReference]
  }
  
  @scala.inline
  implicit class DataObjectReferenceMutableBuilder[Self <: DataObjectReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuditing(value: Auditing): Self = StObject.set(x, "auditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryValueRef(value: js.Array[CategoryValue]): Self = StObject.set(x, "categoryValueRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryValueRefVarargs(value: CategoryValue*): Self = StObject.set(x, "categoryValueRef", js.Array(value :_*))
    
    @scala.inline
    def setDataObjectRef(value: DataObject): Self = StObject.set(x, "dataObjectRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoring(value: Monitoring): Self = StObject.set(x, "monitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
