package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Declaration, 'type'> */
trait DeclareExportAllDeclaration extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var source: LiteralKind | Null
  var `type`: typingsSlinky.astTypes.astTypesStrings.DeclareExportAllDeclaration
}

object DeclareExportAllDeclaration {
  @scala.inline
  def apply(
    `type`: typingsSlinky.astTypes.astTypesStrings.DeclareExportAllDeclaration,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    source: LiteralKind = null
  ): DeclareExportAllDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareExportAllDeclaration]
  }
}

