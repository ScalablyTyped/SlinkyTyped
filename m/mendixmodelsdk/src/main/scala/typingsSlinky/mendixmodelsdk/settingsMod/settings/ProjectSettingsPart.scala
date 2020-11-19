package typingsSlinky.mendixmodelsdk.settingsMod.settings

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.settingsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/settings", "settings.ProjectSettingsPart")
@js.native
abstract class ProjectSettingsPart protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def containerAsProjectSettings: ProjectSettings = js.native
  
  @JSName("model")
  var model_FProjectSettingsPart: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/settings", "settings.ProjectSettingsPart")
@js.native
object ProjectSettingsPart extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
