package typingsSlinky.astTypes.namedTypesMod.namedTypes

import typingsSlinky.astTypes.kindsMod.ChainElementKind
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.JSXIdentifierKind
import typingsSlinky.astTypes.kindsMod.JSXMemberExpressionKind
import typingsSlinky.astTypes.kindsMod.MemberExpressionKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.MemberExpression, 'type' | 'object' | 'property' | 'computed'> */
@js.native
trait JSXMemberExpression
  extends ASTNode
     with ChainElementKind
     with ExpressionKind
     with MemberExpressionKind
     with NodeKind
     with PrintableKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var computed: js.UndefOr[Boolean] = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var `object`: JSXIdentifierKind | JSXMemberExpressionKind = js.native
  
  var optional: js.UndefOr[Boolean] = js.native
  
  var property: JSXIdentifierKind = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.JSXMemberExpression = js.native
}
object JSXMemberExpression {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.JSXMemberExpression")
  @js.native
  val ^ : Type[JSXMemberExpression] = js.native
  
  @scala.inline
  implicit class JSXMemberExpressionMutableBuilder[Self <: JSXMemberExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputedUndefined: Self = StObject.set(x, "computed", js.undefined)
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setObject(value: JSXIdentifierKind | JSXMemberExpressionKind): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    @scala.inline
    def setProperty(value: JSXIdentifierKind): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.astTypes.astTypesStrings.JSXMemberExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
