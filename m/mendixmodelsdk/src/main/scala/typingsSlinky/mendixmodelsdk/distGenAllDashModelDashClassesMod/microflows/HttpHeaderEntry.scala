package typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.microflows

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.HttpHeaderEntry")
@js.native
class HttpHeaderEntry protected ()
  extends typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.HttpHeaderEntry {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.HttpHeaderEntry")
@js.native
object HttpHeaderEntry extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new HttpHeaderEntry instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.HttpHeaderEntry = js.native
  /**
    * Creates and returns a new HttpHeaderEntry instance in the SDK and on the server.
    * The new HttpHeaderEntry will be automatically stored in the 'headerEntries' property
    * of the parent HttpConfiguration element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.HttpConfiguration): typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.HttpHeaderEntry = js.native
}

