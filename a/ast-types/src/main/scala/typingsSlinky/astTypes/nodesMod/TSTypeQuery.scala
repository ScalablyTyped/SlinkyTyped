package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSImportTypeKind
import typingsSlinky.astTypes.kindsMod.TSQualifiedNameKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.TSType, 'type'> */
trait TSTypeQuery extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var exprName: IdentifierKind | TSQualifiedNameKind | TSImportTypeKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeQuery
}

object TSTypeQuery {
  @scala.inline
  def apply(
    exprName: IdentifierKind | TSQualifiedNameKind | TSImportTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeQuery,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): TSTypeQuery = {
    val __obj = js.Dynamic.literal(exprName = exprName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeQuery]
  }
}

