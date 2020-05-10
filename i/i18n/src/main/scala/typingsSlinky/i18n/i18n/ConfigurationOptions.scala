package typingsSlinky.i18n.i18n

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationOptions extends js.Object {
  /**
    * Hash to specify different aliases for i18n's internal methods to apply on the request/response objects (method -> alias).
    * Note that this will *not* overwrite existing properties with the same name.
    * @default undefined
    */
  var api: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Watch for changes in json files to reload locale on updates
    * @default false
    */
  var autoReload: js.UndefOr[Boolean] = js.native
  /**
    * Sets a custom cookie name to parse locale settings from
    * @default null
    */
  var cookie: js.UndefOr[String] = js.native
  /**
    * Alter a site wide default locale
    * @default "en"
    */
  var defaultLocale: js.UndefOr[String] = js.native
  /**
    * Where to store json files, relative to modules directory
    * @default "./locales"
    */
  var directory: js.UndefOr[String] = js.native
  /**
    * Control mode on directory creation. Setting has no effect on win.
    * @default null
    */
  var directoryPermissions: js.UndefOr[String] = js.native
  /**
    * Setting extension of json files (you might want to set this to '.js' according to webtranslateit)
    * @default ".json"
    */
  var extension: js.UndefOr[String] = js.native
  /**
    * Language fallback map
    * @default {}
    */
  var fallbacks: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * What to use as the indentation unit
    * @default "\t"
    */
  var indent: js.UndefOr[String] = js.native
  /**
    * Setup some locales - other locales default to en silently
    * @default []
    */
  var locales: js.UndefOr[js.Array[String]] = js.native
  /**
    * Setting of log level DEBUG
    * @default require("debug")("i18n:debug")
    */
  var logDebugFn: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.native
  /**
    * Setting of log level ERROR
    * @default require("debug")("i18n:error")
    */
  var logErrorFn: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.native
  /**
    * Setting of log level WARN
    * @default require("debug")("i18n:warn")
    */
  var logWarnFn: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.native
  /**
    * Enable object notation
    * @default false
    */
  var objectNotation: js.UndefOr[Boolean] = js.native
  /**
    * Setting prefix of json files name (in case you use different locale files naming scheme (webapp-en.json), rather then just en.json)
    * @default ""
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * Downcase locale when passed on queryParam; e.g. lang=en-US becomes en-us.
    * When set to false, the queryParam value will be used as passed; e.g. lang=en-US remains en-US.
    * @default true
    */
  var preserveLegacyCase: js.UndefOr[Boolean] = js.native
  /**
    * Query parameter to switch locale (ie. /home?lang=ch)
    * @default null
    */
  var queryParameter: js.UndefOr[String] = js.native
  /**
    * object or [obj1, obj2] to bind the i18n api and current locale to
    * @default null
    */
  var register: js.UndefOr[js.Any] = js.native
  /**
    * Sync locale information across all files
    * @default false
    */
  var syncFiles: js.UndefOr[Boolean] = js.native
  /**
    * Whether to write new locale information to disk
    * @default true
    */
  var updateFiles: js.UndefOr[Boolean] = js.native
}

object ConfigurationOptions {
  @scala.inline
  def apply(): ConfigurationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationOptions]
  }
  @scala.inline
  implicit class ConfigurationOptionsOps[Self <: ConfigurationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApi(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoReload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoReload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoReload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoReload")(js.undefined)
        ret
    }
    @scala.inline
    def withCookie(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLocale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLocale")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directory")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectoryPermissions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryPermissions")(js.undefined)
        ret
    }
    @scala.inline
    def withExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbacks(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbacks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbacks")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(js.undefined)
        ret
    }
    @scala.inline
    def withLocales(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locales")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocales: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locales")(js.undefined)
        ret
    }
    @scala.inline
    def withLogDebugFn(value: /* msg */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logDebugFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLogDebugFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logDebugFn")(js.undefined)
        ret
    }
    @scala.inline
    def withLogErrorFn(value: /* msg */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logErrorFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLogErrorFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logErrorFn")(js.undefined)
        ret
    }
    @scala.inline
    def withLogWarnFn(value: /* msg */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logWarnFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLogWarnFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logWarnFn")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectNotation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectNotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectNotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectNotation")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveLegacyCase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveLegacyCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveLegacyCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveLegacyCase")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryParameter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryParameter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParameter")(js.undefined)
        ret
    }
    @scala.inline
    def withRegister(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegister: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateFiles")(js.undefined)
        ret
    }
  }
  
}

