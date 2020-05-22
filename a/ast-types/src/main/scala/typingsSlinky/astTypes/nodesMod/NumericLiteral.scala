package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.anon.Flags
import typingsSlinky.astTypes.anon.RawRawValue
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Literal, 'type' | 'value'> */
trait NumericLiteral extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var extra: RawRawValue
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var raw: String | Null
  var regex: js.UndefOr[Flags] = js.undefined
  var `type`: typingsSlinky.astTypes.astTypesStrings.NumericLiteral
  var value: Double
}

object NumericLiteral {
  @scala.inline
  def apply(
    extra: RawRawValue,
    `type`: typingsSlinky.astTypes.astTypesStrings.NumericLiteral,
    value: Double,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    raw: String = null,
    regex: Flags = null
  ): NumericLiteral = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumericLiteral]
  }
}

