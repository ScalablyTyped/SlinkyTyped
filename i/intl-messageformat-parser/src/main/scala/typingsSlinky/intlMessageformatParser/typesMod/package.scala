package typingsSlinky.intlMessageformatParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type ArgumentElement = typingsSlinky.intlMessageformatParser.typesMod.BaseElement[typingsSlinky.intlMessageformatParser.typesMod.TYPE.argument]
  
  type DateElement = typingsSlinky.intlMessageformatParser.typesMod.SimpleFormatElement[
    typingsSlinky.intlMessageformatParser.typesMod.TYPE.date, 
    typingsSlinky.intlMessageformatParser.typesMod.DateTimeSkeleton
  ]
  
  type LiteralElement = typingsSlinky.intlMessageformatParser.typesMod.BaseElement[typingsSlinky.intlMessageformatParser.typesMod.TYPE.literal]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.intlMessageformatParser.typesMod.LiteralElement
    - typingsSlinky.intlMessageformatParser.typesMod.ArgumentElement
    - typingsSlinky.intlMessageformatParser.typesMod.NumberElement
    - typingsSlinky.intlMessageformatParser.typesMod.DateElement
    - typingsSlinky.intlMessageformatParser.typesMod.TimeElement
    - typingsSlinky.intlMessageformatParser.typesMod.SelectElement
    - typingsSlinky.intlMessageformatParser.typesMod.PluralElement
    - typingsSlinky.intlMessageformatParser.typesMod.TagElement
    - typingsSlinky.intlMessageformatParser.typesMod.PoundElement
  */
  type MessageFormatElement = typingsSlinky.intlMessageformatParser.typesMod._MessageFormatElement | typingsSlinky.intlMessageformatParser.typesMod.LiteralElement | typingsSlinky.intlMessageformatParser.typesMod.ArgumentElement | typingsSlinky.intlMessageformatParser.typesMod.NumberElement | typingsSlinky.intlMessageformatParser.typesMod.DateElement | typingsSlinky.intlMessageformatParser.typesMod.TimeElement
  
  type NumberElement = typingsSlinky.intlMessageformatParser.typesMod.SimpleFormatElement[
    typingsSlinky.intlMessageformatParser.typesMod.TYPE.number, 
    typingsSlinky.intlMessageformatParser.typesMod.NumberSkeleton
  ]
  
  type TimeElement = typingsSlinky.intlMessageformatParser.typesMod.SimpleFormatElement[
    typingsSlinky.intlMessageformatParser.typesMod.TYPE.time, 
    typingsSlinky.intlMessageformatParser.typesMod.DateTimeSkeleton
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
  type ValidPluralRule = typingsSlinky.intlMessageformatParser.typesMod._ValidPluralRule | java.lang.String
  
  @scala.inline
  def createLiteralElement(value: java.lang.String): typingsSlinky.intlMessageformatParser.typesMod.LiteralElement = typingsSlinky.intlMessageformatParser.typesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createLiteralElement")(value.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.intlMessageformatParser.typesMod.LiteralElement]
  
  @scala.inline
  def createNumberElement(value: java.lang.String): typingsSlinky.intlMessageformatParser.typesMod.NumberElement = typingsSlinky.intlMessageformatParser.typesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createNumberElement")(value.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.intlMessageformatParser.typesMod.NumberElement]
  @scala.inline
  def createNumberElement(value: java.lang.String, style: java.lang.String): typingsSlinky.intlMessageformatParser.typesMod.NumberElement = (typingsSlinky.intlMessageformatParser.typesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createNumberElement")(value.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.intlMessageformatParser.typesMod.NumberElement]
  
  @scala.inline
  def isArgumentElement(el: typingsSlinky.intlMessageformatParser.typesMod.MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.ArgumentElement */ scala.Boolean = typingsSlinky.intlMessageformatParser.typesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isArgumentElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.ArgumentElement */ scala.Boolean]
  
  @scala.inline
  def isDateElement(el: typingsSlinky.intlMessageformatParser.typesMod.MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.DateElement */ scala.Boolean = typingsSlinky.intlMessageformatParser.typesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isDateElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.DateElement */ scala.Boolean]
  
  @scala.inline
  def isDateTimeSkeleton(): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.DateTimeSkeleton */ scala.Boolean = typingsSlinky.intlMessageformatParser.typesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isDateTimeSkeleton")().asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.DateTimeSkeleton */ scala.Boolean]
  @scala.inline
  def isDateTimeSkeleton(
    el: js.UndefOr[
      typingsSlinky.intlMessageformatParser.typesMod.DateTimeSkeleton | scala.Null | java.lang.String
    ]
  ): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.DateTimeSkeleton */ scala.Boolean = typingsSlinky.intlMessageformatParser.typesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isDateTimeSkeleton")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.DateTimeSkeleton */ scala.Boolean]
  @scala.inline
  def isDateTimeSkeleton(el: typingsSlinky.intlMessageformatParser.typesMod.Skeleton): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.DateTimeSkeleton */ scala.Boolean = typingsSlinky.intlMessageformatParser.typesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isDateTimeSkeleton")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.DateTimeSkeleton */ scala.Boolean]
  
  @scala.inline
  def isLiteralElement(el: typingsSlinky.intlMessageformatParser.typesMod.MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.LiteralElement */ scala.Boolean = typingsSlinky.intlMessageformatParser.typesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isLiteralElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.LiteralElement */ scala.Boolean]
  
  @scala.inline
  def isNumberElement(el: typingsSlinky.intlMessageformatParser.typesMod.MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.NumberElement */ scala.Boolean = typingsSlinky.intlMessageformatParser.typesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isNumberElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.NumberElement */ scala.Boolean]
  
  @scala.inline
  def isNumberSkeleton(
    el: js.UndefOr[
      java.lang.String | typingsSlinky.intlMessageformatParser.typesMod.NumberSkeleton | scala.Null
    ]
  ): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.NumberSkeleton */ scala.Boolean = typingsSlinky.intlMessageformatParser.typesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isNumberSkeleton")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.NumberSkeleton */ scala.Boolean]
  @scala.inline
  def isNumberSkeleton(el: typingsSlinky.intlMessageformatParser.typesMod.Skeleton): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.NumberSkeleton */ scala.Boolean = typingsSlinky.intlMessageformatParser.typesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isNumberSkeleton")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.NumberSkeleton */ scala.Boolean]
  
  @scala.inline
  def isPluralElement(el: typingsSlinky.intlMessageformatParser.typesMod.MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.PluralElement */ scala.Boolean = typingsSlinky.intlMessageformatParser.typesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isPluralElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.PluralElement */ scala.Boolean]
  
  @scala.inline
  def isPoundElement(el: typingsSlinky.intlMessageformatParser.typesMod.MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.PoundElement */ scala.Boolean = typingsSlinky.intlMessageformatParser.typesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isPoundElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.PoundElement */ scala.Boolean]
  
  @scala.inline
  def isSelectElement(el: typingsSlinky.intlMessageformatParser.typesMod.MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.SelectElement */ scala.Boolean = typingsSlinky.intlMessageformatParser.typesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isSelectElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.SelectElement */ scala.Boolean]
  
  @scala.inline
  def isTagElement(el: typingsSlinky.intlMessageformatParser.typesMod.MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.TagElement */ scala.Boolean = typingsSlinky.intlMessageformatParser.typesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isTagElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.TagElement */ scala.Boolean]
  
  @scala.inline
  def isTimeElement(el: typingsSlinky.intlMessageformatParser.typesMod.MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.TimeElement */ scala.Boolean = typingsSlinky.intlMessageformatParser.typesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isTimeElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.TimeElement */ scala.Boolean]
}
