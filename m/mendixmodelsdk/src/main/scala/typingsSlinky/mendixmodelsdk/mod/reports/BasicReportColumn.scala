package typingsSlinky.mendixmodelsdk.mod.reports

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.reportsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "reports.BasicReportColumn")
@js.native
class BasicReportColumn protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.reports.BasicReportColumn {
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
@JSImport("mendixmodelsdk", "reports.BasicReportColumn")
@js.native
object BasicReportColumn extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new BasicReportColumn instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReportColumn = js.native
  /**
    * Creates and returns a new BasicReportColumn instance in the SDK and on the server.
    * The new BasicReportColumn will be automatically stored in the 'columns' property
    * of the parent BasicReport element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReport): typingsSlinky.mendixmodelsdk.reportsMod.reports.BasicReportColumn = js.native
}

