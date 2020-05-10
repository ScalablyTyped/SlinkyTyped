package typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.Grid")
@js.native
abstract class Grid protected () extends EntityWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FGrid: IModel = js.native
  def cellPadding: Double = js.native
  def cellPadding(newValue: Double): js.Any = js.native
  def cellSpacing: Double = js.native
  def cellSpacing(newValue: Double): js.Any = js.native
  def microflow(): js.Any = js.native
  def microflow(newValue: IMicroflow): js.Any = js.native
  def microflowQualifiedName: String | Null = js.native
  @JSName("microflow")
  def microflow_Union: IMicroflow | Null = js.native
  def sortBar: GridSortBar = js.native
  def sortBar(newValue: GridSortBar): js.Any = js.native
  def style: Style = js.native
  def style(newValue: Style): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.Grid")
@js.native
object Grid extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

