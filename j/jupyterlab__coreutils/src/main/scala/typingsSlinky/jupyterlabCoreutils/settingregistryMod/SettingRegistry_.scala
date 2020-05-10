package typingsSlinky.jupyterlabCoreutils.settingregistryMod

import typingsSlinky.jupyterlabCoreutils.settingregistryMod.SettingRegistry.IOptions
import typingsSlinky.jupyterlabCoreutils.tokensMod.ISettingRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/settingregistry", "SettingRegistry")
@js.native
class SettingRegistry_ protected () extends ISettingRegistry {
  /**
    * Create a new setting registry.
    */
  def this(options: IOptions) = this()
  /**
    * Load a plugin into the registry.
    */
  var _load: js.Any = js.native
  var _pluginChanged: js.Any = js.native
  /**
    * Preload a list of plugins and fail gracefully.
    */
  var _preload: js.Any = js.native
  var _ready: js.Any = js.native
  /**
    * Save a plugin in the registry.
    */
  var _save: js.Any = js.native
  var _timeout: js.Any = js.native
  /**
    * Transform the plugin if necessary.
    */
  var _transform: js.Any = js.native
  var _transformers: js.Any = js.native
  /**
    * Validate and preload a plugin, compose the `composite` data.
    */
  var _validate: js.Any = js.native
}

