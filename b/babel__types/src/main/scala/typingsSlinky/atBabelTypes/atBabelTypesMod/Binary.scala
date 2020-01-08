package typingsSlinky.atBabelTypes.atBabelTypesMod

import typingsSlinky.atBabelTypes.atBabelTypesStrings.Ampersand
import typingsSlinky.atBabelTypes.atBabelTypesStrings.AmpersandAmpersand
import typingsSlinky.atBabelTypes.atBabelTypesStrings.Asterisk
import typingsSlinky.atBabelTypes.atBabelTypesStrings.AsteriskAsterisk
import typingsSlinky.atBabelTypes.atBabelTypesStrings.EqualssignEqualssign
import typingsSlinky.atBabelTypes.atBabelTypesStrings.EqualssignEqualssignEqualssign
import typingsSlinky.atBabelTypes.atBabelTypesStrings.ExclamationmarkEqualssign
import typingsSlinky.atBabelTypes.atBabelTypesStrings.ExclamationmarkEqualssignEqualssign
import typingsSlinky.atBabelTypes.atBabelTypesStrings.Greaterthansign
import typingsSlinky.atBabelTypes.atBabelTypesStrings.GreaterthansignEqualssign
import typingsSlinky.atBabelTypes.atBabelTypesStrings.GreaterthansignGreaterthansign
import typingsSlinky.atBabelTypes.atBabelTypesStrings.GreaterthansignGreaterthansignGreaterthansign
import typingsSlinky.atBabelTypes.atBabelTypesStrings.Lessthansign
import typingsSlinky.atBabelTypes.atBabelTypesStrings.LessthansignEqualssign
import typingsSlinky.atBabelTypes.atBabelTypesStrings.LessthansignLessthansign
import typingsSlinky.atBabelTypes.atBabelTypesStrings.Percentsign
import typingsSlinky.atBabelTypes.atBabelTypesStrings.Plussign
import typingsSlinky.atBabelTypes.atBabelTypesStrings.QuestionmarkQuestionmark
import typingsSlinky.atBabelTypes.atBabelTypesStrings.Slash
import typingsSlinky.atBabelTypes.atBabelTypesStrings.Verticalline
import typingsSlinky.atBabelTypes.atBabelTypesStrings.VerticallineVerticalline
import typingsSlinky.atBabelTypes.atBabelTypesStrings.^
import typingsSlinky.atBabelTypes.atBabelTypesStrings.`-_`
import typingsSlinky.atBabelTypes.atBabelTypesStrings.in
import typingsSlinky.atBabelTypes.atBabelTypesStrings.instanceof
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atBabelTypes.atBabelTypesMod.BinaryExpression
  - typings.atBabelTypes.atBabelTypesMod.LogicalExpression
*/
trait Binary extends _Node

object Binary {
  @scala.inline
  def BinaryExpression(
    left: Expression,
    operator: Plussign | `-_` | Slash | Percentsign | Asterisk | AsteriskAsterisk | Ampersand | Verticalline | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | LessthansignLessthansign | ^  | EqualssignEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | in | instanceof | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign,
    right: Expression,
    `type`: typingsSlinky.atBabelTypes.atBabelTypesStrings.BinaryExpression,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): Binary = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binary]
  }
  @scala.inline
  def LogicalExpression(
    left: Expression,
    operator: VerticallineVerticalline | AmpersandAmpersand | QuestionmarkQuestionmark,
    right: Expression,
    `type`: typingsSlinky.atBabelTypes.atBabelTypesStrings.LogicalExpression,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): Binary = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binary]
  }
}

