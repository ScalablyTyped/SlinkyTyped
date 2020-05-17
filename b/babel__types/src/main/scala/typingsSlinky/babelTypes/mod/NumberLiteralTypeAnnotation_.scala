package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.NumberLiteralTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod.Node because Already inherited */ @js.native
trait NumberLiteralTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowType {
  @JSName("type")
  var type_NumberLiteralTypeAnnotation_ : NumberLiteralTypeAnnotation = js.native
  var value: Double = js.native
}

object NumberLiteralTypeAnnotation_ {
  @scala.inline
  def apply(`type`: NumberLiteralTypeAnnotation, value: Double): NumberLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberLiteralTypeAnnotation_]
  }
  @scala.inline
  implicit class NumberLiteralTypeAnnotation_Ops[Self <: NumberLiteralTypeAnnotation_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: NumberLiteralTypeAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

