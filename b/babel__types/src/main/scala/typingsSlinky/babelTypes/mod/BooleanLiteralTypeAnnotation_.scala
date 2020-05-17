package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.BooleanLiteralTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod.Node because Already inherited */ @js.native
trait BooleanLiteralTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowType {
  @JSName("type")
  var type_BooleanLiteralTypeAnnotation_ : BooleanLiteralTypeAnnotation = js.native
  var value: Boolean = js.native
}

object BooleanLiteralTypeAnnotation_ {
  @scala.inline
  def apply(`type`: BooleanLiteralTypeAnnotation, value: Boolean): BooleanLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooleanLiteralTypeAnnotation_]
  }
  @scala.inline
  implicit class BooleanLiteralTypeAnnotation_Ops[Self <: BooleanLiteralTypeAnnotation_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: BooleanLiteralTypeAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

