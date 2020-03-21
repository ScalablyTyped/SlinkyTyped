package typingsSlinky.mendixmodelsdk.reportsMod.reports

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.pages.AlignmentEnum
import typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.textsMod.texts.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReportColumn")
@js.native
class BasicReportColumn protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FBasicReportColumn: IModel = js.native
  def alignment(): AlignmentEnum = js.native
  def alignment(newValue: AlignmentEnum): js.Any = js.native
  def caption(): Text = js.native
  def caption(newValue: Text): js.Any = js.native
  def containerAsBasicReport(): BasicReport = js.native
  def dataSetColumnName(): String = js.native
  def dataSetColumnName(newValue: String): js.Any = js.native
  def format(): ColumnFormat = js.native
  def format(newValue: ColumnFormat): js.Any = js.native
  def width(): Double = js.native
  def width(newValue: Double): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReportColumn")
@js.native
object BasicReportColumn extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new BasicReportColumn instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): BasicReportColumn = js.native
  /**
    * Creates and returns a new BasicReportColumn instance in the SDK and on the server.
    * The new BasicReportColumn will be automatically stored in the 'columns' property
    * of the parent BasicReport element passed as argument.
    */
  def createIn(container: BasicReport): BasicReportColumn = js.native
}

