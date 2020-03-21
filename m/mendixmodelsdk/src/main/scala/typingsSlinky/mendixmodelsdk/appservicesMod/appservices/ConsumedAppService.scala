package typingsSlinky.mendixmodelsdk.appservicesMod.appservices

import typingsSlinky.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.constantsMod.constants.IConstant
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.projectsMod.projects.Document
import typingsSlinky.mendixmodelsdk.projectsMod.projects.FolderBase
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/consumed-app-services relevant section in reference guide}
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
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
  @JSName("actions")
  val actions_FConsumedAppService: IList[IAppServiceAction] = js.native
  @JSName("model")
  var model_FConsumedAppService: IModel = js.native
  def actions(): IList[AppServiceAction] = js.native
  def appServiceLocation(): AppServiceLocationEnum = js.native
  def appServiceLocation(newValue: AppServiceLocationEnum): js.Any = js.native
  def appStoreGuid(): String = js.native
  def appStoreGuid(newValue: String): js.Any = js.native
  def appStoreVersion(): String = js.native
  def appStoreVersion(newValue: String): js.Any = js.native
  def appStoreVersionGuid(): String = js.native
  def appStoreVersionGuid(newValue: String): js.Any = js.native
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MConsumedAppService(): FolderBase = js.native
  def fromAppStore(): Boolean = js.native
  def fromAppStore(newValue: Boolean): js.Any = js.native
  def locationConstant(): js.Any = js.native
  def locationConstant(newValue: IConstant): js.Any = js.native
  def locationConstantQualifiedName(): String | Null = js.native
  @JSName("locationConstant")
  def locationConstant_Union(): IConstant | Null = js.native
  def msd(): Msd = js.native
  def msd(newValue: Msd): js.Any = js.native
  def timeOut(): Double = js.native
  def timeOut(newValue: Double): js.Any = js.native
  def useTimeOut(): Boolean = js.native
  def useTimeOut(newValue: Boolean): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.ConsumedAppService")
@js.native
object ConsumedAppService extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new ConsumedAppService unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): ConsumedAppService = js.native
}

