package typingsSlinky.mendixmodelsdk.distGenMappingsMod.mappings

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenMappingsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflowParameter
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingMicroflowParameter")
@js.native
class MappingMicroflowParameter protected ()
  extends typingsSlinky.mendixmodelsdk.distSdkInternalMod.Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  val containerAsMappingMicroflowCall: MappingMicroflowCall = js.native
  /**
    * The value of this property is conceptually of type mappings.ElementPath.
    *
    * In version 7.6.0: introduced
    */
  var jsonValueElementPath: String = js.native
  var levelOfParent: Double = js.native
  @JSName("model")
  var model_MappingMicroflowParameter: IModel = js.native
  var parameter: IMicroflowParameter | Null = js.native
  val parameterQualifiedName: String | Null = js.native
  /**
    * The value of this property is conceptually of type mappings.ElementPath.
    *
    * In version 7.6.0: deleted
    */
  var valueElementPath: String = js.native
  /**
    * The value of this property is conceptually of type mappings.ElementPath.
    *
    * In version 7.6.0: introduced
    */
  var xmlValueElementPath: String = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingMicroflowParameter")
@js.native
object MappingMicroflowParameter extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MappingMicroflowParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MappingMicroflowParameter = js.native
  /**
    * Creates and returns a new MappingMicroflowParameter instance in the SDK and on the server.
    * The new MappingMicroflowParameter will be automatically stored in the 'parameterMappings' property
    * of the parent MappingMicroflowCall element passed as argument.
    */
  def createIn(container: MappingMicroflowCall): MappingMicroflowParameter = js.native
}

