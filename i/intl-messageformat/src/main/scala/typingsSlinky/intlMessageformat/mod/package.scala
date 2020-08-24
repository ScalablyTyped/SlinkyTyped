package typingsSlinky.intlMessageformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ArgumentElement = typingsSlinky.intlMessageformat.mod.BaseElement[typingsSlinky.intlMessageformat.mod.TYPE.argument]
  type DateElement = typingsSlinky.intlMessageformat.mod.SimpleFormatElement[
    typingsSlinky.intlMessageformat.mod.TYPE.date, 
    typingsSlinky.intlMessageformat.mod.DateTimeSkeleton
  ]
  type FormatXMLElementFn[T, R] = js.Function1[/* parts */ js.Array[java.lang.String | T], R]
  type LiteralElement = typingsSlinky.intlMessageformat.mod.BaseElement[typingsSlinky.intlMessageformat.mod.TYPE.literal]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.intlMessageformat.mod.LiteralElement
    - typingsSlinky.intlMessageformat.mod.ArgumentElement
    - typingsSlinky.intlMessageformat.mod.NumberElement
    - typingsSlinky.intlMessageformat.mod.DateElement
    - typingsSlinky.intlMessageformat.mod.TimeElement
    - typingsSlinky.intlMessageformat.mod.SelectElement
    - typingsSlinky.intlMessageformat.mod.PluralElement
    - typingsSlinky.intlMessageformat.mod.TagElement
    - typingsSlinky.intlMessageformat.mod.PoundElement
  */
  type MessageFormatElement = typingsSlinky.intlMessageformat.mod._MessageFormatElement | typingsSlinky.intlMessageformat.mod.LiteralElement | typingsSlinky.intlMessageformat.mod.ArgumentElement | typingsSlinky.intlMessageformat.mod.NumberElement | typingsSlinky.intlMessageformat.mod.DateElement | typingsSlinky.intlMessageformat.mod.TimeElement
  type NumberElement = typingsSlinky.intlMessageformat.mod.SimpleFormatElement[
    typingsSlinky.intlMessageformat.mod.TYPE.number, 
    typingsSlinky.intlMessageformat.mod.NumberSkeleton
  ]
  type ParseOptions = typingsSlinky.intlMessageformat.mod.Options2 with typingsSlinky.intlMessageformat.mod.IParseOptions
  type PrimitiveType = js.UndefOr[java.lang.String | scala.Double | scala.Boolean | scala.Null | js.Date]
  type TimeElement = typingsSlinky.intlMessageformat.mod.SimpleFormatElement[
    typingsSlinky.intlMessageformat.mod.TYPE.time, 
    typingsSlinky.intlMessageformat.mod.DateTimeSkeleton
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.intlMessageformat.intlMessageformatStrings.zero
    - typingsSlinky.intlMessageformat.intlMessageformatStrings.one
    - typingsSlinky.intlMessageformat.intlMessageformatStrings.two
    - typingsSlinky.intlMessageformat.intlMessageformatStrings.few
    - typingsSlinky.intlMessageformat.intlMessageformatStrings.many
    - typingsSlinky.intlMessageformat.intlMessageformatStrings.other
    - java.lang.String
  */
  type ValidPluralRule = typingsSlinky.intlMessageformat.mod._ValidPluralRule | java.lang.String
}
