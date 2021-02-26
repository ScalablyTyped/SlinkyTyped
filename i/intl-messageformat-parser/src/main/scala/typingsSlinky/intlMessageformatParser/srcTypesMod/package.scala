package typingsSlinky.intlMessageformatParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object srcTypesMod {
  
  type ArgumentElement = typingsSlinky.intlMessageformatParser.srcTypesMod.BaseElement[typingsSlinky.intlMessageformatParser.srcTypesMod.TYPE.argument]
  
  type DateElement = typingsSlinky.intlMessageformatParser.srcTypesMod.SimpleFormatElement[
    typingsSlinky.intlMessageformatParser.srcTypesMod.TYPE.date, 
    typingsSlinky.intlMessageformatParser.srcTypesMod.DateTimeSkeleton
  ]
  
  type LiteralElement = typingsSlinky.intlMessageformatParser.srcTypesMod.BaseElement[typingsSlinky.intlMessageformatParser.srcTypesMod.TYPE.literal]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.intlMessageformatParser.srcTypesMod.LiteralElement
    - typingsSlinky.intlMessageformatParser.srcTypesMod.ArgumentElement
    - typingsSlinky.intlMessageformatParser.srcTypesMod.NumberElement
    - typingsSlinky.intlMessageformatParser.srcTypesMod.DateElement
    - typingsSlinky.intlMessageformatParser.srcTypesMod.TimeElement
    - typingsSlinky.intlMessageformatParser.srcTypesMod.SelectElement
    - typingsSlinky.intlMessageformatParser.srcTypesMod.PluralElement
    - typingsSlinky.intlMessageformatParser.srcTypesMod.TagElement
    - typingsSlinky.intlMessageformatParser.srcTypesMod.PoundElement
  */
  type MessageFormatElement = typingsSlinky.intlMessageformatParser.srcTypesMod._MessageFormatElement | typingsSlinky.intlMessageformatParser.srcTypesMod.LiteralElement | typingsSlinky.intlMessageformatParser.srcTypesMod.ArgumentElement | typingsSlinky.intlMessageformatParser.srcTypesMod.NumberElement | typingsSlinky.intlMessageformatParser.srcTypesMod.DateElement | typingsSlinky.intlMessageformatParser.srcTypesMod.TimeElement
  
  type NumberElement = typingsSlinky.intlMessageformatParser.srcTypesMod.SimpleFormatElement[
    typingsSlinky.intlMessageformatParser.srcTypesMod.TYPE.number, 
    typingsSlinky.intlMessageformatParser.srcTypesMod.NumberSkeleton
  ]
  
  type TimeElement = typingsSlinky.intlMessageformatParser.srcTypesMod.SimpleFormatElement[
    typingsSlinky.intlMessageformatParser.srcTypesMod.TYPE.time, 
    typingsSlinky.intlMessageformatParser.srcTypesMod.DateTimeSkeleton
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.intlMessageformatParser.intlMessageformatParserStrings.zero
    - typingsSlinky.intlMessageformatParser.intlMessageformatParserStrings.one
    - typingsSlinky.intlMessageformatParser.intlMessageformatParserStrings.two
    - typingsSlinky.intlMessageformatParser.intlMessageformatParserStrings.few
    - typingsSlinky.intlMessageformatParser.intlMessageformatParserStrings.many
    - typingsSlinky.intlMessageformatParser.intlMessageformatParserStrings.other
    - java.lang.String
  */
  type ValidPluralRule = typingsSlinky.intlMessageformatParser.srcTypesMod._ValidPluralRule | java.lang.String
  
  @scala.inline
  def createLiteralElement(value: java.lang.String): typingsSlinky.intlMessageformatParser.srcTypesMod.LiteralElement = typingsSlinky.intlMessageformatParser.srcTypesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createLiteralElement")(value.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.intlMessageformatParser.srcTypesMod.LiteralElement]
  
  @scala.inline
  def createNumberElement(value: java.lang.String): typingsSlinky.intlMessageformatParser.srcTypesMod.NumberElement = typingsSlinky.intlMessageformatParser.srcTypesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createNumberElement")(value.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.intlMessageformatParser.srcTypesMod.NumberElement]
  @scala.inline
  def createNumberElement(value: java.lang.String, style: java.lang.String): typingsSlinky.intlMessageformatParser.srcTypesMod.NumberElement = (typingsSlinky.intlMessageformatParser.srcTypesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createNumberElement")(value.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.intlMessageformatParser.srcTypesMod.NumberElement]
  
  @scala.inline
  def isArgumentElement(el: typingsSlinky.intlMessageformatParser.srcTypesMod.MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.ArgumentElement */ scala.Boolean = typingsSlinky.intlMessageformatParser.srcTypesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isArgumentElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.ArgumentElement */ scala.Boolean]
  
  @scala.inline
  def isDateElement(el: typingsSlinky.intlMessageformatParser.srcTypesMod.MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateElement */ scala.Boolean = typingsSlinky.intlMessageformatParser.srcTypesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isDateElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateElement */ scala.Boolean]
  
  @scala.inline
  def isDateTimeSkeleton(): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateTimeSkeleton */ scala.Boolean = typingsSlinky.intlMessageformatParser.srcTypesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isDateTimeSkeleton")().asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateTimeSkeleton */ scala.Boolean]
  @scala.inline
  def isDateTimeSkeleton(
    el: js.UndefOr[
      typingsSlinky.intlMessageformatParser.srcTypesMod.DateTimeSkeleton | scala.Null | java.lang.String
    ]
  ): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateTimeSkeleton */ scala.Boolean = typingsSlinky.intlMessageformatParser.srcTypesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isDateTimeSkeleton")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateTimeSkeleton */ scala.Boolean]
  @scala.inline
  def isDateTimeSkeleton(el: typingsSlinky.intlMessageformatParser.srcTypesMod.Skeleton): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateTimeSkeleton */ scala.Boolean = typingsSlinky.intlMessageformatParser.srcTypesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isDateTimeSkeleton")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateTimeSkeleton */ scala.Boolean]
  
  @scala.inline
  def isLiteralElement(el: typingsSlinky.intlMessageformatParser.srcTypesMod.MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.LiteralElement */ scala.Boolean = typingsSlinky.intlMessageformatParser.srcTypesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isLiteralElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.LiteralElement */ scala.Boolean]
  
  @scala.inline
  def isNumberElement(el: typingsSlinky.intlMessageformatParser.srcTypesMod.MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.NumberElement */ scala.Boolean = typingsSlinky.intlMessageformatParser.srcTypesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isNumberElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.NumberElement */ scala.Boolean]
  
  @scala.inline
  def isNumberSkeleton(
    el: js.UndefOr[
      java.lang.String | typingsSlinky.intlMessageformatParser.srcTypesMod.NumberSkeleton | scala.Null
    ]
  ): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.NumberSkeleton */ scala.Boolean = typingsSlinky.intlMessageformatParser.srcTypesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isNumberSkeleton")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.NumberSkeleton */ scala.Boolean]
  @scala.inline
  def isNumberSkeleton(el: typingsSlinky.intlMessageformatParser.srcTypesMod.Skeleton): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.NumberSkeleton */ scala.Boolean = typingsSlinky.intlMessageformatParser.srcTypesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isNumberSkeleton")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.NumberSkeleton */ scala.Boolean]
  
  @scala.inline
  def isPluralElement(el: typingsSlinky.intlMessageformatParser.srcTypesMod.MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.PluralElement */ scala.Boolean = typingsSlinky.intlMessageformatParser.srcTypesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isPluralElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.PluralElement */ scala.Boolean]
  
  @scala.inline
  def isPoundElement(el: typingsSlinky.intlMessageformatParser.srcTypesMod.MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.PoundElement */ scala.Boolean = typingsSlinky.intlMessageformatParser.srcTypesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isPoundElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.PoundElement */ scala.Boolean]
  
  @scala.inline
  def isSelectElement(el: typingsSlinky.intlMessageformatParser.srcTypesMod.MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.SelectElement */ scala.Boolean = typingsSlinky.intlMessageformatParser.srcTypesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isSelectElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.SelectElement */ scala.Boolean]
  
  @scala.inline
  def isTagElement(el: typingsSlinky.intlMessageformatParser.srcTypesMod.MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.TagElement */ scala.Boolean = typingsSlinky.intlMessageformatParser.srcTypesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isTagElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.TagElement */ scala.Boolean]
  
  @scala.inline
  def isTimeElement(el: typingsSlinky.intlMessageformatParser.srcTypesMod.MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.TimeElement */ scala.Boolean = typingsSlinky.intlMessageformatParser.srcTypesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isTimeElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.TimeElement */ scala.Boolean]
}
