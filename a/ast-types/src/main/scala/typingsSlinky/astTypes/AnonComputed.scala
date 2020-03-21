package typingsSlinky.astTypes

import typingsSlinky.astTypes.astTypesStrings.get
import typingsSlinky.astTypes.astTypesStrings.init
import typingsSlinky.astTypes.astTypesStrings.set
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.DecoratorKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComputed extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var computed: js.UndefOr[Boolean] = js.undefined
  var decorators: js.UndefOr[js.Array[DecoratorKind] | Null] = js.undefined
  var key: LiteralKind | IdentifierKind | ExpressionKind
  var kind: init | get | set
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var method: js.UndefOr[Boolean] = js.undefined
  var shorthand: js.UndefOr[Boolean] = js.undefined
  var value: ExpressionKind | PatternKind
}

object AnonComputed {
  @scala.inline
  def apply(
    key: LiteralKind | IdentifierKind | ExpressionKind,
    kind: init | get | set,
    value: ExpressionKind | PatternKind,
    comments: js.Array[CommentKind] = null,
    computed: js.UndefOr[Boolean] = js.undefined,
    decorators: js.Array[DecoratorKind] = null,
    loc: SourceLocationKind = null,
    method: js.UndefOr[Boolean] = js.undefined,
    shorthand: js.UndefOr[Boolean] = js.undefined
  ): AnonComputed = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(computed)) __obj.updateDynamic("computed")(computed.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(method)) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(shorthand)) __obj.updateDynamic("shorthand")(shorthand.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComputed]
  }
}

