package typingsSlinky.jupyterlabCoreutils.settingregistryMod

import typingsSlinky.jupyterlabCoreutils.settingregistryMod.Settings.IOptions
import typingsSlinky.jupyterlabCoreutils.tokensMod.ISettingRegistry
import typingsSlinky.jupyterlabCoreutils.tokensMod.ISettingRegistry.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/settingregistry", "Settings")
@js.native
class Settings_ protected () extends ISettings {
  /**
    * Instantiate a new plugin settings manager.
    */
  def this(options: IOptions) = this()
  var _changed: js.Any = js.native
  var _isDisposed: js.Any = js.native
  /**
    * Handle plugin changes in the setting registry.
    */
  var _onPluginChanged: js.Any = js.native
  /**
    * The setting registry instance used as a back-end for these settings.
    */
  val registry: ISettingRegistry = js.native
}

