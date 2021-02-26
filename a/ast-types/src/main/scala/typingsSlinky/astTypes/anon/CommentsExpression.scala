package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.ChainElementKind
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentsExpression extends StObject {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var expression: ChainElementKind = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
}
object CommentsExpression {
  
  @scala.inline
  def apply(expression: ChainElementKind): CommentsExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentsExpression]
  }
  
  @scala.inline
  implicit class CommentsExpressionMutableBuilder[Self <: CommentsExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setExpression(value: ChainElementKind): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
  }
}
