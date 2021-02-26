package typingsSlinky.astTypes.namedTypesMod.namedTypes

import typingsSlinky.astTypes.astTypesStrings.minus
import typingsSlinky.astTypes.astTypesStrings.plus
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.FlowKind
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.VarianceKind
import typingsSlinky.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> */
@js.native
trait TypeParameter
  extends ASTNode
     with FlowKind
     with FlowTypeKind
     with NodeKind
     with PrintableKind {
  
  var default: js.UndefOr[FlowTypeKind | Null] = js.native
  
  var bound: js.UndefOr[TypeAnnotationKind | Null] = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var name: String = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.TypeParameter = js.native
  
  var variance: js.UndefOr[VarianceKind | plus | minus | Null] = js.native
}
object TypeParameter {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.TypeParameter")
  @js.native
  val ^ : Type[TypeParameter] = js.native
  
  @scala.inline
  implicit class TypeParameterMutableBuilder[Self <: TypeParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBound(value: TypeAnnotationKind): Self = StObject.set(x, "bound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundNull: Self = StObject.set(x, "bound", null)
    
    @scala.inline
    def setBoundUndefined: Self = StObject.set(x, "bound", js.undefined)
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setDefault(value: FlowTypeKind): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultNull: Self = StObject.set(x, "default", null)
    
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
    def setType(value: typingsSlinky.astTypes.astTypesStrings.TypeParameter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariance(value: VarianceKind | plus | minus): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVarianceNull: Self = StObject.set(x, "variance", null)
    
    @scala.inline
    def setVarianceUndefined: Self = StObject.set(x, "variance", js.undefined)
  }
}
