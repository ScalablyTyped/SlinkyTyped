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

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod._Node because Already inherited */ trait BinaryExpression_
  extends Binary
     with BaseNode
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
    left: Expression,
    operator: Plussign | `-_` | Slash | Percentsign | Asterisk | AsteriskAsterisk | Ampersand | Verticalline | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | LessthansignLessthansign | ^  | EqualssignEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | in | instanceof | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign,
    right: Expression,
    `type`: BinaryExpression,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): BinaryExpression_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryExpression_]
  }
}

