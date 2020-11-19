package typingsSlinky.mendixmodelsdk.allModelClassesMod.microflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/retrieve relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.RetrieveAction")
@js.native
class RetrieveAction protected ()
  extends typingsSlinky.mendixmodelsdk.microflowsMod.microflows.RetrieveAction {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.RetrieveAction")
@js.native
object RetrieveAction extends js.Object {
  
  /**
    * Creates and returns a new RetrieveAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.RetrieveAction = js.native
  
  /**
    * Creates and returns a new RetrieveAction instance in the SDK and on the server.
    * The new RetrieveAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.ActionActivity): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.RetrieveAction = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
