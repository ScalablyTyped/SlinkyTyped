package typingsSlinky.mendixmodelsdk.mod.reports

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/date-range-field relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "reports.ReportDateRangeField")
@js.native
class ReportDateRangeField protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.reports.ReportDateRangeField {
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
@JSImport("mendixmodelsdk", "reports.ReportDateRangeField")
@js.native
object ReportDateRangeField extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
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
}

