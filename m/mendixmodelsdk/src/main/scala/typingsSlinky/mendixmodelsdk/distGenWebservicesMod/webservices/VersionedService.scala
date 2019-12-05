package typingsSlinky.mendixmodelsdk.distGenWebservicesMod.webservices

import typingsSlinky.mendixmodelsdk.distGenAppservicesMod.appservices.MsdEnumerationContainer
import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenImagesMod.images.IImage
import typingsSlinky.mendixmodelsdk.distGenImportmappingsMod.importmappings.IImportMapping
import typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings.ObjectHandlingBackupEnum
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflow
import typingsSlinky.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.Element
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/published-web-services relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.VersionedService")
@js.native
class VersionedService protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  var appServiceState: AppServiceState = js.native
  var caption: String = js.native
  val containerAsPublishedServiceBase: PublishedServiceBase = js.native
  var description: String = js.native
  var documentation: String = js.native
  var enumerationsByContract: MsdEnumerationContainer | Null = js.native
  var headerAuthentication: HeaderAuthentication = js.native
  var headerImportMapping: IImportMapping | Null = js.native
  val headerImportMappingQualifiedName: String | Null = js.native
  var headerMicroflow: IMicroflow | Null = js.native
  val headerMicroflowQualifiedName: String | Null = js.native
  var image: IImage | Null = js.native
  val imageQualifiedName: String | Null = js.native
  var isLockedByContract: Boolean = js.native
  @JSName("model")
  var model_VersionedService: IModel = js.native
  /**
    * In version 7.17.0: introduced
    */
  var objectHandlingBackup: ObjectHandlingBackupEnum = js.native
  val operations: IList[PublishedOperation] = js.native
  /**
    * In version 7.13.0: introduced
    */
  var optimizedXml: Boolean = js.native
  var targetNamespace: String = js.native
  var validate: Boolean = js.native
  var versionNumber: Double = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.VersionedService")
@js.native
object VersionedService extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new VersionedService instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): VersionedService = js.native
  /**
    * Creates and returns a new VersionedService instance in the SDK and on the server.
    * The new VersionedService will be automatically stored in the 'versionedServices' property
    * of the parent PublishedServiceBase element passed as argument.
    */
  def createIn(container: PublishedServiceBase): VersionedService = js.native
}

