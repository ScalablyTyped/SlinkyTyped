package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TemplateElementKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Quasis extends StObject {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var expressions: js.Array[ExpressionKind] = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var quasis: js.Array[TemplateElementKind] = js.native
}
object Quasis {
  
  @scala.inline
  def apply(expressions: js.Array[ExpressionKind], quasis: js.Array[TemplateElementKind]): Quasis = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quasis]
  }
  
  @scala.inline
  implicit class QuasisMutableBuilder[Self <: Quasis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setExpressions(value: js.Array[ExpressionKind]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionsVarargs(value: ExpressionKind*): Self = StObject.set(x, "expressions", js.Array(value :_*))
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setQuasis(value: js.Array[TemplateElementKind]): Self = StObject.set(x, "quasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuasisVarargs(value: TemplateElementKind*): Self = StObject.set(x, "quasis", js.Array(value :_*))
  }
}
