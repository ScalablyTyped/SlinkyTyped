package typingsSlinky.mendixmodelsdk.workflowsMod.workflows

import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.StringTemplate
import typingsSlinky.mendixmodelsdk.pagesMod.pages.IPage
import typingsSlinky.mendixmodelsdk.projectsMod.projects.Document
import typingsSlinky.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
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
- typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typingsSlinky.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
- typingsSlinky.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
- typingsSlinky.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
- typingsSlinky.mendixmodelsdk.workflowsMod.workflows.IWorkflow because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined title, contextEntity, contextEntityQualifiedName, overviewPage, overviewPageQualifiedName, flow */ @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.Workflow")
@js.native
class Workflow protected () extends Document {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MWorkflow: FolderBase = js.native
  
  def contextEntity: IEntity | Null = js.native
  
  def contextEntityQualifiedName: String | Null = js.native
  @JSName("contextEntityQualifiedName")
  val contextEntityQualifiedName_FWorkflow: String | Null = js.native
  
  def contextEntity_=(newValue: IEntity | Null): Unit = js.native
  @JSName("contextEntity")
  val contextEntity_FWorkflow: IEntity | Null = js.native
  
  def description: String = js.native
  def description_=(newValue: String): Unit = js.native
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def dueDate: String = js.native
  def dueDate_=(newValue: String): Unit = js.native
  
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
  val flow_FWorkflow: IFlow = js.native
  
  def overviewPage: IPage | Null = js.native
  
  def overviewPageQualifiedName: String | Null = js.native
  @JSName("overviewPageQualifiedName")
  val overviewPageQualifiedName_FWorkflow: String | Null = js.native
  
  def overviewPage_=(newValue: IPage | Null): Unit = js.native
  @JSName("overviewPage")
  val overviewPage_FWorkflow: IPage | Null = js.native
  
  def subject: StringTemplate = js.native
  def subject_=(newValue: StringTemplate): Unit = js.native
  
  def title: String = js.native
  def title_=(newValue: String): Unit = js.native
  @JSName("title")
  val title_FWorkflow: String = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.Workflow")
@js.native
object Workflow extends js.Object {
  
  /**
    * Creates a new Workflow unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): Workflow = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
