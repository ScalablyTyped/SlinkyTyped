package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.ModuleSpecifier, 'type'> */
trait ExportSpecifier extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var exported: IdentifierKind
  var id: js.UndefOr[IdentifierKind] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var local: js.UndefOr[IdentifierKind] = js.undefined
  var name: js.UndefOr[IdentifierKind] = js.undefined
  var `type`: typingsSlinky.astTypes.astTypesStrings.ExportSpecifier
}

object ExportSpecifier {
  @scala.inline
  def apply(
    exported: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ExportSpecifier,
    comments: js.Array[CommentKind] = null,
    id: IdentifierKind = null,
    loc: SourceLocationKind = null,
    local: IdentifierKind = null,
    name: IdentifierKind = null
  ): ExportSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (local != null) __obj.updateDynamic("local")(local.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSpecifier]
  }
}

