package typingsSlinky.mendixmodelsdk.reportsMod.reports

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportZoomMapping")
@js.native
class ReportZoomMapping protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def containerAsReportZoomInfo: ReportZoomInfo = js.native
  
  @JSName("model")
  var model_FReportZoomMapping: IModel = js.native
  
  def sourceReportColumnName: String = js.native
  def sourceReportColumnName_=(newValue: String): Unit = js.native
  
  def targetParameterName: String = js.native
  def targetParameterName_=(newValue: String): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportZoomMapping")
@js.native
object ReportZoomMapping extends js.Object {
  
  /**
    * Creates and returns a new ReportZoomMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ReportZoomMapping = js.native
  
  /**
    * Creates and returns a new ReportZoomMapping instance in the SDK and on the server.
    * The new ReportZoomMapping will be automatically stored in the 'mappings' property
    * of the parent ReportZoomInfo element passed as argument.
    */
  def createIn(container: ReportZoomInfo): ReportZoomMapping = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
