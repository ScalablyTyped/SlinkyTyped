package typingsSlinky.astTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSQualifiedNameKind
import typingsSlinky.astTypes.kindsMod.TSTypeParameterInstantiationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommentsExpression extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var expression: IdentifierKind | TSQualifiedNameKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var typeParameters: js.UndefOr[TSTypeParameterInstantiationKind | Null] = js.undefined
}

object AnonCommentsExpression {
  @scala.inline
  def apply(
    expression: IdentifierKind | TSQualifiedNameKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeParameters: TSTypeParameterInstantiationKind = null
  ): AnonCommentsExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommentsExpression]
  }
}

