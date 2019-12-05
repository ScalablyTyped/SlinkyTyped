package typingsSlinky.astDashTypes.genNodesMod

import typingsSlinky.astDashTypes.genKindsMod.DecoratorKind
import typingsSlinky.astDashTypes.genKindsMod.ObjectPropertyKind
import typingsSlinky.astDashTypes.genKindsMod.PropertyKind
import typingsSlinky.astDashTypes.genKindsMod.PropertyPatternKind
import typingsSlinky.astDashTypes.genKindsMod.RestPropertyKind
import typingsSlinky.astDashTypes.genKindsMod.SpreadPropertyKind
import typingsSlinky.astDashTypes.genKindsMod.SpreadPropertyPatternKind
import typingsSlinky.astDashTypes.genKindsMod.TSTypeAnnotationKind
import typingsSlinky.astDashTypes.genKindsMod.TypeAnnotationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Pattern, 'type'> ]: ast-types.ast-types/gen/nodes.Pattern[P]} */ trait ObjectPattern extends ASTNode {
  var decorators: js.Array[DecoratorKind] | Null
  var properties: js.Array[
    PropertyKind | PropertyPatternKind | SpreadPropertyPatternKind | SpreadPropertyKind | ObjectPropertyKind | RestPropertyKind
  ]
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.ObjectPattern
  var typeAnnotation: TypeAnnotationKind | TSTypeAnnotationKind | Null
}

object ObjectPattern {
  @scala.inline
  def apply(
    properties: js.Array[
      PropertyKind | PropertyPatternKind | SpreadPropertyPatternKind | SpreadPropertyKind | ObjectPropertyKind | RestPropertyKind
    ],
    `type`: typingsSlinky.astDashTypes.astDashTypesStrings.ObjectPattern,
    decorators: js.Array[DecoratorKind] = null,
    typeAnnotation: TypeAnnotationKind | TSTypeAnnotationKind = null
  ): ObjectPattern = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectPattern]
  }
}

