package typingsSlinky.mendixmodelsdk.workflowsMod.workflows

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
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
  * In version 9.0.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsSlinky.mendixmodelsdk.workflowsMod.workflows.IOutcome because Already inherited
- typingsSlinky.mendixmodelsdk.workflowsMod.workflows.IParallelSplitOutcome because var conflicts: containerAsExclusiveSplitActivity, containerAsParallelSplitActivity, containerAsWorkflowTask, flow, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.ParallelSplitOutcome")
@js.native
class ParallelSplitOutcome protected () extends Outcome {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsParallelSplitActivity")
  def containerAsParallelSplitActivity_MParallelSplitOutcome: ParallelSplitActivity = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.ParallelSplitOutcome")
@js.native
object ParallelSplitOutcome extends js.Object {
  
  /**
    * Creates and returns a new ParallelSplitOutcome instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ParallelSplitOutcome = js.native
  
  /**
    * Creates and returns a new ParallelSplitOutcome instance in the SDK and on the server.
    * The new ParallelSplitOutcome will be automatically stored in the 'outcomes' property
    * of the parent ParallelSplitActivity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.0 and higher
    */
  def createIn(container: ParallelSplitActivity): ParallelSplitOutcome = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
