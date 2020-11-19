package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.WebServiceOperationSimpleParameterMapping")
@js.native
class WebServiceOperationSimpleParameterMapping protected () extends WebServiceOperationParameterMapping {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  @JSName("model")
  var model_FWebServiceOperationSimpleParameterMapping: IModel = js.native
  
  /**
    * The value of this property is conceptually of type mappings.ElementPath.
    */
  def parameterPath: String = js.native
  def parameterPath_=(newValue: String): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.WebServiceOperationSimpleParameterMapping")
@js.native
object WebServiceOperationSimpleParameterMapping extends js.Object {
  
  /**
    * Creates and returns a new WebServiceOperationSimpleParameterMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): WebServiceOperationSimpleParameterMapping = js.native
  
  /**
    * Creates and returns a new WebServiceOperationSimpleParameterMapping instance in the SDK and on the server.
    * The new WebServiceOperationSimpleParameterMapping will be automatically stored in the 'parameterMappings' property
    * of the parent SimpleRequestHandling element passed as argument.
    */
  def createIn(container: SimpleRequestHandling): WebServiceOperationSimpleParameterMapping = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
