package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.BooleanTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod.Node because Already inherited */ @js.native
trait BooleanTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowBaseAnnotation
     with FlowType {
  @JSName("type")
  var type_BooleanTypeAnnotation_ : BooleanTypeAnnotation = js.native
}

object BooleanTypeAnnotation_ {
  @scala.inline
  def apply(`type`: BooleanTypeAnnotation): BooleanTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooleanTypeAnnotation_]
  }
  @scala.inline
  implicit class BooleanTypeAnnotation_Ops[Self <: BooleanTypeAnnotation_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: BooleanTypeAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

