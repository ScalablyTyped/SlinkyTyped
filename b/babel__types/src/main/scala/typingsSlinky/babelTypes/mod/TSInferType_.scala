package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.TSInferType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod.Node because Already inherited */ @js.native
trait TSInferType_
  extends TSType
     with BaseNode {
  var typeParameter: TSTypeParameter_ = js.native
  @JSName("type")
  var type_TSInferType_ : TSInferType = js.native
}

object TSInferType_ {
  @scala.inline
  def apply(`type`: TSInferType, typeParameter: TSTypeParameter_): TSInferType_ = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSInferType_]
  }
  @scala.inline
  implicit class TSInferType_Ops[Self <: TSInferType_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: TSInferType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeParameter(value: TSTypeParameter_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeParameter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

