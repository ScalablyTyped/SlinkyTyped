package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.StringTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod.Node because Already inherited */ @js.native
trait StringTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowBaseAnnotation
     with FlowType {
  @JSName("type")
  var type_StringTypeAnnotation_ : StringTypeAnnotation = js.native
}

object StringTypeAnnotation_ {
  @scala.inline
  def apply(`type`: StringTypeAnnotation): StringTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringTypeAnnotation_]
  }
  @scala.inline
  implicit class StringTypeAnnotation_Ops[Self <: StringTypeAnnotation_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: StringTypeAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

