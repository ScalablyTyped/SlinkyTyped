package typingsSlinky.mendixmodelsdk.datasetsMod.datasets

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.datasetsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  def containerAsDataSetParameter: DataSetParameter = js.native
  
  @JSName("model")
  var model_FDataSetParameterConstraint: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetParameterConstraint")
@js.native
object DataSetParameterConstraint extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
