package typingsSlinky.babelDashTypes.babelDashTypesMod

import typingsSlinky.babelDashTypes.babelDashTypesStrings.`!==`
import typingsSlinky.babelDashTypes.babelDashTypesStrings.`!=`
import typingsSlinky.babelDashTypes.babelDashTypesStrings.`%`
import typingsSlinky.babelDashTypes.babelDashTypesStrings.`&`
import typingsSlinky.babelDashTypes.babelDashTypesStrings.`**`
import typingsSlinky.babelDashTypes.babelDashTypesStrings.`+`
import typingsSlinky.babelDashTypes.babelDashTypesStrings.`-`
import typingsSlinky.babelDashTypes.babelDashTypesStrings.`/`
import typingsSlinky.babelDashTypes.babelDashTypesStrings.`<<`
import typingsSlinky.babelDashTypes.babelDashTypesStrings.`<=`
import typingsSlinky.babelDashTypes.babelDashTypesStrings.`<`
import typingsSlinky.babelDashTypes.babelDashTypesStrings.`===`
import typingsSlinky.babelDashTypes.babelDashTypesStrings.`==`
import typingsSlinky.babelDashTypes.babelDashTypesStrings.`>=`
import typingsSlinky.babelDashTypes.babelDashTypesStrings.`>>>`
import typingsSlinky.babelDashTypes.babelDashTypesStrings.`>>`
import typingsSlinky.babelDashTypes.babelDashTypesStrings.`>`
import typingsSlinky.babelDashTypes.babelDashTypesStrings.`_backtick^_backtick`
import typingsSlinky.babelDashTypes.babelDashTypesStrings.in
import typingsSlinky.babelDashTypes.babelDashTypesStrings.instanceof
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryExpression
  extends Node
     with Binary
     with Expression {
  var left: Expression
  var operator: `+` | `-` | `/` | `%` | typingsSlinky.babelDashTypes.babelDashTypesStrings.`*` | `**` | `&` | typingsSlinky.babelDashTypes.babelDashTypesStrings.`|` | `>>` | `>>>` | `<<` | `_backtick^_backtick` | `==` | `===` | `!=` | `!==` | in | instanceof | `>` | `<` | `>=` | `<=`
  var right: Expression
  @JSName("type")
  var type_BinaryExpression: typingsSlinky.babelDashTypes.babelDashTypesStrings.BinaryExpression
}

object BinaryExpression {
  @scala.inline
  def apply(
    end: Double,
    left: Expression,
    loc: SourceLocation,
    operator: `+` | `-` | `/` | `%` | typingsSlinky.babelDashTypes.babelDashTypesStrings.`*` | `**` | `&` | typingsSlinky.babelDashTypes.babelDashTypesStrings.`|` | `>>` | `>>>` | `<<` | `_backtick^_backtick` | `==` | `===` | `!=` | `!==` | in | instanceof | `>` | `<` | `>=` | `<=`,
    right: Expression,
    start: Double,
    `type`: typingsSlinky.babelDashTypes.babelDashTypesStrings.BinaryExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): BinaryExpression = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryExpression]
  }
}

@JSImport("babel-types", "binaryExpression")
@js.native
object binaryExpression extends js.Object {
  def apply(): BinaryExpression = js.native
  def apply(
    operator: `+` | `-` | `/` | `%` | typingsSlinky.babelDashTypes.babelDashTypesStrings.`*` | `**` | `&` | typingsSlinky.babelDashTypes.babelDashTypesStrings.`|` | `>>` | `>>>` | `<<` | `_backtick^_backtick` | `==` | `===` | `!=` | `!==` | in | instanceof | `>` | `<` | `>=` | `<=`
  ): BinaryExpression = js.native
  def apply(
    operator: `+` | `-` | `/` | `%` | typingsSlinky.babelDashTypes.babelDashTypesStrings.`*` | `**` | `&` | typingsSlinky.babelDashTypes.babelDashTypesStrings.`|` | `>>` | `>>>` | `<<` | `_backtick^_backtick` | `==` | `===` | `!=` | `!==` | in | instanceof | `>` | `<` | `>=` | `<=`,
    left: Expression
  ): BinaryExpression = js.native
  def apply(
    operator: `+` | `-` | `/` | `%` | typingsSlinky.babelDashTypes.babelDashTypesStrings.`*` | `**` | `&` | typingsSlinky.babelDashTypes.babelDashTypesStrings.`|` | `>>` | `>>>` | `<<` | `_backtick^_backtick` | `==` | `===` | `!=` | `!==` | in | instanceof | `>` | `<` | `>=` | `<=`,
    left: Expression,
    right: Expression
  ): BinaryExpression = js.native
}

