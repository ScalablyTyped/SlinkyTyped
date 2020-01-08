package typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.codeactions

import typingsSlinky.mendixmodelsdk.distGenCodeactionsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "codeactions.CodeActionParameter")
@js.native
abstract class CodeActionParameter protected ()
  extends typingsSlinky.mendixmodelsdk.distGenCodeactionsMod.codeactions.CodeActionParameter {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "codeactions.CodeActionParameter")
@js.native
object CodeActionParameter extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

