package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.TSType, 'type'> */
trait TSTypeOperator extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var operator: String
  var `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeOperator
  var typeAnnotation: TSTypeKind
}

object TSTypeOperator {
  @scala.inline
  def apply(
    operator: String,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeOperator,
    typeAnnotation: TSTypeKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): TSTypeOperator = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeOperator]
  }
}

