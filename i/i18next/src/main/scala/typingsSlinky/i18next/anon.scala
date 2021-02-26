package typingsSlinky.i18next

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.i18next.i18nextBooleans.`false`
import typingsSlinky.i18next.i18nextStrings.altKey
import typingsSlinky.i18next.i18nextStrings.ctrlKey
import typingsSlinky.i18next.i18nextStrings.iframe
import typingsSlinky.i18next.i18nextStrings.metaKey
import typingsSlinky.i18next.i18nextStrings.shiftKey
import typingsSlinky.i18next.i18nextStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AllowedHosts extends StObject {
    
    /**
      * Hostnames that are allowed to send last used data.
      * Please keep those to your local system, staging, test servers (not production)
      * @default ['localhost']
      */
    var allowedHosts: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * An api key if you want to send missing keys
      */
    var apiKey: js.UndefOr[String] = js.native
    
    /**
      * Debounce interval to send data in milliseconds
      * @default 90000
      */
    var debounceSubmit: js.UndefOr[Double] = js.native
    
    /**
      * The id of your locize project
      */
    var projectId: String = js.native
    
    /**
      * The reference language of your project
      * @default 'en'
      */
    var referenceLng: js.UndefOr[String] = js.native
    
    /**
      * Version
      * @default 'latest'
      */
    var version: js.UndefOr[String] = js.native
  }
  object AllowedHosts {
    
    @scala.inline
    def apply(projectId: String): AllowedHosts = {
      val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllowedHosts]
    }
    
    @scala.inline
    implicit class AllowedHostsMutableBuilder[Self <: AllowedHosts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedHosts(value: js.Array[String]): Self = StObject.set(x, "allowedHosts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedHostsUndefined: Self = StObject.set(x, "allowedHosts", js.undefined)
      
      @scala.inline
      def setAllowedHostsVarargs(value: String*): Self = StObject.set(x, "allowedHosts", js.Array(value :_*))
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      @scala.inline
      def setDebounceSubmit(value: Double): Self = StObject.set(x, "debounceSubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebounceSubmitUndefined: Self = StObject.set(x, "debounceSubmit", js.undefined)
      
      @scala.inline
      def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferenceLng(value: String): Self = StObject.set(x, "referenceLng", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferenceLngUndefined: Self = StObject.set(x, "referenceLng", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait AutoOpen extends StObject {
    
    /**
      * If set to false you will need to open the editor via API
      * @default true
      */
    var autoOpen: js.UndefOr[Boolean] = js.native
    
    /**
      * Styles to adapt layout in iframe mode to your website layout.
      * This will add a style to `<body>`
      * @default 'margin-right: 605px;'
      */
    var bodyStyle: js.UndefOr[String] = js.native
    
    /**
      * Enable by adding querystring locize=true; can be set to another value or turned off by setting to false
      * @default 'locize'
      */
    var enableByQS: js.UndefOr[String | `false`] = js.native
    
    /**
      * Enable on init without the need of adding querystring locize=true
      * @default false
      */
    var enabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Styles to adapt layout in iframe mode to your website layout.
      * This will add a style to the `<iframe>`
      * @default 'z-index: 2000; position: fixed; top: 0; right: 0; bottom: 0; width: 600px; box-shadow: -3px 0 5px 0 rgba(0,0,0,0.5);'
      */
    var iframeContainerStyle: js.UndefOr[String] = js.native
    
    /**
      * Styles to adapt layout in iframe mode to your website layout.
      * This will add a style to the parent of `<iframe>`
      * @default 'height: 100%; width: 600px; border: none;'
      */
    var iframeStyle: js.UndefOr[String] = js.native
    
    /**
      * Use lng in editor, eg. if running with lng=cimode (i18next, locize)
      * @default null
      */
    var lngOverride: js.UndefOr[String | Null] = js.native
    
    /**
      * Use lng in editor taken from query string, eg. if running with lng=cimode (i18next, locize)
      * @default 'useLng'
      */
    var lngOverrideQS: js.UndefOr[String] = js.native
    
    /**
      * How the editor will open.
      * Setting to window will open a new window/tab instead
      * @default 'iframe'
      */
    var mode: js.UndefOr[iframe | window] = js.native
    
    /**
      * Handle when locize saved the edited translations, eg. reload website
      * @default noop
      */
    var onEditorSaved: js.UndefOr[js.Function2[/* lng */ Null, /* ns */ String | js.Array[String], Unit]] = js.native
    
    /**
      * Turn on/off by pressing key combination. Combine this with `toggleKeyModifier`
      * @default 24 (x)
      */
    var toggleKeyCode: js.UndefOr[Double] = js.native
    
    /**
      * Turn on/off by pressing key combination. Combine this with `toggleKeyCode`
      * @default 'ctrlKey'
      */
    var toggleKeyModifier: js.UndefOr[ctrlKey | metaKey | altKey | shiftKey] = js.native
  }
  object AutoOpen {
    
    @scala.inline
    def apply(): AutoOpen = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoOpen]
    }
    
    @scala.inline
    implicit class AutoOpenMutableBuilder[Self <: AutoOpen] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoOpen(value: Boolean): Self = StObject.set(x, "autoOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoOpenUndefined: Self = StObject.set(x, "autoOpen", js.undefined)
      
      @scala.inline
      def setBodyStyle(value: String): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
      
      @scala.inline
      def setEnableByQS(value: String | `false`): Self = StObject.set(x, "enableByQS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableByQSUndefined: Self = StObject.set(x, "enableByQS", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setIframeContainerStyle(value: String): Self = StObject.set(x, "iframeContainerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIframeContainerStyleUndefined: Self = StObject.set(x, "iframeContainerStyle", js.undefined)
      
      @scala.inline
      def setIframeStyle(value: String): Self = StObject.set(x, "iframeStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIframeStyleUndefined: Self = StObject.set(x, "iframeStyle", js.undefined)
      
      @scala.inline
      def setLngOverride(value: String): Self = StObject.set(x, "lngOverride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLngOverrideNull: Self = StObject.set(x, "lngOverride", null)
      
      @scala.inline
      def setLngOverrideQS(value: String): Self = StObject.set(x, "lngOverrideQS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLngOverrideQSUndefined: Self = StObject.set(x, "lngOverrideQS", js.undefined)
      
      @scala.inline
      def setLngOverrideUndefined: Self = StObject.set(x, "lngOverride", js.undefined)
      
      @scala.inline
      def setMode(value: iframe | window): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setOnEditorSaved(value: (/* lng */ Null, /* ns */ String | js.Array[String]) => Unit): Self = StObject.set(x, "onEditorSaved", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnEditorSavedUndefined: Self = StObject.set(x, "onEditorSaved", js.undefined)
      
      @scala.inline
      def setToggleKeyCode(value: Double): Self = StObject.set(x, "toggleKeyCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleKeyCodeUndefined: Self = StObject.set(x, "toggleKeyCode", js.undefined)
      
      @scala.inline
      def setToggleKeyModifier(value: ctrlKey | metaKey | altKey | shiftKey): Self = StObject.set(x, "toggleKeyModifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleKeyModifierUndefined: Self = StObject.set(x, "toggleKeyModifier", js.undefined)
    }
  }
  
  /* Inlined i18next.i18next.InterpolationOptions & {[key: string] : any} */
  @js.native
  trait InterpolationOptionskeyst
    extends /* key */ StringDictionary[js.Any] {
    
    /**
      * Global variables to use in interpolation replacements
      * @default undefined
      */
    var defaultVariables: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    /**
      * Escape function
      * @default str => str
      */
    var escape: js.UndefOr[js.Function1[/* str */ String, String]] = js.native
    
    /**
      * Escape passed in values to avoid xss injection
      * @default true
      */
    var escapeValue: js.UndefOr[Boolean] = js.native
    
    /**
      * Format function see formatting for details
      * @default noop
      */
    var format: js.UndefOr[
        /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias i18next.i18next.FormatFunction */ js.Object
      ] = js.native
    
    /**
      * Used to separate format from interpolation value
      * @default ','
      */
    var formatSeparator: js.UndefOr[String] = js.native
    
    /**
      * After how many interpolation runs to break out before throwing a stack overflow
      * @default 1000
      */
    var maxReplaces: js.UndefOr[Double] = js.native
    
    /**
      * Separates options from key
      * @default ','
      */
    var nestingOptionsSeparator: js.UndefOr[String] = js.native
    
    /**
      * Prefix for nesting
      * @default '$t('
      */
    var nestingPrefix: js.UndefOr[String] = js.native
    
    /**
      * Escaped prefix for nesting (regexSafe)
      * @default undefined
      */
    var nestingPrefixEscaped: js.UndefOr[String] = js.native
    
    /**
      * Suffix for nesting
      * @default ')'
      */
    var nestingSuffix: js.UndefOr[String] = js.native
    
    /**
      * Escaped suffix for nesting (regexSafe)
      * @default undefined
      */
    var nestingSuffixEscaped: js.UndefOr[String] = js.native
    
    /**
      * Prefix for interpolation
      * @default '{{'
      */
    var prefix: js.UndefOr[String] = js.native
    
    /**
      * Escaped prefix for interpolation (regexSafe)
      * @default undefined
      */
    var prefixEscaped: js.UndefOr[String] = js.native
    
    /**
      * If true, it will skip to interpolate the variables
      * @default false
      */
    var skipOnVariables: js.UndefOr[Boolean] = js.native
    
    /**
      * Suffix for interpolation
      * @default '}}'
      */
    var suffix: js.UndefOr[String] = js.native
    
    /**
      * Escaped suffix for interpolation (regexSafe)
      * @default undefined
      */
    var suffixEscaped: js.UndefOr[String] = js.native
    
    /**
      * Prefix to unescaped mode
      * @default '-'
      */
    var unescapePrefix: js.UndefOr[String] = js.native
    
    /**
      * Suffix to unescaped mode
      * @default undefined
      */
    var unescapeSuffix: js.UndefOr[String] = js.native
    
    /**
      * If true, then value passed into escape function is not casted to string, use with custom escape function that does its own type check
      * @default false
      */
    var useRawValueToEscape: js.UndefOr[Boolean] = js.native
  }
  object InterpolationOptionskeyst {
    
    @scala.inline
    def apply(): InterpolationOptionskeyst = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InterpolationOptionskeyst]
    }
    
    @scala.inline
    implicit class InterpolationOptionskeystMutableBuilder[Self <: InterpolationOptionskeyst] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultVariables(value: StringDictionary[js.Any]): Self = StObject.set(x, "defaultVariables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultVariablesUndefined: Self = StObject.set(x, "defaultVariables", js.undefined)
      
      @scala.inline
      def setEscape(value: /* str */ String => String): Self = StObject.set(x, "escape", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      @scala.inline
      def setEscapeValue(value: Boolean): Self = StObject.set(x, "escapeValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeValueUndefined: Self = StObject.set(x, "escapeValue", js.undefined)
      
      @scala.inline
      def setFormat(
        value: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias i18next.i18next.FormatFunction */ js.Object
      ): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatSeparator(value: String): Self = StObject.set(x, "formatSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatSeparatorUndefined: Self = StObject.set(x, "formatSeparator", js.undefined)
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setMaxReplaces(value: Double): Self = StObject.set(x, "maxReplaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxReplacesUndefined: Self = StObject.set(x, "maxReplaces", js.undefined)
      
      @scala.inline
      def setNestingOptionsSeparator(value: String): Self = StObject.set(x, "nestingOptionsSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNestingOptionsSeparatorUndefined: Self = StObject.set(x, "nestingOptionsSeparator", js.undefined)
      
      @scala.inline
      def setNestingPrefix(value: String): Self = StObject.set(x, "nestingPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNestingPrefixEscaped(value: String): Self = StObject.set(x, "nestingPrefixEscaped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNestingPrefixEscapedUndefined: Self = StObject.set(x, "nestingPrefixEscaped", js.undefined)
      
      @scala.inline
      def setNestingPrefixUndefined: Self = StObject.set(x, "nestingPrefix", js.undefined)
      
      @scala.inline
      def setNestingSuffix(value: String): Self = StObject.set(x, "nestingSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNestingSuffixEscaped(value: String): Self = StObject.set(x, "nestingSuffixEscaped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNestingSuffixEscapedUndefined: Self = StObject.set(x, "nestingSuffixEscaped", js.undefined)
      
      @scala.inline
      def setNestingSuffixUndefined: Self = StObject.set(x, "nestingSuffix", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixEscaped(value: String): Self = StObject.set(x, "prefixEscaped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixEscapedUndefined: Self = StObject.set(x, "prefixEscaped", js.undefined)
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setSkipOnVariables(value: Boolean): Self = StObject.set(x, "skipOnVariables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipOnVariablesUndefined: Self = StObject.set(x, "skipOnVariables", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixEscaped(value: String): Self = StObject.set(x, "suffixEscaped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixEscapedUndefined: Self = StObject.set(x, "suffixEscaped", js.undefined)
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setUnescapePrefix(value: String): Self = StObject.set(x, "unescapePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnescapePrefixUndefined: Self = StObject.set(x, "unescapePrefix", js.undefined)
      
      @scala.inline
      def setUnescapeSuffix(value: String): Self = StObject.set(x, "unescapeSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnescapeSuffixUndefined: Self = StObject.set(x, "unescapeSuffix", js.undefined)
      
      @scala.inline
      def setUseRawValueToEscape(value: Boolean): Self = StObject.set(x, "useRawValueToEscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseRawValueToEscapeUndefined: Self = StObject.set(x, "useRawValueToEscape", js.undefined)
    }
  }
  
  @js.native
  trait KeySeparator extends StObject {
    
    var keySeparator: js.UndefOr[String] = js.native
  }
  object KeySeparator {
    
    @scala.inline
    def apply(): KeySeparator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeySeparator]
    }
    
    @scala.inline
    implicit class KeySeparatorMutableBuilder[Self <: KeySeparator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeySeparator(value: String): Self = StObject.set(x, "keySeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySeparatorUndefined: Self = StObject.set(x, "keySeparator", js.undefined)
    }
  }
  
  @js.native
  trait Silent extends StObject {
    
    var keySeparator: js.UndefOr[String] = js.native
    
    var silent: js.UndefOr[Boolean] = js.native
  }
  object Silent {
    
    @scala.inline
    def apply(): Silent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Silent]
    }
    
    @scala.inline
    implicit class SilentMutableBuilder[Self <: Silent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeySeparator(value: String): Self = StObject.set(x, "keySeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySeparatorUndefined: Self = StObject.set(x, "keySeparator", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
  
  @js.native
  trait Translation extends StObject {
    
    var translation: StringDictionary[String] = js.native
  }
  object Translation {
    
    @scala.inline
    def apply(translation: StringDictionary[String]): Translation = {
      val __obj = js.Dynamic.literal(translation = translation.asInstanceOf[js.Any])
      __obj.asInstanceOf[Translation]
    }
    
    @scala.inline
    implicit class TranslationMutableBuilder[Self <: Translation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTranslation(value: StringDictionary[String]): Self = StObject.set(x, "translation", value.asInstanceOf[js.Any])
    }
  }
}
