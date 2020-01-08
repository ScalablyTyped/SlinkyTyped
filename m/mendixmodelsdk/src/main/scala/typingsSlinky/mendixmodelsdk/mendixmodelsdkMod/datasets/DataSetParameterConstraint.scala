package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.datasets

import typingsSlinky.mendixmodelsdk.distGenDatasetsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "datasets.DataSetParameterConstraint")
@js.native
abstract class DataSetParameterConstraint protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.datasets.DataSetParameterConstraint {
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
@JSImport("mendixmodelsdk", "datasets.DataSetParameterConstraint")
@js.native
object DataSetParameterConstraint extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

