package typingsSlinky.mendixmodelsdk.settingsMod.settings

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.settingsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/settings", "settings.ModelerSettings")
@js.native
class ModelerSettings protected () extends ProjectSettingsPart {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  /**
    * In version 8.6.0: introduced
    */
  def actionActivityDefaultColors: IList[ActionActivityDefaultColor] = js.native
  
  def lowerCaseMicroflowVariables: Boolean = js.native
  def lowerCaseMicroflowVariables_=(newValue: Boolean): Unit = js.native
  
  @JSName("model")
  var model_FModelerSettings: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/settings", "settings.ModelerSettings")
@js.native
object ModelerSettings extends js.Object {
  
  /**
    * Creates and returns a new ModelerSettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ModelerSettings = js.native
  
  /**
    * Creates and returns a new ModelerSettings instance in the SDK and on the server.
    * The new ModelerSettings will be automatically stored in the 'settingsParts' property
    * of the parent ProjectSettings element passed as argument.
    */
  def createIn(container: ProjectSettings): ModelerSettings = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
