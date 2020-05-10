package typingsSlinky.i18next.mod

import typingsSlinky.i18next.AnonAllowedHosts
import typingsSlinky.i18next.AnonAutoOpen
import typingsSlinky.i18next.i18nextBooleans.`false`
import typingsSlinky.i18next.i18nextStrings.all
import typingsSlinky.i18next.i18nextStrings.current
import typingsSlinky.i18next.i18nextStrings.currentOnly
import typingsSlinky.i18next.i18nextStrings.fallback
import typingsSlinky.i18next.i18nextStrings.languageOnly
import typingsSlinky.i18next.i18nextStrings.v1
import typingsSlinky.i18next.i18nextStrings.v2
import typingsSlinky.i18next.i18nextStrings.v3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitOptions extends js.Object {
  /**
    * Prefixes the namespace to the returned key when using `cimode`
    * @default false
    */
  var appendNamespaceToCIMode: js.UndefOr[Boolean] = js.native
  /**
    * Appends namespace to missing key
    * @default false
    */
  var appendNamespaceToMissingKey: js.UndefOr[Boolean] = js.native
  /**
    * Options for backend - check documentation of plugin
    * @default undefined
    */
  var backend: js.UndefOr[js.Object] = js.native
  /**
    * Options for cache layer - check documentation of plugin
    * @default undefined
    */
  var cache: js.UndefOr[js.Object] = js.native
  /**
    * Language will be lowercased EN --> en while leaving full locales like en-US
    * @default false
    */
  var cleanCode: js.UndefOr[Boolean] = js.native
  /**
    * Compatibility JSON version
    * @default 'v3'
    */
  var compatibilityJSON: js.UndefOr[v1 | v2 | v3] = js.native
  /**
    * Char to split context from key
    * @default '_'
    */
  var contextSeparator: js.UndefOr[String] = js.native
  /**
    * Logs info level to console output. Helps finding issues with loading not working.
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * Default namespace used if not passed to translation function
    * @default 'translation'
    */
  var defaultNS: js.UndefOr[String] = js.native
  /**
    * Options for language detection - check documentation of plugin
    * @default undefined
    */
  var detection: js.UndefOr[js.Object] = js.native
  /**
    * Options for https://github.com/locize/locize-editor
    * @default undefined
    */
  var editor: js.UndefOr[AnonAutoOpen] = js.native
  /**
    * Language to use if translations in user language are not available.
    * @default 'dev'
    */
  var fallbackLng: js.UndefOr[`false` | FallbackLng] = js.native
  /**
    * String or array of namespaces to lookup key if not found in given namespace.
    * @default false
    */
  var fallbackNS: js.UndefOr[`false` | String | js.Array[String]] = js.native
  /**
    * Options for i18n message format - check documentation of plugin
    * @default undefined
    */
  var i18nFormat: js.UndefOr[js.Object] = js.native
  /**
    * Triggers resource loading in init function inside a setTimeout (default async behaviour).
    * Set it to false if your backend loads resources sync - that way calling i18next.t after
    * init is possible without relaying on the init callback.
    * @default true
    */
  var initImmediate: js.UndefOr[Boolean] = js.native
  /**
    * @see https://www.i18next.com/interpolation.html
    */
  var interpolation: js.UndefOr[InterpolationOptions] = js.native
  /**
    * Char, eg. '\n' that arrays will be joined by
    * @default false
    */
  var joinArrays: js.UndefOr[`false` | String] = js.native
  /**
    * Char to separate keys
    * @default '.'
    */
  var keySeparator: js.UndefOr[`false` | String] = js.native
  /**
    * Language to use (overrides language detection)
    * @default undefined
    */
  var lng: js.UndefOr[String] = js.native
  /**
    * Language codes to lookup, given set language is
    * 'en-US': 'all' --> ['en-US', 'en', 'dev'],
    * 'currentOnly' --> 'en-US',
    * 'languageOnly' --> 'en'
    * @default 'all'
    */
  var load: js.UndefOr[all | currentOnly | languageOnly] = js.native
  /**
    * Options for https://github.com/locize/locize-lastused
    * @default undefined
    */
  var locizeLastUsed: js.UndefOr[AnonAllowedHosts] = js.native
  /**
    * Language will be lowercased eg. en-US --> en-us
    * @default false
    */
  var lowerCaseLng: js.UndefOr[Boolean] = js.native
  /**
    * Gets called in case a interpolation value is undefined. This method will not be called if the value is empty string or null
    * @default noop
    */
  var missingInterpolationHandler: js.UndefOr[
    js.Function3[/* text */ String, /* value */ js.Any, /* options */ InitOptions, _]
  ] = js.native
  /**
    * Used for custom missing key handling (needs saveMissing set to true!)
    * @default false
    */
  var missingKeyHandler: js.UndefOr[
    `false` | (js.Function4[
      /* lngs */ js.Array[String], 
      /* ns */ String, 
      /* key */ String, 
      /* fallbackValue */ String, 
      Unit
    ])
  ] = js.native
  /**
    * If true will pass eg. en-US if finding en in whitelist
    * @default false
    */
  var nonExplicitWhitelist: js.UndefOr[Boolean] = js.native
  /**
    * String or array of namespaces to load
    * @default 'translation'
    */
  var ns: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Char to split namespace from key
    * @default ':'
    */
  var nsSeparator: js.UndefOr[`false` | String] = js.native
  /**
    * Sets defaultValue
    * @default args => ({ defaultValue: args[1] })
    */
  var overloadTranslationOptionHandler: js.UndefOr[js.Function1[/* args */ js.Array[String], TOptions[StringMap]]] = js.native
  /**
    * Receives a key that was not found in `t()` and returns a value, that will be returned by `t()`
    * @default noop
    */
  var parseMissingKeyHandler: js.UndefOr[js.Function1[/* key */ String, _]] = js.native
  /**
    * Allow initializing with bundled resources while using a backend to load non bundled ones.
    * @default false
    */
  var partialBundledLanguages: js.UndefOr[Boolean] = js.native
  /**
    * Char to split plural from key
    * @default '_'
    */
  var pluralSeparator: js.UndefOr[String] = js.native
  /**
    * String or array of postProcessors to apply per default
    * @default false
    */
  var postProcess: js.UndefOr[`false` | String | js.Array[String]] = js.native
  /**
    * passthrough the resolved object including 'usedNS', 'usedLang' etc into options object of postprocessors as 'i18nResolved' property
    * @default false
    */
  var postProcessPassResolved: js.UndefOr[Boolean] = js.native
  /**
    * Array of languages to preload. Important on server-side to assert translations are loaded before rendering views.
    * @default false
    */
  var preload: js.UndefOr[`false` | js.Array[String]] = js.native
  /**
    * Options for react - check documentation of plugin
    * @default undefined
    */
  var react: js.UndefOr[ReactOptions] = js.native
  /**
    * Resources to initialize with (if not using loading or not appending using addResourceBundle)
    * @default undefined
    */
  var resources: js.UndefOr[Resource] = js.native
  /**
    * Allows empty string as valid translation
    * @default true
    */
  var returnEmptyString: js.UndefOr[Boolean] = js.native
  /**
    * Allows null values as valid translation
    * @default true
    */
  var returnNull: js.UndefOr[Boolean] = js.native
  /**
    * Allows objects as valid translation result
    * @default false
    */
  var returnObjects: js.UndefOr[Boolean] = js.native
  /**
    * Gets called if object was passed in as key but returnObjects was set to false
    * @default noop
    */
  var returnedObjectHandler: js.UndefOr[js.Function3[/* key */ String, /* value */ String, /* options */ js.Any, Unit]] = js.native
  /**
    * Calls save missing key function on backend if key not found
    * @default false
    */
  var saveMissing: js.UndefOr[Boolean] = js.native
  /**
    * @default 'fallback'
    */
  var saveMissingTo: js.UndefOr[current | all | fallback] = js.native
  /**
    * Will use 'plural' as suffix for languages only having 1 plural form, setting it to false will suffix all with numbers
    * @default true
    */
  var simplifyPluralSuffix: js.UndefOr[Boolean] = js.native
  /**
    * Experimental: enable to update default values using the saveMissing
    * (Works only if defaultValue different from translated value.
    * Only useful on initial development or when keeping code as source of truth not changing values outside of code.
    * Only supported if backend supports it already)
    * @default false
    */
  var updateMissing: js.UndefOr[Boolean] = js.native
  /**
    * Array of allowed languages
    * @default false
    */
  var whitelist: js.UndefOr[`false` | js.Array[String]] = js.native
}

object InitOptions {
  @scala.inline
  def apply(): InitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitOptions]
  }
  @scala.inline
  implicit class InitOptionsOps[Self <: InitOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendNamespaceToCIMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendNamespaceToCIMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendNamespaceToCIMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendNamespaceToCIMode")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendNamespaceToMissingKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendNamespaceToMissingKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendNamespaceToMissingKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendNamespaceToMissingKey")(js.undefined)
        ret
    }
    @scala.inline
    def withBackend(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backend")(js.undefined)
        ret
    }
    @scala.inline
    def withCache(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withCleanCode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleanCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanCode")(js.undefined)
        ret
    }
    @scala.inline
    def withCompatibilityJSON(value: v1 | v2 | v3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compatibilityJSON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompatibilityJSON: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compatibilityJSON")(js.undefined)
        ret
    }
    @scala.inline
    def withContextSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultNS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultNS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultNS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultNS")(js.undefined)
        ret
    }
    @scala.inline
    def withDetection(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detection")(js.undefined)
        ret
    }
    @scala.inline
    def withEditor(value: AnonAutoOpen): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackLng(value: `false` | FallbackLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackLng")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackLng: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackLng")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackNS(value: `false` | String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackNS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackNS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackNS")(js.undefined)
        ret
    }
    @scala.inline
    def withI18nFormat(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18nFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutI18nFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18nFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withInitImmediate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initImmediate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitImmediate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initImmediate")(js.undefined)
        ret
    }
    @scala.inline
    def withInterpolation(value: InterpolationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterpolation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolation")(js.undefined)
        ret
    }
    @scala.inline
    def withJoinArrays(value: `false` | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joinArrays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJoinArrays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joinArrays")(js.undefined)
        ret
    }
    @scala.inline
    def withKeySeparator(value: `false` | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeySeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withLng(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lng")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLng: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lng")(js.undefined)
        ret
    }
    @scala.inline
    def withLoad(value: all | currentOnly | languageOnly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
    @scala.inline
    def withLocizeLastUsed(value: AnonAllowedHosts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locizeLastUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocizeLastUsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locizeLastUsed")(js.undefined)
        ret
    }
    @scala.inline
    def withLowerCaseLng(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerCaseLng")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowerCaseLng: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerCaseLng")(js.undefined)
        ret
    }
    @scala.inline
    def withMissingInterpolationHandler(value: (/* text */ String, /* value */ js.Any, /* options */ InitOptions) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingInterpolationHandler")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutMissingInterpolationHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingInterpolationHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withMissingKeyHandlerFunction4(
      value: (/* lngs */ js.Array[String], /* ns */ String, /* key */ String, /* fallbackValue */ String) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingKeyHandler")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withMissingKeyHandler(
      value: `false` | (js.Function4[
          /* lngs */ js.Array[String], 
          /* ns */ String, 
          /* key */ String, 
          /* fallbackValue */ String, 
          Unit
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingKeyHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissingKeyHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingKeyHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withNonExplicitWhitelist(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonExplicitWhitelist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonExplicitWhitelist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonExplicitWhitelist")(js.undefined)
        ret
    }
    @scala.inline
    def withNs(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ns")(js.undefined)
        ret
    }
    @scala.inline
    def withNsSeparator(value: `false` | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nsSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNsSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nsSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withOverloadTranslationOptionHandler(value: /* args */ js.Array[String] => TOptions[StringMap]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overloadTranslationOptionHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOverloadTranslationOptionHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overloadTranslationOptionHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withParseMissingKeyHandler(value: /* key */ String => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseMissingKeyHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutParseMissingKeyHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseMissingKeyHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withPartialBundledLanguages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partialBundledLanguages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartialBundledLanguages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partialBundledLanguages")(js.undefined)
        ret
    }
    @scala.inline
    def withPluralSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluralSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPluralSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluralSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withPostProcess(value: `false` | String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postProcess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostProcess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postProcess")(js.undefined)
        ret
    }
    @scala.inline
    def withPostProcessPassResolved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postProcessPassResolved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostProcessPassResolved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postProcessPassResolved")(js.undefined)
        ret
    }
    @scala.inline
    def withPreload(value: `false` | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(js.undefined)
        ret
    }
    @scala.inline
    def withReact(value: ReactOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("react")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("react")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: Resource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnEmptyString(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnEmptyString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnEmptyString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnEmptyString")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnNull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnNull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnNull")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnObjects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnObjects")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnedObjectHandler(value: (/* key */ String, /* value */ String, /* options */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnedObjectHandler")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutReturnedObjectHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnedObjectHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveMissing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveMissing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveMissing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveMissing")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveMissingTo(value: current | all | fallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveMissingTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveMissingTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveMissingTo")(js.undefined)
        ret
    }
    @scala.inline
    def withSimplifyPluralSuffix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simplifyPluralSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimplifyPluralSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simplifyPluralSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateMissing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMissing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateMissing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMissing")(js.undefined)
        ret
    }
    @scala.inline
    def withWhitelist(value: `false` | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhitelist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(js.undefined)
        ret
    }
  }
  
}

