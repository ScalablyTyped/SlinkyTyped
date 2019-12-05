package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.astDashTypesStrings.`%=`
import typingsSlinky.astDashTypes.astDashTypesStrings.`&=`
import typingsSlinky.astDashTypes.astDashTypesStrings.`*=`
import typingsSlinky.astDashTypes.astDashTypesStrings.`+=`
import typingsSlinky.astDashTypes.astDashTypesStrings.`-=`
import typingsSlinky.astDashTypes.astDashTypesStrings.`/=`
import typingsSlinky.astDashTypes.astDashTypesStrings.`<<=`
import typingsSlinky.astDashTypes.astDashTypesStrings.`=`
import typingsSlinky.astDashTypes.astDashTypesStrings.`>>=`
import typingsSlinky.astDashTypes.astDashTypesStrings.`>>>=`
import typingsSlinky.astDashTypes.astDashTypesStrings.`^=`
import typingsSlinky.astDashTypes.astDashTypesStrings.`|=`
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.MemberExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.PatternKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait AssignmentExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var left: PatternKind | MemberExpressionKind
  var operator: `=` | `+=` | `-=` | `*=` | `/=` | `%=` | `<<=` | `>>=` | `>>>=` | `|=` | `^=` | `&=`
  var right: ExpressionKind
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.AssignmentExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.AssignmentExpression")
@js.native
object AssignmentExpression extends TopLevel[Type[AssignmentExpression]]

