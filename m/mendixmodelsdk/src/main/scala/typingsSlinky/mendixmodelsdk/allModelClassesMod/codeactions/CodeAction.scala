package typingsSlinky.mendixmodelsdk.allModelClassesMod.codeactions

import typingsSlinky.mendixmodelsdk.codeactionsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "codeactions.CodeAction")
@js.native
abstract class CodeAction protected ()
  extends typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions.CodeAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "codeactions.CodeAction")
@js.native
object CodeAction extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
