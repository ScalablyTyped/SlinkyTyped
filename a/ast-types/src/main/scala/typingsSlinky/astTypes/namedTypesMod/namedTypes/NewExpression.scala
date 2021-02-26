package typingsSlinky.astTypes.namedTypesMod.namedTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.SpreadElementKind
import typingsSlinky.astTypes.kindsMod.TypeParameterInstantiationKind
import typingsSlinky.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> */
@js.native
trait NewExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  
  var arguments: js.Array[ExpressionKind | SpreadElementKind] = js.native
  
  var callee: ExpressionKind = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.NewExpression = js.native
  
  var typeArguments: js.UndefOr[Null | TypeParameterInstantiationKind] = js.native
}
object NewExpression {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.NewExpression")
  @js.native
  val ^ : Type[NewExpression] = js.native
  
  @scala.inline
  implicit class NewExpressionMutableBuilder[Self <: NewExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: js.Array[ExpressionKind | SpreadElementKind]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsVarargs(value: (ExpressionKind | SpreadElementKind)*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    @scala.inline
    def setCallee(value: ExpressionKind): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
    
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
    def setType(value: typingsSlinky.astTypes.astTypesStrings.NewExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeArguments(value: TypeParameterInstantiationKind): Self = StObject.set(x, "typeArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeArgumentsNull: Self = StObject.set(x, "typeArguments", null)
    
    @scala.inline
    def setTypeArgumentsUndefined: Self = StObject.set(x, "typeArguments", js.undefined)
  }
}
