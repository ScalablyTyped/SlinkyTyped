package typingsSlinky.mendixmodelsdk.mod.workflows

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
@JSImport("mendixmodelsdk", "workflows.Flow")
@js.native
class Flow protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.workflows.Flow {
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
@JSImport("mendixmodelsdk", "workflows.Flow")
@js.native
object Flow extends js.Object {
  
  /**
    * Creates and returns a new Flow instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.Flow = js.native
  
  /**
    * Creates and returns a new Flow instance in the SDK and on the server.
    * The new Flow will be automatically stored in the 'flow' property
    * of the parent Outcome element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInOutcomeUnderFlow(container: typingsSlinky.mendixmodelsdk.workflowsMod.workflows.Outcome): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.Flow = js.native
  
  /**
    * Creates and returns a new Flow instance in the SDK and on the server.
    * The new Flow will be automatically stored in the 'flow' property
    * of the parent Workflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInWorkflowUnderFlow(container: typingsSlinky.mendixmodelsdk.workflowsMod.workflows.Workflow): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.Flow = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
