package typingsSlinky.oracleOraclejet.ojdataproviderMod

import typingsSlinky.oracleOraclejet.ojdataproviderMod.AttributeFilterOperator.AttributeOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeFilterOperator_[D] extends js.Object {
  var attribute: String = js.native
  var op: AttributeOperator = js.native
  var value: js.Any = js.native
}

object AttributeFilterOperator_ {
  @scala.inline
  def apply[D](attribute: String, op: AttributeOperator, value: js.Any): AttributeFilterOperator_[D] = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeFilterOperator_[D]]
  }
  @scala.inline
  implicit class AttributeFilterOperator_Ops[Self[d] <: AttributeFilterOperator_[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withAttribute(value: String): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOp(value: AttributeOperator): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("op")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

