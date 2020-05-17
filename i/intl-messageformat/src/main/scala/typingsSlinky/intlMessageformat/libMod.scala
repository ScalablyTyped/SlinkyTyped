package typingsSlinky.intlMessageformat

import typingsSlinky.intlMessageformat.anon.Date
import typingsSlinky.intlMessageformat.anon.FnCall
import typingsSlinky.intlMessageformat.anon.PartialFormats
import typingsSlinky.intlMessageformat.coreMod.Options
import typingsSlinky.intlMessageformat.formattersMod.FormatXMLElementFn
import typingsSlinky.intlMessageformat.formattersMod.Formats
import typingsSlinky.intlMessageformat.formattersMod.FormatterCache
import typingsSlinky.intlMessageformat.formattersMod.Formatters
import typingsSlinky.intlMessageformat.formattersMod.MessageFormatPart
import typingsSlinky.intlMessageformat.formattersMod.PrimitiveType
import typingsSlinky.intlMessageformatParser.mod.MessageFormatElement
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  @js.native
  class IntlMessageFormat protected ()
    extends typingsSlinky.intlMessageformat.coreMod.IntlMessageFormat {
    def this(message: String) = this()
    def this(message: js.Array[MessageFormatElement]) = this()
    def this(message: String, locales: String) = this()
    def this(message: String, locales: js.Array[String]) = this()
    def this(message: js.Array[MessageFormatElement], locales: String) = this()
    def this(message: js.Array[MessageFormatElement], locales: js.Array[String]) = this()
    def this(message: String, locales: String, overrideFormats: PartialFormats) = this()
    def this(message: String, locales: js.Array[String], overrideFormats: PartialFormats) = this()
    def this(message: js.Array[MessageFormatElement], locales: String, overrideFormats: PartialFormats) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: js.Array[String],
      overrideFormats: PartialFormats
    ) = this()
    def this(message: String, locales: String, overrideFormats: PartialFormats, opts: Options) = this()
    def this(message: String, locales: js.Array[String], overrideFormats: PartialFormats, opts: Options) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: String,
      overrideFormats: PartialFormats,
      opts: Options
    ) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: js.Array[String],
      overrideFormats: PartialFormats,
      opts: Options
    ) = this()
  }
  
  @js.native
  class default protected ()
    extends typingsSlinky.intlMessageformat.coreMod.default {
    def this(message: String) = this()
    def this(message: js.Array[MessageFormatElement]) = this()
    def this(message: String, locales: String) = this()
    def this(message: String, locales: js.Array[String]) = this()
    def this(message: js.Array[MessageFormatElement], locales: String) = this()
    def this(message: js.Array[MessageFormatElement], locales: js.Array[String]) = this()
    def this(message: String, locales: String, overrideFormats: PartialFormats) = this()
    def this(message: String, locales: js.Array[String], overrideFormats: PartialFormats) = this()
    def this(message: js.Array[MessageFormatElement], locales: String, overrideFormats: PartialFormats) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: js.Array[String],
      overrideFormats: PartialFormats
    ) = this()
    def this(message: String, locales: String, overrideFormats: PartialFormats, opts: Options) = this()
    def this(message: String, locales: js.Array[String], overrideFormats: PartialFormats, opts: Options) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: String,
      overrideFormats: PartialFormats,
      opts: Options
    ) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: js.Array[String],
      overrideFormats: PartialFormats,
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
    var __parse: js.UndefOr[FnCall] = js.native
    var defaultLocale: String = js.native
    var formats: Date = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var __parse: js.UndefOr[FnCall] = js.native
    var defaultLocale: String = js.native
    var formats: Date = js.native
  }
  
}

