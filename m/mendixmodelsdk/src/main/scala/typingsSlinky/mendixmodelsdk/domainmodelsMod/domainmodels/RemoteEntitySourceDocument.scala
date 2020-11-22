package typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels

import typingsSlinky.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.projectsMod.projects.Document
import typingsSlinky.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 7.18.0: introduced
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
- typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IRemoteEntitySourceDocument because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined icon, serviceName, version, endpointId, minimumMxVersion, recommendedMxVersion, applicationId, environmentType */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.RemoteEntitySourceDocument")
@js.native
abstract class RemoteEntitySourceDocument protected () extends Document {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  
  /**
    * In version 8.12.0: added public
    * In version 8.11.0: introduced
    */
  def applicationId: String = js.native
  def applicationId_=(newValue: String): Unit = js.native
  /**
    * In version 8.12.0: added public
    * In version 8.11.0: introduced
    */
  @JSName("applicationId")
  val applicationId_FRemoteEntitySourceDocument: String = js.native
  
  /**
    * In version 8.10.0: introduced
    */
  def catalogUrl: String = js.native
  def catalogUrl_=(newValue: String): Unit = js.native
  
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MRemoteEntitySourceDocument: FolderBase = js.native
  
  /**
    * In version 8.10.0: introduced
    */
  def description: String = js.native
  def description_=(newValue: String): Unit = js.native
  
  /**
    * In version 8.14.0: introduced
    */
  def endpointId: String = js.native
  def endpointId_=(newValue: String): Unit = js.native
  /**
    * In version 8.14.0: introduced
    */
  @JSName("endpointId")
  val endpointId_FRemoteEntitySourceDocument: String = js.native
  
  /**
    * In version 8.14.0: introduced
    */
  def environmentType: EnvironmentType = js.native
  def environmentType_=(newValue: EnvironmentType): Unit = js.native
  /**
    * In version 8.14.0: introduced
    */
  @JSName("environmentType")
  val environmentType_FRemoteEntitySourceDocument: EnvironmentType = js.native
  
  /**
    * In version 8.11.0: added public
    * In version 8.10.0: introduced
    */
  def icon: String | Null = js.native
  def icon_=(newValue: String | Null): Unit = js.native
  /**
    * In version 8.11.0: added public
    * In version 8.10.0: introduced
    */
  @JSName("icon")
  val icon_FRemoteEntitySourceDocument: String | Null = js.native
  
  def metadata: String = js.native
  
  def metadataUrl: String = js.native
  def metadataUrl_=(newValue: String): Unit = js.native
  
  def metadata_=(newValue: String): Unit = js.native
  
  /**
    * In version 8.14.0: introduced
    */
  def minimumMxVersion: String = js.native
  def minimumMxVersion_=(newValue: String): Unit = js.native
  /**
    * In version 8.14.0: introduced
    */
  @JSName("minimumMxVersion")
  val minimumMxVersion_FRemoteEntitySourceDocument: String = js.native
  
  /**
    * In version 8.14.0: introduced
    */
  def recommendedMxVersion: String = js.native
  def recommendedMxVersion_=(newValue: String): Unit = js.native
  /**
    * In version 8.14.0: introduced
    */
  @JSName("recommendedMxVersion")
  val recommendedMxVersion_FRemoteEntitySourceDocument: String = js.native
  
  /**
    * In version 8.10.0: added public
    * In version 8.0.0: introduced
    */
  def serviceName: String = js.native
  def serviceName_=(newValue: String): Unit = js.native
  /**
    * In version 8.10.0: added public
    * In version 8.0.0: introduced
    */
  @JSName("serviceName")
  val serviceName_FRemoteEntitySourceDocument: String = js.native
  
  /**
    * In version 8.10.0: added public
    * In version 8.0.0: introduced
    */
  def version: String = js.native
  def version_=(newValue: String): Unit = js.native
  /**
    * In version 8.10.0: added public
    * In version 8.0.0: introduced
    */
  @JSName("version")
  val version_FRemoteEntitySourceDocument: String = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.RemoteEntitySourceDocument")
@js.native
object RemoteEntitySourceDocument extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
