package typingsSlinky.mendixmodelsdk.allModelClassesMod.domainmodels

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/event-handlers relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.EventHandler")
@js.native
class EventHandler protected ()
  extends typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.EventHandler {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.EventHandler")
@js.native
object EventHandler extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new EventHandler instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.EventHandler = js.native
  /**
    * Creates and returns a new EventHandler instance in the SDK and on the server.
    * The new EventHandler will be automatically stored in the 'eventHandlers' property
    * of the parent Entity element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.Entity): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.EventHandler = js.native
}

