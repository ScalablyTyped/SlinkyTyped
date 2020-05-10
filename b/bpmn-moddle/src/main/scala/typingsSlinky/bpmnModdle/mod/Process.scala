package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.bpmnModdle.mod.TypeDerived because Already inherited
- typingsSlinky.bpmnModdle.mod.BaseElement because Already inherited
- typingsSlinky.bpmnModdle.mod.CallableElement because var conflicts: $attrs, $parent, $type, documentation, extensionDefinitions, extensionElements, id. Inlined name, ioSpecification, supportedInterfaceRef, ioBinding */ @js.native
trait Process extends FlowElementsContainer {
  var artifacts: js.Array[Artifact] = js.native
  var auditing: Auditing = js.native
  var correlationSubscriptions: js.Array[CorrelationSubscription] = js.native
  var definitionalCollaborationRef: Collaboration = js.native
  var ioBinding: InputOutputBinding = js.native
  var ioSpecification: InputOutputSpecification = js.native
  var isClosed: Boolean = js.native
  var isExecutable: Boolean = js.native
  var monitoring: Monitoring = js.native
  var name: String = js.native
  var processType: String = js.native
  var properties: js.Array[Property] = js.native
  var resources: js.Array[ResourceRole] = js.native
  var supportedInterfaceRef: Interface = js.native
  var supports: js.Array[Process] = js.native
}

object Process {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    artifacts: js.Array[Artifact],
    auditing: Auditing,
    correlationSubscriptions: js.Array[CorrelationSubscription],
    definitionalCollaborationRef: Collaboration,
    flowElements: js.Array[FlowElement],
    id: String,
    ioBinding: InputOutputBinding,
    ioSpecification: InputOutputSpecification,
    isClosed: Boolean,
    isExecutable: Boolean,
    laneSets: js.Array[LaneSet],
    monitoring: Monitoring,
    name: String,
    processType: String,
    properties: js.Array[Property],
    resources: js.Array[ResourceRole],
    supportedInterfaceRef: Interface,
    supports: js.Array[Process]
  ): Process = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], correlationSubscriptions = correlationSubscriptions.asInstanceOf[js.Any], definitionalCollaborationRef = definitionalCollaborationRef.asInstanceOf[js.Any], flowElements = flowElements.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ioBinding = ioBinding.asInstanceOf[js.Any], ioSpecification = ioSpecification.asInstanceOf[js.Any], isClosed = isClosed.asInstanceOf[js.Any], isExecutable = isExecutable.asInstanceOf[js.Any], laneSets = laneSets.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], processType = processType.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], supportedInterfaceRef = supportedInterfaceRef.asInstanceOf[js.Any], supports = supports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Process]
  }
  @scala.inline
  implicit class ProcessOps[Self <: Process] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtifacts(value: js.Array[Artifact]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuditing(value: Auditing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auditing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCorrelationSubscriptions(value: js.Array[CorrelationSubscription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correlationSubscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefinitionalCollaborationRef(value: Collaboration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionalCollaborationRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIoBinding(value: InputOutputBinding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ioBinding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIoSpecification(value: InputOutputSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ioSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsClosed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isClosed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsExecutable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExecutable")(value.asInstanceOf[js.Any])
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
    def withProcessType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: js.Array[Property]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResources(value: js.Array[ResourceRole]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedInterfaceRef(value: Interface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedInterfaceRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupports(value: js.Array[Process]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supports")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

