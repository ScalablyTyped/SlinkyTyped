package typingsSlinky.mendixmodelsdk.mod.appservices

import typingsSlinky.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "appservices.MsdMetadata")
@js.native
class MsdMetadata protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.appservices.MsdMetadata {
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
@JSImport("mendixmodelsdk", "appservices.MsdMetadata")
@js.native
object MsdMetadata extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MsdMetadata instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.appservicesMod.appservices.MsdMetadata = js.native
  /**
    * Creates and returns a new MsdMetadata instance in the SDK and on the server.
    * The new MsdMetadata will be automatically stored in the 'metadata' property
    * of the parent Msd element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.appservicesMod.appservices.Msd): typingsSlinky.mendixmodelsdk.appservicesMod.appservices.MsdMetadata = js.native
}

