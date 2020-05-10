package typingsSlinky.epilogue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceSearchOption extends js.Object {
  var attributes: js.Array[String] = js.native
  var operator: String = js.native
  var param: String = js.native
}

object ResourceSearchOption {
  @scala.inline
  def apply(attributes: js.Array[String], operator: String, param: String): ResourceSearchOption = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceSearchOption]
  }
  @scala.inline
  implicit class ResourceSearchOptionOps[Self <: ResourceSearchOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("param")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

