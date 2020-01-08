package typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.datasets

import typingsSlinky.mendixmodelsdk.distGenDatasetsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/data-sets relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSet")
@js.native
class DataSet protected ()
  extends typingsSlinky.mendixmodelsdk.distGenDatasetsMod.datasets.DataSet {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSet")
@js.native
object DataSet extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new DataSet unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): typingsSlinky.mendixmodelsdk.distGenDatasetsMod.datasets.DataSet = js.native
}

