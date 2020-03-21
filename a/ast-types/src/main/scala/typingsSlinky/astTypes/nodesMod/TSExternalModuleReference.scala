package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StringLiteralKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Declaration, 'type'> */
trait TSExternalModuleReference extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var expression: StringLiteralKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsSlinky.astTypes.astTypesStrings.TSExternalModuleReference
}

object TSExternalModuleReference {
  @scala.inline
  def apply(
    expression: StringLiteralKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSExternalModuleReference,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): TSExternalModuleReference = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSExternalModuleReference]
  }
}

