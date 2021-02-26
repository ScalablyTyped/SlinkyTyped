package typingsSlinky.formatjsIntlDisplaynames

import typingsSlinky.formatjsEcma402Abstract.typesDisplaynamesMod.DisplayNamesData
import typingsSlinky.formatjsEcma402Abstract.typesDisplaynamesMod.DisplayNamesLocaleData
import typingsSlinky.formatjsIntlDisplaynames.anon.PickDisplayNamesOptionslo
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.`best fit`
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.code
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.currency
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.language
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.long
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.lookup
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.narrow
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.none
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.region
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.script
import typingsSlinky.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.short
import typingsSlinky.std.NonNullable
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@formatjs/intl-displaynames", "DisplayNames")
  @js.native
  class DisplayNames protected () extends StObject {
    def this(locales: js.UndefOr[scala.Nothing], options: DisplayNamesOptions) = this()
    def this(locales: String, options: DisplayNamesOptions) = this()
    def this(locales: js.Array[String], options: DisplayNamesOptions) = this()
    
    def of(code: String): js.UndefOr[String] = js.native
    def of(code: js.Object): js.UndefOr[String] = js.native
    def of(code: Double): js.UndefOr[String] = js.native
    
    def resolvedOptions(): DisplayNamesResolvedOptions = js.native
  }
  /* static members */
  object DisplayNames {
    
    @JSImport("@formatjs/intl-displaynames", "DisplayNames")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@formatjs/intl-displaynames", "DisplayNames.__addLocaleData")
    @js.native
    def __addLocaleData(data: DisplayNamesLocaleData*): Unit = js.native
    
    @JSImport("@formatjs/intl-displaynames", "DisplayNames.__defaultLocale")
    @js.native
    def __defaultLocale: js.Any = js.native
    @scala.inline
    def __defaultLocale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__defaultLocale")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl-displaynames", "DisplayNames.availableLocales")
    @js.native
    def availableLocales: js.Any = js.native
    @scala.inline
    def availableLocales_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("availableLocales")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl-displaynames", "DisplayNames.getDefaultLocale")
    @js.native
    def getDefaultLocale: js.Any = js.native
    @scala.inline
    def getDefaultLocale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDefaultLocale")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl-displaynames", "DisplayNames.localeData")
    @js.native
    def localeData: Record[String, js.UndefOr[DisplayNamesData]] = js.native
    @scala.inline
    def localeData_=(x: Record[String, js.UndefOr[DisplayNamesData]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("localeData")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl-displaynames", "DisplayNames.polyfilled")
    @js.native
    val polyfilled: /* true */ Boolean = js.native
    
    @JSImport("@formatjs/intl-displaynames", "DisplayNames.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(): js.Array[String] = js.native
    @JSImport("@formatjs/intl-displaynames", "DisplayNames.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: js.UndefOr[scala.Nothing], options: PickDisplayNamesOptionslo): js.Array[String] = js.native
    @JSImport("@formatjs/intl-displaynames", "DisplayNames.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    @JSImport("@formatjs/intl-displaynames", "DisplayNames.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: String, options: PickDisplayNamesOptionslo): js.Array[String] = js.native
    @JSImport("@formatjs/intl-displaynames", "DisplayNames.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    @JSImport("@formatjs/intl-displaynames", "DisplayNames.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: js.Array[String], options: PickDisplayNamesOptionslo): js.Array[String] = js.native
  }
  
  @js.native
  trait DisplayNamesOptions extends StObject {
    
    var fallback: js.UndefOr[code | none] = js.native
    
    var localeMatcher: js.UndefOr[lookup | (`best fit`)] = js.native
    
    var style: js.UndefOr[narrow | short | long] = js.native
    
    var `type`: language | region | script | currency = js.native
  }
  object DisplayNamesOptions {
    
    @scala.inline
    def apply(`type`: language | region | script | currency): DisplayNamesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisplayNamesOptions]
    }
    
    @scala.inline
    implicit class DisplayNamesOptionsMutableBuilder[Self <: DisplayNamesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFallback(value: code | none): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      @scala.inline
      def setLocaleMatcher(value: lookup | (`best fit`)): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
      
      @scala.inline
      def setStyle(value: narrow | short | long): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setType(value: language | region | script | currency): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DisplayNamesResolvedOptions extends StObject {
    
    var fallback: NonNullable[js.UndefOr[code | none]] = js.native
    
    var locale: String = js.native
    
    var style: NonNullable[js.UndefOr[narrow | short | long]] = js.native
    
    var `type`: NonNullable[language | region | script | currency] = js.native
  }
  object DisplayNamesResolvedOptions {
    
    @scala.inline
    def apply(locale: String, `type`: NonNullable[language | region | script | currency]): DisplayNamesResolvedOptions = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisplayNamesResolvedOptions]
    }
    
    @scala.inline
    implicit class DisplayNamesResolvedOptionsMutableBuilder[Self <: DisplayNamesResolvedOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFallback(value: NonNullable[js.UndefOr[code | none]]): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: NonNullable[js.UndefOr[narrow | short | long]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setType(value: NonNullable[language | region | script | currency]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
