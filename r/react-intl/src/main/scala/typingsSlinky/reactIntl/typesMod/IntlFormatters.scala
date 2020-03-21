package typingsSlinky.reactIntl.typesMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.intlMessageformat.mod.FormatXMLElementFn
import typingsSlinky.intlMessageformat.mod.PrimitiveType
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.std.Intl.DateTimeFormatPart
import typingsSlinky.std.Intl.NumberFormatPart
import typingsSlinky.std.Record
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntlFormatters extends js.Object {
  def formatDate(value: String): String = js.native
  def formatDate(value: String, opts: FormatDateOptions): String = js.native
  def formatDateToParts(value: String): js.Array[DateTimeFormatPart] = js.native
  def formatDateToParts(value: String, opts: FormatDateOptions): js.Array[DateTimeFormatPart] = js.native
  @JSName("formatDateToParts")
  def formatDateToParts_0(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.FnCallDate>[0] */ js.Any
  ): js.Array[DateTimeFormatPart] = js.native
  @JSName("formatDateToParts")
  def formatDateToParts_0(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.FnCallDate>[0] */ js.Any,
    opts: FormatDateOptions
  ): js.Array[DateTimeFormatPart] = js.native
  @JSName("formatDate")
  def formatDate_0(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.FnCallDate>[0] */ js.Any
  ): String = js.native
  @JSName("formatDate")
  def formatDate_0(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.FnCallDate>[0] */ js.Any,
    opts: FormatDateOptions
  ): String = js.native
  def formatDisplayName(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DisplayNames * / any['of']>[0] */ js.Any
  ): js.UndefOr[String] = js.native
  def formatDisplayName(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DisplayNames * / any['of']>[0] */ js.Any,
    opts: FormatDisplayNameOptions
  ): js.UndefOr[String] = js.native
  def formatHTMLMessage(descriptor: MessageDescriptor): TagMod[Any] = js.native
  def formatHTMLMessage(descriptor: MessageDescriptor, values: Record[String, PrimitiveType]): TagMod[Any] = js.native
  def formatList(values: js.Array[String | TagMod[Any]]): TagMod[Any] = js.native
  def formatList(values: js.Array[String | TagMod[Any]], opts: FormatListOptions): TagMod[Any] = js.native
  @JSName("formatList")
  def formatList_String(values: js.Array[String]): String = js.native
  @JSName("formatList")
  def formatList_String(values: js.Array[String], opts: FormatListOptions): String = js.native
  def formatMessage(descriptor: MessageDescriptor): String = js.native
  def formatMessage(descriptor: MessageDescriptor, values: Record[String, PrimitiveType]): String = js.native
  @JSName("formatMessage")
  def formatMessage_Union(descriptor: MessageDescriptor): String | ReactNodeArray = js.native
  @JSName("formatMessage")
  def formatMessage_Union(
    descriptor: MessageDescriptor,
    values: Record[String, PrimitiveType | ReactElement | FormatXMLElementFn]
  ): String | ReactNodeArray = js.native
  @JSName("formatNumberToParts")
  def formatNumberToParts_0(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : number): string>[0] */ js.Any
  ): js.Array[NumberFormatPart] = js.native
  @JSName("formatNumberToParts")
  def formatNumberToParts_0(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : number): string>[0] */ js.Any,
    opts: FormatNumberOptions
  ): js.Array[NumberFormatPart] = js.native
  @JSName("formatNumber")
  def formatNumber_0(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : number): string>[0] */ js.Any
  ): String = js.native
  @JSName("formatNumber")
  def formatNumber_0(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : number): string>[0] */ js.Any,
    opts: FormatNumberOptions
  ): String = js.native
  @JSName("formatPlural")
  def formatPlural_0(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(n : number): string>[0] */ js.Any
  ): ReturnType[js.Function1[/* n */ Double, String]] = js.native
  @JSName("formatPlural")
  def formatPlural_0(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(n : number): string>[0] */ js.Any,
    opts: FormatPluralOptions
  ): ReturnType[js.Function1[/* n */ Double, String]] = js.native
  def formatRelativeTime(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : number, unit : @formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.FormattableUnit): string>[0] */ js.Any,
    unit: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : number, unit : @formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.FormattableUnit): string>[1] */ js.Any
  ): String = js.native
  def formatRelativeTime(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : number, unit : @formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.FormattableUnit): string>[0] */ js.Any,
    unit: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : number, unit : @formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.FormattableUnit): string>[1] */ js.Any,
    opts: FormatRelativeTimeOptions
  ): String = js.native
  @JSName("formatRelativeTime")
  def formatRelativeTime_0(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : number, unit : @formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.FormattableUnit): string>[0] */ js.Any
  ): String = js.native
  def formatTime(value: String): String = js.native
  def formatTime(value: String, opts: FormatDateOptions): String = js.native
  def formatTimeToParts(value: String): js.Array[DateTimeFormatPart] = js.native
  def formatTimeToParts(value: String, opts: FormatDateOptions): js.Array[DateTimeFormatPart] = js.native
  @JSName("formatTimeToParts")
  def formatTimeToParts_0(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.FnCallDate>[0] */ js.Any
  ): js.Array[DateTimeFormatPart] = js.native
  @JSName("formatTimeToParts")
  def formatTimeToParts_0(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.FnCallDate>[0] */ js.Any,
    opts: FormatDateOptions
  ): js.Array[DateTimeFormatPart] = js.native
  @JSName("formatTime")
  def formatTime_0(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.FnCallDate>[0] */ js.Any
  ): String = js.native
  @JSName("formatTime")
  def formatTime_0(
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.FnCallDate>[0] */ js.Any,
    opts: FormatDateOptions
  ): String = js.native
}

