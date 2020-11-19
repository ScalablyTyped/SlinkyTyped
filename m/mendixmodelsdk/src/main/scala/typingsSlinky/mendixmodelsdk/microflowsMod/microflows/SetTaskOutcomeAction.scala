package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.workflowsMod.workflows.IWorkflowTaskOutcome
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 8.10.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.SetTaskOutcomeAction")
@js.native
class SetTaskOutcomeAction protected () extends MicroflowAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  @JSName("model")
  var model_FSetTaskOutcomeAction: IModel = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    */
  def outcome: IWorkflowTaskOutcome | Null = js.native
  
  def outcomeQualifiedName: String | Null = js.native
  
  def outcome_=(newValue: IWorkflowTaskOutcome | Null): Unit = js.native
  
  def workflowTaskVariable: String = js.native
  def workflowTaskVariable_=(newValue: String): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.SetTaskOutcomeAction")
@js.native
object SetTaskOutcomeAction extends js.Object {
  
  /**
    * Creates and returns a new SetTaskOutcomeAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): SetTaskOutcomeAction = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeAction instance in the SDK and on the server.
    * The new SetTaskOutcomeAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.10.0 and higher
    */
  def createIn(container: ActionActivity): SetTaskOutcomeAction = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
