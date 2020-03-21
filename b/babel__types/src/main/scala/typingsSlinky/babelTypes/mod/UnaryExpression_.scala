package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.Exclamationmark
import typingsSlinky.babelTypes.babelTypesStrings.Plussign
import typingsSlinky.babelTypes.babelTypesStrings.Tilde
import typingsSlinky.babelTypes.babelTypesStrings.UnaryExpression
import typingsSlinky.babelTypes.babelTypesStrings.`-_`
import typingsSlinky.babelTypes.babelTypesStrings.`throw`
import typingsSlinky.babelTypes.babelTypesStrings.delete
import typingsSlinky.babelTypes.babelTypesStrings.typeof
import typingsSlinky.babelTypes.babelTypesStrings.void
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod._Node because Already inherited */ trait UnaryExpression_
  extends Expression
     with BaseNode
     with UnaryLike {
  var argument: Expression
  var operator: void | `throw` | delete | Exclamationmark | Plussign | `-_` | Tilde | typeof
  var prefix: Boolean
  @JSName("type")
  var type_UnaryExpression_ : UnaryExpression
}

object UnaryExpression_ {
  @scala.inline
  def apply(
    argument: Expression,
    operator: void | `throw` | delete | Exclamationmark | Plussign | `-_` | Tilde | typeof,
    prefix: Boolean,
    `type`: UnaryExpression,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): UnaryExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnaryExpression_]
  }
}

