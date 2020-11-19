package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IAttribute
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/aggregate-list relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.AggregateListAction")
@js.native
class AggregateListAction protected () extends MicroflowAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def aggregateFunction: AggregateFunctionEnum = js.native
  def aggregateFunction_=(newValue: AggregateFunctionEnum): Unit = js.native
  
  def attribute: IAttribute | Null = js.native
  
  def attributeQualifiedName: String | Null = js.native
  
  def attribute_=(newValue: IAttribute | Null): Unit = js.native
  
  def inputListVariableName: String = js.native
  def inputListVariableName_=(newValue: String): Unit = js.native
  
  @JSName("model")
  var model_FAggregateListAction: IModel = js.native
  
  def outputVariableName: String = js.native
  def outputVariableName_=(newValue: String): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.AggregateListAction")
@js.native
object AggregateListAction extends js.Object {
  
  /**
    * Creates and returns a new AggregateListAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): AggregateListAction = js.native
  
  /**
    * Creates and returns a new AggregateListAction instance in the SDK and on the server.
    * The new AggregateListAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    */
  def createIn(container: ActionActivity): AggregateListAction = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
