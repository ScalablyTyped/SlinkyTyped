package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlternateComments extends StObject {
  
  var alternate: ExpressionKind = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var consequent: ExpressionKind = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var test: ExpressionKind = js.native
}
object AlternateComments {
  
  @scala.inline
  def apply(alternate: ExpressionKind, consequent: ExpressionKind, test: ExpressionKind): AlternateComments = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlternateComments]
  }
  
  @scala.inline
  implicit class AlternateCommentsMutableBuilder[Self <: AlternateComments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternate(value: ExpressionKind): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setConsequent(value: ExpressionKind): Self = StObject.set(x, "consequent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setTest(value: ExpressionKind): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
  }
}
