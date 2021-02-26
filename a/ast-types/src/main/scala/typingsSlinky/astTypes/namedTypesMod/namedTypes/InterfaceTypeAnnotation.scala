package typingsSlinky.astTypes.namedTypesMod.namedTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.FlowKind
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.InterfaceExtendsKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.ObjectTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> */
@js.native
trait InterfaceTypeAnnotation
  extends ASTNode
     with FlowKind
     with FlowTypeKind
     with NodeKind
     with PrintableKind {
  
  var body: ObjectTypeAnnotationKind = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var `extends`: js.UndefOr[js.Array[InterfaceExtendsKind] | Null] = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.InterfaceTypeAnnotation = js.native
}
object InterfaceTypeAnnotation {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.InterfaceTypeAnnotation")
  @js.native
  val ^ : Type[InterfaceTypeAnnotation] = js.native
  
  @scala.inline
  implicit class InterfaceTypeAnnotationMutableBuilder[Self <: InterfaceTypeAnnotation] (val x: Self) extends AnyVal {
    
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
    def setExtendsNull: Self = StObject.set(x, "extends", null)
    
    @scala.inline
    def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
    
    @scala.inline
    def setExtendsVarargs(value: InterfaceExtendsKind*): Self = StObject.set(x, "extends", js.Array(value :_*))
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.astTypes.astTypesStrings.InterfaceTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
