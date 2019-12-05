package typingsSlinky.astDashTypes.genNodesMod

import typingsSlinky.astDashTypes.astDashTypesStrings.`+`
import typingsSlinky.astDashTypes.astDashTypesStrings.`-`
import typingsSlinky.astDashTypes.genKindsMod.TSTypeKind
import typingsSlinky.astDashTypes.genKindsMod.TSTypeParameterKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSMappedType extends ASTNode {
  var optional: Boolean | `+` | `-`
  var readonly: Boolean | `+` | `-`
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.TSMappedType
  var typeAnnotation: TSTypeKind | Null
  var typeParameter: TSTypeParameterKind
}

object TSMappedType {
  @scala.inline
  def apply(
    optional: Boolean | `+` | `-`,
    readonly: Boolean | `+` | `-`,
    `type`: typingsSlinky.astDashTypes.astDashTypesStrings.TSMappedType,
    typeParameter: TSTypeParameterKind,
    typeAnnotation: TSTypeKind = null
  ): TSMappedType = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSMappedType]
  }
}

