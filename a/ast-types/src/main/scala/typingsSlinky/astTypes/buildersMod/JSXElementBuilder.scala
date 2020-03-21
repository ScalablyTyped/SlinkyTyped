package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonAttributes
import typingsSlinky.astTypes.kindsMod.JSXClosingElementKind
import typingsSlinky.astTypes.kindsMod.JSXElementKind
import typingsSlinky.astTypes.kindsMod.JSXExpressionContainerKind
import typingsSlinky.astTypes.kindsMod.JSXFragmentKind
import typingsSlinky.astTypes.kindsMod.JSXOpeningElementKind
import typingsSlinky.astTypes.kindsMod.JSXTextKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXElement
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
  def from(params: AnonAttributes): JSXElement = js.native
}

