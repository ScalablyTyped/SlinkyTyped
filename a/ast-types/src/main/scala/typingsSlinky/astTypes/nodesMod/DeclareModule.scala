package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.BlockStatementKind
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Statement, 'type'> */
trait DeclareModule extends ASTNode {
  var body: BlockStatementKind
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var id: IdentifierKind | LiteralKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsSlinky.astTypes.astTypesStrings.DeclareModule
}

object DeclareModule {
  @scala.inline
  def apply(
    body: BlockStatementKind,
    id: IdentifierKind | LiteralKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.DeclareModule,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): DeclareModule = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareModule]
  }
}

