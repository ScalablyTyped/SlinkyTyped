package typingsSlinky.intlMessageformatParser

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
}
