package typingsSlinky.electronSettings.mod

import typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Settings extends EventEmitter {
  
  /**
    * Clears the custom settings file path, if it exists.
    * @see #setPath
    */
  def clearPath(): Settings = js.native
  
  /**
    * Deletes the key and value at the given key path and returns the Settings
    * instance. Chainable.
    * @see #deleteAll
    */
  def delete(keyPath: String): Settings = js.native
  def delete(keyPath: String, options: SettingsOptions): Settings = js.native
  
  /**
    * Deletes all settings and returns the Settings instance. Chainable.
    * @see #delete
    */
  def deleteAll(): Settings = js.native
  def deleteAll(options: SettingsOptions): Settings = js.native
  
  /**
    * Returns the absolute path to where the settings file is or will be
    * stored.
    *
    * In general, the settings file is stored in your app's user data directory
    * in a file called Settings. The default user data directory for your
    * system can be found below.
    *
    * * MacOS: If you're running macOS, your app's default user data directory
    *   is `~/Library/Application\ Support/<Your App>`.
    * * Windows: If you're running Windows, your app's default user data
    *   directory is `%APPDATA%/<Your App>`.
    * * Linux: If you're running Linux, your app's default user data directory
    *   is either `$XDG_CONFIG_HOME/<Your App>` or `~/.config/<Your App>`.
    *
    * If you wish, you may change your app's default user data directory by
    * calling Electron's `app.setPath()` method before the ready event of the
    * app module is emitted, but this is not recommended, as it will likely
    * cause unintended consequences.
    */
  def file(): String = js.native
  
  /**
    * Returns the value at the given key path, or sets the value at that key
    * path to the default value, if provided, if the key does not exist.
    * @param defaultValue The value to apply if the setting does not already
    *                     exist.
    * @see #getAll
    */
  def get(keyPath: String): JsonValue = js.native
  def get(keyPath: String, defaultValue: js.UndefOr[scala.Nothing], options: SettingsOptions): JsonValue = js.native
  def get(keyPath: String, defaultValue: js.Any): JsonValue = js.native
  def get(keyPath: String, defaultValue: js.Any, options: SettingsOptions): JsonValue = js.native
  
  /**
    * Returns all settings.
    * @see #get
    */
  def getAll(): JsonValue = js.native
  
  /**
    * Returns a boolean indicating whether the settings object contains the
    * given key path.
    */
  def has(keyPath: String): Boolean = js.native
  
  /**
    * Sets the value at the given key path and returns the Settings instance.
    * Chainable.
    * @param keyPath The path to the key whose value we wish to set. This key
    *                need not already exist.
    * @param value   The value to set the key at the chosen key path to. This
    *                must be a data type supported by JSON.
    * @see #setAll
    */
  def set(keyPath: String, value: JsonValue): Settings = js.native
  def set(keyPath: String, value: JsonValue, options: SettingsOptions): Settings = js.native
  
  /**
    * Sets all settings and returns the Settings instance. Chainable.
    * @param obj The new settings object.
    * @see #set
    */
  def setAll(obj: JsonValue): Settings = js.native
  def setAll(obj: JsonValue, options: SettingsOptions): Settings = js.native
  
  /**
    * Sets a custom settings file path. By default, the settings file is
    * stored in your app's user data directory in a file called Settings,
    * but this method allows you to change this.
    *
    * Note: This method should be used cautiously, as it may have unintended
    * consequences. In general, this method should only be used for
    * debug purposes, and not in production apps.
    * @param filePath An absolute path to the settings file where the
    *                 user data will be saved.
    */
  def setPath(filePath: String): Settings = js.native
  
  /**
    * Returns an Observer instance which watches the given key path for changes
    * and calls the given handler if the value changes. To unsubscribe from
    * changes, call observer.dispose().
    * @param keyPath The path to the key that we wish to watch for changes.
    * @param handler The callback that will be invoked if the value at the
    *                chosen key path changes. The context of this callback is
    *                that of the observer instance.
    */
  def watch(keyPath: String, handler: SettingsHandler): SettingsObserver = js.native
}
