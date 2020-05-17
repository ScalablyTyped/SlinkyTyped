package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Children
import typingsSlinky.astTypes.kindsMod.JSXClosingFragmentKind
import typingsSlinky.astTypes.kindsMod.JSXElementKind
import typingsSlinky.astTypes.kindsMod.JSXExpressionContainerKind
import typingsSlinky.astTypes.kindsMod.JSXFragmentKind
import typingsSlinky.astTypes.kindsMod.JSXOpeningFragmentKind
import typingsSlinky.astTypes.kindsMod.JSXTextKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXFragmentBuilder extends js.Object {
  def apply(openingElement: JSXOpeningFragmentKind, closingElement: JSXClosingFragmentKind): JSXFragment = js.native
  def apply(
    openingElement: JSXOpeningFragmentKind,
    closingElement: JSXClosingFragmentKind,
    children: js.Array[
      JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
    ]
  ): JSXFragment = js.native
  def from(params: Children): JSXFragment = js.native
}

