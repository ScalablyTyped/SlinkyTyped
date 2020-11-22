package typingsSlinky.mendixmodelsdk.mappingsMod.mappings

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.mappingsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingMicroflowCall")
@js.native
class MappingMicroflowCall protected ()
  extends typingsSlinky.mendixmodelsdk.internalMod.Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsObjectMappingElement: ObjectMappingElement = js.native
  
  def microflow: IMicroflow | Null = js.native
  
  def microflowQualifiedName: String | Null = js.native
  
  def microflow_=(newValue: IMicroflow | Null): Unit = js.native
  
  def parameterMappings: IList[MappingMicroflowParameter] = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingMicroflowCall")
@js.native
object MappingMicroflowCall extends js.Object {
  
  /**
    * Creates and returns a new MappingMicroflowCall instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MappingMicroflowCall = js.native
  
  /**
    * Creates and returns a new MappingMicroflowCall instance in the SDK and on the server.
    * The new MappingMicroflowCall will be automatically stored in the 'mappingMicroflowCall' property
    * of the parent ObjectMappingElement element passed as argument.
    */
  def createIn(container: ObjectMappingElement): MappingMicroflowCall = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
