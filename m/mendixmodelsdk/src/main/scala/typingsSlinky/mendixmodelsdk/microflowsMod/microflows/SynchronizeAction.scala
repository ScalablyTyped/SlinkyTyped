package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/synchronize relevant section in reference guide}
  *
  * In version 7.22.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.SynchronizeAction")
@js.native
class SynchronizeAction protected () extends MicroflowAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FSynchronizeAction: IModel = js.native
  /**
    * In version 8.10.0: introduced
    */
  def `type`: SynchronizationType = js.native
  def `type`(newValue: SynchronizationType): js.Any = js.native
  /**
    * In version 8.10.0: introduced
    */
  def variableNames: IList[String] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.SynchronizeAction")
@js.native
object SynchronizeAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new SynchronizeAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): SynchronizeAction = js.native
  /**
    * Creates and returns a new SynchronizeAction instance in the SDK and on the server.
    * The new SynchronizeAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 and higher
    */
  def createIn(container: ActionActivity): SynchronizeAction = js.native
}

