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
  type NumberElement = typingsSlinky.intlMessageformatParser.mod.SimpleFormatElement[
    typingsSlinky.intlMessageformatParser.mod.TYPE.number, 
    typingsSlinky.intlMessageformatParser.mod.NumberSkeleton
  ]
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
}
