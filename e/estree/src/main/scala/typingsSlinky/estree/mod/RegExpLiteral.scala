package typingsSlinky.estree.mod

import typingsSlinky.estree.AnonFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegExpLiteral
  extends Literal
     with BaseNode {
  var raw: js.UndefOr[String] = js.undefined
  var regex: AnonFlags
  @JSName("type")
  var type_RegExpLiteral: typingsSlinky.estree.estreeStrings.Literal
  var value: js.UndefOr[js.RegExp | Null] = js.undefined
}

object RegExpLiteral {
  @scala.inline
  def apply(
    regex: AnonFlags,
    `type`: typingsSlinky.estree.estreeStrings.Literal,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    raw: String = null,
    trailingComments: js.Array[Comment] = null,
    value: js.RegExp = null
  ): RegExpLiteral = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegExpLiteral]
  }
}

