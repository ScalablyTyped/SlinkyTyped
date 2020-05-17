package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.IntersectionTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod.Node because Already inherited */ @js.native
trait IntersectionTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowType {
  @JSName("type")
  var type_IntersectionTypeAnnotation_ : IntersectionTypeAnnotation = js.native
  var types: js.Array[FlowType] = js.native
}

object IntersectionTypeAnnotation_ {
  @scala.inline
  def apply(`type`: IntersectionTypeAnnotation, types: js.Array[FlowType]): IntersectionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntersectionTypeAnnotation_]
  }
  @scala.inline
  implicit class IntersectionTypeAnnotation_Ops[Self <: IntersectionTypeAnnotation_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: IntersectionTypeAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypes(value: js.Array[FlowType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

