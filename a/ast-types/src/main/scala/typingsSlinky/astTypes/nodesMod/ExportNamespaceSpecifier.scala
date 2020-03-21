package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Specifier, 'type'> */
trait ExportNamespaceSpecifier extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var exported: IdentifierKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsSlinky.astTypes.astTypesStrings.ExportNamespaceSpecifier
}

object ExportNamespaceSpecifier {
  @scala.inline
  def apply(
    exported: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ExportNamespaceSpecifier,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ExportNamespaceSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportNamespaceSpecifier]
  }
}

