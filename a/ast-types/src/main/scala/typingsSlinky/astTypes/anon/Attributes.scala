package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.CommentKind
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
import typingsSlinky.astTypes.kindsMod.JSXSpreadChildKind
import typingsSlinky.astTypes.kindsMod.JSXTextKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attributes extends StObject {
  
  var attributes: js.UndefOr[js.Array[JSXAttributeKind | JSXSpreadAttributeKind]] = js.native
  
  var children: js.UndefOr[
    js.Array[
      JSXTextKind | JSXExpressionContainerKind | JSXSpreadChildKind | JSXElementKind | JSXFragmentKind | LiteralKind
    ]
  ] = js.native
  
  var closingElement: js.UndefOr[JSXClosingElementKind | Null] = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var name: js.UndefOr[JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind] = js.native
  
  var openingElement: JSXOpeningElementKind = js.native
  
  var selfClosing: js.UndefOr[Boolean] = js.native
}
object Attributes {
  
  @scala.inline
  def apply(openingElement: JSXOpeningElementKind): Attributes = {
    val __obj = js.Dynamic.literal(openingElement = openingElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
  
  @scala.inline
  implicit class AttributesMutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Array[JSXAttributeKind | JSXSpreadAttributeKind]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: (JSXAttributeKind | JSXSpreadAttributeKind)*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
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
    def setClosingElement(value: JSXClosingElementKind): Self = StObject.set(x, "closingElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosingElementNull: Self = StObject.set(x, "closingElement", null)
    
    @scala.inline
    def setClosingElementUndefined: Self = StObject.set(x, "closingElement", js.undefined)
    
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
    def setName(value: JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOpeningElement(value: JSXOpeningElementKind): Self = StObject.set(x, "openingElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfClosing(value: Boolean): Self = StObject.set(x, "selfClosing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfClosingUndefined: Self = StObject.set(x, "selfClosing", js.undefined)
  }
}
