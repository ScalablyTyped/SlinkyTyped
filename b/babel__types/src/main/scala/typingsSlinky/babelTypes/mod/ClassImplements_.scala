package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.ClassImplements
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod._Node because Already inherited */ @js.native
trait ClassImplements_
  extends Flow
     with BaseNode {
  
  var id: Identifier_ = js.native
  
  var typeParameters: TypeParameterInstantiation_ | Null = js.native
  
  @JSName("type")
  var type_ClassImplements_ : ClassImplements = js.native
}
object ClassImplements_ {
  
  @scala.inline
  def apply(id: Identifier_, `type`: ClassImplements): ClassImplements_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassImplements_]
  }
  
  @scala.inline
  implicit class ClassImplements_Ops[Self <: ClassImplements_] (val x: Self) extends AnyVal {
    
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
    def setId(value: Identifier_): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ClassImplements): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TypeParameterInstantiation_): Self = this.set("typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = this.set("typeParameters", null)
  }
}
