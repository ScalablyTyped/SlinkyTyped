package typingsSlinky.mendixmodelsdk.mod.settings

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.settingsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "settings.LanguageSettings")
@js.native
class LanguageSettings protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.settings.LanguageSettings {
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
@JSImport("mendixmodelsdk", "settings.LanguageSettings")
@js.native
object LanguageSettings extends js.Object {
  
  /**
    * Creates and returns a new LanguageSettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.settingsMod.settings.LanguageSettings = js.native
  
  /**
    * Creates and returns a new LanguageSettings instance in the SDK and on the server.
    * The new LanguageSettings will be automatically stored in the 'settingsParts' property
    * of the parent ProjectSettings element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.settingsMod.settings.ProjectSettings): typingsSlinky.mendixmodelsdk.settingsMod.settings.LanguageSettings = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
