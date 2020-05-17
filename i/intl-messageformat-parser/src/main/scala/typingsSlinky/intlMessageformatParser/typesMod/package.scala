package typingsSlinky.intlMessageformatParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ArgumentElement = typingsSlinky.intlMessageformatParser.typesMod.BaseElement[typingsSlinky.intlMessageformatParser.typesMod.TYPE.argument]
  type DateElement = typingsSlinky.intlMessageformatParser.typesMod.SimpleFormatElement[
    typingsSlinky.intlMessageformatParser.typesMod.TYPE.date, 
    typingsSlinky.intlMessageformatParser.typesMod.DateTimeSkeleton
  ]
  type LiteralElement = typingsSlinky.intlMessageformatParser.typesMod.BaseElement[typingsSlinky.intlMessageformatParser.typesMod.TYPE.literal]
  type NumberElement = typingsSlinky.intlMessageformatParser.typesMod.SimpleFormatElement[
    typingsSlinky.intlMessageformatParser.typesMod.TYPE.number, 
    typingsSlinky.intlMessageformatParser.typesMod.NumberSkeleton
  ]
  type TimeElement = typingsSlinky.intlMessageformatParser.typesMod.SimpleFormatElement[
    typingsSlinky.intlMessageformatParser.typesMod.TYPE.time, 
    typingsSlinky.intlMessageformatParser.typesMod.DateTimeSkeleton
  ]
}
