package typingsSlinky.angularCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def APP_BASE_HREF: typingsSlinky.angularCore.mod.InjectionToken[java.lang.String] = typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].selectDynamic("APP_BASE_HREF").asInstanceOf[typingsSlinky.angularCore.mod.InjectionToken[java.lang.String]]
  
  @scala.inline
  def DOCUMENT: typingsSlinky.angularCore.mod.InjectionToken[org.scalajs.dom.raw.Document] = typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].selectDynamic("DOCUMENT").asInstanceOf[typingsSlinky.angularCore.mod.InjectionToken[org.scalajs.dom.raw.Document]]
  
  @scala.inline
  def LOCATION_INITIALIZED: typingsSlinky.angularCore.mod.InjectionToken[js.Promise[js.Any]] = typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].selectDynamic("LOCATION_INITIALIZED").asInstanceOf[typingsSlinky.angularCore.mod.InjectionToken[js.Promise[js.Any]]]
  
  type LocationChangeListener = js.Function1[/* event */ typingsSlinky.angularCommon.mod.LocationChangeEvent, js.Any]
  
  @scala.inline
  def VERSION: typingsSlinky.angularCore.mod.Version = typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[typingsSlinky.angularCore.mod.Version]
  
  @scala.inline
  def formatCurrency(value: scala.Double, locale: java.lang.String, currency: java.lang.String): java.lang.String = (typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatCurrency")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], currency.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def formatCurrency(
    value: scala.Double,
    locale: java.lang.String,
    currency: java.lang.String,
    currencyCode: js.UndefOr[scala.Nothing],
    digitsInfo: java.lang.String
  ): java.lang.String = (typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatCurrency")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], currency.asInstanceOf[js.Any], currencyCode.asInstanceOf[js.Any], digitsInfo.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def formatCurrency(
    value: scala.Double,
    locale: java.lang.String,
    currency: java.lang.String,
    currencyCode: java.lang.String
  ): java.lang.String = (typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatCurrency")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], currency.asInstanceOf[js.Any], currencyCode.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def formatCurrency(
    value: scala.Double,
    locale: java.lang.String,
    currency: java.lang.String,
    currencyCode: java.lang.String,
    digitsInfo: java.lang.String
  ): java.lang.String = (typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatCurrency")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], currency.asInstanceOf[js.Any], currencyCode.asInstanceOf[js.Any], digitsInfo.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def formatDate(value: java.lang.String, format: java.lang.String, locale: java.lang.String): java.lang.String = (typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def formatDate(
    value: java.lang.String,
    format: java.lang.String,
    locale: java.lang.String,
    timezone: java.lang.String
  ): java.lang.String = (typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], timezone.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def formatDate(value: js.Date, format: java.lang.String, locale: java.lang.String): java.lang.String = (typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def formatDate(value: js.Date, format: java.lang.String, locale: java.lang.String, timezone: java.lang.String): java.lang.String = (typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], timezone.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def formatDate(value: scala.Double, format: java.lang.String, locale: java.lang.String): java.lang.String = (typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def formatDate(
    value: scala.Double,
    format: java.lang.String,
    locale: java.lang.String,
    timezone: java.lang.String
  ): java.lang.String = (typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], timezone.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def formatNumber(value: scala.Double, locale: java.lang.String): java.lang.String = (typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def formatNumber(value: scala.Double, locale: java.lang.String, digitsInfo: java.lang.String): java.lang.String = (typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], digitsInfo.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def formatPercent(value: scala.Double, locale: java.lang.String): java.lang.String = (typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatPercent")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def formatPercent(value: scala.Double, locale: java.lang.String, digitsInfo: java.lang.String): java.lang.String = (typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatPercent")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], digitsInfo.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getCurrencySymbol_narrow(code: java.lang.String, format: typingsSlinky.angularCommon.angularCommonStrings.narrow): java.lang.String = (typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getCurrencySymbol")(code.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def getCurrencySymbol_narrow(
    code: java.lang.String,
    format: typingsSlinky.angularCommon.angularCommonStrings.narrow,
    locale: java.lang.String
  ): java.lang.String = (typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getCurrencySymbol")(code.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getCurrencySymbol_wide(code: java.lang.String, format: typingsSlinky.angularCommon.angularCommonStrings.wide): java.lang.String = (typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getCurrencySymbol")(code.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def getCurrencySymbol_wide(
    code: java.lang.String,
    format: typingsSlinky.angularCommon.angularCommonStrings.wide,
    locale: java.lang.String
  ): java.lang.String = (typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getCurrencySymbol")(code.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getLocaleCurrencyCode(locale: java.lang.String): java.lang.String | scala.Null = typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleCurrencyCode")(locale.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | scala.Null]
  
  @scala.inline
  def getLocaleCurrencyName(locale: java.lang.String): java.lang.String | scala.Null = typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleCurrencyName")(locale.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | scala.Null]
  
  @scala.inline
  def getLocaleCurrencySymbol(locale: java.lang.String): java.lang.String | scala.Null = typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleCurrencySymbol")(locale.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | scala.Null]
  
  @scala.inline
  def getLocaleDateFormat(locale: java.lang.String, width: typingsSlinky.angularCommon.mod.FormatWidth): java.lang.String = (typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleDateFormat")(locale.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getLocaleDateTimeFormat(locale: java.lang.String, width: typingsSlinky.angularCommon.mod.FormatWidth): java.lang.String = (typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleDateTimeFormat")(locale.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getLocaleDayNames(
    locale: java.lang.String,
    formStyle: typingsSlinky.angularCommon.mod.FormStyle,
    width: typingsSlinky.angularCommon.mod.TranslationWidth
  ): js.Array[java.lang.String] = (typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleDayNames")(locale.asInstanceOf[js.Any], formStyle.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def getLocaleDayPeriods(
    locale: java.lang.String,
    formStyle: typingsSlinky.angularCommon.mod.FormStyle,
    width: typingsSlinky.angularCommon.mod.TranslationWidth
  ): js.Tuple2[java.lang.String, java.lang.String] = (typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleDayPeriods")(locale.asInstanceOf[js.Any], formStyle.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[java.lang.String, java.lang.String]]
  
  @scala.inline
  def getLocaleDirection(locale: java.lang.String): typingsSlinky.angularCommon.angularCommonStrings.ltr | typingsSlinky.angularCommon.angularCommonStrings.rtl = typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleDirection")(locale.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCommon.angularCommonStrings.ltr | typingsSlinky.angularCommon.angularCommonStrings.rtl]
  
  @scala.inline
  def getLocaleEraNames(locale: java.lang.String, width: typingsSlinky.angularCommon.mod.TranslationWidth): js.Tuple2[java.lang.String, java.lang.String] = (typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleEraNames")(locale.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[java.lang.String, java.lang.String]]
  
  @scala.inline
  def getLocaleExtraDayPeriodRules(locale: java.lang.String): js.Array[
    typingsSlinky.angularCommon.mod.Time | (js.Tuple2[typingsSlinky.angularCommon.mod.Time, typingsSlinky.angularCommon.mod.Time])
  ] = typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleExtraDayPeriodRules")(locale.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    typingsSlinky.angularCommon.mod.Time | (js.Tuple2[typingsSlinky.angularCommon.mod.Time, typingsSlinky.angularCommon.mod.Time])
  ]]
  
  @scala.inline
  def getLocaleExtraDayPeriods(
    locale: java.lang.String,
    formStyle: typingsSlinky.angularCommon.mod.FormStyle,
    width: typingsSlinky.angularCommon.mod.TranslationWidth
  ): js.Array[java.lang.String] = (typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleExtraDayPeriods")(locale.asInstanceOf[js.Any], formStyle.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def getLocaleFirstDayOfWeek(locale: java.lang.String): typingsSlinky.angularCommon.mod.WeekDay = typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleFirstDayOfWeek")(locale.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCommon.mod.WeekDay]
  
  @scala.inline
  def getLocaleId(locale: java.lang.String): java.lang.String = typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleId")(locale.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getLocaleMonthNames(
    locale: java.lang.String,
    formStyle: typingsSlinky.angularCommon.mod.FormStyle,
    width: typingsSlinky.angularCommon.mod.TranslationWidth
  ): js.Array[java.lang.String] = (typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleMonthNames")(locale.asInstanceOf[js.Any], formStyle.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def getLocaleNumberFormat(locale: java.lang.String, `type`: typingsSlinky.angularCommon.mod.NumberFormatStyle): java.lang.String = (typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleNumberFormat")(locale.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getLocaleNumberSymbol(locale: java.lang.String, symbol: typingsSlinky.angularCommon.mod.NumberSymbol): java.lang.String = (typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleNumberSymbol")(locale.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getLocalePluralCase(locale: java.lang.String): js.Function1[/* value */ scala.Double, typingsSlinky.angularCommon.mod.Plural] = typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocalePluralCase")(locale.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ scala.Double, typingsSlinky.angularCommon.mod.Plural]]
  
  @scala.inline
  def getLocaleTimeFormat(locale: java.lang.String, width: typingsSlinky.angularCommon.mod.FormatWidth): java.lang.String = (typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleTimeFormat")(locale.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getLocaleWeekEndRange(locale: java.lang.String): js.Tuple2[typingsSlinky.angularCommon.mod.WeekDay, typingsSlinky.angularCommon.mod.WeekDay] = typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleWeekEndRange")(locale.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[typingsSlinky.angularCommon.mod.WeekDay, typingsSlinky.angularCommon.mod.WeekDay]]
  
  @scala.inline
  def getNumberOfCurrencyDigits(code: java.lang.String): scala.Double = typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getNumberOfCurrencyDigits")(code.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  
  @scala.inline
  def isPlatformBrowser(platformId: js.Object): scala.Boolean = typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isPlatformBrowser")(platformId.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isPlatformServer(platformId: js.Object): scala.Boolean = typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isPlatformServer")(platformId.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isPlatformWorkerApp(platformId: js.Object): scala.Boolean = typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isPlatformWorkerApp")(platformId.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isPlatformWorkerUi(platformId: js.Object): scala.Boolean = typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isPlatformWorkerUi")(platformId.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def registerLocaleData(data: js.Any): scala.Unit = typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerLocaleData")(data.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def registerLocaleData(data: js.Any, localeId: js.UndefOr[scala.Nothing], extraData: js.Any): scala.Unit = (typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerLocaleData")(data.asInstanceOf[js.Any], localeId.asInstanceOf[js.Any], extraData.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def registerLocaleData(data: js.Any, localeId: java.lang.String): scala.Unit = (typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerLocaleData")(data.asInstanceOf[js.Any], localeId.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def registerLocaleData(data: js.Any, localeId: java.lang.String, extraData: js.Any): scala.Unit = (typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerLocaleData")(data.asInstanceOf[js.Any], localeId.asInstanceOf[js.Any], extraData.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def registerLocaleData(data: js.Any, localeId: js.Any): scala.Unit = (typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerLocaleData")(data.asInstanceOf[js.Any], localeId.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def registerLocaleData(data: js.Any, localeId: js.Any, extraData: js.Any): scala.Unit = (typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerLocaleData")(data.asInstanceOf[js.Any], localeId.asInstanceOf[js.Any], extraData.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵPLATFORMBROWSERID: /* "browser" */ java.lang.String = typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275PLATFORM_BROWSER_ID").asInstanceOf[/* "browser" */ java.lang.String]
  
  @scala.inline
  def ɵPLATFORMSERVERID: /* "server" */ java.lang.String = typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275PLATFORM_SERVER_ID").asInstanceOf[/* "server" */ java.lang.String]
  
  @scala.inline
  def ɵPLATFORMWORKERAPPID: /* "browserWorkerApp" */ java.lang.String = typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275PLATFORM_WORKER_APP_ID").asInstanceOf[/* "browserWorkerApp" */ java.lang.String]
  
  @scala.inline
  def ɵPLATFORMWORKERUIID: /* "browserWorkerUi" */ java.lang.String = typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275PLATFORM_WORKER_UI_ID").asInstanceOf[/* "browserWorkerUi" */ java.lang.String]
  
  @scala.inline
  def ɵangularPackagesCommonCommonA(): typingsSlinky.angularCommon.mod.ɵBrowserPlatformLocation = typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_common_common_a")().asInstanceOf[typingsSlinky.angularCommon.mod.ɵBrowserPlatformLocation]
  
  @scala.inline
  def ɵangularPackagesCommonCommonB(): typingsSlinky.angularCommon.mod.ɵBrowserPlatformLocation = typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_common_common_b")().asInstanceOf[typingsSlinky.angularCommon.mod.ɵBrowserPlatformLocation]
  
  @scala.inline
  def ɵangularPackagesCommonCommonC(): typingsSlinky.angularCommon.mod.Location = typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_common_common_c")().asInstanceOf[typingsSlinky.angularCommon.mod.Location]
  
  @scala.inline
  def ɵangularPackagesCommonCommonD(platformLocation: typingsSlinky.angularCommon.mod.PlatformLocation): typingsSlinky.angularCommon.mod.PathLocationStrategy = typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_common_common_d")(platformLocation.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.angularCommon.mod.PathLocationStrategy]
  
  @scala.inline
  def ɵangularPackagesCommonCommonE: js.Array[typingsSlinky.angularCore.mod.Provider] = typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275angular_packages_common_common_e").asInstanceOf[js.Array[typingsSlinky.angularCore.mod.Provider]]
  
  @scala.inline
  def ɵangularPackagesCommonCommonF: js.Array[
    (org.scalablytyped.runtime.Instantiable1[
      (/* _ref */ typingsSlinky.angularCore.mod.ChangeDetectorRef) | (/* differs */ typingsSlinky.angularCore.mod.KeyValueDiffers) | (/* _localization */ typingsSlinky.angularCommon.mod.NgLocalization) | (/* _locale */ java.lang.String), 
      typingsSlinky.angularCommon.mod.AsyncPipe | typingsSlinky.angularCommon.mod.DatePipe | typingsSlinky.angularCommon.mod.DecimalPipe | typingsSlinky.angularCommon.mod.I18nPluralPipe | typingsSlinky.angularCommon.mod.KeyValuePipe | typingsSlinky.angularCommon.mod.PercentPipe
    ]) | (org.scalablytyped.runtime.Instantiable0[
      typingsSlinky.angularCommon.mod.I18nSelectPipe | typingsSlinky.angularCommon.mod.SlicePipe
    ]) | (org.scalablytyped.runtime.Instantiable2[
      /* _locale */ java.lang.String, 
      /* _defaultCurrencyCode */ js.UndefOr[java.lang.String], 
      typingsSlinky.angularCommon.mod.CurrencyPipe
    ])
  ] = typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275angular_packages_common_common_f").asInstanceOf[js.Array[
    (org.scalablytyped.runtime.Instantiable1[
      (/* _ref */ typingsSlinky.angularCore.mod.ChangeDetectorRef) | (/* differs */ typingsSlinky.angularCore.mod.KeyValueDiffers) | (/* _localization */ typingsSlinky.angularCommon.mod.NgLocalization) | (/* _locale */ java.lang.String), 
      typingsSlinky.angularCommon.mod.AsyncPipe | typingsSlinky.angularCommon.mod.DatePipe | typingsSlinky.angularCommon.mod.DecimalPipe | typingsSlinky.angularCommon.mod.I18nPluralPipe | typingsSlinky.angularCommon.mod.KeyValuePipe | typingsSlinky.angularCommon.mod.PercentPipe
    ]) | (org.scalablytyped.runtime.Instantiable0[
      typingsSlinky.angularCommon.mod.I18nSelectPipe | typingsSlinky.angularCommon.mod.SlicePipe
    ]) | (org.scalablytyped.runtime.Instantiable2[
      /* _locale */ java.lang.String, 
      /* _defaultCurrencyCode */ js.UndefOr[java.lang.String], 
      typingsSlinky.angularCommon.mod.CurrencyPipe
    ])
  ]]
  
  @scala.inline
  def ɵgetDOM(): typingsSlinky.angularCommon.mod.ɵDomAdapter = typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getDOM")().asInstanceOf[typingsSlinky.angularCommon.mod.ɵDomAdapter]
  
  @scala.inline
  def ɵparseCookieValue(cookieStr: java.lang.String, name: java.lang.String): java.lang.String | scala.Null = (typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275parseCookieValue")(cookieStr.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | scala.Null]
  
  @scala.inline
  def ɵsetRootDomAdapter(adapter: typingsSlinky.angularCommon.mod.ɵDomAdapter): scala.Unit = typingsSlinky.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setRootDomAdapter")(adapter.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
}
