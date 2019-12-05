package typingsSlinky.astDashTypes.genNodesMod

import typingsSlinky.astDashTypes.genKindsMod.TSTypeKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSTypeOperator extends ASTNode {
  var operator: String
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.TSTypeOperator
  var typeAnnotation: TSTypeKind
}

object TSTypeOperator {
  @scala.inline
  def apply(
    operator: String,
    `type`: typingsSlinky.astDashTypes.astDashTypesStrings.TSTypeOperator,
    typeAnnotation: TSTypeKind
  ): TSTypeOperator = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeOperator]
  }
}

