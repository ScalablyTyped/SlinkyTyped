package typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.JSXClosingFragmentKind
import typingsSlinky.astDashTypes.genKindsMod.JSXElementKind
import typingsSlinky.astDashTypes.genKindsMod.JSXExpressionContainerKind
import typingsSlinky.astDashTypes.genKindsMod.JSXFragmentKind
import typingsSlinky.astDashTypes.genKindsMod.JSXOpeningFragmentKind
import typingsSlinky.astDashTypes.genKindsMod.JSXTextKind
import typingsSlinky.astDashTypes.genKindsMod.LiteralKind
import typingsSlinky.astDashTypes.genKindsMod.NodeKind
import typingsSlinky.astDashTypes.genKindsMod.PrintableKind
import typingsSlinky.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait JSXFragment
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var children: js.UndefOr[
    js.Array[
      JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
    ]
  ] = js.undefined
  var closingElement: JSXClosingFragmentKind
  var openingElement: JSXOpeningFragmentKind
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.JSXFragment
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.JSXFragment")
@js.native
object JSXFragment extends TopLevel[Type[JSXFragment]]

