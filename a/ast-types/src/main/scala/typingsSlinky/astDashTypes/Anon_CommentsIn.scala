package typingsSlinky.astDashTypes

import typingsSlinky.astDashTypes.astDashTypesStrings.`!==`
import typingsSlinky.astDashTypes.astDashTypesStrings.`!=`
import typingsSlinky.astDashTypes.astDashTypesStrings.`%`
import typingsSlinky.astDashTypes.astDashTypesStrings.`&`
import typingsSlinky.astDashTypes.astDashTypesStrings.`**`
import typingsSlinky.astDashTypes.astDashTypesStrings.`+`
import typingsSlinky.astDashTypes.astDashTypesStrings.`-`
import typingsSlinky.astDashTypes.astDashTypesStrings.`/`
import typingsSlinky.astDashTypes.astDashTypesStrings.`<<`
import typingsSlinky.astDashTypes.astDashTypesStrings.`<=`
import typingsSlinky.astDashTypes.astDashTypesStrings.`<`
import typingsSlinky.astDashTypes.astDashTypesStrings.`===`
import typingsSlinky.astDashTypes.astDashTypesStrings.`==`
import typingsSlinky.astDashTypes.astDashTypesStrings.`>=`
import typingsSlinky.astDashTypes.astDashTypesStrings.`>>>`
import typingsSlinky.astDashTypes.astDashTypesStrings.`>>`
import typingsSlinky.astDashTypes.astDashTypesStrings.`>`
import typingsSlinky.astDashTypes.astDashTypesStrings.`_backtick^_backtick`
import typingsSlinky.astDashTypes.astDashTypesStrings.in
import typingsSlinky.astDashTypes.astDashTypesStrings.instanceof
import typingsSlinky.astDashTypes.genKindsMod.CommentKind
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsIn extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var left: ExpressionKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var operator: `==` | `!=` | `===` | `!==` | `<` | `<=` | `>` | `>=` | `<<` | `>>` | `>>>` | `+` | `-` | typingsSlinky.astDashTypes.astDashTypesStrings.`*` | `/` | `%` | `**` | `&` | typingsSlinky.astDashTypes.astDashTypesStrings.`|` | `_backtick^_backtick` | in | instanceof
  var right: ExpressionKind
}

object Anon_CommentsIn {
  @scala.inline
  def apply(
    left: ExpressionKind,
    operator: `==` | `!=` | `===` | `!==` | `<` | `<=` | `>` | `>=` | `<<` | `>>` | `>>>` | `+` | `-` | typingsSlinky.astDashTypes.astDashTypesStrings.`*` | `/` | `%` | `**` | `&` | typingsSlinky.astDashTypes.astDashTypesStrings.`|` | `_backtick^_backtick` | in | instanceof,
    right: ExpressionKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): Anon_CommentsIn = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CommentsIn]
  }
}

