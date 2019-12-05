package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.astDashTypesStrings.`!==`
import typingsSlinky.astDashTypes.astDashTypesStrings.`!=`
import typingsSlinky.astDashTypes.astDashTypesStrings.`%`
import typingsSlinky.astDashTypes.astDashTypesStrings.`&`
import typingsSlinky.astDashTypes.astDashTypesStrings.`**`
import typingsSlinky.astDashTypes.astDashTypesStrings.`+`
import typingsSlinky.astDashTypes.astDashTypesStrings.`-`
import typingsSlinky.astDashTypes.astDashTypesStrings.`/`
import typingsSlinky.astDashTypes.astDashTypesStrings.`<<`
import typingsSlinky.astDashTypes.astDashTypesStrings.`<=`
import typingsSlinky.astDashTypes.astDashTypesStrings.`<`
import typingsSlinky.astDashTypes.astDashTypesStrings.`===`
import typingsSlinky.astDashTypes.astDashTypesStrings.`==`
import typingsSlinky.astDashTypes.astDashTypesStrings.`>=`
import typingsSlinky.astDashTypes.astDashTypesStrings.`>>>`
import typingsSlinky.astDashTypes.astDashTypesStrings.`>>`
import typingsSlinky.astDashTypes.astDashTypesStrings.`>`
import typingsSlinky.astDashTypes.astDashTypesStrings.`_backtick^_backtick`
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
  var operator: `==` | `!=` | `===` | `!==` | `<` | `<=` | `>` | `>=` | `<<` | `>>` | `>>>` | `+` | `-` | typingsSlinky.astDashTypes.astDashTypesStrings.`*` | `/` | `%` | `**` | `&` | typingsSlinky.astDashTypes.astDashTypesStrings.`|` | `_backtick^_backtick` | in | instanceof
  var right: ExpressionKind
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.BinaryExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.BinaryExpression")
@js.native
object BinaryExpression extends TopLevel[Type[BinaryExpression]]

