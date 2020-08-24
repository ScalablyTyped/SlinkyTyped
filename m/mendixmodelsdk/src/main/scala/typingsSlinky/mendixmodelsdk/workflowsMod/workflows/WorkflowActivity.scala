package typingsSlinky.mendixmodelsdk.workflowsMod.workflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.commonMod.common.IPoint
import typingsSlinky.mendixmodelsdk.commonMod.common.ISize
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 8.10.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsSlinky.mendixmodelsdk.workflowsMod.workflows.IWorkflowActivity because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsWorkflow, caption */ @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.WorkflowActivity")
@js.native
abstract class WorkflowActivity protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  /**
    * In version 8.12.0: added public
    */
  @JSName("caption")
  val caption_FWorkflowActivity: String = js.native
  @JSName("containerAsWorkflow")
  val containerAsWorkflow_FWorkflowActivity: IWorkflow = js.native
  @JSName("model")
  var model_FWorkflowActivity: IModel = js.native
  /**
    * In version 8.12.0: added public
    */
  def caption: String = js.native
  def caption_=(newValue: String): Unit = js.native
  def containerAsWorkflow: Workflow = js.native
  def location: IPoint = js.native
  def location_=(newValue: IPoint): Unit = js.native
  def size: ISize = js.native
  def size_=(newValue: ISize): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.WorkflowActivity")
@js.native
object WorkflowActivity extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

