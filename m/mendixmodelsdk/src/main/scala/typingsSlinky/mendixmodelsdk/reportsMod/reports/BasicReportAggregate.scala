package typingsSlinky.mendixmodelsdk.reportsMod.reports

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.textsMod.texts.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReportAggregate")
@js.native
class BasicReportAggregate protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def aggregateFunction: AggregateFunctionEnum = js.native
  def aggregateFunction_=(newValue: AggregateFunctionEnum): Unit = js.native
  
  def applicablePerColumn: IList[Boolean] = js.native
  
  def caption: Text = js.native
  def caption_=(newValue: Text): Unit = js.native
  
  def containerAsBasicReport: BasicReport = js.native
  
  @JSName("model")
  var model_FBasicReportAggregate: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReportAggregate")
@js.native
object BasicReportAggregate extends js.Object {
  
  /**
    * Creates and returns a new BasicReportAggregate instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): BasicReportAggregate = js.native
  
  /**
    * Creates and returns a new BasicReportAggregate instance in the SDK and on the server.
    * The new BasicReportAggregate will be automatically stored in the 'aggregates' property
    * of the parent BasicReport element passed as argument.
    */
  def createIn(container: BasicReport): BasicReportAggregate = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
