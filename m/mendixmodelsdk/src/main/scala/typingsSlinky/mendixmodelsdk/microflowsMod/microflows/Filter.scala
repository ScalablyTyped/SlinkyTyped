package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.Filter")
@js.native
class Filter protected () extends InspectAttribute {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  @JSName("model")
  var model_FFilter: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.Filter")
@js.native
object Filter extends js.Object {
  
  /**
    * Creates and returns a new Filter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): Filter = js.native
  
  /**
    * Creates and returns a new Filter instance in the SDK and on the server.
    * The new Filter will be automatically stored in the 'operation' property
    * of the parent ListOperationAction element passed as argument.
    */
  def createIn(container: ListOperationAction): Filter = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
