package typingsSlinky.mendixmodelsdk.appservicesMod.appservices

import typingsSlinky.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.constantsMod.constants.IConstant
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.projectsMod.projects.Document
import typingsSlinky.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/consumed-app-services relevant section in reference guide}
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
- typingsSlinky.mendixmodelsdk.appservicesMod.appservices.IConsumedAppService because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined actions */ @JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.ConsumedAppService")
@js.native
class ConsumedAppService protected () extends Document {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  
  def actions: IList[AppServiceAction] = js.native
  @JSName("actions")
  val actions_FConsumedAppService: IList[IAppServiceAction] = js.native
  
  def appServiceLocation: AppServiceLocationEnum = js.native
  def appServiceLocation_=(newValue: AppServiceLocationEnum): Unit = js.native
  
  def appStoreGuid: String = js.native
  def appStoreGuid_=(newValue: String): Unit = js.native
  
  def appStoreVersion: String = js.native
  
  def appStoreVersionGuid: String = js.native
  def appStoreVersionGuid_=(newValue: String): Unit = js.native
  
  def appStoreVersion_=(newValue: String): Unit = js.native
  
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MConsumedAppService: FolderBase = js.native
  
  def fromAppStore: Boolean = js.native
  def fromAppStore_=(newValue: Boolean): Unit = js.native
  
  def locationConstant: IConstant | Null = js.native
  
  def locationConstantQualifiedName: String | Null = js.native
  
  def locationConstant_=(newValue: IConstant | Null): Unit = js.native
  
  def msd: Msd = js.native
  def msd_=(newValue: Msd): Unit = js.native
  
  def timeOut: Double = js.native
  def timeOut_=(newValue: Double): Unit = js.native
  
  def useTimeOut: Boolean = js.native
  def useTimeOut_=(newValue: Boolean): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.ConsumedAppService")
@js.native
object ConsumedAppService extends js.Object {
  
  /**
    * Creates a new ConsumedAppService unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): ConsumedAppService = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
