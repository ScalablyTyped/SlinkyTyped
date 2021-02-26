package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.InterfaceDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod._Node because Already inherited */ @js.native
trait InterfaceDeclaration_
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  
  var body: ObjectTypeAnnotation_ = js.native
  
  var `extends`: js.Array[InterfaceExtends_] | Null = js.native
  
  var id: Identifier_ = js.native
  
  var implements: js.Array[ClassImplements_] | Null = js.native
  
  var mixins: js.Array[InterfaceExtends_] | Null = js.native
  
  var typeParameters: TypeParameterDeclaration_ | Null = js.native
  
  @JSName("type")
  var type_InterfaceDeclaration_ : InterfaceDeclaration = js.native
}
object InterfaceDeclaration_ {
  
  @scala.inline
  def apply(body: ObjectTypeAnnotation_, id: Identifier_, `type`: InterfaceDeclaration): InterfaceDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceDeclaration_]
  }
  
  @scala.inline
  implicit class InterfaceDeclaration_MutableBuilder[Self <: InterfaceDeclaration_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: ObjectTypeAnnotation_): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtends(value: js.Array[InterfaceExtends_]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendsNull: Self = StObject.set(x, "extends", null)
    
    @scala.inline
    def setExtendsVarargs(value: InterfaceExtends_ *): Self = StObject.set(x, "extends", js.Array(value :_*))
    
    @scala.inline
    def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplements(value: js.Array[ClassImplements_]): Self = StObject.set(x, "implements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplementsNull: Self = StObject.set(x, "implements", null)
    
    @scala.inline
    def setImplementsVarargs(value: ClassImplements_ *): Self = StObject.set(x, "implements", js.Array(value :_*))
    
    @scala.inline
    def setMixins(value: js.Array[InterfaceExtends_]): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixinsNull: Self = StObject.set(x, "mixins", null)
    
    @scala.inline
    def setMixinsVarargs(value: InterfaceExtends_ *): Self = StObject.set(x, "mixins", js.Array(value :_*))
    
    @scala.inline
    def setType(value: InterfaceDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
