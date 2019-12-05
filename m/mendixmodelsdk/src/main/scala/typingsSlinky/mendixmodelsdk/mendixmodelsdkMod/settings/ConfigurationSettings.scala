package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.settings

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "settings.ConfigurationSettings")
@js.native
class ConfigurationSettings protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.settings.ConfigurationSettings {
  def this(
    model: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit,
    container: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "settings.ConfigurationSettings")
@js.native
object ConfigurationSettings extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typingsSlinky.mendixmodelsdk.distGenSettingsMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new ConfigurationSettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenSettingsMod.settings.ConfigurationSettings = js.native
  /**
    * Creates and returns a new ConfigurationSettings instance in the SDK and on the server.
    * The new ConfigurationSettings will be automatically stored in the 'settingsParts' property
    * of the parent ProjectSettings element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenSettingsMod.settings.ProjectSettings): typingsSlinky.mendixmodelsdk.distGenSettingsMod.settings.ConfigurationSettings = js.native
}

