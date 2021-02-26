package typingsSlinky.astTypes.namedTypesMod.namedTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.kindsMod.TypeAnnotationKind
import typingsSlinky.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Identifier, 'type' | 'name'> */
@js.native
trait TSTypeParameter
  extends ASTNode
     with ExpressionKind
     with IdentifierKind
     with NodeKind
     with PatternKind
     with PrintableKind {
  
  var default: js.UndefOr[TSTypeKind] = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var constraint: js.UndefOr[TSTypeKind] = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var name: String = js.native
  
  var optional: js.UndefOr[Boolean] = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeParameter = js.native
  
  var typeAnnotation: js.UndefOr[TypeAnnotationKind | TSTypeAnnotationKind | Null] = js.native
}
object TSTypeParameter {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.TSTypeParameter")
  @js.native
  val ^ : Type[TSTypeParameter] = js.native
  
  @scala.inline
  implicit class TSTypeParameterMutableBuilder[Self <: TSTypeParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setConstraint(value: TSTypeKind): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintUndefined: Self = StObject.set(x, "constraint", js.undefined)
    
    @scala.inline
    def setDefault(value: TSTypeKind): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.astTypes.astTypesStrings.TSTypeParameter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TypeAnnotationKind | TSTypeAnnotationKind): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    @scala.inline
    def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
  }
}
