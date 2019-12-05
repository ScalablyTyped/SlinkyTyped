package typingsSlinky.atBabelTypes.atBabelTypesMod

import typingsSlinky.atBabelTypes.atBabelTypesStrings.`!`
import typingsSlinky.atBabelTypes.atBabelTypesStrings.`+`
import typingsSlinky.atBabelTypes.atBabelTypesStrings.`-`
import typingsSlinky.atBabelTypes.atBabelTypesStrings.`throw`
import typingsSlinky.atBabelTypes.atBabelTypesStrings.`~`
import typingsSlinky.atBabelTypes.atBabelTypesStrings.delete
import typingsSlinky.atBabelTypes.atBabelTypesStrings.typeof
import typingsSlinky.atBabelTypes.atBabelTypesStrings.void
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atBabelTypes.atBabelTypesMod.UnaryExpression
  - typings.atBabelTypes.atBabelTypesMod.SpreadElement
*/
trait UnaryLike extends _Node

object UnaryLike {
  @scala.inline
  def UnaryExpression(
    argument: Expression,
    operator: void | `throw` | delete | `!` | `+` | `-` | `~` | typeof,
    prefix: Boolean,
    `type`: typingsSlinky.atBabelTypes.atBabelTypesStrings.UnaryExpression,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): UnaryLike = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnaryLike]
  }
  @scala.inline
  def SpreadElement(
    argument: Expression,
    `type`: typingsSlinky.atBabelTypes.atBabelTypesStrings.SpreadElement,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): UnaryLike = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnaryLike]
  }
}

