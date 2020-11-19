package typingsSlinky.mendixmodelsdk.restMod.rest

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.exportmappingsMod.exportmappings.IExportMapping
import typingsSlinky.mendixmodelsdk.importmappingsMod.importmappings.IImportMapping
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingBackupEnum
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.CommitEnum
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typingsSlinky.mendixmodelsdk.restMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.servicesMod.services.HttpMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/published-rest-operation relevant section in reference guide}
  *
  * In version 7.11.0: removed experimental
  * In version 7.7.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/rest", "rest.PublishedRestServiceOperation")
@js.native
class PublishedRestServiceOperation protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  /**
    * In version 7.14.0: introduced
    */
  def commit: CommitEnum = js.native
  def commit_=(newValue: CommitEnum): Unit = js.native
  
  def containerAsPublishedRestServiceResource: PublishedRestServiceResource = js.native
  
  /**
    * In version 7.15.0: introduced
    */
  def deprecated: Boolean = js.native
  def deprecated_=(newValue: Boolean): Unit = js.native
  
  def documentation: String = js.native
  def documentation_=(newValue: String): Unit = js.native
  
  /**
    * In version 7.14.0: introduced
    */
  def exportMapping: IExportMapping | Null = js.native
  
  def exportMappingQualifiedName: String | Null = js.native
  
  def exportMapping_=(newValue: IExportMapping | Null): Unit = js.native
  
  def httpMethod: HttpMethod = js.native
  def httpMethod_=(newValue: HttpMethod): Unit = js.native
  
  /**
    * In version 7.14.0: introduced
    */
  def importMapping: IImportMapping | Null = js.native
  
  def importMappingQualifiedName: String | Null = js.native
  
  def importMapping_=(newValue: IImportMapping | Null): Unit = js.native
  
  def microflow: IMicroflow | Null = js.native
  
  def microflowQualifiedName: String | Null = js.native
  
  def microflow_=(newValue: IMicroflow | Null): Unit = js.native
  
  @JSName("model")
  var model_FPublishedRestServiceOperation: IModel = js.native
  
  /**
    * In version 7.17.0: introduced
    */
  def objectHandlingBackup: ObjectHandlingBackupEnum = js.native
  def objectHandlingBackup_=(newValue: ObjectHandlingBackupEnum): Unit = js.native
  
  /**
    * In version 7.17.0: introduced
    */
  def parameters: IList[RestOperationParameter] = js.native
  
  def path: String = js.native
  def path_=(newValue: String): Unit = js.native
  
  def summary: String = js.native
  def summary_=(newValue: String): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/rest", "rest.PublishedRestServiceOperation")
@js.native
object PublishedRestServiceOperation extends js.Object {
  
  /**
    * Creates and returns a new PublishedRestServiceOperation instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): PublishedRestServiceOperation = js.native
  
  /**
    * Creates and returns a new PublishedRestServiceOperation instance in the SDK and on the server.
    * The new PublishedRestServiceOperation will be automatically stored in the 'operations' property
    * of the parent PublishedRestServiceResource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 and higher
    */
  def createIn(container: PublishedRestServiceResource): PublishedRestServiceOperation = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
