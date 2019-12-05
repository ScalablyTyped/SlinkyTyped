package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.genKindsMod.ArrayPatternKind
import typingsSlinky.astDashTypes.genKindsMod.IdentifierKind
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.ObjectPatternKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.genKindsMod.RestElementKind
import typingsSlinky.astDashTypes.genKindsMod.TSHasOptionalTypeAnnotationKind
import typingsSlinky.astDashTypes.genKindsMod.TSHasOptionalTypeParametersKind
import typingsSlinky.astDashTypes.genKindsMod.TSTypeKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSFunctionType
  extends TSHasOptionalTypeParameters
     with TSHasOptionalTypeAnnotation
     with ASTNode
     with NodeKind
     with PrintableKind
     with TSHasOptionalTypeAnnotationKind
     with TSHasOptionalTypeParametersKind
     with TSTypeKind {
  var parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.TSFunctionType
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSFunctionType")
@js.native
object TSFunctionType extends TopLevel[Type[TSFunctionType]]

