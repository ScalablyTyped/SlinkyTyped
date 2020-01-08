package typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenCodeactionsMod.codeactions.IMicroflowActionInfo
import typingsSlinky.mendixmodelsdk.distGenCodeactionsMod.codeactions.MicroflowActionInfo
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distGenProjectsMod.projects.FolderBase
import typingsSlinky.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.distGenSecurityMod.security.IModuleRole
import typingsSlinky.mendixmodelsdk.distGenTextsMod.texts.Text
import typingsSlinky.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/microflows relevant section in reference guide}
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.distGenProjectsMod.projects.IModuleDocument because Already inherited
- typings.mendixmodelsdk.distGenProjectsMod.projects.IDocument because Already inherited
- typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflowBase because Already inherited
- typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IServerSideMicroflow because Already inherited
- typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflow because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined allowedModuleRoles, allowedModuleRolesQualifiedNames, microflowActionInfo */ @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.Microflow")
@js.native
class Microflow protected () extends ServerSideMicroflow {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  @JSName("allowedModuleRolesQualifiedNames")
  val allowedModuleRolesQualifiedNames_FMicroflow: js.Array[String] = js.native
  /**
    * In version 7.23.0: added public
    */
  @JSName("allowedModuleRoles")
  val allowedModuleRoles_FMicroflow: IList[IModuleRole] = js.native
  /**
    * In version 8.0.0: introduced
    */
  @JSName("microflowActionInfo")
  val microflowActionInfo_FMicroflow: IMicroflowActionInfo | Null = js.native
  @JSName("model")
  var model_FMicroflow: IModel = js.native
  def allowConcurrentExecution(): Boolean = js.native
  def allowConcurrentExecution(newValue: Boolean): js.Any = js.native
  /**
    * In version 7.23.0: added public
    */
  def allowedModuleRoles(): IList[IModuleRole] = js.native
  def allowedModuleRolesQualifiedNames(): js.Array[String] = js.native
  def concurrencyErrorMessage(): Text = js.native
  def concurrencyErrorMessage(newValue: Text): js.Any = js.native
  def concurrencyErrorMicroflow(): IMicroflow | Null = js.native
  def concurrencyErrorMicroflow(newValue: IMicroflow): js.Any = js.native
  def concurrencyErrorMicroflowQualifiedName(): String | Null = js.native
  @JSName("concurrencyErrorMicroflow")
  def concurrencyErrorMicroflow_Any(): js.Any = js.native
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MMicroflow(): FolderBase = js.native
  /**
    * In version 8.0.0: introduced
    */
  def microflowActionInfo(): MicroflowActionInfo | Null = js.native
  def microflowActionInfo(newValue: MicroflowActionInfo): js.Any = js.native
  @JSName("microflowActionInfo")
  def microflowActionInfo_Any(): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.Microflow")
@js.native
object Microflow extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new Microflow unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): Microflow = js.native
}

