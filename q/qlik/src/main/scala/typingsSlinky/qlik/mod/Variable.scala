package typingsSlinky.qlik.mod

import typingsSlinky.qlik.AnonQIsNum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Variable extends js.Object {
  var qContent: AnonQIsNum = js.native
}

object Variable {
  @scala.inline
  def apply(qContent: AnonQIsNum): Variable = {
    val __obj = js.Dynamic.literal(qContent = qContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variable]
  }
  @scala.inline
  implicit class VariableOps[Self <: Variable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQContent(value: AnonQIsNum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qContent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

