package typingsSlinky.astTypes.namedTypesMod.namedTypes

import typingsSlinky.astTypes.kindsMod.BlockStatementKind
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.DeclarationKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.FlowPredicateKind
import typingsSlinky.astTypes.kindsMod.FunctionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.TSTypeParameterDeclarationKind
import typingsSlinky.astTypes.kindsMod.TypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.TypeParameterDeclarationKind
import typingsSlinky.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Function, 'type' | 'id'> */
/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> */
@js.native
trait FunctionDeclaration
  extends ASTNode
     with DeclarationKind
     with FunctionKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  
  var async: js.UndefOr[Boolean] = js.native
  
  var body: BlockStatementKind = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var defaults: js.UndefOr[js.Array[ExpressionKind | Null]] = js.native
  
  var expression: js.UndefOr[Boolean] = js.native
  
  var generator: js.UndefOr[Boolean] = js.native
  
  var id: IdentifierKind | Null = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var params: js.Array[PatternKind] = js.native
  
  var predicate: js.UndefOr[FlowPredicateKind | Null] = js.native
  
  var rest: js.UndefOr[IdentifierKind | Null] = js.native
  
  var returnType: js.UndefOr[TypeAnnotationKind | TSTypeAnnotationKind | Null] = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.FunctionDeclaration = js.native
  
  var typeParameters: js.UndefOr[TypeParameterDeclarationKind | TSTypeParameterDeclarationKind | Null] = js.native
}
object FunctionDeclaration {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.FunctionDeclaration")
  @js.native
  val ^ : Type[FunctionDeclaration] = js.native
  
  @scala.inline
  implicit class FunctionDeclarationMutableBuilder[Self <: FunctionDeclaration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    @scala.inline
    def setBody(value: BlockStatementKind): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setDefaults(value: js.Array[ExpressionKind | Null]): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
    
    @scala.inline
    def setDefaultsVarargs(value: (ExpressionKind | Null)*): Self = StObject.set(x, "defaults", js.Array(value :_*))
    
    @scala.inline
    def setExpression(value: Boolean): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    @scala.inline
    def setGenerator(value: Boolean): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneratorUndefined: Self = StObject.set(x, "generator", js.undefined)
    
    @scala.inline
    def setId(value: IdentifierKind): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setParams(value: js.Array[PatternKind]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: PatternKind*): Self = StObject.set(x, "params", js.Array(value :_*))
    
    @scala.inline
    def setPredicate(value: FlowPredicateKind): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredicateNull: Self = StObject.set(x, "predicate", null)
    
    @scala.inline
    def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
    
    @scala.inline
    def setRest(value: IdentifierKind): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestNull: Self = StObject.set(x, "rest", null)
    
    @scala.inline
    def setRestUndefined: Self = StObject.set(x, "rest", js.undefined)
    
    @scala.inline
    def setReturnType(value: TypeAnnotationKind | TSTypeAnnotationKind): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnTypeNull: Self = StObject.set(x, "returnType", null)
    
    @scala.inline
    def setReturnTypeUndefined: Self = StObject.set(x, "returnType", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.astTypes.astTypesStrings.FunctionDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclarationKind | TSTypeParameterDeclarationKind): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    @scala.inline
    def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
