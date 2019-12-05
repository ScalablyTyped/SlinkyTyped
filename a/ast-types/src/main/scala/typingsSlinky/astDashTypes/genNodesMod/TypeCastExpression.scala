package typingsSlinky.astDashTypes.genNodesMod

import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.TypeAnnotationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait TypeCastExpression extends ASTNode {
  var expression: ExpressionKind
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.TypeCastExpression
  var typeAnnotation: TypeAnnotationKind
}

object TypeCastExpression {
  @scala.inline
  def apply(
    expression: ExpressionKind,
    `type`: typingsSlinky.astDashTypes.astDashTypesStrings.TypeCastExpression,
    typeAnnotation: TypeAnnotationKind
  ): TypeCastExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeCastExpression]
  }
}

