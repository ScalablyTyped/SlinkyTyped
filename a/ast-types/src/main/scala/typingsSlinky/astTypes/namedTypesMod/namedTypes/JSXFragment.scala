package typingsSlinky.astTypes.namedTypesMod.namedTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.JSXClosingFragmentKind
import typingsSlinky.astTypes.kindsMod.JSXElementKind
import typingsSlinky.astTypes.kindsMod.JSXExpressionContainerKind
import typingsSlinky.astTypes.kindsMod.JSXFragmentKind
import typingsSlinky.astTypes.kindsMod.JSXOpeningFragmentKind
import typingsSlinky.astTypes.kindsMod.JSXSpreadChildKind
import typingsSlinky.astTypes.kindsMod.JSXTextKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> */
@js.native
trait JSXFragment
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  
  var children: js.UndefOr[
    js.Array[
      JSXTextKind | JSXExpressionContainerKind | JSXSpreadChildKind | JSXElementKind | JSXFragmentKind | LiteralKind
    ]
  ] = js.native
  
  var closingFragment: JSXClosingFragmentKind = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var openingFragment: JSXOpeningFragmentKind = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.JSXFragment = js.native
}
object JSXFragment {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.JSXFragment")
  @js.native
  val ^ : Type[JSXFragment] = js.native
  
  @scala.inline
  implicit class JSXFragmentMutableBuilder[Self <: JSXFragment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(
      value: js.Array[
          JSXTextKind | JSXExpressionContainerKind | JSXSpreadChildKind | JSXElementKind | JSXFragmentKind | LiteralKind
        ]
    ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(
      value: (JSXTextKind | JSXExpressionContainerKind | JSXSpreadChildKind | JSXElementKind | JSXFragmentKind | LiteralKind)*
    ): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setClosingFragment(value: JSXClosingFragmentKind): Self = StObject.set(x, "closingFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setOpeningFragment(value: JSXOpeningFragmentKind): Self = StObject.set(x, "openingFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.astTypes.astTypesStrings.JSXFragment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
