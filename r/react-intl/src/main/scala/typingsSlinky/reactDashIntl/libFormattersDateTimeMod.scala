package typingsSlinky.reactDashIntl

import typingsSlinky.reactDashIntl.libTypesMod.IntlConfig
import typingsSlinky.reactDashIntl.reactDashIntlStrings.date
import typingsSlinky.reactDashIntl.reactDashIntlStrings.formats
import typingsSlinky.reactDashIntl.reactDashIntlStrings.locale
import typingsSlinky.reactDashIntl.reactDashIntlStrings.onError
import typingsSlinky.reactDashIntl.reactDashIntlStrings.time
import typingsSlinky.reactDashIntl.reactDashIntlStrings.timeZone
import typingsSlinky.std.ConstructorParameters
import typingsSlinky.std.Intl.DateTimeFormat
import typingsSlinky.std.Intl.DateTimeFormatPart
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/lib/formatters/dateTime", JSImport.Namespace)
@js.native
object libFormattersDateTimeMod extends js.Object {
  def formatDate(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Anon_Locales], DateTimeFormat]
  ): String = js.native
  def formatDate(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Anon_Locales], DateTimeFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[0] */ js.Any
  ): String = js.native
  def formatDate(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Anon_Locales], DateTimeFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[1] */ js.Any
  ): String = js.native
  def formatDateToParts(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Anon_Locales], DateTimeFormat]
  ): js.Array[DateTimeFormatPart] = js.native
  def formatDateToParts(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Anon_Locales], DateTimeFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[0] */ js.Any
  ): js.Array[DateTimeFormatPart] = js.native
  def formatDateToParts(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Anon_Locales], DateTimeFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[1] */ js.Any
  ): js.Array[DateTimeFormatPart] = js.native
  def formatTime(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Anon_Locales], DateTimeFormat]
  ): String = js.native
  def formatTime(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Anon_Locales], DateTimeFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[0] */ js.Any
  ): String = js.native
  def formatTime(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Anon_Locales], DateTimeFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[1] */ js.Any
  ): String = js.native
  def formatTimeToParts(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Anon_Locales], DateTimeFormat]
  ): js.Array[DateTimeFormatPart] = js.native
  def formatTimeToParts(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Anon_Locales], DateTimeFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[0] */ js.Any
  ): js.Array[DateTimeFormatPart] = js.native
  def formatTimeToParts(
    config: Pick[IntlConfig, locale | formats | onError | timeZone],
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Anon_Locales], DateTimeFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[1] */ js.Any
  ): js.Array[DateTimeFormatPart] = js.native
  def getFormatter(
    hasLocaleFormatsOnErrorTimeZone: Pick[IntlConfig, locale | formats | onError | timeZone],
    `type`: date,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Anon_Locales], DateTimeFormat]
  ): DateTimeFormat = js.native
  def getFormatter(
    hasLocaleFormatsOnErrorTimeZone: Pick[IntlConfig, locale | formats | onError | timeZone],
    `type`: date,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Anon_Locales], DateTimeFormat],
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[1] */ js.Any
  ): DateTimeFormat = js.native
  def getFormatter(
    hasLocaleFormatsOnErrorTimeZone: Pick[IntlConfig, locale | formats | onError | timeZone],
    `type`: time,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Anon_Locales], DateTimeFormat]
  ): DateTimeFormat = js.native
  def getFormatter(
    hasLocaleFormatsOnErrorTimeZone: Pick[IntlConfig, locale | formats | onError | timeZone],
    `type`: time,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Anon_Locales], DateTimeFormat],
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.DateTimeFormat['format']>[0] | string, opts ? : react-intl.react-intl/lib/types.FormatDateOptions): string>[1] */ js.Any
  ): DateTimeFormat = js.native
}

