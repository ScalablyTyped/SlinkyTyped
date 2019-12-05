package typingsSlinky.astDashTypes.genBuildersMod

import typingsSlinky.astDashTypes.Anon_Attributes
import typingsSlinky.astDashTypes.genKindsMod.JSXClosingElementKind
import typingsSlinky.astDashTypes.genKindsMod.JSXElementKind
import typingsSlinky.astDashTypes.genKindsMod.JSXExpressionContainerKind
import typingsSlinky.astDashTypes.genKindsMod.JSXFragmentKind
import typingsSlinky.astDashTypes.genKindsMod.JSXOpeningElementKind
import typingsSlinky.astDashTypes.genKindsMod.JSXTextKind
import typingsSlinky.astDashTypes.genKindsMod.LiteralKind
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.JSXElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXElementBuilder extends js.Object {
  def apply(openingElement: JSXOpeningElementKind): JSXElement = js.native
  def apply(
    openingElement: JSXOpeningElementKind,
    closingElement: Null,
    children: js.Array[
      JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
    ]
  ): JSXElement = js.native
  def apply(openingElement: JSXOpeningElementKind, closingElement: JSXClosingElementKind): JSXElement = js.native
  def apply(
    openingElement: JSXOpeningElementKind,
    closingElement: JSXClosingElementKind,
    children: js.Array[
      JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
    ]
  ): JSXElement = js.native
  def from(params: Anon_Attributes): JSXElement = js.native
}

