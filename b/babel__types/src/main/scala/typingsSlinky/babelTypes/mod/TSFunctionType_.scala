package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.TSFunctionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod._Node because Already inherited */ @js.native
trait TSFunctionType_
  extends TSType
     with BaseNode {
  
  var parameters: js.Array[Identifier_ | RestElement_] = js.native
  
  var typeAnnotation: TSTypeAnnotation_ | Null = js.native
  
  var typeParameters: TSTypeParameterDeclaration_ | Null = js.native
  
  @JSName("type")
  var type_TSFunctionType_ : TSFunctionType = js.native
}
object TSFunctionType_ {
  
  @scala.inline
  def apply(parameters: js.Array[Identifier_ | RestElement_], `type`: TSFunctionType): TSFunctionType_ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSFunctionType_]
  }
  
  @scala.inline
  implicit class TSFunctionType_Ops[Self <: TSFunctionType_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParametersVarargs(value: (Identifier_ | RestElement_)*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[Identifier_ | RestElement_]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSFunctionType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TSTypeAnnotation_): Self = this.set("typeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotationNull: Self = this.set("typeAnnotation", null)
    
    @scala.inline
    def setTypeParameters(value: TSTypeParameterDeclaration_): Self = this.set("typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = this.set("typeParameters", null)
  }
}
