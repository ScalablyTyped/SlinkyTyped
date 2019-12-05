package typingsSlinky.intlDashMessageformatDashParser

import typingsSlinky.intlDashMessageformatDashParser.libMod.ParseOptions
import typingsSlinky.intlDashMessageformatDashParser.libParserMod.Expectation
import typingsSlinky.intlDashMessageformatDashParser.libParserMod.IFileRange
import typingsSlinky.intlDashMessageformatDashParser.libParserMod.IParseOptions
import typingsSlinky.intlDashMessageformatDashParser.libParserMod.ParseFunction
import typingsSlinky.intlDashMessageformatDashParser.libSkeletonMod.ExtendedDateTimeFormatOptions
import typingsSlinky.intlDashMessageformatDashParser.libTypesMod.DateTimeSkeleton
import typingsSlinky.intlDashMessageformatDashParser.libTypesMod.LiteralElement
import typingsSlinky.intlDashMessageformatDashParser.libTypesMod.MessageFormatElement
import typingsSlinky.intlDashMessageformatDashParser.libTypesMod.NumberElement
import typingsSlinky.intlDashMessageformatDashParser.libTypesMod.NumberSkeleton
import typingsSlinky.intlDashMessageformatDashParser.libTypesMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat-parser/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  @js.native
  class SyntaxError protected ()
    extends typingsSlinky.intlDashMessageformatDashParser.libParserMod.SyntaxError {
    def this(message: String, expected: js.Array[Expectation], found: String, location: IFileRange) = this()
    def this(message: String, expected: js.Array[Expectation], found: Null, location: IFileRange) = this()
  }
  
  val pegParse: ParseFunction = js.native
  def createLiteralElement(value: String): LiteralElement = js.native
  def createNumberElement(value: String): NumberElement = js.native
  def createNumberElement(value: String, style: String): NumberElement = js.native
  def isArgumentElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.ArgumentElement */ Boolean = js.native
  def isDateElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.DateElement */ Boolean = js.native
  def isDateTimeSkeleton(): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.DateTimeSkeleton */ Boolean = js.native
  def isDateTimeSkeleton(el: DateTimeSkeleton | String): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.DateTimeSkeleton */ Boolean = js.native
  def isLiteralElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.LiteralElement */ Boolean = js.native
  def isNumberElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.NumberElement */ Boolean = js.native
  def isNumberSkeleton(): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.NumberSkeleton */ Boolean = js.native
  def isNumberSkeleton(el: String): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.NumberSkeleton */ Boolean = js.native
  def isNumberSkeleton(el: NumberSkeleton): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.NumberSkeleton */ Boolean = js.native
  def isPluralElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.PluralElement */ Boolean = js.native
  def isSelectElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.SelectElement */ Boolean = js.native
  def isTimeElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/types.TimeElement */ Boolean = js.native
  def parse(input: String): js.Array[MessageFormatElement] = js.native
  def parse(input: String, opts: ParseOptions): js.Array[MessageFormatElement] = js.native
  def parseDateTimeSkeleton(skeleton: String): ExtendedDateTimeFormatOptions = js.native
  /* static members */
  @js.native
  object SyntaxError extends js.Object {
    def buildMessage(expected: js.Array[Expectation]): String = js.native
    def buildMessage(expected: js.Array[Expectation], found: String): String = js.native
  }
  
  @js.native
  object TYPE extends js.Object {
    /* 1 */ val argument: typingsSlinky.intlDashMessageformatDashParser.libTypesMod.TYPE.argument with Double = js.native
    /* 3 */ val date: typingsSlinky.intlDashMessageformatDashParser.libTypesMod.TYPE.date with Double = js.native
    /* 0 */ val literal: typingsSlinky.intlDashMessageformatDashParser.libTypesMod.TYPE.literal with Double = js.native
    /* 2 */ val number: typingsSlinky.intlDashMessageformatDashParser.libTypesMod.TYPE.number with Double = js.native
    /* 6 */ val plural: typingsSlinky.intlDashMessageformatDashParser.libTypesMod.TYPE.plural with Double = js.native
    /* 5 */ val select: typingsSlinky.intlDashMessageformatDashParser.libTypesMod.TYPE.select with Double = js.native
    /* 4 */ val time: typingsSlinky.intlDashMessageformatDashParser.libTypesMod.TYPE.time with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.intlDashMessageformatDashParser.libTypesMod.TYPE with Double] = js.native
  }
  
  type ParseOptions = Options with IParseOptions
}

