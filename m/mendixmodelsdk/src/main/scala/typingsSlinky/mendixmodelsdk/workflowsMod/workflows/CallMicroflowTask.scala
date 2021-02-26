package typingsSlinky.mendixmodelsdk.workflowsMod.workflows

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.IMicroflow
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
- typingsSlinky.mendixmodelsdk.workflowsMod.workflows.IWorkflowActivity because Already inherited
- typingsSlinky.mendixmodelsdk.workflowsMod.workflows.IWorkflowTask because Already inherited
- typingsSlinky.mendixmodelsdk.workflowsMod.workflows.ICallMicroflowTask because var conflicts: containerAsFlow, id, isLoaded, model, outcomes, structureTypeName, unit. Inlined microflow, microflowQualifiedName */ @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.CallMicroflowTask")
@js.native
class CallMicroflowTask protected () extends WorkflowTask {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsFlow")
  def containerAsFlow_MCallMicroflowTask: Flow = js.native
  
  def microflow: IMicroflow | Null = js.native
  
  def microflowQualifiedName: String | Null = js.native
  @JSName("microflowQualifiedName")
  val microflowQualifiedName_FCallMicroflowTask: String | Null = js.native
  
  def microflow_=(newValue: IMicroflow | Null): Unit = js.native
  @JSName("microflow")
  val microflow_FCallMicroflowTask: IMicroflow | Null = js.native
}
object CallMicroflowTask {
  
  @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.CallMicroflowTask")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new CallMicroflowTask instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.CallMicroflowTask.create")
  @js.native
  def create(model: IModel): CallMicroflowTask = js.native
  
  /**
    * Creates and returns a new CallMicroflowTask instance in the SDK and on the server.
    * The new CallMicroflowTask will be automatically stored in the 'activities' property
    * of the parent Flow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.CallMicroflowTask.createIn")
  @js.native
  def createIn(container: Flow): CallMicroflowTask = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.CallMicroflowTask.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.CallMicroflowTask.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
