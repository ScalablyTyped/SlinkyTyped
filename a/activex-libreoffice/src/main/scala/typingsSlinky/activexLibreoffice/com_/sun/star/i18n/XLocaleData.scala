package typingsSlinky.activexLibreoffice.com_.sun.star.i18n

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access locale specific data as it is defined in XML locale data files compiled into the binary data libraries liblocaledata*.so respectively
  * localedata*.dll.
  *
  * For XML locale data files definitions see [the DTD file]{@link
  * url="http://cgit.freedesktop.org/libreoffice/core/tree/i18npool/source/localedata/data/locale.dtd"} .
  */
@js.native
trait XLocaleData extends XInterface {
  /** returns all available locales. */
  val AllInstalledLocaleNames: SafeArray[Locale] = js.native
  /** returns all LC_CALENDAR calendars for a locale. */
  def getAllCalendars(aLocale: Locale): SafeArray[Calendar] = js.native
  /** returns all LC_CURRENCY currencies for a locale. */
  def getAllCurrencies(aLocale: Locale): SafeArray[Currency] = js.native
  /** returns all LC_FORMAT format elements for a locale. */
  def getAllFormats(aLocale: Locale): SafeArray[FormatElement] = js.native
  /** returns all available locales. */
  def getAllInstalledLocaleNames(): SafeArray[Locale] = js.native
  /** returns all LC_COLLATION collation options for a locale. */
  def getCollationOptions(aLocale: Locale): SafeArray[String] = js.native
  /** returns all LC_COLLATION collators for a locale. */
  def getCollatorImplementations(aLocale: Locale): SafeArray[Implementation] = js.native
  /** returns all LC_MISC forbidden characters for a locale. */
  def getForbiddenCharacters(aLocale: Locale): ForbiddenCharacters = js.native
  /** returns the LC_INFO locale information. */
  def getLanguageCountryInfo(aLocale: Locale): LanguageCountryInfo = js.native
  /** returns LC_CTYPE separators and markers. */
  def getLocaleItem(aLocale: Locale): LocaleDataItem = js.native
  /**
    * returns all LC_MISC reserved words for a locale.
    * @see reservedWords
    */
  def getReservedWord(aLocale: Locale): SafeArray[String] = js.native
  /** returns all LC_SEARCH search options for a locale. */
  def getSearchOptions(aLocale: Locale): SafeArray[String] = js.native
  /** returns all LC_TRANSLITERATION transliterations for a locale. */
  def getTransliterations(aLocale: Locale): SafeArray[String] = js.native
}

object XLocaleData {
  @scala.inline
  def apply(
    AllInstalledLocaleNames: SafeArray[Locale],
    acquire: () => Unit,
    getAllCalendars: Locale => SafeArray[Calendar],
    getAllCurrencies: Locale => SafeArray[Currency],
    getAllFormats: Locale => SafeArray[FormatElement],
    getAllInstalledLocaleNames: () => SafeArray[Locale],
    getCollationOptions: Locale => SafeArray[String],
    getCollatorImplementations: Locale => SafeArray[Implementation],
    getForbiddenCharacters: Locale => ForbiddenCharacters,
    getLanguageCountryInfo: Locale => LanguageCountryInfo,
    getLocaleItem: Locale => LocaleDataItem,
    getReservedWord: Locale => SafeArray[String],
    getSearchOptions: Locale => SafeArray[String],
    getTransliterations: Locale => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XLocaleData = {
    val __obj = js.Dynamic.literal(AllInstalledLocaleNames = AllInstalledLocaleNames.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAllCalendars = js.Any.fromFunction1(getAllCalendars), getAllCurrencies = js.Any.fromFunction1(getAllCurrencies), getAllFormats = js.Any.fromFunction1(getAllFormats), getAllInstalledLocaleNames = js.Any.fromFunction0(getAllInstalledLocaleNames), getCollationOptions = js.Any.fromFunction1(getCollationOptions), getCollatorImplementations = js.Any.fromFunction1(getCollatorImplementations), getForbiddenCharacters = js.Any.fromFunction1(getForbiddenCharacters), getLanguageCountryInfo = js.Any.fromFunction1(getLanguageCountryInfo), getLocaleItem = js.Any.fromFunction1(getLocaleItem), getReservedWord = js.Any.fromFunction1(getReservedWord), getSearchOptions = js.Any.fromFunction1(getSearchOptions), getTransliterations = js.Any.fromFunction1(getTransliterations), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XLocaleData]
  }
  @scala.inline
  implicit class XLocaleDataOps[Self <: XLocaleData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllInstalledLocaleNames(value: SafeArray[Locale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllInstalledLocaleNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAllCalendars(value: Locale => SafeArray[Calendar]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllCalendars")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAllCurrencies(value: Locale => SafeArray[Currency]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllCurrencies")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAllFormats(value: Locale => SafeArray[FormatElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllFormats")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAllInstalledLocaleNames(value: () => SafeArray[Locale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllInstalledLocaleNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCollationOptions(value: Locale => SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCollationOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCollatorImplementations(value: Locale => SafeArray[Implementation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCollatorImplementations")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetForbiddenCharacters(value: Locale => ForbiddenCharacters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getForbiddenCharacters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLanguageCountryInfo(value: Locale => LanguageCountryInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLanguageCountryInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLocaleItem(value: Locale => LocaleDataItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLocaleItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetReservedWord(value: Locale => SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReservedWord")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSearchOptions(value: Locale => SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSearchOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTransliterations(value: Locale => SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTransliterations")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

