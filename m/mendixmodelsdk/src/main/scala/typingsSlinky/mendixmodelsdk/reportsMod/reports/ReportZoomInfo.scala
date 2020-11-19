package typingsSlinky.mendixmodelsdk.reportsMod.reports

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.pages.IPage
import typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportZoomInfo")
@js.native
class ReportZoomInfo protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def containerAsBasicReport: BasicReport = js.native
  
  def mappings: IList[ReportZoomMapping] = js.native
  
  @JSName("model")
  var model_FReportZoomInfo: IModel = js.native
  
  def targetPage: IPage | Null = js.native
  
  def targetPageQualifiedName: String | Null = js.native
  
  def targetPage_=(newValue: IPage | Null): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportZoomInfo")
@js.native
object ReportZoomInfo extends js.Object {
  
  /**
    * Creates and returns a new ReportZoomInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ReportZoomInfo = js.native
  
  /**
    * Creates and returns a new ReportZoomInfo instance in the SDK and on the server.
    * The new ReportZoomInfo will be automatically stored in the 'zoomInfo' property
    * of the parent BasicReport element passed as argument.
    */
  def createIn(container: BasicReport): ReportZoomInfo = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
