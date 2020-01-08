package typingsSlinky.astDashTypes

import typingsSlinky.astDashTypes.astDashTypesStrings.Exclamationmark
import typingsSlinky.astDashTypes.astDashTypesStrings.Plussign
import typingsSlinky.astDashTypes.astDashTypesStrings.Tilde
import typingsSlinky.astDashTypes.astDashTypesStrings.`-_`
import typingsSlinky.astDashTypes.astDashTypesStrings.delete
import typingsSlinky.astDashTypes.astDashTypesStrings.typeof
import typingsSlinky.astDashTypes.astDashTypesStrings.void
import typingsSlinky.astDashTypes.genKindsMod.CommentKind
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ extends js.Object {
  var argument: ExpressionKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var operator: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete
  var prefix: js.UndefOr[Boolean] = js.undefined
}

object Anon_ {
  @scala.inline
  def apply(
    argument: ExpressionKind,
    operator: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    prefix: js.UndefOr[Boolean] = js.undefined
  ): Anon_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(prefix)) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_]
  }
}

