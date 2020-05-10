package typingsSlinky.relayCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFragmentTypeCondition extends js.Object {
  var fragmentTypeCondition: String = js.native
}

object AnonFragmentTypeCondition {
  @scala.inline
  def apply(fragmentTypeCondition: String): AnonFragmentTypeCondition = {
    val __obj = js.Dynamic.literal(fragmentTypeCondition = fragmentTypeCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFragmentTypeCondition]
  }
  @scala.inline
  implicit class AnonFragmentTypeConditionOps[Self <: AnonFragmentTypeCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFragmentTypeCondition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentTypeCondition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

