package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.BooleanLiteralKind
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.NumericLiteralKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StringLiteralKind
import typingsSlinky.astTypes.kindsMod.TemplateLiteralKind
import typingsSlinky.astTypes.kindsMod.UnaryExpressionKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Literal extends StObject {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var literal: NumericLiteralKind | StringLiteralKind | BooleanLiteralKind | TemplateLiteralKind | UnaryExpressionKind = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
}
object Literal {
  
  @scala.inline
  def apply(
    literal: NumericLiteralKind | StringLiteralKind | BooleanLiteralKind | TemplateLiteralKind | UnaryExpressionKind
  ): Literal = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
  
  @scala.inline
  implicit class LiteralMutableBuilder[Self <: Literal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setLiteral(
      value: NumericLiteralKind | StringLiteralKind | BooleanLiteralKind | TemplateLiteralKind | UnaryExpressionKind
    ): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
  }
}
