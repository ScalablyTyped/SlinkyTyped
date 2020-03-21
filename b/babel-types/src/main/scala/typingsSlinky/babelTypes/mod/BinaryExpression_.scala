package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.Ampersand
import typingsSlinky.babelTypes.babelTypesStrings.Asterisk
import typingsSlinky.babelTypes.babelTypesStrings.AsteriskAsterisk
import typingsSlinky.babelTypes.babelTypesStrings.BinaryExpression
import typingsSlinky.babelTypes.babelTypesStrings.EqualssignEqualssign
import typingsSlinky.babelTypes.babelTypesStrings.EqualssignEqualssignEqualssign
import typingsSlinky.babelTypes.babelTypesStrings.ExclamationmarkEqualssign
import typingsSlinky.babelTypes.babelTypesStrings.ExclamationmarkEqualssignEqualssign
import typingsSlinky.babelTypes.babelTypesStrings.Greaterthansign
import typingsSlinky.babelTypes.babelTypesStrings.GreaterthansignEqualssign
import typingsSlinky.babelTypes.babelTypesStrings.GreaterthansignGreaterthansign
import typingsSlinky.babelTypes.babelTypesStrings.GreaterthansignGreaterthansignGreaterthansign
import typingsSlinky.babelTypes.babelTypesStrings.Lessthansign
import typingsSlinky.babelTypes.babelTypesStrings.LessthansignEqualssign
import typingsSlinky.babelTypes.babelTypesStrings.LessthansignLessthansign
import typingsSlinky.babelTypes.babelTypesStrings.Percentsign
import typingsSlinky.babelTypes.babelTypesStrings.Plussign
import typingsSlinky.babelTypes.babelTypesStrings.Slash
import typingsSlinky.babelTypes.babelTypesStrings.Verticalline
import typingsSlinky.babelTypes.babelTypesStrings.^
import typingsSlinky.babelTypes.babelTypesStrings.`-_`
import typingsSlinky.babelTypes.babelTypesStrings.in
import typingsSlinky.babelTypes.babelTypesStrings.instanceof
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryExpression_
  extends Node
     with Binary
     with Expression {
  var left: Expression
  var operator: Plussign | `-_` | Slash | Percentsign | Asterisk | AsteriskAsterisk | Ampersand | Verticalline | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | LessthansignLessthansign | ^  | EqualssignEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | in | instanceof | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign
  var right: Expression
  @JSName("type")
  var type_BinaryExpression_ : BinaryExpression
}

object BinaryExpression_ {
  @scala.inline
  def apply(
    end: Double,
    left: Expression,
    loc: SourceLocation,
    operator: Plussign | `-_` | Slash | Percentsign | Asterisk | AsteriskAsterisk | Ampersand | Verticalline | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | LessthansignLessthansign | ^  | EqualssignEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | in | instanceof | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign,
    right: Expression,
    start: Double,
    `type`: BinaryExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): BinaryExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryExpression_]
  }
}

