package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.bpmnModdle.mod.TypeDerived because Already inherited
- typingsSlinky.bpmnModdle.mod.BaseElement because Already inherited
- typingsSlinky.bpmnModdle.mod.ItemAwareElement because var conflicts: $attrs, $parent, $type, documentation, extensionDefinitions, extensionElements, id. Inlined itemSubjectRef, dataState */ @js.native
trait DataStoreReference extends FlowElement {
  var dataState: DataState = js.native
  var dataStoreRef: DataStore = js.native
  var itemSubjectRef: ItemDefinition = js.native
}

object DataStoreReference {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    auditing: Auditing,
    categoryValueRef: js.Array[CategoryValue],
    dataState: DataState,
    dataStoreRef: DataStore,
    id: String,
    itemSubjectRef: ItemDefinition,
    monitoring: Monitoring
  ): DataStoreReference = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], dataState = dataState.asInstanceOf[js.Any], dataStoreRef = dataStoreRef.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemSubjectRef = itemSubjectRef.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataStoreReference]
  }
  @scala.inline
  implicit class DataStoreReferenceOps[Self <: DataStoreReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataState(value: DataState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataStoreRef(value: DataStore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataStoreRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemSubjectRef(value: ItemDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSubjectRef")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

