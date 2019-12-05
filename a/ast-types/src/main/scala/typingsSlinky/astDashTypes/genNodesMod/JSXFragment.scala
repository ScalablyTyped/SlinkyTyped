package typingsSlinky.astDashTypes.genNodesMod

import typingsSlinky.astDashTypes.genKindsMod.JSXClosingFragmentKind
import typingsSlinky.astDashTypes.genKindsMod.JSXElementKind
import typingsSlinky.astDashTypes.genKindsMod.JSXExpressionContainerKind
import typingsSlinky.astDashTypes.genKindsMod.JSXFragmentKind
import typingsSlinky.astDashTypes.genKindsMod.JSXOpeningFragmentKind
import typingsSlinky.astDashTypes.genKindsMod.JSXTextKind
import typingsSlinky.astDashTypes.genKindsMod.LiteralKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait JSXFragment extends ASTNode {
  var children: js.Array[
    JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
  ]
  var closingElement: JSXClosingFragmentKind
  var openingElement: JSXOpeningFragmentKind
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.JSXFragment
}

object JSXFragment {
  @scala.inline
  def apply(
    children: js.Array[
      JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
    ],
    closingElement: JSXClosingFragmentKind,
    openingElement: JSXOpeningFragmentKind,
    `type`: typingsSlinky.astDashTypes.astDashTypesStrings.JSXFragment
  ): JSXFragment = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingElement = closingElement.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXFragment]
  }
}

