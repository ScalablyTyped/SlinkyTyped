package typingsSlinky.astTypes.namedTypesMod.namedTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
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
trait ConditionalExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  
  var alternate: ExpressionKind = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var consequent: ExpressionKind = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var test: ExpressionKind = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.ConditionalExpression = js.native
}
object ConditionalExpression {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.ConditionalExpression")
  @js.native
  val ^ : Type[ConditionalExpression] = js.native
  
  @scala.inline
  implicit class ConditionalExpressionMutableBuilder[Self <: ConditionalExpression] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setType(value: typingsSlinky.astTypes.astTypesStrings.ConditionalExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
