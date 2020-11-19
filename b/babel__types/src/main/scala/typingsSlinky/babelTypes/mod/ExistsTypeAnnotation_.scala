package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.ExistsTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod._Node because Already inherited */ @js.native
trait ExistsTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowType {
  
  @JSName("type")
  var type_ExistsTypeAnnotation_ : ExistsTypeAnnotation = js.native
}
object ExistsTypeAnnotation_ {
  
  @scala.inline
  def apply(`type`: ExistsTypeAnnotation): ExistsTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExistsTypeAnnotation_]
  }
  
  @scala.inline
  implicit class ExistsTypeAnnotation_Ops[Self <: ExistsTypeAnnotation_] (val x: Self) extends AnyVal {
    
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
    def setType(value: ExistsTypeAnnotation): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
