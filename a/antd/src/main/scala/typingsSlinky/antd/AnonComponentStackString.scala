package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonComponentStackString extends js.Object {
  var componentStack: String = js.native
}

object AnonComponentStackString {
  @scala.inline
  def apply(componentStack: String): AnonComponentStackString = {
    val __obj = js.Dynamic.literal(componentStack = componentStack.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponentStackString]
  }
  @scala.inline
  implicit class AnonComponentStackStringOps[Self <: AnonComponentStackString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentStack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentStack")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

