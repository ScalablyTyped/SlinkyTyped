package typingsSlinky.mendixmodelsdk.mod.microflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "microflows.Head")
@js.native
class Head protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.microflows.Head {
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
@JSImport("mendixmodelsdk", "microflows.Head")
@js.native
object Head extends js.Object {
  
  /**
    * Creates and returns a new Head instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.Head = js.native
  
  /**
    * Creates and returns a new Head instance in the SDK and on the server.
    * The new Head will be automatically stored in the 'operation' property
    * of the parent ListOperationAction element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.ListOperationAction): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.Head = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
