package typingsSlinky.astDashTypes.genNodesMod

import typingsSlinky.astDashTypes.genKindsMod.TSTypeKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSParenthesizedType extends ASTNode {
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.TSParenthesizedType
  var typeAnnotation: TSTypeKind
}

object TSParenthesizedType {
  @scala.inline
  def apply(
    `type`: typingsSlinky.astDashTypes.astDashTypesStrings.TSParenthesizedType,
    typeAnnotation: TSTypeKind
  ): TSParenthesizedType = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSParenthesizedType]
  }
}

