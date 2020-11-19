package typingsSlinky.mendixmodelsdk.restMod.rest

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.datatypesMod.datatypes.DataType
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.IMicroflowParameter
import typingsSlinky.mendixmodelsdk.restMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.11.0: removed experimental
  * In version 7.8.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/rest", "rest.RestOperationParameter")
@js.native
class RestOperationParameter protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def containerAsPublishedRestService: PublishedRestService = js.native
  
  def containerAsPublishedRestServiceOperation: PublishedRestServiceOperation = js.native
  
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  def dataType: String = js.native
  def dataType_=(newValue: String): Unit = js.native
  
  /**
    * In version 8.3.0: introduced
    */
  def description: String = js.native
  def description_=(newValue: String): Unit = js.native
  
  /**
    * In version 7.17.0: introduced
    */
  def microflowParameter: IMicroflowParameter | Null = js.native
  
  def microflowParameterQualifiedName: String | Null = js.native
  
  def microflowParameter_=(newValue: IMicroflowParameter | Null): Unit = js.native
  
  @JSName("model")
  var model_FRestOperationParameter: IModel = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  
  def parameterType: RestOperationParameterType = js.native
  def parameterType_=(newValue: RestOperationParameterType): Unit = js.native
  
  /**
    * In version 7.17.0: introduced
    */
  def `type`: DataType = js.native
  def type_=(newValue: DataType): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/rest", "rest.RestOperationParameter")
@js.native
object RestOperationParameter extends js.Object {
  
  /**
    * Creates and returns a new RestOperationParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): RestOperationParameter = js.native
  
  /**
    * Creates and returns a new RestOperationParameter instance in the SDK and on the server.
    * The new RestOperationParameter will be automatically stored in the 'parameters' property
    * of the parent PublishedRestServiceOperation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  def createInPublishedRestServiceOperationUnderParameters(container: PublishedRestServiceOperation): RestOperationParameter = js.native
  
  /**
    * Creates and returns a new RestOperationParameter instance in the SDK and on the server.
    * The new RestOperationParameter will be automatically stored in the 'parameters' property
    * of the parent PublishedRestService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  def createInPublishedRestServiceUnderParameters(container: PublishedRestService): RestOperationParameter = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
