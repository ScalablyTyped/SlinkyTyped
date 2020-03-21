package typingsSlinky.mendixmodelsdk.allModelClassesMod.microflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.AppServiceCallParameterMapping")
@js.native
class AppServiceCallParameterMapping protected ()
  extends typingsSlinky.mendixmodelsdk.microflowsMod.microflows.AppServiceCallParameterMapping {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.AppServiceCallParameterMapping")
@js.native
object AppServiceCallParameterMapping extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new AppServiceCallParameterMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.AppServiceCallParameterMapping = js.native
  /**
    * Creates and returns a new AppServiceCallParameterMapping instance in the SDK and on the server.
    * The new AppServiceCallParameterMapping will be automatically stored in the 'parameterMappings' property
    * of the parent AppServiceCallAction element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.AppServiceCallAction): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.AppServiceCallParameterMapping = js.native
}

