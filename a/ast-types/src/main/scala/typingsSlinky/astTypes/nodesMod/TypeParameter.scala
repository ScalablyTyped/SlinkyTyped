package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.astTypesStrings.minus
import typingsSlinky.astTypes.astTypesStrings.plus
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.VarianceKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.FlowType, 'type'> */
trait TypeParameter extends ASTNode {
  var bound: TypeAnnotationKind | Null
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var name: String
  var `type`: typingsSlinky.astTypes.astTypesStrings.TypeParameter
  var variance: VarianceKind | plus | minus | Null
}

object TypeParameter {
  @scala.inline
  def apply(
    name: String,
    `type`: typingsSlinky.astTypes.astTypesStrings.TypeParameter,
    bound: TypeAnnotationKind = null,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    variance: VarianceKind | plus | minus = null
  ): TypeParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], bound = bound.asInstanceOf[js.Any], variance = variance.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeParameter]
  }
}

