package typingsSlinky.astTypes.namedTypesMod.namedTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.DeclarationKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.InterfaceDeclarationKind
import typingsSlinky.astTypes.kindsMod.InterfaceExtendsKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.ObjectTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.kindsMod.TypeParameterDeclarationKind
import typingsSlinky.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.InterfaceDeclaration, 'type'> */
@js.native
trait DeclareInterface
  extends ASTNode
     with DeclarationKind
     with InterfaceDeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  
  var body: ObjectTypeAnnotationKind = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var `extends`: js.Array[InterfaceExtendsKind] = js.native
  
  var id: IdentifierKind = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.DeclareInterface = js.native
  
  var typeParameters: js.UndefOr[TypeParameterDeclarationKind | Null] = js.native
}
object DeclareInterface {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.DeclareInterface")
  @js.native
  val ^ : Type[DeclareInterface] = js.native
  
  @scala.inline
  implicit class DeclareInterfaceMutableBuilder[Self <: DeclareInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: ObjectTypeAnnotationKind): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setExtends(value: js.Array[InterfaceExtendsKind]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendsVarargs(value: InterfaceExtendsKind*): Self = StObject.set(x, "extends", js.Array(value :_*))
    
    @scala.inline
    def setId(value: IdentifierKind): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.astTypes.astTypesStrings.DeclareInterface): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclarationKind): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    @scala.inline
    def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
