package typingsSlinky.mendixmodelsdk.mod.microflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "microflows.MicroflowObjectCollection")
@js.native
class MicroflowObjectCollection protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.microflows.MicroflowObjectCollection {
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
@JSImport("mendixmodelsdk", "microflows.MicroflowObjectCollection")
@js.native
object MicroflowObjectCollection extends js.Object {
  
  /**
    * Creates and returns a new MicroflowObjectCollection instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.MicroflowObjectCollection = js.native
  
  /**
    * Creates and returns a new MicroflowObjectCollection instance in the SDK and on the server.
    * The new MicroflowObjectCollection will be automatically stored in the 'objectCollection' property
    * of the parent LoopedActivity element passed as argument.
    */
  def createInLoopedActivityUnderObjectCollection(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.LoopedActivity): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.MicroflowObjectCollection = js.native
  
  /**
    * Creates and returns a new MicroflowObjectCollection instance in the SDK and on the server.
    * The new MicroflowObjectCollection will be automatically stored in the 'objectCollection' property
    * of the parent MicroflowBase element passed as argument.
    */
  def createInMicroflowBaseUnderObjectCollection(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.MicroflowBase): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.MicroflowObjectCollection = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
