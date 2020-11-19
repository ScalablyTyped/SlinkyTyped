package typingsSlinky.mendixmodelsdk.webservicesMod.webservices

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.datatypesMod.datatypes.DataType
import typingsSlinky.mendixmodelsdk.imagesMod.images.IImage
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typingsSlinky.mendixmodelsdk.webservicesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.PublishedOperation")
@js.native
class PublishedOperation protected () extends PublishedResource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def description: String = js.native
  def description_=(newValue: String): Unit = js.native
  
  def documentation: String = js.native
  def documentation_=(newValue: String): Unit = js.native
  
  def entityExposedName: String = js.native
  
  def entityExposedNameByContract: String = js.native
  def entityExposedNameByContract_=(newValue: String): Unit = js.native
  
  def entityExposedName_=(newValue: String): Unit = js.native
  
  def image: IImage | Null = js.native
  
  def imageQualifiedName: String | Null = js.native
  
  def image_=(newValue: IImage | Null): Unit = js.native
  
  def isLockedByContract: Boolean = js.native
  def isLockedByContract_=(newValue: Boolean): Unit = js.native
  
  def microflow: IMicroflow | Null = js.native
  
  def microflowQualifiedName: String | Null = js.native
  
  def microflow_=(newValue: IMicroflow | Null): Unit = js.native
  
  @JSName("model")
  var model_FPublishedOperation: IModel = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  
  /**
    * In version 7.9.0: introduced
    */
  def operationReturnType: DataType = js.native
  def operationReturnType_=(newValue: DataType): Unit = js.native
  
  def parameters: IList[PublishedParameter] = js.native
  
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  def returnType: String = js.native
  
  def returnTypeIsNillable: Boolean = js.native
  def returnTypeIsNillable_=(newValue: Boolean): Unit = js.native
  
  def returnTypeIsOptional: Boolean = js.native
  def returnTypeIsOptional_=(newValue: Boolean): Unit = js.native
  
  def returnTypeNameByContract: String = js.native
  def returnTypeNameByContract_=(newValue: String): Unit = js.native
  
  def returnTypeSpecificationByContract: String = js.native
  def returnTypeSpecificationByContract_=(newValue: String): Unit = js.native
  
  def returnType_=(newValue: String): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.PublishedOperation")
@js.native
object PublishedOperation extends js.Object {
  
  /**
    * Creates and returns a new PublishedOperation instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): PublishedOperation = js.native
  
  /**
    * Creates and returns a new PublishedOperation instance in the SDK and on the server.
    * The new PublishedOperation will be automatically stored in the 'operations' property
    * of the parent VersionedService element passed as argument.
    */
  def createIn(container: VersionedService): PublishedOperation = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
