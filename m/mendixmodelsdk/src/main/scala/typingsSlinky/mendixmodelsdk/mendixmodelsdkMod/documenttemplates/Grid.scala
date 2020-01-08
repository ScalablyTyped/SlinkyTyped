package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.documenttemplates

import typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "documenttemplates.Grid")
@js.native
abstract class Grid protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.documenttemplates.Grid {
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
@JSImport("mendixmodelsdk", "documenttemplates.Grid")
@js.native
object Grid extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

