package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.TSConditionalType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod.Node because Already inherited */ @js.native
trait TSConditionalType_
  extends TSType
     with BaseNode {
  var checkType: TSType = js.native
  var extendsType: TSType = js.native
  var falseType: TSType = js.native
  var trueType: TSType = js.native
  @JSName("type")
  var type_TSConditionalType_ : TSConditionalType = js.native
}

object TSConditionalType_ {
  @scala.inline
  def apply(
    checkType: TSType,
    extendsType: TSType,
    falseType: TSType,
    trueType: TSType,
    `type`: TSConditionalType
  ): TSConditionalType_ = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSConditionalType_]
  }
  @scala.inline
  implicit class TSConditionalType_Ops[Self <: TSConditionalType_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckType(value: TSType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtendsType(value: TSType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendsType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFalseType(value: TSType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("falseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrueType(value: TSType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trueType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TSConditionalType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

