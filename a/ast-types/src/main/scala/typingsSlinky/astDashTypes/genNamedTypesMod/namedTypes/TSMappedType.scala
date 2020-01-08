package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.astDashTypesStrings.Plussign
import typingsSlinky.astDashTypes.astDashTypesStrings.`-_`
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.genKindsMod.TSTypeKind
import typingsSlinky.astDashTypes.genKindsMod.TSTypeParameterKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSMappedType
  extends ASTNode
     with NodeKind
     with PrintableKind
     with TSTypeKind {
  var optional: js.UndefOr[Boolean | Plussign | `-_`] = js.undefined
  var readonly: js.UndefOr[Boolean | Plussign | `-_`] = js.undefined
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.TSMappedType
  var typeAnnotation: js.UndefOr[TSTypeKind | Null] = js.undefined
  var typeParameter: TSTypeParameterKind
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSMappedType")
@js.native
object TSMappedType extends TopLevel[Type[TSMappedType]]

