package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/microflow-call relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.MicroflowCallAction")
@js.native
class MicroflowCallAction protected () extends MicroflowAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def microflowCall: MicroflowCall = js.native
  def microflowCall_=(newValue: MicroflowCall): Unit = js.native
  
  @JSName("model")
  var model_FMicroflowCallAction: IModel = js.native
  
  def outputVariableName: String = js.native
  def outputVariableName_=(newValue: String): Unit = js.native
  
  def useReturnVariable: Boolean = js.native
  def useReturnVariable_=(newValue: Boolean): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.MicroflowCallAction")
@js.native
object MicroflowCallAction extends js.Object {
  
  /**
    * Creates and returns a new MicroflowCallAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MicroflowCallAction = js.native
  
  /**
    * Creates and returns a new MicroflowCallAction instance in the SDK and on the server.
    * The new MicroflowCallAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    */
  def createIn(container: ActionActivity): MicroflowCallAction = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
