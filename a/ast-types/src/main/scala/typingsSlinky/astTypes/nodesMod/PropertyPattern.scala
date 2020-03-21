package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Pattern, 'type'> */
trait PropertyPattern extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var computed: Boolean
  var key: LiteralKind | IdentifierKind | ExpressionKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var pattern: PatternKind
  var `type`: typingsSlinky.astTypes.astTypesStrings.PropertyPattern
}

object PropertyPattern {
  @scala.inline
  def apply(
    computed: Boolean,
    key: LiteralKind | IdentifierKind | ExpressionKind,
    pattern: PatternKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.PropertyPattern,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): PropertyPattern = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyPattern]
  }
}

