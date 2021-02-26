package typingsSlinky.intlMessageformatParser

import typingsSlinky.intlMessageformatParser.srcParserMod.Expectation
import typingsSlinky.intlMessageformatParser.srcParserMod.IFileRange
import typingsSlinky.intlMessageformatParser.srcParserMod.IParseOptions
import typingsSlinky.intlMessageformatParser.srcParserMod.ParseFunction
import typingsSlinky.intlMessageformatParser.srcTypesMod.DateTimeSkeleton
import typingsSlinky.intlMessageformatParser.srcTypesMod.LiteralElement
import typingsSlinky.intlMessageformatParser.srcTypesMod.MessageFormatElement
import typingsSlinky.intlMessageformatParser.srcTypesMod.NumberElement
import typingsSlinky.intlMessageformatParser.srcTypesMod.NumberSkeleton
import typingsSlinky.intlMessageformatParser.srcTypesMod.Options
import typingsSlinky.intlMessageformatParser.srcTypesMod.Skeleton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("intl-messageformat-parser", "SyntaxError")
  @js.native
  class SyntaxError protected ()
    extends typingsSlinky.intlMessageformatParser.srcParserMod.SyntaxError {
    def this(message: String, expected: js.Array[Expectation], found: String, location: IFileRange) = this()
    def this(message: String, expected: js.Array[Expectation], found: Null, location: IFileRange) = this()
  }
  /* static members */
  object SyntaxError {
    
    @JSImport("intl-messageformat-parser", "SyntaxError.buildMessage")
    @js.native
    def buildMessage(expected: js.Array[Expectation]): String = js.native
    @JSImport("intl-messageformat-parser", "SyntaxError.buildMessage")
    @js.native
    def buildMessage(expected: js.Array[Expectation], found: String): String = js.native
  }
  
  @JSImport("intl-messageformat-parser", "TYPE")
  @js.native
  object TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.intlMessageformatParser.srcTypesMod.TYPE with Double] = js.native
    
    /* 1 */ val argument: typingsSlinky.intlMessageformatParser.srcTypesMod.TYPE.argument with Double = js.native
    
    /* 3 */ val date: typingsSlinky.intlMessageformatParser.srcTypesMod.TYPE.date with Double = js.native
    
    /* 0 */ val literal: typingsSlinky.intlMessageformatParser.srcTypesMod.TYPE.literal with Double = js.native
    
    /* 2 */ val number: typingsSlinky.intlMessageformatParser.srcTypesMod.TYPE.number with Double = js.native
    
    /* 6 */ val plural: typingsSlinky.intlMessageformatParser.srcTypesMod.TYPE.plural with Double = js.native
    
    /* 7 */ val pound: typingsSlinky.intlMessageformatParser.srcTypesMod.TYPE.pound with Double = js.native
    
    /* 5 */ val select: typingsSlinky.intlMessageformatParser.srcTypesMod.TYPE.select with Double = js.native
    
    /* 8 */ val tag: typingsSlinky.intlMessageformatParser.srcTypesMod.TYPE.tag with Double = js.native
    
    /* 4 */ val time: typingsSlinky.intlMessageformatParser.srcTypesMod.TYPE.time with Double = js.native
  }
  
  @JSImport("intl-messageformat-parser", "createLiteralElement")
  @js.native
  def createLiteralElement(value: String): LiteralElement = js.native
  
  @JSImport("intl-messageformat-parser", "createNumberElement")
  @js.native
  def createNumberElement(value: String): NumberElement = js.native
  @JSImport("intl-messageformat-parser", "createNumberElement")
  @js.native
  def createNumberElement(value: String, style: String): NumberElement = js.native
  
  @JSImport("intl-messageformat-parser", "isArgumentElement")
  @js.native
  def isArgumentElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.ArgumentElement */ Boolean = js.native
  
  @JSImport("intl-messageformat-parser", "isDateElement")
  @js.native
  def isDateElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateElement */ Boolean = js.native
  
  @JSImport("intl-messageformat-parser", "isDateTimeSkeleton")
  @js.native
  def isDateTimeSkeleton(): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateTimeSkeleton */ Boolean = js.native
  @JSImport("intl-messageformat-parser", "isDateTimeSkeleton")
  @js.native
  def isDateTimeSkeleton(el: js.UndefOr[DateTimeSkeleton | Null | String]): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateTimeSkeleton */ Boolean = js.native
  @JSImport("intl-messageformat-parser", "isDateTimeSkeleton")
  @js.native
  def isDateTimeSkeleton(el: Skeleton): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateTimeSkeleton */ Boolean = js.native
  
  @JSImport("intl-messageformat-parser", "isLiteralElement")
  @js.native
  def isLiteralElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.LiteralElement */ Boolean = js.native
  
  @JSImport("intl-messageformat-parser", "isNumberElement")
  @js.native
  def isNumberElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.NumberElement */ Boolean = js.native
  
  @JSImport("intl-messageformat-parser", "isNumberSkeleton")
  @js.native
  def isNumberSkeleton(el: js.UndefOr[String | NumberSkeleton | Null]): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.NumberSkeleton */ Boolean = js.native
  @JSImport("intl-messageformat-parser", "isNumberSkeleton")
  @js.native
  def isNumberSkeleton(el: Skeleton): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.NumberSkeleton */ Boolean = js.native
  
  @JSImport("intl-messageformat-parser", "isPluralElement")
  @js.native
  def isPluralElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.PluralElement */ Boolean = js.native
  
  @JSImport("intl-messageformat-parser", "isPoundElement")
  @js.native
  def isPoundElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.PoundElement */ Boolean = js.native
  
  @JSImport("intl-messageformat-parser", "isSelectElement")
  @js.native
  def isSelectElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.SelectElement */ Boolean = js.native
  
  @JSImport("intl-messageformat-parser", "isTagElement")
  @js.native
  def isTagElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.TagElement */ Boolean = js.native
  
  @JSImport("intl-messageformat-parser", "isTimeElement")
  @js.native
  def isTimeElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.TimeElement */ Boolean = js.native
  
  @JSImport("intl-messageformat-parser", "parse")
  @js.native
  def parse(input: String): js.Array[MessageFormatElement] = js.native
  @JSImport("intl-messageformat-parser", "parse")
  @js.native
  def parse(input: String, opts: ParseOptions): js.Array[MessageFormatElement] = js.native
  
  @JSImport("intl-messageformat-parser", "pegParse")
  @js.native
  val pegParse: ParseFunction = js.native
  
  type ParseOptions = Options with IParseOptions
}
