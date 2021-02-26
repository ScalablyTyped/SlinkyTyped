package typingsSlinky.astTypes.namedTypesMod.namedTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.DeclarationKind
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.OpaqueTypeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.kindsMod.TypeParameterDeclarationKind
import typingsSlinky.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.OpaqueType, 'type' | 'impltype'> */
@js.native
trait DeclareOpaqueType
  extends ASTNode
     with DeclarationKind
     with NodeKind
     with OpaqueTypeKind
     with PrintableKind
     with StatementKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var id: IdentifierKind = js.native
  
  var impltype: FlowTypeKind | Null = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var supertype: js.UndefOr[FlowTypeKind | Null] = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.DeclareOpaqueType = js.native
  
  var typeParameters: js.UndefOr[TypeParameterDeclarationKind | Null] = js.native
}
object DeclareOpaqueType {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.DeclareOpaqueType")
  @js.native
  val ^ : Type[DeclareOpaqueType] = js.native
  
  @scala.inline
  implicit class DeclareOpaqueTypeMutableBuilder[Self <: DeclareOpaqueType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setId(value: IdentifierKind): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpltype(value: FlowTypeKind): Self = StObject.set(x, "impltype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpltypeNull: Self = StObject.set(x, "impltype", null)
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setSupertype(value: FlowTypeKind): Self = StObject.set(x, "supertype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupertypeNull: Self = StObject.set(x, "supertype", null)
    
    @scala.inline
    def setSupertypeUndefined: Self = StObject.set(x, "supertype", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.astTypes.astTypesStrings.DeclareOpaqueType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclarationKind): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    @scala.inline
    def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
