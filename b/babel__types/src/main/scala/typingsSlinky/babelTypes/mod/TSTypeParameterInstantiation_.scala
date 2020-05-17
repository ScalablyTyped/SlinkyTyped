package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.TSTypeParameterInstantiation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeParameterInstantiation_
  extends BaseNode
     with Node {
  var params: js.Array[TSType] = js.native
  @JSName("type")
  var type_TSTypeParameterInstantiation_ : TSTypeParameterInstantiation = js.native
}

object TSTypeParameterInstantiation_ {
  @scala.inline
  def apply(params: js.Array[TSType], `type`: TSTypeParameterInstantiation): TSTypeParameterInstantiation_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeParameterInstantiation_]
  }
  @scala.inline
  implicit class TSTypeParameterInstantiation_Ops[Self <: TSTypeParameterInstantiation_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParams(value: js.Array[TSType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TSTypeParameterInstantiation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

