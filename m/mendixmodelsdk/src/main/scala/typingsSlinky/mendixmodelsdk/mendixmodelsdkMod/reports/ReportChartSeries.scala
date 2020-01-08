package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.reports

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenReportsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "reports.ReportChartSeries")
@js.native
class ReportChartSeries protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.reports.ReportChartSeries {
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
@JSImport("mendixmodelsdk", "reports.ReportChartSeries")
@js.native
object ReportChartSeries extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ReportChartSeries instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportChartSeries = js.native
  /**
    * Creates and returns a new ReportChartSeries instance in the SDK and on the server.
    * The new ReportChartSeries will be automatically stored in the 'seriess' property
    * of the parent ReportChart element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportChart): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportChartSeries = js.native
}

