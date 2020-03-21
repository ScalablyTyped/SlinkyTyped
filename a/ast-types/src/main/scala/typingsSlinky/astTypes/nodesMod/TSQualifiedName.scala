package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSQualifiedNameKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Node, 'type'> */
trait TSQualifiedName extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var left: IdentifierKind | TSQualifiedNameKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var right: IdentifierKind | TSQualifiedNameKind
  var `type`: typingsSlinky.astTypes.astTypesStrings.TSQualifiedName
}

object TSQualifiedName {
  @scala.inline
  def apply(
    left: IdentifierKind | TSQualifiedNameKind,
    right: IdentifierKind | TSQualifiedNameKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSQualifiedName,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): TSQualifiedName = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSQualifiedName]
  }
}

