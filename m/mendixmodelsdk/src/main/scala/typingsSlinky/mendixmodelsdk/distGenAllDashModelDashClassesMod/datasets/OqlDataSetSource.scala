package typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.datasets

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenDatasetsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.OqlDataSetSource")
@js.native
class OqlDataSetSource protected ()
  extends typingsSlinky.mendixmodelsdk.distGenDatasetsMod.datasets.OqlDataSetSource {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.OqlDataSetSource")
@js.native
object OqlDataSetSource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new OqlDataSetSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenDatasetsMod.datasets.OqlDataSetSource = js.native
  /**
    * Creates and returns a new OqlDataSetSource instance in the SDK and on the server.
    * The new OqlDataSetSource will be automatically stored in the 'source' property
    * of the parent DataSet element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenDatasetsMod.datasets.DataSet): typingsSlinky.mendixmodelsdk.distGenDatasetsMod.datasets.OqlDataSetSource = js.native
}

