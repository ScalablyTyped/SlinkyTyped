package typingsSlinky.mendixmodelsdk.reportsMod.reports

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.pages.AlignmentEnum
import typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.textsMod.texts.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReportColumn")
@js.native
class BasicReportColumn protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def alignment: AlignmentEnum = js.native
  def alignment_=(newValue: AlignmentEnum): Unit = js.native
  
  def caption: Text = js.native
  def caption_=(newValue: Text): Unit = js.native
  
  def containerAsBasicReport: BasicReport = js.native
  
  def dataSetColumnName: String = js.native
  def dataSetColumnName_=(newValue: String): Unit = js.native
  
  def format: ColumnFormat = js.native
  def format_=(newValue: ColumnFormat): Unit = js.native
  
  def width: Double = js.native
  def width_=(newValue: Double): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReportColumn")
@js.native
object BasicReportColumn extends js.Object {
  
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
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
