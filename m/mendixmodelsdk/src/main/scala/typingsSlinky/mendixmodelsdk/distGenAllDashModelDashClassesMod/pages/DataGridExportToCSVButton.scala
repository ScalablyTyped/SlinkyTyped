package typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/export-to-csv-button relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.DataGridExportToCSVButton")
@js.native
class DataGridExportToCSVButton protected ()
  extends typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.DataGridExportToCSVButton {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.DataGridExportToCSVButton")
@js.native
object DataGridExportToCSVButton extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataGridExportToCSVButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.DataGridExportToCSVButton = js.native
  /**
    * Creates and returns a new DataGridExportToCSVButton instance in the SDK and on the server.
    * The new DataGridExportToCSVButton will be automatically stored in the 'items' property
    * of the parent ControlBar element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ControlBar): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.DataGridExportToCSVButton = js.native
}

