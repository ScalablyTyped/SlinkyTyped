package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.astDashTypesStrings.`private`
import typingsSlinky.astDashTypes.astDashTypesStrings.`protected`
import typingsSlinky.astDashTypes.astDashTypesStrings.minus
import typingsSlinky.astDashTypes.astDashTypesStrings.plus
import typingsSlinky.astDashTypes.astDashTypesStrings.public
import typingsSlinky.astDashTypes.genKindsMod.ClassPropertyKind
import typingsSlinky.astDashTypes.genKindsMod.DeclarationKind
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.IdentifierKind
import typingsSlinky.astDashTypes.genKindsMod.LiteralKind
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.genKindsMod.StatementKind
import typingsSlinky.astDashTypes.genKindsMod.TSTypeAnnotationKind
import typingsSlinky.astDashTypes.genKindsMod.TypeAnnotationKind
import typingsSlinky.astDashTypes.genKindsMod.VarianceKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait ClassProperty
  extends ASTNode
     with ClassPropertyKind
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  var access: js.UndefOr[public | `private` | `protected`] = js.undefined
  var computed: js.UndefOr[Boolean] = js.undefined
  var key: LiteralKind | IdentifierKind | ExpressionKind
  var static: js.UndefOr[Boolean] = js.undefined
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.ClassProperty
  var typeAnnotation: js.UndefOr[TypeAnnotationKind | TSTypeAnnotationKind | Null] = js.undefined
  var value: ExpressionKind | Null
  var variance: js.UndefOr[VarianceKind | plus | minus | Null] = js.undefined
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ClassProperty")
@js.native
object ClassProperty extends TopLevel[Type[ClassProperty]]

