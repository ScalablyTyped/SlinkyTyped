package typingsSlinky.intlMessageformatParser

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
}
