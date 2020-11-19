package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions.IMicroflowActionInfo
import typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions.MicroflowActionInfo
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.securityMod.security.IModuleRole
import typingsSlinky.mendixmodelsdk.textsMod.texts.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/microflows relevant section in reference guide}
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
- typingsSlinky.mendixmodelsdk.microflowsMod.microflows.IMicroflowBase because Already inherited
- typingsSlinky.mendixmodelsdk.microflowsMod.microflows.IServerSideMicroflow because Already inherited
- typingsSlinky.mendixmodelsdk.microflowsMod.microflows.IMicroflow because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined allowedModuleRoles, allowedModuleRolesQualifiedNames, microflowActionInfo */ @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.Microflow")
@js.native
class Microflow protected () extends ServerSideMicroflow {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  
  def allowConcurrentExecution: Boolean = js.native
  def allowConcurrentExecution_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 7.23.0: added public
    */
  def allowedModuleRoles: IList[IModuleRole] = js.native
  
  def allowedModuleRolesQualifiedNames: js.Array[String] = js.native
  @JSName("allowedModuleRolesQualifiedNames")
  val allowedModuleRolesQualifiedNames_FMicroflow: js.Array[String] = js.native
  
  /**
    * In version 7.23.0: added public
    */
  @JSName("allowedModuleRoles")
  val allowedModuleRoles_FMicroflow: IList[IModuleRole] = js.native
  
  def concurrencyErrorMessage: Text = js.native
  def concurrencyErrorMessage_=(newValue: Text): Unit = js.native
  
  def concurrencyErrorMicroflow: IMicroflow | Null = js.native
  
  def concurrencyErrorMicroflowQualifiedName: String | Null = js.native
  
  def concurrencyErrorMicroflow_=(newValue: IMicroflow | Null): Unit = js.native
  
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MMicroflow: FolderBase = js.native
  
  /**
    * In version 8.0.0: introduced
    */
  def microflowActionInfo: MicroflowActionInfo | Null = js.native
  def microflowActionInfo_=(newValue: MicroflowActionInfo | Null): Unit = js.native
  /**
    * In version 8.0.0: introduced
    */
  @JSName("microflowActionInfo")
  val microflowActionInfo_FMicroflow: IMicroflowActionInfo | Null = js.native
  
  @JSName("model")
  var model_FMicroflow: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.Microflow")
@js.native
object Microflow extends js.Object {
  
  /**
    * Creates a new Microflow unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): Microflow = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
