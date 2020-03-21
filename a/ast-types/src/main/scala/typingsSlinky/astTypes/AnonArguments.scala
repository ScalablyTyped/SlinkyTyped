package typingsSlinky.astTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.SpreadElementKind
import typingsSlinky.astTypes.kindsMod.TypeParameterInstantiationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArguments extends js.Object {
  var arguments: js.Array[ExpressionKind | SpreadElementKind]
  var callee: ExpressionKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var typeArguments: js.UndefOr[Null | TypeParameterInstantiationKind] = js.undefined
}

object AnonArguments {
  @scala.inline
  def apply(
    arguments: js.Array[ExpressionKind | SpreadElementKind],
    callee: ExpressionKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeArguments: TypeParameterInstantiationKind = null
  ): AnonArguments = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (typeArguments != null) __obj.updateDynamic("typeArguments")(typeArguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArguments]
  }
}

