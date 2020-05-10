package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.TSTypePredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod._Node because Already inherited */ @js.native
trait TSTypePredicate_
  extends TSType
     with BaseNode {
  var asserts: Boolean | Null = js.native
  var parameterName: Identifier_ | TSThisType_ = js.native
  var typeAnnotation: TSTypeAnnotation_ | Null = js.native
  @JSName("type")
  var type_TSTypePredicate_ : TSTypePredicate = js.native
}

object TSTypePredicate_ {
  @scala.inline
  def apply(parameterName: Identifier_ | TSThisType_, `type`: TSTypePredicate): TSTypePredicate_ = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypePredicate_]
  }
  @scala.inline
  implicit class TSTypePredicate_Ops[Self <: TSTypePredicate_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParameterName(value: Identifier_ | TSThisType_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TSTypePredicate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsserts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asserts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssertsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asserts")(null)
        ret
    }
    @scala.inline
    def withTypeAnnotation(value: TSTypeAnnotation_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeAnnotationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeAnnotation")(null)
        ret
    }
  }
  
}

