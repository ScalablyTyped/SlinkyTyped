package typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.microflows

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.MicroflowObjectCollection")
@js.native
class MicroflowObjectCollection protected ()
  extends typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.MicroflowObjectCollection {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.MicroflowObjectCollection")
@js.native
object MicroflowObjectCollection extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MicroflowObjectCollection instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.MicroflowObjectCollection = js.native
  /**
    * Creates and returns a new MicroflowObjectCollection instance in the SDK and on the server.
    * The new MicroflowObjectCollection will be automatically stored in the 'objectCollection' property
    * of the parent LoopedActivity element passed as argument.
    */
  def createInLoopedActivityUnderObjectCollection(container: typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.LoopedActivity): typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.MicroflowObjectCollection = js.native
  /**
    * Creates and returns a new MicroflowObjectCollection instance in the SDK and on the server.
    * The new MicroflowObjectCollection will be automatically stored in the 'objectCollection' property
    * of the parent MicroflowBase element passed as argument.
    */
  def createInMicroflowBaseUnderObjectCollection(container: typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.MicroflowBase): typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.MicroflowObjectCollection = js.native
}

