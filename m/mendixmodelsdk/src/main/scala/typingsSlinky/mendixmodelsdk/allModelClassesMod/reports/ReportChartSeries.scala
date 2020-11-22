package typingsSlinky.mendixmodelsdk.allModelClassesMod.reports

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChartSeries")
@js.native
class ReportChartSeries protected ()
  extends typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChartSeries {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportChartSeries")
@js.native
object ReportChartSeries extends js.Object {
  
  /**
    * Creates and returns a new ReportChartSeries instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChartSeries = js.native
  
  /**
    * Creates and returns a new ReportChartSeries instance in the SDK and on the server.
    * The new ReportChartSeries will be automatically stored in the 'seriess' property
    * of the parent ReportChart element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChart): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportChartSeries = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
