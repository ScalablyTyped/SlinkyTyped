package typingsSlinky.mendixmodelsdk.workflowsMod.workflows

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 8.15.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsSlinky.mendixmodelsdk.workflowsMod.workflows.IFlow because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsOutcome, containerAsWorkflow, activities */ @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.Flow")
@js.native
class Flow protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    */
  def activities: IList[WorkflowActivity] = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    */
  @JSName("activities")
  val activities_FFlow: IList[IWorkflowActivity] = js.native
  
  def containerAsOutcome: Outcome = js.native
  @JSName("containerAsOutcome")
  val containerAsOutcome_FFlow: IOutcome = js.native
  
  def containerAsWorkflow: Workflow = js.native
  @JSName("containerAsWorkflow")
  val containerAsWorkflow_FFlow: IWorkflow = js.native
}
object Flow {
  
  @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.Flow")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new Flow instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.Flow.create")
  @js.native
  def create(model: IModel): Flow = js.native
  
  /**
    * Creates and returns a new Flow instance in the SDK and on the server.
    * The new Flow will be automatically stored in the 'flow' property
    * of the parent Outcome element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.Flow.createInOutcomeUnderFlow")
  @js.native
  def createInOutcomeUnderFlow(container: Outcome): Flow = js.native
  
  /**
    * Creates and returns a new Flow instance in the SDK and on the server.
    * The new Flow will be automatically stored in the 'flow' property
    * of the parent Workflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.Flow.createInWorkflowUnderFlow")
  @js.native
  def createInWorkflowUnderFlow(container: Workflow): Flow = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.Flow.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.Flow.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
