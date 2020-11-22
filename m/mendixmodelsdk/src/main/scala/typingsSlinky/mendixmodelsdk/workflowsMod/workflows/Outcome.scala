package typingsSlinky.mendixmodelsdk.workflowsMod.workflows

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo
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
- typingsSlinky.mendixmodelsdk.workflowsMod.workflows.IOutcome because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsExclusiveSplitActivity, containerAsParallelSplitActivity, containerAsWorkflowTask, flow */ @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.Outcome")
@js.native
abstract class Outcome protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsExclusiveSplitActivity: ExclusiveSplitActivity = js.native
  @JSName("containerAsExclusiveSplitActivity")
  val containerAsExclusiveSplitActivity_FOutcome: IExclusiveSplitActivity = js.native
  
  def containerAsParallelSplitActivity: ParallelSplitActivity = js.native
  @JSName("containerAsParallelSplitActivity")
  val containerAsParallelSplitActivity_FOutcome: IParallelSplitActivity = js.native
  
  def containerAsWorkflowTask: WorkflowTask = js.native
  @JSName("containerAsWorkflowTask")
  val containerAsWorkflowTask_FOutcome: IWorkflowTask = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    */
  def flow: Flow = js.native
  def flow_=(newValue: Flow): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    */
  @JSName("flow")
  val flow_FOutcome: IFlow = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.Outcome")
@js.native
object Outcome extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
