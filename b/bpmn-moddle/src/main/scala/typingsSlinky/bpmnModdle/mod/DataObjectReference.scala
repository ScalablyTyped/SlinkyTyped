package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class DataObjectReferenceOps[Self <: DataObjectReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuditing(value: Auditing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auditing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategoryValueRef(value: js.Array[CategoryValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryValueRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataObjectRef(value: DataObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataObjectRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonitoring(value: Monitoring): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

