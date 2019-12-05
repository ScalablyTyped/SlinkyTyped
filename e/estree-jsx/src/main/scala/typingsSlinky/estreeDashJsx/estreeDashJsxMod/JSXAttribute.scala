package typingsSlinky.estreeDashJsx.estreeDashJsxMod

import typingsSlinky.estree.estreeMod.BaseNode
import typingsSlinky.estree.estreeMod.Comment
import typingsSlinky.estree.estreeMod.Literal
import typingsSlinky.estree.estreeMod.SourceLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXAttribute extends BaseNode {
  var name: JSXIdentifier | JSXNamespacedName
  @JSName("type")
  var type_JSXAttribute: typingsSlinky.estreeDashJsx.estreeDashJsxStrings.JSXAttribute
  var value: Literal | JSXExpressionContainer | JSXElement | JSXFragment | Null
}

object JSXAttribute {
  @scala.inline
  def apply(
    name: JSXIdentifier | JSXNamespacedName,
    `type`: typingsSlinky.estreeDashJsx.estreeDashJsxStrings.JSXAttribute,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null,
    value: Literal | JSXExpressionContainer | JSXElement | JSXFragment = null
  ): JSXAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXAttribute]
  }
}

