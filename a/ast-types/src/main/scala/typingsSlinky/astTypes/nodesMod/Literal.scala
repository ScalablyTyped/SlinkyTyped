package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.anon.Flags
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Expression, 'type'> */
trait Literal extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var regex: Flags | Null
  var `type`: typingsSlinky.astTypes.astTypesStrings.Literal
  var value: String | Boolean | Null | Double | js.RegExp
}

object Literal {
  @scala.inline
  def apply(
    `type`: typingsSlinky.astTypes.astTypesStrings.Literal,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    regex: Flags = null,
    value: String | Boolean | Double | js.RegExp = null
  ): Literal = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
}

