package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.ThisTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod.Node because Already inherited */ @js.native
trait ThisTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowBaseAnnotation
     with FlowType {
  @JSName("type")
  var type_ThisTypeAnnotation_ : ThisTypeAnnotation = js.native
}

object ThisTypeAnnotation_ {
  @scala.inline
  def apply(`type`: ThisTypeAnnotation): ThisTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThisTypeAnnotation_]
  }
  @scala.inline
  implicit class ThisTypeAnnotation_Ops[Self <: ThisTypeAnnotation_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: ThisTypeAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

