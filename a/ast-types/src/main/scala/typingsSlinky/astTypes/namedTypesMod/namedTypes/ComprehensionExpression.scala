package typingsSlinky.astTypes.namedTypesMod.namedTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ComprehensionBlockKind
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
trait ComprehensionExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  
  var blocks: js.Array[ComprehensionBlockKind] = js.native
  
  var body: ExpressionKind = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var filter: ExpressionKind | Null = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.ComprehensionExpression = js.native
}
object ComprehensionExpression {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.ComprehensionExpression")
  @js.native
  val ^ : Type[ComprehensionExpression] = js.native
  
  @scala.inline
  implicit class ComprehensionExpressionMutableBuilder[Self <: ComprehensionExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlocks(value: js.Array[ComprehensionBlockKind]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocksVarargs(value: ComprehensionBlockKind*): Self = StObject.set(x, "blocks", js.Array(value :_*))
    
    @scala.inline
    def setBody(value: ExpressionKind): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setFilter(value: ExpressionKind): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterNull: Self = StObject.set(x, "filter", null)
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.astTypes.astTypesStrings.ComprehensionExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
