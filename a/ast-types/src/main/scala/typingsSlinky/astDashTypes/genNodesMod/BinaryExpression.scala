package typingsSlinky.astDashTypes.genNodesMod

import typingsSlinky.astDashTypes.astDashTypesStrings.Ampersand
import typingsSlinky.astDashTypes.astDashTypesStrings.Asterisk
import typingsSlinky.astDashTypes.astDashTypesStrings.AsteriskAsterisk
import typingsSlinky.astDashTypes.astDashTypesStrings.EqualssignEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.EqualssignEqualssignEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.ExclamationmarkEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.ExclamationmarkEqualssignEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.Greaterthansign
import typingsSlinky.astDashTypes.astDashTypesStrings.GreaterthansignEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.GreaterthansignGreaterthansign
import typingsSlinky.astDashTypes.astDashTypesStrings.GreaterthansignGreaterthansignGreaterthansign
import typingsSlinky.astDashTypes.astDashTypesStrings.Lessthansign
import typingsSlinky.astDashTypes.astDashTypesStrings.LessthansignEqualssign
import typingsSlinky.astDashTypes.astDashTypesStrings.LessthansignLessthansign
import typingsSlinky.astDashTypes.astDashTypesStrings.Percentsign
import typingsSlinky.astDashTypes.astDashTypesStrings.Plussign
import typingsSlinky.astDashTypes.astDashTypesStrings.Slash
import typingsSlinky.astDashTypes.astDashTypesStrings.Verticalline
import typingsSlinky.astDashTypes.astDashTypesStrings.^
import typingsSlinky.astDashTypes.astDashTypesStrings.`-_`
import typingsSlinky.astDashTypes.astDashTypesStrings.in
import typingsSlinky.astDashTypes.astDashTypesStrings.instanceof
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait BinaryExpression extends ASTNode {
  var left: ExpressionKind
  var operator: EqualssignEqualssign | ExclamationmarkEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | LessthansignLessthansign | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | Plussign | `-_` | Asterisk | Slash | Percentsign | AsteriskAsterisk | Ampersand | Verticalline | ^  | in | instanceof
  var right: ExpressionKind
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.BinaryExpression
}

object BinaryExpression {
  @scala.inline
  def apply(
    left: ExpressionKind,
    operator: EqualssignEqualssign | ExclamationmarkEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | LessthansignLessthansign | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | Plussign | `-_` | Asterisk | Slash | Percentsign | AsteriskAsterisk | Ampersand | Verticalline | ^  | in | instanceof,
    right: ExpressionKind,
    `type`: typingsSlinky.astDashTypes.astDashTypesStrings.BinaryExpression
  ): BinaryExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryExpression]
  }
}

