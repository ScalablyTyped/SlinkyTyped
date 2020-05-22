package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.anon.Flags
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Literal, 'type' | 'value'> */
trait RegExpLiteral extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var flags: String
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var pattern: String
  var regex: js.UndefOr[Flags] = js.undefined
  var `type`: typingsSlinky.astTypes.astTypesStrings.RegExpLiteral
  var value: js.RegExp
}

object RegExpLiteral {
  @scala.inline
  def apply(
    flags: String,
    pattern: String,
    `type`: typingsSlinky.astTypes.astTypesStrings.RegExpLiteral,
    value: js.RegExp,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    regex: Flags = null
  ): RegExpLiteral = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegExpLiteral]
  }
}

