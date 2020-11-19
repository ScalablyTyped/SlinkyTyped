package typingsSlinky.mendixmodelsdk.webservicesMod.webservices

import typingsSlinky.mendixmodelsdk.appservicesMod.appservices.MsdMicroflowParameter
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.datatypesMod.datatypes.DataType
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.IMicroflowParameter
import typingsSlinky.mendixmodelsdk.webservicesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.PublishedParameter")
@js.native
class PublishedParameter protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def containerAsPublishedOperation: PublishedOperation = js.native
  
  def dataEntity: DataEntity = js.native
  def dataEntity_=(newValue: DataEntity): Unit = js.native
  
  def entityExposedItemName: String = js.native
  
  def entityExposedItemNameByContract: String = js.native
  def entityExposedItemNameByContract_=(newValue: String): Unit = js.native
  
  def entityExposedItemName_=(newValue: String): Unit = js.native
  
  def entityExposedName: String = js.native
  def entityExposedName_=(newValue: String): Unit = js.native
  
  def isLockedByContract: Boolean = js.native
  def isLockedByContract_=(newValue: Boolean): Unit = js.native
  
  def isNillable: Boolean = js.native
  def isNillable_=(newValue: Boolean): Unit = js.native
  
  def isOptional: Boolean = js.native
  
  def isOptionalByContract: Boolean = js.native
  def isOptionalByContract_=(newValue: Boolean): Unit = js.native
  
  def isOptional_=(newValue: Boolean): Unit = js.native
  
  @JSName("model")
  var model_FPublishedParameter: IModel = js.native
  
  def parameter: IMicroflowParameter | Null = js.native
  
  def parameterByContract: MsdMicroflowParameter = js.native
  def parameterByContract_=(newValue: MsdMicroflowParameter): Unit = js.native
  
  def parameterQualifiedName: String | Null = js.native
  
  /**
    * In version 7.9.0: introduced
    */
  def parameterType: DataType = js.native
  def parameterType_=(newValue: DataType): Unit = js.native
  
  def parameter_=(newValue: IMicroflowParameter | Null): Unit = js.native
  
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  def `type`: String = js.native
  def type_=(newValue: String): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.PublishedParameter")
@js.native
object PublishedParameter extends js.Object {
  
  /**
    * Creates and returns a new PublishedParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): PublishedParameter = js.native
  
  /**
    * Creates and returns a new PublishedParameter instance in the SDK and on the server.
    * The new PublishedParameter will be automatically stored in the 'parameters' property
    * of the parent PublishedOperation element passed as argument.
    */
  def createIn(container: PublishedOperation): PublishedParameter = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
