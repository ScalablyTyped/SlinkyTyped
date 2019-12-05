package typingsSlinky.astDashTypes.genNodesMod

import typingsSlinky.astDashTypes.genKindsMod.FlowTypeKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait TypeAnnotation extends ASTNode {
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.TypeAnnotation
  var typeAnnotation: FlowTypeKind
}

object TypeAnnotation {
  @scala.inline
  def apply(
    `type`: typingsSlinky.astDashTypes.astDashTypesStrings.TypeAnnotation,
    typeAnnotation: FlowTypeKind
  ): TypeAnnotation = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeAnnotation]
  }
}

