package typingsSlinky.mendixmodelsdk.workflowsMod.workflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.StringTemplate
import typingsSlinky.mendixmodelsdk.pagesMod.pages.IPage
import typingsSlinky.mendixmodelsdk.securityMod.security.IUserRole
import typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
- typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
- typingsSlinky.mendixmodelsdk.workflowsMod.workflows.IWorkflowActivity because Already inherited
- typingsSlinky.mendixmodelsdk.workflowsMod.workflows.IWorkflowTask because Already inherited
- typingsSlinky.mendixmodelsdk.workflowsMod.workflows.IUserTask because var conflicts: containerAsWorkflow, id, isLoaded, model, name, possibleOutcomes, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.UserTask")
@js.native
class UserTask protected () extends WorkflowTask {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  @JSName("containerAsWorkflow")
  def containerAsWorkflow_MUserTask: Workflow = js.native
  
  def description: StringTemplate = js.native
  def description_=(newValue: StringTemplate): Unit = js.native
  
  @JSName("model")
  var model_FUserTask: IModel = js.native
  
  def page: IPage | Null = js.native
  
  def pageQualifiedName: String | Null = js.native
  
  def page_=(newValue: IPage | Null): Unit = js.native
  
  def subject: StringTemplate = js.native
  def subject_=(newValue: StringTemplate): Unit = js.native
  
  /**
    * In version 8.11.0: deleted
    */
  def userRole: IUserRole | Null = js.native
  
  def userRoleQualifiedName: String | Null = js.native
  
  def userRole_=(newValue: IUserRole | Null): Unit = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.11.0: introduced
    */
  def userSource: UserSource = js.native
  def userSource_=(newValue: UserSource): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.UserTask")
@js.native
object UserTask extends js.Object {
  
  /**
    * Creates and returns a new UserTask instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): UserTask = js.native
  
  /**
    * Creates and returns a new UserTask instance in the SDK and on the server.
    * The new UserTask will be automatically stored in the 'activities' property
    * of the parent Workflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.10.0 and higher
    */
  def createIn(container: Workflow): UserTask = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
