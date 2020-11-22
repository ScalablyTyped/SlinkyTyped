package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Children
import typingsSlinky.astTypes.kindsMod.JSXClosingFragmentKind
import typingsSlinky.astTypes.kindsMod.JSXElementKind
import typingsSlinky.astTypes.kindsMod.JSXExpressionContainerKind
import typingsSlinky.astTypes.kindsMod.JSXFragmentKind
import typingsSlinky.astTypes.kindsMod.JSXOpeningFragmentKind
import typingsSlinky.astTypes.kindsMod.JSXSpreadChildKind
import typingsSlinky.astTypes.kindsMod.JSXTextKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXFragmentBuilder extends js.Object {
  
  def apply(openingFragment: JSXOpeningFragmentKind, closingFragment: JSXClosingFragmentKind): JSXFragment = js.native
  def apply(
    openingFragment: JSXOpeningFragmentKind,
    closingFragment: JSXClosingFragmentKind,
    children: js.Array[
      JSXTextKind | JSXExpressionContainerKind | JSXSpreadChildKind | JSXElementKind | JSXFragmentKind | LiteralKind
    ]
  ): JSXFragment = js.native
  
  def from(params: Children): JSXFragment = js.native
}
