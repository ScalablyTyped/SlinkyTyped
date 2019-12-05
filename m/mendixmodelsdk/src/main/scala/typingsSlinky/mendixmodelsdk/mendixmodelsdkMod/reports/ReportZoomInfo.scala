package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.reports

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "reports.ReportZoomInfo")
@js.native
class ReportZoomInfo protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.reports.ReportZoomInfo {
  def this(
    model: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit,
    container: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "reports.ReportZoomInfo")
@js.native
object ReportZoomInfo extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typingsSlinky.mendixmodelsdk.distGenReportsMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new ReportZoomInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportZoomInfo = js.native
  /**
    * Creates and returns a new ReportZoomInfo instance in the SDK and on the server.
    * The new ReportZoomInfo will be automatically stored in the 'zoomInfo' property
    * of the parent BasicReport element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.BasicReport): typingsSlinky.mendixmodelsdk.distGenReportsMod.reports.ReportZoomInfo = js.native
}

