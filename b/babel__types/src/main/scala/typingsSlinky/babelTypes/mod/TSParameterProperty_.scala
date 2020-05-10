package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.TSParameterProperty
import typingsSlinky.babelTypes.babelTypesStrings.`private`
import typingsSlinky.babelTypes.babelTypesStrings.`protected`
import typingsSlinky.babelTypes.babelTypesStrings.public
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod._Node because Already inherited */ @js.native
trait TSParameterProperty_
  extends LVal
     with BaseNode {
  var accessibility: public | `private` | `protected` | Null = js.native
  var parameter: Identifier_ | AssignmentPattern_ = js.native
  var readonly: Boolean | Null = js.native
  @JSName("type")
  var type_TSParameterProperty_ : TSParameterProperty = js.native
}

object TSParameterProperty_ {
  @scala.inline
  def apply(parameter: Identifier_ | AssignmentPattern_, `type`: TSParameterProperty): TSParameterProperty_ = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSParameterProperty_]
  }
  @scala.inline
  implicit class TSParameterProperty_Ops[Self <: TSParameterProperty_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParameter(value: Identifier_ | AssignmentPattern_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TSParameterProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessibility(value: public | `private` | `protected`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessibilityNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibility")(null)
        ret
    }
    @scala.inline
    def withReadonly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadonlyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonly")(null)
        ret
    }
  }
  
}

