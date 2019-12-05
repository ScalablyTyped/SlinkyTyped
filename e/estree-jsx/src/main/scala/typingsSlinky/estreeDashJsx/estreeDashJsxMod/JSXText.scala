package typingsSlinky.estreeDashJsx.estreeDashJsxMod

import typingsSlinky.estree.estreeMod.BaseNode
import typingsSlinky.estree.estreeMod.Comment
import typingsSlinky.estree.estreeMod.SourceLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXText extends BaseNode {
  var raw: String
  @JSName("type")
  var type_JSXText: typingsSlinky.estreeDashJsx.estreeDashJsxStrings.JSXText
  var value: String
}

object JSXText {
  @scala.inline
  def apply(
    raw: String,
    `type`: typingsSlinky.estreeDashJsx.estreeDashJsxStrings.JSXText,
    value: String,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): JSXText = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXText]
  }
}

