package typingsSlinky.astTypes.namedTypesMod.namedTypes

import typingsSlinky.astTypes.astTypesStrings.Plussign
import typingsSlinky.astTypes.astTypesStrings.`-_`
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.kindsMod.TSTypeParameterKind
import typingsSlinky.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> */
@js.native
trait TSMappedType
  extends ASTNode
     with NodeKind
     with PrintableKind
     with TSTypeKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var optional: js.UndefOr[Boolean | Plussign | `-_`] = js.native
  
  var readonly: js.UndefOr[Boolean | Plussign | `-_`] = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.TSMappedType = js.native
  
  var typeAnnotation: js.UndefOr[TSTypeKind | Null] = js.native
  
  var typeParameter: TSTypeParameterKind = js.native
}
object TSMappedType {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.TSMappedType")
  @js.native
  val ^ : Type[TSMappedType] = js.native
  
  @scala.inline
  implicit class TSMappedTypeMutableBuilder[Self <: TSMappedType] (val x: Self) extends AnyVal {
    
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
    def setOptional(value: Boolean | Plussign | `-_`): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    @scala.inline
    def setReadonly(value: Boolean | Plussign | `-_`): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.astTypes.astTypesStrings.TSMappedType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TSTypeKind): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    @scala.inline
    def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
    
    @scala.inline
    def setTypeParameter(value: TSTypeParameterKind): Self = StObject.set(x, "typeParameter", value.asInstanceOf[js.Any])
  }
}
