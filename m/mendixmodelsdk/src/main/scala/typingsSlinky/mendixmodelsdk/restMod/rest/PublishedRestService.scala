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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/published-rest-services relevant section in reference guide}
  *
  * In version 7.11.0: removed experimental
  * In version 7.6.0: introduced
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
- typingsSlinky.mendixmodelsdk.restMod.rest.IPublishedRestService because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/rest", "rest.PublishedRestService")
@js.native
class PublishedRestService protected () extends Document {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  
  def allowedRoles: IList[IModuleRole] = js.native
  
  def allowedRolesQualifiedNames: js.Array[String] = js.native
  
  /**
    * In version 7.17.0: introduced
    */
  def authenticationMicroflow: IMicroflow | Null = js.native
  
  def authenticationMicroflowQualifiedName: String | Null = js.native
  
  def authenticationMicroflow_=(newValue: IMicroflow | Null): Unit = js.native
  
  /**
    * In version 7.13.0: deleted
    * In version 7.11.0: introduced
    */
  def authenticationType: RestAuthenticationType = js.native
  def authenticationType_=(newValue: RestAuthenticationType): Unit = js.native
  
  /**
    * In version 7.13.0: introduced
    */
  def authenticationTypes: IList[RestAuthenticationType] = js.native
  
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MPublishedRestService: FolderBase = js.native
  
  /**
    * In version 7.18.0: introduced
    */
  def corsConfiguration: CorsConfiguration | Null = js.native
  def corsConfiguration_=(newValue: CorsConfiguration | Null): Unit = js.native
  
  @JSName("model")
  var model_FPublishedRestService: IModel = js.native
  
  /**
    * In version 7.17.0: introduced
    */
  def parameters: IList[RestOperationParameter] = js.native
  
  def path: String = js.native
  def path_=(newValue: String): Unit = js.native
  
  /**
    * In version 7.7.0: introduced
    */
  def resources: IList[PublishedRestServiceResource] = js.native
  
  /**
    * In version 7.12.0: introduced
    */
  def serviceName: String = js.native
  def serviceName_=(newValue: String): Unit = js.native
  
  /**
    * In version 7.12.0: introduced
    */
  def version: String = js.native
  def version_=(newValue: String): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/rest", "rest.PublishedRestService")
@js.native
object PublishedRestService extends js.Object {
  
  /**
    * Creates a new PublishedRestService unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): PublishedRestService = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
