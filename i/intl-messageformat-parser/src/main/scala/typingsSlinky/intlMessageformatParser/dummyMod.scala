package typingsSlinky.intlMessageformatParser

import typingsSlinky.intlMessageformatParser.srcParserMod.IParseOptions
import typingsSlinky.intlMessageformatParser.srcTypesMod.DateTimeSkeleton
import typingsSlinky.intlMessageformatParser.srcTypesMod.LiteralElement
import typingsSlinky.intlMessageformatParser.srcTypesMod.MessageFormatElement
import typingsSlinky.intlMessageformatParser.srcTypesMod.NumberElement
import typingsSlinky.intlMessageformatParser.srcTypesMod.NumberSkeleton
import typingsSlinky.intlMessageformatParser.srcTypesMod.Options
import typingsSlinky.intlMessageformatParser.srcTypesMod.Skeleton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("intl-messageformat-parser/dummy", JSImport.Namespace)
@js.native
object dummyMod extends js.Object {
  
  def createLiteralElement(value: String): LiteralElement = js.native
  
  def createNumberElement(value: String): NumberElement = js.native
  def createNumberElement(value: String, style: String): NumberElement = js.native
  
  def isArgumentElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.ArgumentElement */ Boolean = js.native
  
  def isDateElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateElement */ Boolean = js.native
  
  def isDateTimeSkeleton(): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateTimeSkeleton */ Boolean = js.native
  def isDateTimeSkeleton(el: js.UndefOr[DateTimeSkeleton | Null | String]): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateTimeSkeleton */ Boolean = js.native
  def isDateTimeSkeleton(el: Skeleton): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateTimeSkeleton */ Boolean = js.native
  
  def isLiteralElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.LiteralElement */ Boolean = js.native
  
  def isNumberElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.NumberElement */ Boolean = js.native
  
  def isNumberSkeleton(el: js.UndefOr[String | NumberSkeleton | Null]): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.NumberSkeleton */ Boolean = js.native
  def isNumberSkeleton(el: Skeleton): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.NumberSkeleton */ Boolean = js.native
  
  def isPluralElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.PluralElement */ Boolean = js.native
  
  def isPoundElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.PoundElement */ Boolean = js.native
  
  def isSelectElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.SelectElement */ Boolean = js.native
  
  def isTagElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.TagElement */ Boolean = js.native
  
  def isTimeElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.TimeElement */ Boolean = js.native
  
  def parse(): Unit = js.native
  
  @js.native
  object TYPE extends js.Object {
    
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
  
  type ParseOptions = Options with IParseOptions
}
