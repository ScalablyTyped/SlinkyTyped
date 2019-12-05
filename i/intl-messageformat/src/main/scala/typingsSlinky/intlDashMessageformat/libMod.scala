package typingsSlinky.intlDashMessageformat

import typingsSlinky.intlDashMessageformat.libCoreMod.Options
import typingsSlinky.intlDashMessageformat.libFormattersMod.FormatXMLElementFn
import typingsSlinky.intlDashMessageformat.libFormattersMod.Formats
import typingsSlinky.intlDashMessageformat.libFormattersMod.FormatterCache
import typingsSlinky.intlDashMessageformat.libFormattersMod.Formatters
import typingsSlinky.intlDashMessageformat.libFormattersMod.MessageFormatPart
import typingsSlinky.intlDashMessageformat.libFormattersMod.PrimitiveType
import typingsSlinky.intlDashMessageformatDashParser.intlDashMessageformatDashParserMod.MessageFormatElement
import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  @js.native
  class IntlMessageFormat protected ()
    extends typingsSlinky.intlDashMessageformat.libCoreMod.IntlMessageFormat {
    def this(message: String) = this()
    def this(message: js.Array[MessageFormatElement]) = this()
    def this(message: String, locales: String) = this()
    def this(message: String, locales: js.Array[String]) = this()
    def this(message: js.Array[MessageFormatElement], locales: String) = this()
    def this(message: js.Array[MessageFormatElement], locales: js.Array[String]) = this()
    def this(message: String, locales: String, overrideFormats: Partial[Formats]) = this()
    def this(message: String, locales: js.Array[String], overrideFormats: Partial[Formats]) = this()
    def this(message: js.Array[MessageFormatElement], locales: String, overrideFormats: Partial[Formats]) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: js.Array[String],
      overrideFormats: Partial[Formats]
    ) = this()
    def this(message: String, locales: String, overrideFormats: Partial[Formats], opts: Options) = this()
    def this(message: String, locales: js.Array[String], overrideFormats: Partial[Formats], opts: Options) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: String,
      overrideFormats: Partial[Formats],
      opts: Options
    ) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: js.Array[String],
      overrideFormats: Partial[Formats],
      opts: Options
    ) = this()
  }
  
  @js.native
  class default protected ()
    extends typingsSlinky.intlDashMessageformat.libCoreMod.default {
    def this(message: String) = this()
    def this(message: js.Array[MessageFormatElement]) = this()
    def this(message: String, locales: String) = this()
    def this(message: String, locales: js.Array[String]) = this()
    def this(message: js.Array[MessageFormatElement], locales: String) = this()
    def this(message: js.Array[MessageFormatElement], locales: js.Array[String]) = this()
    def this(message: String, locales: String, overrideFormats: Partial[Formats]) = this()
    def this(message: String, locales: js.Array[String], overrideFormats: Partial[Formats]) = this()
    def this(message: js.Array[MessageFormatElement], locales: String, overrideFormats: Partial[Formats]) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: js.Array[String],
      overrideFormats: Partial[Formats]
    ) = this()
    def this(message: String, locales: String, overrideFormats: Partial[Formats], opts: Options) = this()
    def this(message: String, locales: js.Array[String], overrideFormats: Partial[Formats], opts: Options) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: String,
      overrideFormats: Partial[Formats],
      opts: Options
    ) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: js.Array[String],
      overrideFormats: Partial[Formats],
      opts: Options
    ) = this()
  }
  
  def createDefaultFormatters(): Formatters = js.native
  def createDefaultFormatters(cache: FormatterCache): Formatters = js.native
  def formatHTMLMessage(els: js.Array[MessageFormatElement], locales: String, formatters: Formatters, formats: Formats): js.Array[String | js.Object] = js.native
  def formatHTMLMessage(
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: Record[String, PrimitiveType | js.Object | FormatXMLElementFn]
  ): js.Array[String | js.Object] = js.native
  def formatHTMLMessage(
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: Record[String, PrimitiveType | js.Object | FormatXMLElementFn],
    originalMessage: String
  ): js.Array[String | js.Object] = js.native
  def formatHTMLMessage(
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats
  ): js.Array[String | js.Object] = js.native
  def formatHTMLMessage(
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: Record[String, PrimitiveType | js.Object | FormatXMLElementFn]
  ): js.Array[String | js.Object] = js.native
  def formatHTMLMessage(
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: Record[String, PrimitiveType | js.Object | FormatXMLElementFn],
    originalMessage: String
  ): js.Array[String | js.Object] = js.native
  def formatToParts(els: js.Array[MessageFormatElement], locales: String, formatters: Formatters, formats: Formats): js.Array[MessageFormatPart] = js.native
  def formatToParts(
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: Record[String, _]
  ): js.Array[MessageFormatPart] = js.native
  def formatToParts(
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: Record[String, _],
    currentPluralValue: Double
  ): js.Array[MessageFormatPart] = js.native
  def formatToParts(
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: Record[String, _],
    currentPluralValue: Double,
    originalMessage: String
  ): js.Array[MessageFormatPart] = js.native
  def formatToParts(
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats
  ): js.Array[MessageFormatPart] = js.native
  def formatToParts(
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: Record[String, _]
  ): js.Array[MessageFormatPart] = js.native
  def formatToParts(
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: Record[String, _],
    currentPluralValue: Double
  ): js.Array[MessageFormatPart] = js.native
  def formatToParts(
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: Record[String, _],
    currentPluralValue: Double,
    originalMessage: String
  ): js.Array[MessageFormatPart] = js.native
  def formatToString(els: js.Array[MessageFormatElement], locales: String, formatters: Formatters, formats: Formats): String = js.native
  def formatToString(
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: Record[String, PrimitiveType]
  ): String = js.native
  def formatToString(
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: Record[String, PrimitiveType],
    originalMessage: String
  ): String = js.native
  def formatToString(
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats
  ): String = js.native
  def formatToString(
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: Record[String, PrimitiveType]
  ): String = js.native
  def formatToString(
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: Record[String, PrimitiveType],
    originalMessage: String
  ): String = js.native
  /* static members */
  @js.native
  object IntlMessageFormat extends js.Object {
    var __parse: js.UndefOr[Fn_Input] = js.native
    var defaultLocale: String = js.native
    var formats: Anon_Date = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var __parse: js.UndefOr[Fn_Input] = js.native
    var defaultLocale: String = js.native
    var formats: Anon_Date = js.native
  }
  
}

