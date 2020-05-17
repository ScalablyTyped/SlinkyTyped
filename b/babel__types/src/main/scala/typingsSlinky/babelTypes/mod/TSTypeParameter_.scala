package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.TSTypeParameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeParameter_
  extends BaseNode
     with Node {
  var constraint: TSType | Null = js.native
  var default: TSType | Null = js.native
  var name: String = js.native
  @JSName("type")
  var type_TSTypeParameter_ : TSTypeParameter = js.native
}

object TSTypeParameter_ {
  @scala.inline
  def apply(name: String, `type`: TSTypeParameter): TSTypeParameter_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeParameter_]
  }
  @scala.inline
  implicit class TSTypeParameter_Ops[Self <: TSTypeParameter_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TSTypeParameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstraint(value: TSType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstraintNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraint")(null)
        ret
    }
    @scala.inline
    def withDefault(value: TSType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(null)
        ret
    }
  }
  
}

