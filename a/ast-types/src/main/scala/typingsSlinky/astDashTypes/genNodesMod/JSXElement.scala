package typingsSlinky.astDashTypes.genNodesMod

import typingsSlinky.astDashTypes.genKindsMod.JSXAttributeKind
import typingsSlinky.astDashTypes.genKindsMod.JSXClosingElementKind
import typingsSlinky.astDashTypes.genKindsMod.JSXElementKind
import typingsSlinky.astDashTypes.genKindsMod.JSXExpressionContainerKind
import typingsSlinky.astDashTypes.genKindsMod.JSXFragmentKind
import typingsSlinky.astDashTypes.genKindsMod.JSXIdentifierKind
import typingsSlinky.astDashTypes.genKindsMod.JSXMemberExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.JSXNamespacedNameKind
import typingsSlinky.astDashTypes.genKindsMod.JSXOpeningElementKind
import typingsSlinky.astDashTypes.genKindsMod.JSXSpreadAttributeKind
import typingsSlinky.astDashTypes.genKindsMod.JSXTextKind
import typingsSlinky.astDashTypes.genKindsMod.LiteralKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait JSXElement extends ASTNode {
  var attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind]
  var children: js.Array[
    JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
  ]
  var closingElement: JSXClosingElementKind | Null
  var name: JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind
  var openingElement: JSXOpeningElementKind
  var selfClosing: Boolean
  var `type`: typingsSlinky.astDashTypes.astDashTypesStrings.JSXElement
}

object JSXElement {
  @scala.inline
  def apply(
    attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind],
    children: js.Array[
      JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
    ],
    name: JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind,
    openingElement: JSXOpeningElementKind,
    selfClosing: Boolean,
    `type`: typingsSlinky.astDashTypes.astDashTypesStrings.JSXElement,
    closingElement: JSXClosingElementKind = null
  ): JSXElement = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (closingElement != null) __obj.updateDynamic("closingElement")(closingElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXElement]
  }
}

