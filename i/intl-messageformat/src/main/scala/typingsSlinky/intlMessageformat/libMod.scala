package typingsSlinky.intlMessageformat

import typingsSlinky.intlMessageformat.anon.Date
import typingsSlinky.intlMessageformat.anon.FnCall
import typingsSlinky.intlMessageformat.anon.PartialFormats
import typingsSlinky.intlMessageformat.coreMod.Options
import typingsSlinky.intlMessageformat.errorMod.ErrorCode
import typingsSlinky.intlMessageformat.formattersMod.FormatXMLElementFn
import typingsSlinky.intlMessageformat.formattersMod.Formats
import typingsSlinky.intlMessageformat.formattersMod.Formatters
import typingsSlinky.intlMessageformat.formattersMod.MessageFormatPart
import typingsSlinky.intlMessageformat.formattersMod.PrimitiveType
import typingsSlinky.intlMessageformatParser.srcTypesMod.MessageFormatElement
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("intl-messageformat/lib", JSImport.Default)
  @js.native
  class default protected ()
    extends typingsSlinky.intlMessageformat.coreMod.IntlMessageFormat {
    def this(message: String) = this()
    def this(message: js.Array[MessageFormatElement]) = this()
    def this(message: String, locales: String) = this()
    def this(message: String, locales: js.Array[String]) = this()
    def this(message: js.Array[MessageFormatElement], locales: String) = this()
    def this(message: js.Array[MessageFormatElement], locales: js.Array[String]) = this()
    def this(message: String, locales: js.UndefOr[scala.Nothing], overrideFormats: PartialFormats) = this()
    def this(message: String, locales: String, overrideFormats: PartialFormats) = this()
    def this(message: String, locales: js.Array[String], overrideFormats: PartialFormats) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: js.UndefOr[scala.Nothing],
      overrideFormats: PartialFormats
    ) = this()
    def this(message: js.Array[MessageFormatElement], locales: String, overrideFormats: PartialFormats) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: js.Array[String],
      overrideFormats: PartialFormats
    ) = this()
    def this(
      message: String,
      locales: js.UndefOr[scala.Nothing],
      overrideFormats: js.UndefOr[scala.Nothing],
      opts: Options
    ) = this()
    def this(
      message: String,
      locales: js.UndefOr[scala.Nothing],
      overrideFormats: PartialFormats,
      opts: Options
    ) = this()
    def this(message: String, locales: String, overrideFormats: js.UndefOr[scala.Nothing], opts: Options) = this()
    def this(message: String, locales: String, overrideFormats: PartialFormats, opts: Options) = this()
    def this(
      message: String,
      locales: js.Array[String],
      overrideFormats: js.UndefOr[scala.Nothing],
      opts: Options
    ) = this()
    def this(message: String, locales: js.Array[String], overrideFormats: PartialFormats, opts: Options) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: js.UndefOr[scala.Nothing],
      overrideFormats: js.UndefOr[scala.Nothing],
      opts: Options
    ) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: js.UndefOr[scala.Nothing],
      overrideFormats: PartialFormats,
      opts: Options
    ) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: String,
      overrideFormats: js.UndefOr[scala.Nothing],
      opts: Options
    ) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: String,
      overrideFormats: PartialFormats,
      opts: Options
    ) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: js.Array[String],
      overrideFormats: js.UndefOr[scala.Nothing],
      opts: Options
    ) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: js.Array[String],
      overrideFormats: PartialFormats,
      opts: Options
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("intl-messageformat/lib", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("intl-messageformat/lib", "default.__parse")
    @js.native
    def __parse: js.UndefOr[FnCall] = js.native
    @scala.inline
    def __parse_=(x: js.UndefOr[FnCall]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__parse")(x.asInstanceOf[js.Any])
    
    @JSImport("intl-messageformat/lib", "default.formats")
    @js.native
    def formats: Date = js.native
    @scala.inline
    def formats_=(x: Date): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formats")(x.asInstanceOf[js.Any])
    
    @JSImport("intl-messageformat/lib", "default.memoizedDefaultLocale")
    @js.native
    def memoizedDefaultLocale: js.Any = js.native
    @scala.inline
    def memoizedDefaultLocale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("memoizedDefaultLocale")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("intl-messageformat/lib", "FormatError")
  @js.native
  class FormatError protected ()
    extends typingsSlinky.intlMessageformat.errorMod.FormatError {
    def this(msg: String, code: ErrorCode) = this()
    def this(msg: String, code: ErrorCode, originalMessage: String) = this()
  }
  
  @JSImport("intl-messageformat/lib", "IntlMessageFormat")
  @js.native
  class IntlMessageFormat protected ()
    extends typingsSlinky.intlMessageformat.coreMod.IntlMessageFormat {
    def this(message: String) = this()
    def this(message: js.Array[MessageFormatElement]) = this()
    def this(message: String, locales: String) = this()
    def this(message: String, locales: js.Array[String]) = this()
    def this(message: js.Array[MessageFormatElement], locales: String) = this()
    def this(message: js.Array[MessageFormatElement], locales: js.Array[String]) = this()
    def this(message: String, locales: js.UndefOr[scala.Nothing], overrideFormats: PartialFormats) = this()
    def this(message: String, locales: String, overrideFormats: PartialFormats) = this()
    def this(message: String, locales: js.Array[String], overrideFormats: PartialFormats) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: js.UndefOr[scala.Nothing],
      overrideFormats: PartialFormats
    ) = this()
    def this(message: js.Array[MessageFormatElement], locales: String, overrideFormats: PartialFormats) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: js.Array[String],
      overrideFormats: PartialFormats
    ) = this()
    def this(
      message: String,
      locales: js.UndefOr[scala.Nothing],
      overrideFormats: js.UndefOr[scala.Nothing],
      opts: Options
    ) = this()
    def this(
      message: String,
      locales: js.UndefOr[scala.Nothing],
      overrideFormats: PartialFormats,
      opts: Options
    ) = this()
    def this(message: String, locales: String, overrideFormats: js.UndefOr[scala.Nothing], opts: Options) = this()
    def this(message: String, locales: String, overrideFormats: PartialFormats, opts: Options) = this()
    def this(
      message: String,
      locales: js.Array[String],
      overrideFormats: js.UndefOr[scala.Nothing],
      opts: Options
    ) = this()
    def this(message: String, locales: js.Array[String], overrideFormats: PartialFormats, opts: Options) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: js.UndefOr[scala.Nothing],
      overrideFormats: js.UndefOr[scala.Nothing],
      opts: Options
    ) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: js.UndefOr[scala.Nothing],
      overrideFormats: PartialFormats,
      opts: Options
    ) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: String,
      overrideFormats: js.UndefOr[scala.Nothing],
      opts: Options
    ) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: String,
      overrideFormats: PartialFormats,
      opts: Options
    ) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: js.Array[String],
      overrideFormats: js.UndefOr[scala.Nothing],
      opts: Options
    ) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: js.Array[String],
      overrideFormats: PartialFormats,
      opts: Options
    ) = this()
  }
  /* static members */
  object IntlMessageFormat {
    
    @JSImport("intl-messageformat/lib", "IntlMessageFormat")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("intl-messageformat/lib", "IntlMessageFormat.__parse")
    @js.native
    def __parse: js.UndefOr[FnCall] = js.native
    @scala.inline
    def __parse_=(x: js.UndefOr[FnCall]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__parse")(x.asInstanceOf[js.Any])
    
    @JSImport("intl-messageformat/lib", "IntlMessageFormat.formats")
    @js.native
    def formats: Date = js.native
    @scala.inline
    def formats_=(x: Date): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formats")(x.asInstanceOf[js.Any])
    
    @JSImport("intl-messageformat/lib", "IntlMessageFormat.memoizedDefaultLocale")
    @js.native
    def memoizedDefaultLocale: js.Any = js.native
    @scala.inline
    def memoizedDefaultLocale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("memoizedDefaultLocale")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("intl-messageformat/lib", "InvalidValueError")
  @js.native
  class InvalidValueError protected ()
    extends typingsSlinky.intlMessageformat.errorMod.InvalidValueError {
    def this(variableId: String, value: js.Any, options: js.Array[String]) = this()
    def this(variableId: String, value: js.Any, options: js.Array[String], originalMessage: String) = this()
  }
  
  @JSImport("intl-messageformat/lib", "InvalidValueTypeError")
  @js.native
  class InvalidValueTypeError protected ()
    extends typingsSlinky.intlMessageformat.errorMod.InvalidValueTypeError {
    def this(value: js.Any, `type`: String) = this()
    def this(value: js.Any, `type`: String, originalMessage: String) = this()
  }
  
  @JSImport("intl-messageformat/lib", "MissingValueError")
  @js.native
  class MissingValueError protected ()
    extends typingsSlinky.intlMessageformat.errorMod.MissingValueError {
    def this(variableId: String) = this()
    def this(variableId: String, originalMessage: String) = this()
  }
  
  @JSImport("intl-messageformat/lib", "formatToParts")
  @js.native
  def formatToParts[T](els: js.Array[MessageFormatElement], locales: String, formatters: Formatters, formats: Formats): js.Array[MessageFormatPart[T]] = js.native
  @JSImport("intl-messageformat/lib", "formatToParts")
  @js.native
  def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: js.UndefOr[scala.Nothing],
    currentPluralValue: js.UndefOr[scala.Nothing],
    originalMessage: String
  ): js.Array[MessageFormatPart[T]] = js.native
  @JSImport("intl-messageformat/lib", "formatToParts")
  @js.native
  def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: js.UndefOr[scala.Nothing],
    currentPluralValue: Double
  ): js.Array[MessageFormatPart[T]] = js.native
  @JSImport("intl-messageformat/lib", "formatToParts")
  @js.native
  def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: js.UndefOr[scala.Nothing],
    currentPluralValue: Double,
    originalMessage: String
  ): js.Array[MessageFormatPart[T]] = js.native
  @JSImport("intl-messageformat/lib", "formatToParts")
  @js.native
  def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: Record[
      String, 
      PrimitiveType | T | (FormatXMLElementFn[T, String | T | (js.Array[String | T])])
    ]
  ): js.Array[MessageFormatPart[T]] = js.native
  @JSImport("intl-messageformat/lib", "formatToParts")
  @js.native
  def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: Record[
      String, 
      PrimitiveType | T | (FormatXMLElementFn[T, String | T | (js.Array[String | T])])
    ],
    currentPluralValue: js.UndefOr[scala.Nothing],
    originalMessage: String
  ): js.Array[MessageFormatPart[T]] = js.native
  @JSImport("intl-messageformat/lib", "formatToParts")
  @js.native
  def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: Record[
      String, 
      PrimitiveType | T | (FormatXMLElementFn[T, String | T | (js.Array[String | T])])
    ],
    currentPluralValue: Double
  ): js.Array[MessageFormatPart[T]] = js.native
  @JSImport("intl-messageformat/lib", "formatToParts")
  @js.native
  def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: Record[
      String, 
      PrimitiveType | T | (FormatXMLElementFn[T, String | T | (js.Array[String | T])])
    ],
    currentPluralValue: Double,
    originalMessage: String
  ): js.Array[MessageFormatPart[T]] = js.native
  @JSImport("intl-messageformat/lib", "formatToParts")
  @js.native
  def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats
  ): js.Array[MessageFormatPart[T]] = js.native
  @JSImport("intl-messageformat/lib", "formatToParts")
  @js.native
  def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: js.UndefOr[scala.Nothing],
    currentPluralValue: js.UndefOr[scala.Nothing],
    originalMessage: String
  ): js.Array[MessageFormatPart[T]] = js.native
  @JSImport("intl-messageformat/lib", "formatToParts")
  @js.native
  def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: js.UndefOr[scala.Nothing],
    currentPluralValue: Double
  ): js.Array[MessageFormatPart[T]] = js.native
  @JSImport("intl-messageformat/lib", "formatToParts")
  @js.native
  def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: js.UndefOr[scala.Nothing],
    currentPluralValue: Double,
    originalMessage: String
  ): js.Array[MessageFormatPart[T]] = js.native
  @JSImport("intl-messageformat/lib", "formatToParts")
  @js.native
  def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: Record[
      String, 
      PrimitiveType | T | (FormatXMLElementFn[T, String | T | (js.Array[String | T])])
    ]
  ): js.Array[MessageFormatPart[T]] = js.native
  @JSImport("intl-messageformat/lib", "formatToParts")
  @js.native
  def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: Record[
      String, 
      PrimitiveType | T | (FormatXMLElementFn[T, String | T | (js.Array[String | T])])
    ],
    currentPluralValue: js.UndefOr[scala.Nothing],
    originalMessage: String
  ): js.Array[MessageFormatPart[T]] = js.native
  @JSImport("intl-messageformat/lib", "formatToParts")
  @js.native
  def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: Record[
      String, 
      PrimitiveType | T | (FormatXMLElementFn[T, String | T | (js.Array[String | T])])
    ],
    currentPluralValue: Double
  ): js.Array[MessageFormatPart[T]] = js.native
  @JSImport("intl-messageformat/lib", "formatToParts")
  @js.native
  def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: Record[
      String, 
      PrimitiveType | T | (FormatXMLElementFn[T, String | T | (js.Array[String | T])])
    ],
    currentPluralValue: Double,
    originalMessage: String
  ): js.Array[MessageFormatPart[T]] = js.native
  
  @JSImport("intl-messageformat/lib", "isFormatXMLElementFn")
  @js.native
  def isFormatXMLElementFn[T](el: T): /* is intl-messageformat.intl-messageformat/lib/src/formatters.FormatXMLElementFn<T, string | T | std.Array<string | T>> */ Boolean = js.native
  @JSImport("intl-messageformat/lib", "isFormatXMLElementFn")
  @js.native
  def isFormatXMLElementFn[T](el: FormatXMLElementFn[T, String | T | (js.Array[String | T])]): /* is intl-messageformat.intl-messageformat/lib/src/formatters.FormatXMLElementFn<T, string | T | std.Array<string | T>> */ Boolean = js.native
  @JSImport("intl-messageformat/lib", "isFormatXMLElementFn")
  @js.native
  def isFormatXMLElementFn[T](el: PrimitiveType): /* is intl-messageformat.intl-messageformat/lib/src/formatters.FormatXMLElementFn<T, string | T | std.Array<string | T>> */ Boolean = js.native
}
