package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.ArrayTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod.Node because Already inherited */ @js.native
trait ArrayTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowType {
  var elementType: FlowType = js.native
  @JSName("type")
  var type_ArrayTypeAnnotation_ : ArrayTypeAnnotation = js.native
}

object ArrayTypeAnnotation_ {
  @scala.inline
  def apply(elementType: FlowType, `type`: ArrayTypeAnnotation): ArrayTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayTypeAnnotation_]
  }
  @scala.inline
  implicit class ArrayTypeAnnotation_Ops[Self <: ArrayTypeAnnotation_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElementType(value: FlowType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ArrayTypeAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

