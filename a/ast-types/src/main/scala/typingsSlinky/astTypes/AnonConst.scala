package typingsSlinky.astTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSEnumMemberKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConst extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var const: js.UndefOr[Boolean] = js.undefined
  var declare: js.UndefOr[Boolean] = js.undefined
  var id: IdentifierKind
  var initializer: js.UndefOr[ExpressionKind | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var members: js.Array[TSEnumMemberKind]
}

object AnonConst {
  @scala.inline
  def apply(
    id: IdentifierKind,
    members: js.Array[TSEnumMemberKind],
    comments: js.Array[CommentKind] = null,
    const: js.UndefOr[Boolean] = js.undefined,
    declare: js.UndefOr[Boolean] = js.undefined,
    initializer: ExpressionKind = null,
    loc: SourceLocationKind = null
  ): AnonConst = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(const)) __obj.updateDynamic("const")(const.asInstanceOf[js.Any])
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare.asInstanceOf[js.Any])
    if (initializer != null) __obj.updateDynamic("initializer")(initializer.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConst]
  }
}

