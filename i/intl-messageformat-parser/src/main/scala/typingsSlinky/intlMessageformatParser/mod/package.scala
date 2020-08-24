package typingsSlinky.intlMessageformatParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ArgumentElement = typingsSlinky.intlMessageformatParser.mod.BaseElement[typingsSlinky.intlMessageformatParser.mod.TYPE.argument]
  type DateElement = typingsSlinky.intlMessageformatParser.mod.SimpleFormatElement[
    typingsSlinky.intlMessageformatParser.mod.TYPE.date, 
    typingsSlinky.intlMessageformatParser.mod.DateTimeSkeleton
  ]
  type LiteralElement = typingsSlinky.intlMessageformatParser.mod.BaseElement[typingsSlinky.intlMessageformatParser.mod.TYPE.literal]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.intlMessageformatParser.mod.LiteralElement
    - typingsSlinky.intlMessageformatParser.mod.ArgumentElement
    - typingsSlinky.intlMessageformatParser.mod.NumberElement
    - typingsSlinky.intlMessageformatParser.mod.DateElement
    - typingsSlinky.intlMessageformatParser.mod.TimeElement
    - typingsSlinky.intlMessageformatParser.mod.SelectElement
    - typingsSlinky.intlMessageformatParser.mod.PluralElement
    - typingsSlinky.intlMessageformatParser.mod.TagElement
    - typingsSlinky.intlMessageformatParser.mod.PoundElement
  */
  type MessageFormatElement = typingsSlinky.intlMessageformatParser.mod._MessageFormatElement | typingsSlinky.intlMessageformatParser.mod.LiteralElement | typingsSlinky.intlMessageformatParser.mod.ArgumentElement | typingsSlinky.intlMessageformatParser.mod.NumberElement | typingsSlinky.intlMessageformatParser.mod.DateElement | typingsSlinky.intlMessageformatParser.mod.TimeElement
  type NumberElement = typingsSlinky.intlMessageformatParser.mod.SimpleFormatElement[
    typingsSlinky.intlMessageformatParser.mod.TYPE.number, 
    typingsSlinky.intlMessageformatParser.mod.NumberSkeleton
  ]
  type NumberFormatOptionsNotation = typingsSlinky.intlMessageformatParser.mod.NumberFormatNotation
  type ParseFunction = js.Function2[
    /* input */ java.lang.String, 
    /* options */ js.UndefOr[typingsSlinky.intlMessageformatParser.mod.IParseOptions], 
    js.Array[typingsSlinky.intlMessageformatParser.mod.MessageFormatElement]
  ]
  type ParseOptions = typingsSlinky.intlMessageformatParser.mod.Options with typingsSlinky.intlMessageformatParser.mod.IParseOptions
  type TimeElement = typingsSlinky.intlMessageformatParser.mod.SimpleFormatElement[
    typingsSlinky.intlMessageformatParser.mod.TYPE.time, 
    typingsSlinky.intlMessageformatParser.mod.DateTimeSkeleton
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
  type ValidPluralRule = typingsSlinky.intlMessageformatParser.mod._ValidPluralRule | java.lang.String
}
