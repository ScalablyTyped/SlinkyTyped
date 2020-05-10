package typingsSlinky.mjmlReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCondition extends js.Object {
  var children: String = js.native
  var condition: String = js.native
}

object AnonCondition {
  @scala.inline
  def apply(children: String, condition: String): AnonCondition = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCondition]
  }
  @scala.inline
  implicit class AnonConditionOps[Self <: AnonCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCondition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

