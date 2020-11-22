package typingsSlinky.intlMessageformatParser

import typingsSlinky.intlMessageformatParser.parserMod.Expectation
import typingsSlinky.intlMessageformatParser.parserMod.IFileRange
import typingsSlinky.intlMessageformatParser.parserMod.IParseOptions
import typingsSlinky.intlMessageformatParser.parserMod.ParseFunction
import typingsSlinky.intlMessageformatParser.typesMod.DateTimeSkeleton
import typingsSlinky.intlMessageformatParser.typesMod.LiteralElement
import typingsSlinky.intlMessageformatParser.typesMod.MessageFormatElement
import typingsSlinky.intlMessageformatParser.typesMod.NumberElement
import typingsSlinky.intlMessageformatParser.typesMod.NumberSkeleton
import typingsSlinky.intlMessageformatParser.typesMod.Options
import typingsSlinky.intlMessageformatParser.typesMod.Skeleton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("intl-messageformat-parser/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  
  def createLiteralElement(value: String): LiteralElement = js.native
  
  def createNumberElement(value: String): NumberElement = js.native
  def createNumberElement(value: String, style: String): NumberElement = js.native
  
  def isArgumentElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.ArgumentElement */ Boolean = js.native
  
  def isDateElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.DateElement */ Boolean = js.native
  
  def isDateTimeSkeleton(): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.DateTimeSkeleton */ Boolean = js.native
  def isDateTimeSkeleton(el: js.UndefOr[DateTimeSkeleton | Null | String]): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.DateTimeSkeleton */ Boolean = js.native
  def isDateTimeSkeleton(el: Skeleton): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.DateTimeSkeleton */ Boolean = js.native
  
  def isLiteralElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.LiteralElement */ Boolean = js.native
  
  def isNumberElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.NumberElement */ Boolean = js.native
  
  def isNumberSkeleton(el: js.UndefOr[String | NumberSkeleton | Null]): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.NumberSkeleton */ Boolean = js.native
  def isNumberSkeleton(el: Skeleton): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.NumberSkeleton */ Boolean = js.native
  
  def isPluralElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.PluralElement */ Boolean = js.native
  
  def isPoundElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.PoundElement */ Boolean = js.native
  
  def isSelectElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.SelectElement */ Boolean = js.native
  
  def isTagElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.TagElement */ Boolean = js.native
  
  def isTimeElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.TimeElement */ Boolean = js.native
  
  def parse(input: String): js.Array[MessageFormatElement] = js.native
  def parse(input: String, opts: ParseOptions): js.Array[MessageFormatElement] = js.native
  
  val pegParse: ParseFunction = js.native
  
  @js.native
  class SyntaxError protected ()
    extends typingsSlinky.intlMessageformatParser.parserMod.SyntaxError {
    def this(message: String, expected: js.Array[Expectation], found: String, location: IFileRange) = this()
    def this(message: String, expected: js.Array[Expectation], found: Null, location: IFileRange) = this()
  }
  /* static members */
  @js.native
  object SyntaxError extends js.Object {
    
    def buildMessage(expected: js.Array[Expectation]): String = js.native
    def buildMessage(expected: js.Array[Expectation], found: String): String = js.native
  }
  
  @js.native
  object TYPE extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.intlMessageformatParser.typesMod.TYPE with Double] = js.native
    
    /* 1 */ val argument: typingsSlinky.intlMessageformatParser.typesMod.TYPE.argument with Double = js.native
    
    /* 3 */ val date: typingsSlinky.intlMessageformatParser.typesMod.TYPE.date with Double = js.native
    
    /* 0 */ val literal: typingsSlinky.intlMessageformatParser.typesMod.TYPE.literal with Double = js.native
    
    /* 2 */ val number: typingsSlinky.intlMessageformatParser.typesMod.TYPE.number with Double = js.native
    
    /* 6 */ val plural: typingsSlinky.intlMessageformatParser.typesMod.TYPE.plural with Double = js.native
    
    /* 7 */ val pound: typingsSlinky.intlMessageformatParser.typesMod.TYPE.pound with Double = js.native
    
    /* 5 */ val select: typingsSlinky.intlMessageformatParser.typesMod.TYPE.select with Double = js.native
    
    /* 8 */ val tag: typingsSlinky.intlMessageformatParser.typesMod.TYPE.tag with Double = js.native
    
    /* 4 */ val time: typingsSlinky.intlMessageformatParser.typesMod.TYPE.time with Double = js.native
  }
  
  type ParseOptions = Options with IParseOptions
}
