package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.FlowType, 'type'> */
trait StringLiteralTypeAnnotation extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var raw: String
  var `type`: typingsSlinky.astTypes.astTypesStrings.StringLiteralTypeAnnotation
  var value: String
}

object StringLiteralTypeAnnotation {
  @scala.inline
  def apply(
    raw: String,
    `type`: typingsSlinky.astTypes.astTypesStrings.StringLiteralTypeAnnotation,
    value: String,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): StringLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringLiteralTypeAnnotation]
  }
}

