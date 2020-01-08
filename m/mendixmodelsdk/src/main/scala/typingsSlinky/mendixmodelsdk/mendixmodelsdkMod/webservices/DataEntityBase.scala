package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.webservices

import typingsSlinky.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "webservices.DataEntityBase")
@js.native
abstract class DataEntityBase protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservices.DataEntityBase {
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
@JSImport("mendixmodelsdk", "webservices.DataEntityBase")
@js.native
object DataEntityBase extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

