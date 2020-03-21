package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.astTypesStrings.minus
import typingsSlinky.astTypes.astTypesStrings.plus
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Node, 'type'> */
trait Variance extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var kind: plus | minus
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsSlinky.astTypes.astTypesStrings.Variance
}

object Variance {
  @scala.inline
  def apply(
    kind: plus | minus,
    `type`: typingsSlinky.astTypes.astTypesStrings.Variance,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): Variance = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variance]
  }
}

