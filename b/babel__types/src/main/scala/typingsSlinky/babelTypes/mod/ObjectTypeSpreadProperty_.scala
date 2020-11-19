package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.ObjectTypeSpreadProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod._Node because Already inherited */ @js.native
trait ObjectTypeSpreadProperty_
  extends Flow
     with BaseNode
     with UserWhitespacable {
  
  var argument: FlowType = js.native
  
  @JSName("type")
  var type_ObjectTypeSpreadProperty_ : ObjectTypeSpreadProperty = js.native
}
object ObjectTypeSpreadProperty_ {
  
  @scala.inline
  def apply(argument: FlowType, `type`: ObjectTypeSpreadProperty): ObjectTypeSpreadProperty_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeSpreadProperty_]
  }
  
  @scala.inline
  implicit class ObjectTypeSpreadProperty_Ops[Self <: ObjectTypeSpreadProperty_] (val x: Self) extends AnyVal {
    
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
    def setArgument(value: FlowType): Self = this.set("argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ObjectTypeSpreadProperty): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
