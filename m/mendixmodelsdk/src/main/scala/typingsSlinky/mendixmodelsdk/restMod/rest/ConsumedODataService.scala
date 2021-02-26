package typingsSlinky.mendixmodelsdk.restMod.rest

import typingsSlinky.mendixmodelsdk.constantsMod.constants.IConstant
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.RemoteEntitySourceDocument
import typingsSlinky.mendixmodelsdk.expressionsMod.expressions.Expression
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.HttpConfiguration
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.RequestProxyType
import typingsSlinky.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.restMod.StructureVersionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/consumed-odata-service-properties relevant section in reference guide}
  *
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
- typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IRemoteEntitySourceDocument because Already inherited
- typingsSlinky.mendixmodelsdk.restMod.rest.IConsumedODataService because var conflicts: applicationId, containerAsFolderBase, endpointId, environmentType, icon, id, isLoaded, minimumMxVersion, model, recommendedMxVersion, serviceName, structureTypeName, unit, version. Inlined lastUpdated */ @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ConsumedODataService")
@js.native
class ConsumedODataService protected () extends RemoteEntitySourceDocument {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MConsumedODataService: FolderBase = js.native
  
  /**
    * In version 8.4.0: introduced
    */
  def headersMicroflow: IMicroflow | Null = js.native
  
  def headersMicroflowQualifiedName: String | Null = js.native
  
  def headersMicroflow_=(newValue: IMicroflow | Null): Unit = js.native
  
  /**
    * In version 8.0.0: introduced
    */
  def httpConfiguration: HttpConfiguration = js.native
  def httpConfiguration_=(newValue: HttpConfiguration): Unit = js.native
  
  /**
    * In version 8.14.0: introduced
    */
  def lastUpdated: String = js.native
  def lastUpdated_=(newValue: String): Unit = js.native
  /**
    * In version 8.14.0: introduced
    */
  @JSName("lastUpdated")
  val lastUpdated_FConsumedODataService: String = js.native
  
  /**
    * In version 8.6.0: introduced
    */
  def metadataReferences: IList[MetadataReference] = js.native
  
  /**
    * In version 8.6.0: introduced
    */
  def oDataVersion: ODataVersion = js.native
  def oDataVersion_=(newValue: ODataVersion): Unit = js.native
  
  def proxyHost: IConstant | Null = js.native
  
  def proxyHostQualifiedName: String | Null = js.native
  
  def proxyHost_=(newValue: IConstant | Null): Unit = js.native
  
  def proxyPassword: IConstant | Null = js.native
  
  def proxyPasswordQualifiedName: String | Null = js.native
  
  def proxyPassword_=(newValue: IConstant | Null): Unit = js.native
  
  def proxyPort: IConstant | Null = js.native
  
  def proxyPortQualifiedName: String | Null = js.native
  
  def proxyPort_=(newValue: IConstant | Null): Unit = js.native
  
  def proxyType: RequestProxyType = js.native
  def proxyType_=(newValue: RequestProxyType): Unit = js.native
  
  def proxyUsername: IConstant | Null = js.native
  
  def proxyUsernameQualifiedName: String | Null = js.native
  
  def proxyUsername_=(newValue: IConstant | Null): Unit = js.native
  
  /**
    * In version 8.14.0: deleted
    * In version 8.0.0: introduced
    */
  def serviceId: String = js.native
  def serviceId_=(newValue: String): Unit = js.native
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    *
    * In version 8.5.0: introduced
    */
  def timeoutExpression: String = js.native
  def timeoutExpression_=(newValue: String): Unit = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.5.0: introduced
    */
  def timeoutModel: Expression = js.native
  def timeoutModel_=(newValue: Expression): Unit = js.native
  
  /**
    * In version 8.14.0: deleted
    * In version 8.13.0: introduced
    */
  def versionApiMockResults: String = js.native
  def versionApiMockResults_=(newValue: String): Unit = js.native
}
object ConsumedODataService {
  
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ConsumedODataService")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ConsumedODataService unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ConsumedODataService.createIn")
  @js.native
  def createIn(container: IFolderBase): ConsumedODataService = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ConsumedODataService.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ConsumedODataService.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
