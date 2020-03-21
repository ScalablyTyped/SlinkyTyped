package typingsSlinky.mendixmodelsdk.mod.appservices

import typingsSlinky.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "appservices.MsdVersion")
@js.native
class MsdVersion protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.appservices.MsdVersion {
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
@JSImport("mendixmodelsdk", "appservices.MsdVersion")
@js.native
object MsdVersion extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MsdVersion instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.appservicesMod.appservices.MsdVersion = js.native
  /**
    * Creates and returns a new MsdVersion instance in the SDK and on the server.
    * The new MsdVersion will be automatically stored in the 'version' property
    * of the parent Msd element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.appservicesMod.appservices.Msd): typingsSlinky.mendixmodelsdk.appservicesMod.appservices.MsdVersion = js.native
}

