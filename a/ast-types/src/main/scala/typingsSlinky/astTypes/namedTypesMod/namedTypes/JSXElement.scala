package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.JSXAttributeKind
import typingsSlinky.astTypes.kindsMod.JSXClosingElementKind
import typingsSlinky.astTypes.kindsMod.JSXElementKind
import typingsSlinky.astTypes.kindsMod.JSXExpressionContainerKind
import typingsSlinky.astTypes.kindsMod.JSXFragmentKind
import typingsSlinky.astTypes.kindsMod.JSXIdentifierKind
import typingsSlinky.astTypes.kindsMod.JSXMemberExpressionKind
import typingsSlinky.astTypes.kindsMod.JSXNamespacedNameKind
import typingsSlinky.astTypes.kindsMod.JSXOpeningElementKind
import typingsSlinky.astTypes.kindsMod.JSXSpreadAttributeKind
import typingsSlinky.astTypes.kindsMod.JSXTextKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> */
@js.native
trait JSXElement
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var attributes: js.UndefOr[js.Array[JSXAttributeKind | JSXSpreadAttributeKind]] = js.native
  var children: js.UndefOr[
    js.Array[
      JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
    ]
  ] = js.native
  var closingElement: js.UndefOr[JSXClosingElementKind | Null] = js.native
  var comments: js.UndefOr[js.Array[CommentKind]] = js.native
  var loc: js.UndefOr[SourceLocationKind] = js.native
  var name: js.UndefOr[JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind] = js.native
  var openingElement: JSXOpeningElementKind = js.native
  var selfClosing: js.UndefOr[Boolean] = js.native
  var `type`: typingsSlinky.astTypes.astTypesStrings.JSXElement = js.native
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.JSXElement")
@js.native
object JSXElement extends TopLevel[Type[JSXElement]]

