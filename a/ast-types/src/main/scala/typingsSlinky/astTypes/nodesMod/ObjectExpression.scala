package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ObjectMethodKind
import typingsSlinky.astTypes.kindsMod.ObjectPropertyKind
import typingsSlinky.astTypes.kindsMod.PropertyKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.SpreadElementKind
import typingsSlinky.astTypes.kindsMod.SpreadPropertyKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Expression, 'type'> */
trait ObjectExpression extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var properties: js.Array[
    PropertyKind | ObjectMethodKind | ObjectPropertyKind | SpreadPropertyKind | SpreadElementKind
  ]
  var `type`: typingsSlinky.astTypes.astTypesStrings.ObjectExpression
}

object ObjectExpression {
  @scala.inline
  def apply(
    properties: js.Array[
      PropertyKind | ObjectMethodKind | ObjectPropertyKind | SpreadPropertyKind | SpreadElementKind
    ],
    `type`: typingsSlinky.astTypes.astTypesStrings.ObjectExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ObjectExpression = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectExpression]
  }
}

