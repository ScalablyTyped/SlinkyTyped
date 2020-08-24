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
- typingsSlinky.babelTypes.mod._Node because Already inherited */ @js.native
trait BinaryExpression_
  extends Binary
     with BaseNode
     with Expression {
  var left: Expression | PrivateName_ = js.native
  var operator: Plussign | `-_` | Slash | Percentsign | Asterisk | AsteriskAsterisk | Ampersand | Verticalline | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | LessthansignLessthansign | ^  | EqualssignEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | in | instanceof | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign = js.native
  var right: Expression = js.native
  @JSName("type")
  var type_BinaryExpression_ : BinaryExpression = js.native
}

object BinaryExpression_ {
  @scala.inline
  def apply(
    left: Expression | PrivateName_,
    operator: Plussign | `-_` | Slash | Percentsign | Asterisk | AsteriskAsterisk | Ampersand | Verticalline | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | LessthansignLessthansign | ^  | EqualssignEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | in | instanceof | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign,
    right: Expression,
    `type`: BinaryExpression
  ): BinaryExpression_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryExpression_]
  }
  @scala.inline
  implicit class BinaryExpression_Ops[Self <: BinaryExpression_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLeft(value: Expression | PrivateName_): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperator(
      value: Plussign | `-_` | Slash | Percentsign | Asterisk | AsteriskAsterisk | Ampersand | Verticalline | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | LessthansignLessthansign | ^  | EqualssignEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | in | instanceof | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign
    ): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: Expression): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: BinaryExpression): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

