package typingsSlinky.jupyterlabCoreutils.tokensMod.ISettingRegistry

import typingsSlinky.jupyterlabCoreutils.AnonUser
import typingsSlinky.jupyterlabCoreutils.settingregistryMod.ISchemaValidator.IError
import typingsSlinky.phosphorCoreutils.jsonMod.JSONValue
import typingsSlinky.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import typingsSlinky.phosphorDisposable.mod.IDisposable
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for manipulating the settings of a specific plugin.
  */
@js.native
trait ISettings extends IDisposable {
  /**
    * A signal that emits when the plugin's settings have changed.
    */
  val changed: ISignal[this.type, Unit] = js.native
  /**
    * The composite of user settings and extension defaults.
    */
  val composite: ReadonlyJSONObject = js.native
  /**
    * The plugin's ID.
    */
  val id: String = js.native
  val plugin: IPlugin = js.native
  /**
    * The plugin settings raw text value.
    */
  val raw: String = js.native
  /**
    * The plugin's schema.
    */
  val schema: ISchema = js.native
  /**
    * The user settings.
    */
  val user: ReadonlyJSONObject = js.native
  /**
    * The published version of the NPM package containing these settings.
    */
  val version: String = js.native
  /**
    * Return the defaults in a commented JSON format.
    */
  def annotatedDefaults(): String = js.native
  /**
    * Calculate the default value of a setting by iterating through the schema.
    *
    * @param key - The name of the setting whose default value is calculated.
    *
    * @returns A calculated default JSON value for a specific setting.
    */
  def default(key: String): js.UndefOr[JSONValue] = js.native
  /**
    * Get an individual setting.
    *
    * @param key - The name of the setting being retrieved.
    *
    * @returns The setting value.
    */
  def get(key: String): AnonUser = js.native
  /**
    * Remove a single setting.
    *
    * @param key - The name of the setting being removed.
    *
    * @returns A promise that resolves when the setting is removed.
    *
    * #### Notes
    * This function is asynchronous because it writes to the setting registry.
    */
  def remove(key: String): js.Promise[Unit] = js.native
  /**
    * Save all of the plugin's user settings at once.
    */
  def save(raw: String): js.Promise[Unit] = js.native
  /**
    * Set a single setting.
    *
    * @param key - The name of the setting being set.
    *
    * @param value - The value of the setting.
    *
    * @returns A promise that resolves when the setting has been saved.
    *
    * #### Notes
    * This function is asynchronous because it writes to the setting registry.
    */
  def set(key: String, value: JSONValue): js.Promise[Unit] = js.native
  /**
    * Validates raw settings with comments.
    *
    * @param raw - The JSON with comments string being validated.
    *
    * @returns A list of errors or `null` if valid.
    */
  def validate(raw: String): js.Array[IError] | Null = js.native
}

object ISettings {
  @scala.inline
  def apply(
    annotatedDefaults: () => String,
    changed: ISignal[ISettings, Unit],
    composite: ReadonlyJSONObject,
    default: String => js.UndefOr[JSONValue],
    dispose: () => Unit,
    get: String => AnonUser,
    id: String,
    isDisposed: Boolean,
    plugin: IPlugin,
    raw: String,
    remove: String => js.Promise[Unit],
    save: String => js.Promise[Unit],
    schema: ISchema,
    set: (String, JSONValue) => js.Promise[Unit],
    user: ReadonlyJSONObject,
    validate: String => js.Array[IError] | Null,
    version: String
  ): ISettings = {
    val __obj = js.Dynamic.literal(annotatedDefaults = js.Any.fromFunction0(annotatedDefaults), changed = changed.asInstanceOf[js.Any], composite = composite.asInstanceOf[js.Any], default = js.Any.fromFunction1(default), dispose = js.Any.fromFunction0(dispose), get = js.Any.fromFunction1(get), id = id.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), save = js.Any.fromFunction1(save), schema = schema.asInstanceOf[js.Any], set = js.Any.fromFunction2(set), user = user.asInstanceOf[js.Any], validate = js.Any.fromFunction1(validate), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISettings]
  }
  @scala.inline
  implicit class ISettingsOps[Self <: ISettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotatedDefaults(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotatedDefaults")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withChanged(value: ISignal[ISettings, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComposite(value: ReadonlyJSONObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault(value: String => js.UndefOr[JSONValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: String => AnonUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlugin(value: IPlugin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRaw(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: String => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSave(value: String => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSchema(value: ISchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet(value: (String, JSONValue) => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUser(value: ReadonlyJSONObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidate(value: String => js.Array[IError] | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

