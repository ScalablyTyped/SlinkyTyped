package typingsSlinky.activexLibreoffice.com_.sun.star.resource

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * offers some operations on {@link com.sun.star.lang.Locale} structures.
  * @see XResourceBundle
  * @see Locale
  */
@js.native
trait XLocale extends XInterface {
  /** @returns a sequence of all locales which are available in the system. */
  val AvailableLocales: SafeArray[Locale] = js.native
  /**
    * the common method of getting the current default locale.
    *
    * It is used for the presentation (for menus, dialogs, etc.). It is, generally, set once when your applet or application is initialized, then never
    * reset. (If you do reset the default locale, you probably want to reload your GUI, so that the change is reflected in your interface.)
    *
    * More advanced programs allow users to use different locales for different fields, for example, in a spreadsheet.
    *
    * ;  Note that the initial setting will match the host system.
    */
  var Default: Locale = js.native
  /** @returns a sequence of all ISO country codes known to the component. */
  val ISOCountries: SafeArray[String] = js.native
  /** @returns a sequence of all ISO language codes known to the component. */
  val ISOLanguages: SafeArray[String] = js.native
  /**
    * creates a locale from language, country, and variant.
    *
    * NOTE: ISO 639 is not a stable standard; some of the language codes it defines (specifically iw, ji, and in) have changed. This constructor accepts
    * both the old codes (iw, ji, and in) and the new codes (he, yi, and id), but all other API on {@link XLocale} will return only the **NEW** codes.
    *
    * Note: The Java class `Locale` returns the **old** codes.
    */
  def create(aLanguage: String, aCountry: String, aVariant: String): Locale = js.native
  /** @returns `TRUE` if the {@link com.sun.star.lang.Locale}**l1** is equal to the other one.  A locale is deemed equal to another locale with identical langua */
  def equals(l1: Locale, l2: Locale): Boolean = js.native
  /** @returns a sequence of all locales which are available in the system. */
  def getAvailableLocales(): SafeArray[Locale] = js.native
  /**
    * the common method of getting the current default locale.
    *
    * It is used for the presentation (for menus, dialogs, etc.). It is, generally, set once when your applet or application is initialized, then never
    * reset. (If you do reset the default locale, you probably want to reload your GUI, so that the change is reflected in your interface.)
    *
    * More advanced programs allow users to use different locales for different fields, for example, in a spreadsheet.
    *
    * ;  Note that the initial setting will match the host system.
    */
  def getDefault(): Locale = js.native
  /**
    * @param locale the locale.
    * @param inLocale specifies the desired user country.
    * @returns country code for display of field to user. If the localized name is not found, returns the ISO codes.
    */
  def getDisplayCountry(locale: Locale, inLocale: Locale): String = js.native
  /** @returns country code for display of field to user. If the localized name is not found, returns the ISO code. The desired user country is from the default */
  def getDisplayCountry_Default(locale: Locale): String = js.native
  /**
    * @param locale the locale.
    * @param inLocale specifies the desired user language.
    * @returns language code for display of field to user. If the localized name is not found, returns the ISO codes.
    */
  def getDisplayLanguage(locale: Locale, inLocale: Locale): String = js.native
  /** @returns language code for display of field to user. If the localized name is not found, returns the ISO code. The desired user language is from the defau */
  def getDisplayLanguage_Default(locale: Locale): String = js.native
  /**
    * @param locale the locale.
    * @param inLocale specifies the desired user locale.
    * @returns a string to display the entire locale to user. If the localized name is not found, uses the ISO codes.
    */
  def getDisplayName(locale: Locale, inLocale: Locale): String = js.native
  /**
    * @param locale the locale.
    * @returns a string to display the entire locale to user. If the localized name is not found, uses the ISO codes. The default locale is used for the present
    */
  def getDisplayName_Default(locale: Locale): String = js.native
  /**
    * @param locale the locale.
    * @param inLocale specifies the desired user variant.
    * @returns variant code for display of field to user. If the localized name is not found, returns the ISO codes.
    */
  def getDisplayVariant(locale: Locale, inLocale: Locale): String = js.native
  /** @returns variant code for display of field to user. The desired user variant is from the default locale. */
  def getDisplayVariant_Default(locale: Locale): String = js.native
  /** @returns the ISO country code for the specified locale. */
  def getISO3Country(locale: Locale): String = js.native
  /** @returns the ISO language code for the specified locale. */
  def getISO3Language(locale: Locale): String = js.native
  /** @returns a sequence of all ISO country codes known to the component. */
  def getISOCountries(): SafeArray[String] = js.native
  /** @returns a sequence of all ISO language codes known to the component. */
  def getISOLanguages(): SafeArray[String] = js.native
  /** @returns a sequence for language codes which are valid within the given country. */
  def getLanguagesForCountry(country: String): SafeArray[String] = js.native
  /**
    * sets the default locale for the whole environment.
    *
    * It is normally set once at the beginning of an application, then never reset. `setDefault` does not reset the host locale.
    */
  def setDefault(newLocale: Locale): Unit = js.native
}

object XLocale {
  @scala.inline
  def apply(
    AvailableLocales: SafeArray[Locale],
    Default: Locale,
    ISOCountries: SafeArray[String],
    ISOLanguages: SafeArray[String],
    acquire: () => Unit,
    create: (String, String, String) => Locale,
    equals: (Locale, Locale) => Boolean,
    getAvailableLocales: () => SafeArray[Locale],
    getDefault: () => Locale,
    getDisplayCountry: (Locale, Locale) => String,
    getDisplayCountry_Default: Locale => String,
    getDisplayLanguage: (Locale, Locale) => String,
    getDisplayLanguage_Default: Locale => String,
    getDisplayName: (Locale, Locale) => String,
    getDisplayName_Default: Locale => String,
    getDisplayVariant: (Locale, Locale) => String,
    getDisplayVariant_Default: Locale => String,
    getISO3Country: Locale => String,
    getISO3Language: Locale => String,
    getISOCountries: () => SafeArray[String],
    getISOLanguages: () => SafeArray[String],
    getLanguagesForCountry: String => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDefault: Locale => Unit
  ): XLocale = {
    val __obj = js.Dynamic.literal(AvailableLocales = AvailableLocales.asInstanceOf[js.Any], Default = Default.asInstanceOf[js.Any], ISOCountries = ISOCountries.asInstanceOf[js.Any], ISOLanguages = ISOLanguages.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), create = js.Any.fromFunction3(create), equals = js.Any.fromFunction2(equals), getAvailableLocales = js.Any.fromFunction0(getAvailableLocales), getDefault = js.Any.fromFunction0(getDefault), getDisplayCountry = js.Any.fromFunction2(getDisplayCountry), getDisplayCountry_Default = js.Any.fromFunction1(getDisplayCountry_Default), getDisplayLanguage = js.Any.fromFunction2(getDisplayLanguage), getDisplayLanguage_Default = js.Any.fromFunction1(getDisplayLanguage_Default), getDisplayName = js.Any.fromFunction2(getDisplayName), getDisplayName_Default = js.Any.fromFunction1(getDisplayName_Default), getDisplayVariant = js.Any.fromFunction2(getDisplayVariant), getDisplayVariant_Default = js.Any.fromFunction1(getDisplayVariant_Default), getISO3Country = js.Any.fromFunction1(getISO3Country), getISO3Language = js.Any.fromFunction1(getISO3Language), getISOCountries = js.Any.fromFunction0(getISOCountries), getISOLanguages = js.Any.fromFunction0(getISOLanguages), getLanguagesForCountry = js.Any.fromFunction1(getLanguagesForCountry), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDefault = js.Any.fromFunction1(setDefault))
    __obj.asInstanceOf[XLocale]
  }
  @scala.inline
  implicit class XLocaleOps[Self <: XLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailableLocales(value: SafeArray[Locale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailableLocales")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault(value: Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withISOCountries(value: SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ISOCountries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withISOLanguages(value: SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ISOLanguages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreate(value: (String, String, String) => Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withEquals(value: (Locale, Locale) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetAvailableLocales(value: () => SafeArray[Locale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAvailableLocales")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDefault(value: () => Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDisplayCountry(value: (Locale, Locale) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisplayCountry")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetDisplayCountry_Default(value: Locale => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisplayCountry_Default")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDisplayLanguage(value: (Locale, Locale) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisplayLanguage")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetDisplayLanguage_Default(value: Locale => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisplayLanguage_Default")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDisplayName(value: (Locale, Locale) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisplayName")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetDisplayName_Default(value: Locale => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisplayName_Default")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDisplayVariant(value: (Locale, Locale) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisplayVariant")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetDisplayVariant_Default(value: Locale => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisplayVariant_Default")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetISO3Country(value: Locale => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getISO3Country")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetISO3Language(value: Locale => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getISO3Language")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetISOCountries(value: () => SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getISOCountries")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetISOLanguages(value: () => SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getISOLanguages")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLanguagesForCountry(value: String => SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLanguagesForCountry")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDefault(value: Locale => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefault")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

