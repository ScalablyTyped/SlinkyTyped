package typingsSlinky.mendixmodelsdk.allModelClassesMod.codeactions

import typingsSlinky.mendixmodelsdk.codeactionsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "codeactions.CodeActionParameter")
@js.native
abstract class CodeActionParameter protected ()
  extends typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions.CodeActionParameter {
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
