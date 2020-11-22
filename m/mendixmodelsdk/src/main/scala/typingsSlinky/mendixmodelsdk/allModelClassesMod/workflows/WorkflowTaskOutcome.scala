package typingsSlinky.mendixmodelsdk.allModelClassesMod.workflows

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
  * In version 8.15.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.WorkflowTaskOutcome")
@js.native
class WorkflowTaskOutcome protected ()
  extends typingsSlinky.mendixmodelsdk.workflowsMod.workflows.WorkflowTaskOutcome {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.WorkflowTaskOutcome")
@js.native
object WorkflowTaskOutcome extends js.Object {
  
  /**
    * Creates and returns a new WorkflowTaskOutcome instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.WorkflowTaskOutcome = js.native
  
  /**
    * Creates and returns a new WorkflowTaskOutcome instance in the SDK and on the server.
    * The new WorkflowTaskOutcome will be automatically stored in the 'outcomes' property
    * of the parent WorkflowTask element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.workflowsMod.workflows.WorkflowTask): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.WorkflowTaskOutcome = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
