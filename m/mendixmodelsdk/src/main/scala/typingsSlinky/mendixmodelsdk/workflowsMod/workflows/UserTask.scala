package typingsSlinky.mendixmodelsdk.workflowsMod.workflows

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.StringTemplate
import typingsSlinky.mendixmodelsdk.pagesMod.pages.IPage
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
- typingsSlinky.mendixmodelsdk.workflowsMod.workflows.IUserTask because var conflicts: containerAsFlow, id, isLoaded, model, outcomes, structureTypeName, unit. Inlined page, pageQualifiedName */ @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.UserTask")
@js.native
class UserTask protected () extends WorkflowTask {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsFlow")
  def containerAsFlow_MUserTask: Flow = js.native
  
  def description: StringTemplate = js.native
  def description_=(newValue: StringTemplate): Unit = js.native
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def dueDate: String = js.native
  def dueDate_=(newValue: String): Unit = js.native
  
  def page: IPage | Null = js.native
  
  def pageQualifiedName: String | Null = js.native
  @JSName("pageQualifiedName")
  val pageQualifiedName_FUserTask: String | Null = js.native
  
  def page_=(newValue: IPage | Null): Unit = js.native
  @JSName("page")
  val page_FUserTask: IPage | Null = js.native
  
  def subject: StringTemplate = js.native
  def subject_=(newValue: StringTemplate): Unit = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    */
  def userSource: UserSource = js.native
  def userSource_=(newValue: UserSource): Unit = js.native
}
object UserTask {
  
  @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.UserTask")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new UserTask instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.UserTask.create")
  @js.native
  def create(model: IModel): UserTask = js.native
  
  /**
    * Creates and returns a new UserTask instance in the SDK and on the server.
    * The new UserTask will be automatically stored in the 'activities' property
    * of the parent Flow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.UserTask.createIn")
  @js.native
  def createIn(container: Flow): UserTask = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.UserTask.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.UserTask.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
