package typingsSlinky.mendixmodelsdk.workflowsMod.workflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.workflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 8.11.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.UserSource")
@js.native
abstract class UserSource protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def containerAsUserTask: UserTask = js.native
  
  @JSName("model")
  var model_FUserSource: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.UserSource")
@js.native
object UserSource extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
