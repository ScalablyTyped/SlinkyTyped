package typingsSlinky.jupyterlabCoreutils.tokensMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jupyterlabCoreutils.AnonComposite
import typingsSlinky.jupyterlabCoreutils.interfacesMod.IDataConnector
import typingsSlinky.jupyterlabCoreutils.phaseinPhaseTransform
import typingsSlinky.jupyterlabCoreutils.settingregistryMod.ISchemaValidator
import typingsSlinky.jupyterlabCoreutils.tokensMod.ISettingRegistry.IPlugin
import typingsSlinky.jupyterlabCoreutils.tokensMod.ISettingRegistry.ISchema
import typingsSlinky.jupyterlabCoreutils.tokensMod.ISettingRegistry.ISettings
import typingsSlinky.phosphorCoreutils.jsonMod.JSONValue
import typingsSlinky.phosphorDisposable.mod.IDisposable
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISettingRegistry_ extends js.Object {
  /**
    * The data connector used by the setting registry.
    */
  val connector: IDataConnector[IPlugin, String, String] = js.native
  /**
    * A signal that emits the name of a plugin when its settings change.
    */
  val pluginChanged: ISignal[this.type, String] = js.native
  /**
    * The collection of setting registry plugins.
    */
  val plugins: StringDictionary[IPlugin] = js.native
  /**
    * The schema of the setting registry.
    */
  val schema: ISchema = js.native
  /**
    * The schema validator used by the setting registry.
    */
  val validator: ISchemaValidator = js.native
  /**
    * Get an individual setting.
    *
    * @param plugin - The name of the plugin whose settings are being retrieved.
    *
    * @param key - The name of the setting being retrieved.
    *
    * @returns A promise that resolves when the setting is retrieved.
    */
  def get(plugin: String, key: String): js.Promise[AnonComposite] = js.native
  /**
    * Load a plugin's settings into the setting registry.
    *
    * @param plugin - The name of the plugin whose settings are being loaded.
    *
    * @returns A promise that resolves with a plugin settings object or rejects
    * if the plugin is not found.
    */
  def load(plugin: String): js.Promise[ISettings] = js.native
  /**
    * Reload a plugin's settings into the registry even if they already exist.
    *
    * @param plugin - The name of the plugin whose settings are being reloaded.
    *
    * @returns A promise that resolves with a plugin settings object or rejects
    * with a list of `ISchemaValidator.IError` objects if it fails.
    */
  def reload(plugin: String): js.Promise[ISettings] = js.native
  /**
    * Remove a single setting in the registry.
    *
    * @param plugin - The name of the plugin whose setting is being removed.
    *
    * @param key - The name of the setting being removed.
    *
    * @returns A promise that resolves when the setting is removed.
    */
  def remove(plugin: String, key: String): js.Promise[Unit] = js.native
  /**
    * Set a single setting in the registry.
    *
    * @param plugin - The name of the plugin whose setting is being set.
    *
    * @param key - The name of the setting being set.
    *
    * @param value - The value of the setting being set.
    *
    * @returns A promise that resolves when the setting has been saved.
    *
    */
  def set(plugin: String, key: String, value: JSONValue): js.Promise[Unit] = js.native
  /**
    * Register a plugin transform function to act on a specific plugin.
    *
    * @param plugin - The name of the plugin whose settings are transformed.
    *
    * @param transforms - The transform functions applied to the plugin.
    *
    * @returns A disposable that removes the transforms from the registry.
    *
    * #### Notes
    * - `compose` transformations: The registry automatically overwrites a
    * plugin's default values with user overrides, but a plugin may instead wish
    * to merge values. This behavior can be accomplished in a `compose`
    * transformation.
    * - `fetch` transformations: The registry uses the plugin data that is
    * fetched from its connector. If a plugin wants to override, e.g. to update
    * its schema with dynamic defaults, a `fetch` transformation can be applied.
    */
  def transform(plugin: String, transforms: phaseinPhaseTransform): IDisposable = js.native
  /**
    * Upload a plugin's settings.
    *
    * @param plugin - The name of the plugin whose settings are being set.
    *
    * @param raw - The raw plugin settings being uploaded.
    *
    * @returns A promise that resolves when the settings have been saved.
    */
  def upload(plugin: String, raw: String): js.Promise[Unit] = js.native
}

object ISettingRegistry_ {
  @scala.inline
  def apply(
    connector: IDataConnector[IPlugin, String, String],
    get: (String, String) => js.Promise[AnonComposite],
    load: String => js.Promise[ISettings],
    pluginChanged: ISignal[ISettingRegistry_, String],
    plugins: StringDictionary[IPlugin],
    reload: String => js.Promise[ISettings],
    remove: (String, String) => js.Promise[Unit],
    schema: ISchema,
    set: (String, String, JSONValue) => js.Promise[Unit],
    transform: (String, phaseinPhaseTransform) => IDisposable,
    upload: (String, String) => js.Promise[Unit],
    validator: ISchemaValidator
  ): ISettingRegistry_ = {
    val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any], get = js.Any.fromFunction2(get), load = js.Any.fromFunction1(load), pluginChanged = pluginChanged.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], reload = js.Any.fromFunction1(reload), remove = js.Any.fromFunction2(remove), schema = schema.asInstanceOf[js.Any], set = js.Any.fromFunction3(set), transform = js.Any.fromFunction2(transform), upload = js.Any.fromFunction2(upload), validator = validator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISettingRegistry_]
  }
  @scala.inline
  implicit class ISettingRegistry_Ops[Self <: ISettingRegistry_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnector(value: IDataConnector[IPlugin, String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: (String, String) => js.Promise[AnonComposite]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLoad(value: String => js.Promise[ISettings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPluginChanged(value: ISignal[ISettingRegistry_, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlugins(value: StringDictionary[IPlugin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReload(value: String => js.Promise[ISettings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: (String, String) => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSchema(value: ISchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet(value: (String, String, JSONValue) => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withTransform(value: (String, phaseinPhaseTransform) => IDisposable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUpload(value: (String, String) => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withValidator(value: ISchemaValidator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

