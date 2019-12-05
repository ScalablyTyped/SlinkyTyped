package typingsSlinky.mendixmodelsdk.distSdkInternalMod

import typingsSlinky.mendixmodelsdk.distSdkInternalUnitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "ModelUnit")
@js.native
abstract class ModelUnit protected ()
  extends typingsSlinky.mendixmodelsdk.distSdkInternalUnitsMod.ModelUnit {
  def this(
    model: typingsSlinky.mendixmodelsdk.distSdkInternalAbstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean
  ) = this()
  def this(
    model: typingsSlinky.mendixmodelsdk.distSdkInternalAbstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IStructuralUnit
  ) = this()
}

