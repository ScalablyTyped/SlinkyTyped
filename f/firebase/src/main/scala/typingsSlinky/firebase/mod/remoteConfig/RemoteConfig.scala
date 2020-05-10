package typingsSlinky.firebase.mod.remoteConfig

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteConfig extends js.Object {
  /**
    * Object containing default values for conigs.
    */
  var defaultConfig: StringDictionary[String | Double | Boolean] = js.native
  /**
    * The Unix timestamp in milliseconds of the last <i>successful</i> fetch, or negative one if
    * the {@link RemoteConfig} instance either hasn't fetched or initialization
    * is incomplete.
    */
  var fetchTimeMillis: Double = js.native
  /**
    * The status of the last fetch <i>attempt</i>.
    */
  var lastFetchStatus: FetchStatus = js.native
  /**
    * Defines configuration for the Remote Config SDK.
    */
  var settings: Settings = js.native
  /**
    * Makes the last fetched config available to the getters.
    * Returns a promise which resolves to true if the current call activated the fetched configs.
    * If the fetched configs were already activated, the promise will resolve to false.
    */
  def activate(): js.Promise[Boolean] = js.native
  /**
    * Ensures the last activated config are available to the getters.
    */
  def ensureInitialized(): js.Promise[Unit] = js.native
  /**
    * Fetches and caches configuration from the Remote Config service.
    */
  def fetch(): js.Promise[Unit] = js.native
  /**
    * Performs fetch and activate operations, as a convenience.
    * Returns a promise which resolves to true if the current call activated the fetched configs.
    * If the fetched configs were already activated, the promise will resolve to false.
    */
  def fetchAndActivate(): js.Promise[Boolean] = js.native
  /**
    * Gets all config.
    */
  def getAll(): StringDictionary[Value] = js.native
  /**
    * Gets the value for the given key as a boolean.
    *
    * Convenience method for calling <code>remoteConfig.getValue(key).asBoolean()</code>.
    */
  def getBoolean(key: String): Boolean = js.native
  /**
    * Gets the value for the given key as a number.
    *
    * Convenience method for calling <code>remoteConfig.getValue(key).asNumber()</code>.
    */
  def getNumber(key: String): Double = js.native
  /**
    * Gets the value for the given key as a String.
    *
    * Convenience method for calling <code>remoteConfig.getValue(key).asString()</code>.
    */
  def getString(key: String): String = js.native
  /**
    * Gets the {@link Value} for the given key.
    */
  def getValue(key: String): Value = js.native
  /**
    * Defines the log level to use.
    */
  def setLogLevel(logLevel: LogLevel): Unit = js.native
}

object RemoteConfig {
  @scala.inline
  def apply(
    activate: () => js.Promise[Boolean],
    defaultConfig: StringDictionary[String | Double | Boolean],
    ensureInitialized: () => js.Promise[Unit],
    fetch: () => js.Promise[Unit],
    fetchAndActivate: () => js.Promise[Boolean],
    fetchTimeMillis: Double,
    getAll: () => StringDictionary[Value],
    getBoolean: String => Boolean,
    getNumber: String => Double,
    getString: String => String,
    getValue: String => Value,
    lastFetchStatus: FetchStatus,
    setLogLevel: LogLevel => Unit,
    settings: Settings
  ): RemoteConfig = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction0(activate), defaultConfig = defaultConfig.asInstanceOf[js.Any], ensureInitialized = js.Any.fromFunction0(ensureInitialized), fetch = js.Any.fromFunction0(fetch), fetchAndActivate = js.Any.fromFunction0(fetchAndActivate), fetchTimeMillis = fetchTimeMillis.asInstanceOf[js.Any], getAll = js.Any.fromFunction0(getAll), getBoolean = js.Any.fromFunction1(getBoolean), getNumber = js.Any.fromFunction1(getNumber), getString = js.Any.fromFunction1(getString), getValue = js.Any.fromFunction1(getValue), lastFetchStatus = lastFetchStatus.asInstanceOf[js.Any], setLogLevel = js.Any.fromFunction1(setLogLevel), settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteConfig]
  }
  @scala.inline
  implicit class RemoteConfigOps[Self <: RemoteConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivate(value: () => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDefaultConfig(value: StringDictionary[String | Double | Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnsureInitialized(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ensureInitialized")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFetch(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFetchAndActivate(value: () => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchAndActivate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFetchTimeMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchTimeMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAll(value: () => StringDictionary[Value]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBoolean(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBoolean")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNumber(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNumber")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetString(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetValue(value: String => Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLastFetchStatus(value: FetchStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastFetchStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetLogLevel(value: LogLevel => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLogLevel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSettings(value: Settings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

