package typingsSlinky.mendixmodelsdk.mod.workflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 8.10.0: introduced
  */
@JSImport("mendixmodelsdk", "workflows.StartWorkflowActivity")
@js.native
class StartWorkflowActivity protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.workflows.StartWorkflowActivity {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk", "workflows.StartWorkflowActivity")
@js.native
object StartWorkflowActivity extends js.Object {
  
  /**
    * Creates and returns a new StartWorkflowActivity instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.StartWorkflowActivity = js.native
  
  /**
    * Creates and returns a new StartWorkflowActivity instance in the SDK and on the server.
    * The new StartWorkflowActivity will be automatically stored in the 'activities' property
    * of the parent Workflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.10.0 and higher
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.workflowsMod.workflows.Workflow): typingsSlinky.mendixmodelsdk.workflowsMod.workflows.StartWorkflowActivity = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
