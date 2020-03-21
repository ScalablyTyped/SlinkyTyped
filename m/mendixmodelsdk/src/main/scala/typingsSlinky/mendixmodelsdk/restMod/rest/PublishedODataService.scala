package typingsSlinky.mendixmodelsdk.restMod.rest

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typingsSlinky.mendixmodelsdk.projectsMod.projects.Document
import typingsSlinky.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.restMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.securityMod.security.IModuleRole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/published-odata-services relevant section in reference guide}
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typingsSlinky.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
- typingsSlinky.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
- typingsSlinky.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
- typingsSlinky.mendixmodelsdk.restMod.rest.IPublishedODataService because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/rest", "rest.PublishedODataService")
@js.native
class PublishedODataService protected () extends Document {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  @JSName("model")
  var model_FPublishedODataService: IModel = js.native
  def allowedModuleRoles(): IList[IModuleRole] = js.native
  def allowedModuleRolesQualifiedNames(): js.Array[String] = js.native
  def authenticationMicroflow(): js.Any = js.native
  def authenticationMicroflow(newValue: IMicroflow): js.Any = js.native
  def authenticationMicroflowQualifiedName(): String | Null = js.native
  /**
    * In version 8.0.0: introduced
    */
  @JSName("authenticationMicroflow")
  def authenticationMicroflow_Union(): IMicroflow | Null = js.native
  /**
    * In version 8.0.0: introduced
    */
  def authenticationTypes(): IList[RestAuthenticationType] = js.native
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MPublishedODataService(): FolderBase = js.native
  /**
    * In version 8.4.0: introduced
    */
  def description(): String = js.native
  def description(newValue: String): js.Any = js.native
  def namespace(): String = js.native
  def namespace(newValue: String): js.Any = js.native
  def path(): String = js.native
  def path(newValue: String): js.Any = js.native
  /**
    * In version 7.19.0: introduced
    */
  def publishAssociations(): Boolean = js.native
  def publishAssociations(newValue: Boolean): js.Any = js.native
  def resources(): IList[PublishedRestResource] = js.native
  /**
    * In version 8.0.0: introduced
    */
  def serviceName(): String = js.native
  def serviceName(newValue: String): js.Any = js.native
  /**
    * In version 8.4.0: introduced
    */
  def summary(): String = js.native
  def summary(newValue: String): js.Any = js.native
  /**
    * In version 8.0.0: introduced
    */
  def version(): String = js.native
  def version(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/rest", "rest.PublishedODataService")
@js.native
object PublishedODataService extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new PublishedODataService unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): PublishedODataService = js.native
}

