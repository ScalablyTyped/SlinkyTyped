package typingsSlinky.astDashTypes.genBuildersMod

import typingsSlinky.astDashTypes.Anon_CommentsIn
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
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.BinaryExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BinaryExpressionBuilder extends js.Object {
  def apply(
    operator: `==` | `!=` | `===` | `!==` | `<` | `<=` | `>` | `>=` | `<<` | `>>` | `>>>` | `+` | `-` | typingsSlinky.astDashTypes.astDashTypesStrings.`*` | `/` | `%` | `**` | `&` | typingsSlinky.astDashTypes.astDashTypesStrings.`|` | `_backtick^_backtick` | in | instanceof,
    left: ExpressionKind,
    right: ExpressionKind
  ): BinaryExpression = js.native
  def from(params: Anon_CommentsIn): BinaryExpression = js.native
}

