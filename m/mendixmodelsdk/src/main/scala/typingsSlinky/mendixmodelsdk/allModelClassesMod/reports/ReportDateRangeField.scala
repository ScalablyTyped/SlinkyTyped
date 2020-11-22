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

/**
  * See: {@link https://docs.mendix.com/refguide/date-range-field relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeField")
@js.native
class ReportDateRangeField protected ()
  extends typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeField {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "reports.ReportDateRangeField")
@js.native
object ReportDateRangeField extends js.Object {
  
  /**
    * Creates and returns a new ReportDateRangeField instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeField = js.native
  
  /**
    * Creates and returns a new ReportDateRangeField instance in the SDK and on the server.
    * The new ReportDateRangeField will be automatically stored in the 'fields' property
    * of the parent ReportDateRangeSelector element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector): typingsSlinky.mendixmodelsdk.reportsMod.reports.ReportDateRangeField = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
