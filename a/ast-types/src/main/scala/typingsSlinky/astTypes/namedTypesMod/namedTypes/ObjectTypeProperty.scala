package typingsSlinky.astTypes.namedTypesMod.namedTypes

import typingsSlinky.astTypes.astTypesStrings.minus
import typingsSlinky.astTypes.astTypesStrings.plus
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.VarianceKind
import typingsSlinky.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> */
@js.native
trait ObjectTypeProperty
  extends ASTNode
     with NodeKind
     with PrintableKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var key: LiteralKind | IdentifierKind = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var optional: Boolean = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.ObjectTypeProperty = js.native
  
  var value: FlowTypeKind = js.native
  
  var variance: js.UndefOr[VarianceKind | plus | minus | Null] = js.native
}
object ObjectTypeProperty {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.ObjectTypeProperty")
  @js.native
  val ^ : Type[ObjectTypeProperty] = js.native
  
  @scala.inline
  implicit class ObjectTypePropertyMutableBuilder[Self <: ObjectTypeProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: LiteralKind | IdentifierKind): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.astTypes.astTypesStrings.ObjectTypeProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: FlowTypeKind): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariance(value: VarianceKind | plus | minus): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVarianceNull: Self = StObject.set(x, "variance", null)
    
    @scala.inline
    def setVarianceUndefined: Self = StObject.set(x, "variance", js.undefined)
  }
}
