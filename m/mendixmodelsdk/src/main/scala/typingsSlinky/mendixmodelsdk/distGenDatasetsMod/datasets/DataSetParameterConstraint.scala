package typingsSlinky.mendixmodelsdk.distGenDatasetsMod.datasets

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenDatasetsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.Element
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetParameterConstraint")
@js.native
abstract class DataSetParameterConstraint protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FDataSetParameterConstraint: IModel = js.native
  def containerAsDataSetParameter(): DataSetParameter = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetParameterConstraint")
@js.native
object DataSetParameterConstraint extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

