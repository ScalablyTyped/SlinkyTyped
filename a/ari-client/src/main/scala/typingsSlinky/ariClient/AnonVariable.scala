package typingsSlinky.ariClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonVariable extends js.Object {
  var variable: String = js.native
}

object AnonVariable {
  @scala.inline
  def apply(variable: String): AnonVariable = {
    val __obj = js.Dynamic.literal(variable = variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVariable]
  }
  @scala.inline
  implicit class AnonVariableOps[Self <: AnonVariable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVariable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

