package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
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
import typingsSlinky.astDashTypes.astDashTypesStrings.`-_`
import typingsSlinky.astDashTypes.astDashTypesStrings.in
import typingsSlinky.astDashTypes.astDashTypesStrings.instanceof
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait BinaryExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var left: ExpressionKind
  var operator: EqualssignEqualssign | ExclamationmarkEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | LessthansignLessthansign | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | Plussign | `-_` | Asterisk | Slash | Percentsign | AsteriskAsterisk | Ampersand | Verticalline | typingsSlinky.astDashTypes.astDashTypesStrings.^  | in | instanceof
  var right: ExpressionKind
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.BinaryExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.BinaryExpression")
@js.native
object BinaryExpression extends TopLevel[Type[BinaryExpression]]

