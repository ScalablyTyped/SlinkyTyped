package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonComponentStack extends js.Object {
  var componentStack: js.UndefOr[String] = js.native
}

object AnonComponentStack {
  @scala.inline
  def apply(): AnonComponentStack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonComponentStack]
  }
  @scala.inline
  implicit class AnonComponentStackOps[Self <: AnonComponentStack] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutComponentStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentStack")(js.undefined)
        ret
    }
  }
  
}

