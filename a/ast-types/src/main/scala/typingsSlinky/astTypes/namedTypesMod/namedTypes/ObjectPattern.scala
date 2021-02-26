package typingsSlinky.astTypes.namedTypesMod.namedTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.DecoratorKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.ObjectPropertyKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.PropertyKind
import typingsSlinky.astTypes.kindsMod.PropertyPatternKind
import typingsSlinky.astTypes.kindsMod.RestPropertyKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.SpreadPropertyKind
import typingsSlinky.astTypes.kindsMod.SpreadPropertyPatternKind
import typingsSlinky.astTypes.kindsMod.TSTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.TypeAnnotationKind
import typingsSlinky.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Pattern, 'type'> */
@js.native
trait ObjectPattern
  extends ASTNode
     with NodeKind
     with PatternKind
     with PrintableKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var decorators: js.UndefOr[js.Array[DecoratorKind] | Null] = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var properties: js.Array[
    PropertyKind | PropertyPatternKind | SpreadPropertyPatternKind | SpreadPropertyKind | ObjectPropertyKind | RestPropertyKind
  ] = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.ObjectPattern = js.native
  
  var typeAnnotation: js.UndefOr[TypeAnnotationKind | TSTypeAnnotationKind | Null] = js.native
}
object ObjectPattern {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.ObjectPattern")
  @js.native
  val ^ : Type[ObjectPattern] = js.native
  
  @scala.inline
  implicit class ObjectPatternMutableBuilder[Self <: ObjectPattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setDecorators(value: js.Array[DecoratorKind]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratorsNull: Self = StObject.set(x, "decorators", null)
    
    @scala.inline
    def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
    
    @scala.inline
    def setDecoratorsVarargs(value: DecoratorKind*): Self = StObject.set(x, "decorators", js.Array(value :_*))
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setProperties(
      value: js.Array[
          PropertyKind | PropertyPatternKind | SpreadPropertyPatternKind | SpreadPropertyKind | ObjectPropertyKind | RestPropertyKind
        ]
    ): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesVarargs(
      value: (PropertyKind | PropertyPatternKind | SpreadPropertyPatternKind | SpreadPropertyKind | ObjectPropertyKind | RestPropertyKind)*
    ): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typingsSlinky.astTypes.astTypesStrings.ObjectPattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TypeAnnotationKind | TSTypeAnnotationKind): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    @scala.inline
    def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
  }
}
